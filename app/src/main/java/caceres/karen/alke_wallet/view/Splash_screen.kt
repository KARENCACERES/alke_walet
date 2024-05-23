package caceres.karen.alke_wallet.view

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import caceres.karen.alke_wallet.databinding.ActivitySplashScreen1Binding
import java.util.Timer
import java.util.TimerTask

class splash_screen : AppCompatActivity() {

    //instanciamos binding
    lateinit var binding: ActivitySplashScreen1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //configuramos el binding
        binding = ActivitySplashScreen1Binding.inflate(layoutInflater)

        //vamos a setear la vista a mostrar
        setContentView(binding.root)
    }
}

/**esta linea le avisal al xml que va a mostra
//setContentView(R.layout.activity_splash_screen1)

//Se declara la imagen como una variable
val logoApp = findViewById<ImageView>(R.id.logosintexto)
logoApp.setOnClickListener {
val abrirPantallaLogin = Intent(this, login_signup_page::class.java)
abrirPantallaLogin.putExtra("nombre", "Karen")
abrirPantallaLogin.putExtra("apellido", "Cáceres")
abrirPantallaLogin.putExtra("acepto_tyC", false)
startActivity(abrirPantallaLogin)
}
/* Iniciar app con un click
//Se declara la imagen como una variable
/
val logoApp = findViewById<ImageView>(R.id.logosintexto)
logoApp.setOnClickListener {
val abrirPantallaLogin = Intent(this, login_signup_page::class.java)
abrirPantallaLogin.putExtra("nombre", "Karen")
abrirPantallaLogin.putExtra("apellido", "Caceres")
abrirPantallaLogin.putExtra("acepto_tyC", false)
startActivity(login_signup_page)
} */

/**
 * Abiendo la pantalla con un timer, incia despues de 3 segundos

var task: TimerTask? = object : TimerTask() {
override fun run() {
val abrirPantallaLogin = Intent(baseContext, login_signup_page::class.java)
abrirPantallaLogin.putExtra("nombre", "Karen")
abrirPantallaLogin.putExtra("apellido", "Cáceres")
abrirPantallaLogin.putExtra("acepto_tyC", false)
startActivity(abrirPantallaLogin)
}
}

val timer = Timer()
timer.schedule(task, delay 3000)

}
}*/