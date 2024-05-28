package caceres.karen.alke_wallet.model

data class User(
    val firstName: String,
    val lastName: String,
    val email: String,
    val password: String,
    val roleID: Long,
    val points: Long,
)
