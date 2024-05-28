package caceres.karen.alke_wallet.view

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import caceres.karen.alke_wallet.databinding.ActivitySignupPage4Binding
import caceres.karen.alke_wallet.databinding.ActivitySplashScreen1Binding

class signup_page : AppCompatActivity() {

    //instanciamos binding
    lateinit var binding: ActivitySignupPage4Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //configuramos el binding
        binding = ActivitySignupPage4Binding.inflate(layoutInflater)

        //vamos a setear la vista a mostrar
        setContentView(binding.root)


        binding.buttonCrearCta.setOnClickListener {
            val AbrirPantalla3 = Intent(this, login_page::class.java)
            startActivity(AbrirPantalla3)
            finish()
        }

    }
}