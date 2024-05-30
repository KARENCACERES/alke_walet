package caceres.karen.alke_wallet.model.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class Retrof {
    companion object {
        val retrofit = Retrofit.Builder()
            .baseUrl("http://wallet-main.eba-ccwdurgr.us-east-1.elasticbeanstalk.com/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }
}