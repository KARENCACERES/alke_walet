package caceres.karen.alke_wallet.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

//encargado de hacer el login de la app
class LoginViewModel : ViewModel() {
    val loginResultLiveData = MutableLiveData<Boolean>()


//Funcion para implementar una corrutina y llamar la API

    fun hacerLogin(email: String, password: String) {
        CoroutineScope(Dispatchers.IO).launch {
            try {
                //llamaremos a la API
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
}
