package caceres.karen.alke_wallet.view

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import caceres.karen.alke_wallet.databinding.ActivityRequestMoney9Binding
import caceres.karen.alke_wallet.databinding.ActivitySplashScreen1Binding

class request_money : AppCompatActivity() {

    //instanciamos binding
    lateinit var binding: ActivityRequestMoney9Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //configuramos el binding
        binding = ActivityRequestMoney9Binding.inflate(layoutInflater)

        //vamos a setear la vista a mostrar
        setContentView(binding.root)
        }
    }