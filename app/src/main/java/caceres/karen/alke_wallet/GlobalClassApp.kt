package caceres.karen.alke_wallet

import android.app.Application
import androidx.room.Room
import caceres.karen.alke_wallet.model.UserResponse
import caceres.karen.alke_wallet.model.database.AppDataBase

//Clase global para guardar datos mientras la app esta abierta!
//a diferencia del sharedPref se borran al cerrar la app!
class GlobalClassApp: Application() {
        companion object{
            //Base de datos
            lateinit var database: AppDataBase
            //vamos a crear un objeto usuario que estara global al proyecto
            var userLogged : UserResponse? = null
            var tokenAccess : String? = null
        }
        override fun onCreate() {
            super.onCreate()
            userLogged = null
            tokenAccess = null

                // Configurar la base de datos Room
                database = Room.databaseBuilder(
                    applicationContext,
                    AppDataBase::class.java, "db_usuarios"
                ).build()
            }
        }
