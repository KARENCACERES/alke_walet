package caceres.karen.alke_wallet.model.database

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query

/**
 * Dao que va a implementar todos los metodos que vamos a usar en esta app
 */
@Dao
interface UsuarioDao { //Metodo para insertar toda la data
    @Insert
    fun insertarDataDB(usuarios : List<UsuarioEntidad>)

    //Metodo para traer toda la informacion
    @Query("Select * from usuarios")
    fun obtenerUsuariosDB() : List<UsuarioEntidad>

    //Metodo para boorar toda la data
    @Query("DELETE FROM usuarios")
    fun borrarDB()
}