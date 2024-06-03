package caceres.karen.alke_wallet

import android.app.Application
import caceres.karen.alke_wallet.model.UserResponse

//Clase global para guardar datos mientras la app esta abierta!
//a diferencia del sharedPref se borran al cerrar la app!
class GlobalClassApp: Application() {
        companion object{
            //vamos a crear un objeto usuario que estara global al proyecto
            var userLogged : UserResponse? = null
            var tokenAccess : String? = null
        }
        override fun onCreate() {
            super.onCreate()
            userLogged = null
            tokenAccess = null
        }

    }