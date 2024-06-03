package caceres.karen.alke_wallet.view

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import caceres.karen.alke_wallet.GlobalClassApp
import caceres.karen.alke_wallet.databinding.ActivityHomePage5Binding
import caceres.karen.alke_wallet.databinding.ActivityLoginPage3Binding
import caceres.karen.alke_wallet.databinding.ActivityLoginSignupPage2Binding
import caceres.karen.alke_wallet.viewmodel.LoginViewModel

class login_page : AppCompatActivity() {

    //instanciamos binding
    private lateinit var binding: ActivityLoginPage3Binding

    //aqui declara el viewmodel
    private lateinit var viewModel: LoginViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //configuramos el binding
        binding = ActivityLoginPage3Binding.inflate(layoutInflater)
        //vamos a setear la vista a mostrar
        setContentView(binding.root)

        //Vamos a configurar el ViewModel
        viewModel = ViewModelProvider(this).get(LoginViewModel::class.java)

        binding.btnCrearCta.setOnClickListener { goToRegisterActivity() }
        binding.buttonLogin.setOnClickListener { login() }

        //observamos el live data del login
        viewModel.loginResultLiveData.observe(this) {loginOk ->
            if (loginOk) {
                //guardamos datos en la variable global
                GlobalClassApp.tokenAccess = viewModel.accessTokenVm

                //ejecutamos funcion para datos del usuario del ViewModel
                viewModel.getUserData()
            } else {
                Toast.makeText(this, "Error en el login", Toast.LENGTH_SHORT).show()
            }
        }

        viewModel.userDataLiveData.observe(this) { userResponse ->
            if (userResponse != null) {
                goToHomePage()
            }else {
                Toast.makeText(this, "Error al obtener los datos del usuario", Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun goToHomePage() {
        val intent = Intent(this, ActivityHomePage5Binding::class.java)
        startActivity(intent)
    }

    private fun goToRegisterActivity() {
        val intent = Intent(this,ActivityLoginSignupPage2Binding::class.java)
        startActivity(intent)
    }

    private fun login() {
        //llamamos los valores datos del usuario los guardamos en variable y los convertimos a String
        val emailIngresado = binding.correoIngresado.text.toString()
        val passwordIngresado = binding.contraseAIngresada.text.toString()

        if (emailIngresado != null && passwordIngresado != null) {

            //llamamos al la funcion del login del ViewModel
            viewModel.login(emailIngresado, passwordIngresado)

        }else {
            Toast.makeText(this, "Ingresa bien los datos", Toast.LENGTH_SHORT).show()
        }
    }
}


/**Vamos a configurar el ViewModel
ViewModel = ViewModelProvider(this).get(LoginViewModel::class.java)


//Configurando el onClick al dar click sobre el btn "Crear una nueva cuenta", salte a la activity Signup Page
binding.btnCrearCta.setOnClickListener {
//Vamos a rescartar la informacion que ingreso el usuario
var correoIngresado = binding.correoIngresado.text.toString()
var passwordIngresado = binding.contraseAIngresada.text.toString()

//vamos a guardar el correo en los sharedPreferences
ViewModel.hacerLogin(correoIngresado, passwordIngresado)
}

//Se configura el observador que va a estar observando al sujeto "loginResultLiveData"
ViewModel.loginResultLiveData.observe(this) { loginOk ->
if (loginOk == true) {
val irMenuPrincipal = Intent(this, ActivityHomePage5Binding::class.java)
startActivity(irMenuPrincipal)
} else {
Toast.makeText(this, "Datos Invalidos", Toast.LENGTH_LONG).show()
}
}


}
}
 */
