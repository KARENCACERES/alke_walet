package caceres.karen.alke_wallet.model.network

import caceres.karen.alke_wallet.model.LoginRequest
import caceres.karen.alke_wallet.model.LoginResponse
import caceres.karen.alke_wallet.model.RegisterRequest
import caceres.karen.alke_wallet.model.RegisterResponse
import caceres.karen.alke_wallet.model.UserResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers
import retrofit2.http.POST

interface ApiService {
    //Ruta del login es auth/login (Post)
    //ruta del register es users (Post)
    // traer la informacion del usuario con token es auth/me (Get)

    //Login
    @Headers("Content-Type: application/json")
    @POST("auth/login")
    suspend fun login(@Body request: LoginRequest): LoginResponse

    //Registro
    @Headers("Content-Type: application/json")
    @POST("users")
    suspend fun register(@Body request: RegisterRequest): RegisterResponse

    //informacion usuario
    @GET("auth/me") //lo vemos con UserResponse
    suspend fun getUserData(@Header("Authorization") token: String): Response<UserResponse>
}