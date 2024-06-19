package caceres.karen.alke_wallet.view

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import caceres.karen.alke_wallet.R
import caceres.karen.alke_wallet.databinding.ActivitySplashScreen1Binding
import java.util.Timer
import java.util.TimerTask

class splash_screen : AppCompatActivity() {

    private var task: TimerTask? = null
    private var timer: Timer? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//esta linea le avisal al xml que va a mostra
        setContentView(R.layout.activity_splash_screen1)

        //Pasando a la siguiente vista con un timer
        var task: TimerTask? = object : TimerTask() {
            override fun run() {
                val abrirPantallaLogin = Intent(baseContext, login_signup_page::class.java)
//                abrirPantallaLogin.putExtra("nombre", "Jaime")
//                abrirPantallaLogin.putExtra("apellido", "Perez")
//                abrirPantallaLogin.putExtra("acepto_tyC", false)
                startActivity(abrirPantallaLogin)
                finish()
            }
        }
        timer = Timer()
        timer!!.schedule(task, 3000)
    }
    override fun onStart() {
        super.onStart()
        Log.i("Ciclo vida", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.i("Ciclo vida","onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.i("Ciclo vida", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.i("Ciclo vida", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("Ciclo vida", "onDestroy")
        task?.cancel()
        timer?.cancel()

    }
}

    /**instanciamos binding
    lateinit var binding: ActivitySplashScreen1Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //configuramos el binding
        binding = ActivitySplashScreen1Binding.inflate(layoutInflater)

        //vamos a setear la vista a mostrar
        setContentView(binding.root)
    }
}*/

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
Iniciar app con un click
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


/**Abiendo la pantalla con un timer, incia despues de 3 segundos

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
    timer.schedule(task,delay 3000)

}
}*/