package caceres.karen.alke_wallet.viewmodel

import android.app.Application
import android.content.Context
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import caceres.karen.alke_wallet.GlobalClassApp
import caceres.karen.alke_wallet.model.LoginRequest
import caceres.karen.alke_wallet.model.UserResponse
import caceres.karen.alke_wallet.model.network.ApiClient
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

//encargado de hacer el login de la app
class LoginViewModel(application: Application) : AndroidViewModel(application) {

    val loginResultLiveData =
        MutableLiveData<Boolean>()//OBSERVADOR variable que almacena el resultado del login
    val loadingLiveData = MutableLiveData<Boolean>() // Estado de carga
    val userDataLiveData = MutableLiveData<UserResponse?>() // LiveData para los datos del usuario

    lateinit var accessTokenVm: String // variable para almacenar el token de acceso
    lateinit var user: String // variable para almacenar el nombre del usuario

    //aqui creamos el sharedPref para guardalr el token
    private val sharedPreferences =
        application.getSharedPreferences("AlkeWallet", Context.MODE_PRIVATE)


    //Funcion para implementar una corrutina y llamar la API
    fun login(email: String, password: String) {
        loadingLiveData.postValue(true)//se activa el estado de carga
        CoroutineScope(Dispatchers.IO).launch {
            //try ve conexion
            //catch ve errores
            try {
                // aqui guardamos la data del response del logiin
                val response = ApiClient.apiService.login(LoginRequest(email, password))

                if (response.accessToken != null) {

                    //almacenar el accessToken
                    accessTokenVm = response.accessToken

                    //guardamos el accesToken en SharedPreferent
                    val editor = sharedPreferences.edit()
                    editor.putString("accessToken", response.accessToken)
                    editor.apply()

                    loginResultLiveData.postValue(true)

                } else {
                    loginResultLiveData.postValue(false)
                }
            } catch (e: Exception) {
                loginResultLiveData.postValue(false)
                Log.e("Errores", "Error: ${e.message}")
            }

        }

    }

    //funcion para obtener los datos del usuario
    fun getUserData() {
        loadingLiveData.postValue(true) // Indicar inicio de carga

        CoroutineScope(Dispatchers.IO).launch {
            try {
                //respuestaToken
                val respuesta = ApiClient.apiService.getUserData("Bearer $accessTokenVm")
                if (respuesta.isSuccessful) {

                    val dataUsuario = respuesta.body()
                    userDataLiveData.postValue(dataUsuario)

                    //guardamos los datos del usuario en la variable global GlobalClassAPP
                    GlobalClassApp.userLogged = dataUsuario

                } else {
                    userDataLiveData.postValue(null)
                }
            } catch (e: Exception) {
                Log.e("Errores", "Error ${e.message}")
                userDataLiveData.postValue(null)
            }
        }
    }
}

//llamaremos a la API
/**  try {

//val response = api.login(correo, contrasena)
if (email == "test@test.cl" && password == "1234") {
loginResultLiveData.postValue(true)
} else {
loginResultLiveData.postValue(false)
}
} catch (e: Exception) {
//si hay un error se ejecuta esta parte
loginResultLiveData.postValue(false)
}

}
}
 */


