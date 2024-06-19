package caceres.karen.alke_wallet.view

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import caceres.karen.alke_wallet.databinding.ActivityLoginSignupPage2Binding
import caceres.karen.alke_wallet.viewmodel.LoginViewModel

class login_signup_page : AppCompatActivity() {

    //instanciamos binding
    lateinit var binding: ActivityLoginSignupPage2Binding
    //instanciamos el viewModel
    lateinit var viewModel: LoginViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //configuramos el binding
        binding = ActivityLoginSignupPage2Binding.inflate(layoutInflater)

        //vamos a setear la vista a mostrar
        setContentView(binding.root)

        //Vamos a configurar el ViewModel
        viewModel = ViewModelProvider(this).get(LoginViewModel::class.java)

        //se declara la variable para el boton y su interaccion
        binding.buttonCtaP2.setOnClickListener {
            val abrirpantallaloginPage = Intent(this, signup_page::class.java)
            startActivity(abrirpantallaloginPage)
        }
        //se declara la variable para el boton y su interaccion
        binding.btnCrearCta.setOnClickListener {
            val abrirpantallaloginPage = Intent(this, home_page::class.java)
            startActivity(abrirpantallaloginPage)

        }
    }
    }


            /**Se declara(nombra) la boton como una variable
            val btn_crear_cta = findViewById<Button>(R.id.button_cta_p2)

            //Al hacer click sobre...
            btn_crear_cta.setOnClickListener {

                //se va a mostrar esto....

                val abrirpantallaloginPage = Intent(this, login_page::class.java)
                startActivity(abrirpantallaloginPage)}
*/