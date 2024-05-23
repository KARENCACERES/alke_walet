package caceres.karen.alke_wallet.model

data class LoginResponse(
    val accessToken: String?,
    val error: String?,
    val status: Int?
)
