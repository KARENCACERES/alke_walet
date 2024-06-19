package caceres.karen.alke_wallet.model.database

import androidx.room.Database
import androidx.room.RoomDatabase

/**
 * Aca se configura la Base de datos
 */
@Database(entities = [UsuarioEntidad::class], version = 1)
abstract class AppDataBase : RoomDatabase() {
    //Aca le digo que Dao vamos a usar
    abstract fun usuarioDao() : UsuarioDao
}