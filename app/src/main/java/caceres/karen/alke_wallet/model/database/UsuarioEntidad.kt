package caceres.karen.alke_wallet.model.database

import androidx.room.Entity
import androidx.room.PrimaryKey
/**
 * Entidad de la base de datos que vamos a crear
 */
@Entity(tableName = "usuarios")
data class UsuarioEntidad(
    //aca van los campos que voy a guardar en la base de datos
    @PrimaryKey(autoGenerate = true)
    val firstName: String,
    val lastName: String,
    val email: String,
    val password: String,
    val roleID: Long,
    val points: Long
){
    override fun toString(): String {
        return this.firstName
    }
}
