package caceres.karen.alke_wallet.model.network

import caceres.karen.alke_wallet.model.RegisterRequest
import caceres.karen.alke_wallet.model.RegisterResponse
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.POST

interface CrearCuentaService {
    @POST("users")
    fun crearUsuario(@Body usuarioCreado: RegisterRequest): Call<RegisterResponse>
}