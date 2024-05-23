package caceres.karen.alke_wallet.view

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import caceres.karen.alke_wallet.databinding.ActivitySendMoney8Binding
import caceres.karen.alke_wallet.databinding.ActivitySplashScreen1Binding

class send_money : AppCompatActivity() {

    //instanciamos binding
    lateinit var binding: ActivitySendMoney8Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //configuramos el binding
        binding = ActivitySendMoney8Binding.inflate(layoutInflater)

        //vamos a setear la vista a mostrar
        setContentView(binding.root)
    }
}