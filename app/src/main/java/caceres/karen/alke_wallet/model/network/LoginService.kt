package caceres.karen.alke_wallet.model.network

import caceres.karen.alke_wallet.model.LoginRequest
import caceres.karen.alke_wallet.model.LoginResponse
import caceres.karen.alke_wallet.model.User
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST

/**Api service que contiene los metodos para LOGEAR al usuario
 *
 */
interface LoginService {
    /**Servicio que hace login al usuario, recibe como parametros el email y la contraseña
     * encapsulados en un OBJETO de tipo RequestLogin
     */

    @POST("auth/login")
    fun hacerLogin(@Body request: LoginRequest): Call<LoginResponse>;

    @GET("auth/me")
    fun obtenerInfoLogin(@Header("Authorization") token: String): Call<User>
}
