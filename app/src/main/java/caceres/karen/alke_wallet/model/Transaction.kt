package caceres.karen.alke_wallet.model

data class Transaction(
    val name: String,
    val lastname: String,
    val amount: String,
    val date: String,
    val imgurl: String?=null,
    val imageView: Int
)
