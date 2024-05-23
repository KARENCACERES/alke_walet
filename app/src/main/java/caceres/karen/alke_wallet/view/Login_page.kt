package caceres.karen.alke_wallet.view

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import caceres.karen.alke_wallet.databinding.ActivityLoginPage3Binding

class login_page : AppCompatActivity() {

    //instanciamos binding
    lateinit var binding: ActivityLoginPage3Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //configuramos el binding
        binding = ActivityLoginPage3Binding.inflate(layoutInflater)
        //vamos a setear la vista a mostrar
        setContentView(binding.root)

    }
}
