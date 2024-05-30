package caceres.karen.alke_wallet.model.network

import caceres.karen.alke_wallet.model.User
import retrofit2.Call
import retrofit2.http.Header
import retrofit2.http.POST

interface AccountService {
    @POST("/users")
    fun obtenerInfoLogin(
        @Header (value = "Authorization") token: String):
            Call<User>
}