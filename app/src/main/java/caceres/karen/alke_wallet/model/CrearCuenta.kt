package caceres.karen.alke_wallet.model

data class CrearCuenta (
    val creationDate: String,
    val money: Long,
    val isBlocked: Boolean,
    val userID: Long
)
