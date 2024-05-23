package caceres.karen.alke_wallet.view

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import caceres.karen.alke_wallet.databinding.ActivityHpEmptyCase6Binding
import caceres.karen.alke_wallet.databinding.ActivitySplashScreen1Binding

class h_p_empty_case : AppCompatActivity() {

    //instanciamos binding
    lateinit var binding: ActivityHpEmptyCase6Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //configuramos el binding
        binding = ActivityHpEmptyCase6Binding.inflate(layoutInflater)

        //vamos a setear la vista a mostrar
        setContentView(binding.root)
    }
}