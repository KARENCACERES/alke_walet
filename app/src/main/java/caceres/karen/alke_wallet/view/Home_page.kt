package caceres.karen.alke_wallet.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import caceres.karen.alke_wallet.R
import caceres.karen.alke_wallet.view.adapter.ListTransactionAdapter
import caceres.karen.alke_wallet.databinding.ActivityHomePage5Binding
import caceres.karen.alke_wallet.model.Transaction

class home_page : AppCompatActivity() {

    //instanciamos binding
    lateinit var binding: ActivityHomePage5Binding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        //configuramos el binding
        binding = ActivityHomePage5Binding.inflate(layoutInflater)

        //vamos a setear la vista a mostrar
        setContentView(binding.root)

        //vamos a crear la lista de usuarios y transacciones
        val transacciones = arrayOf(
            Transaction("Yara", "Khalil", "$500.00", "2024-05-25", imageView = R.drawable.primera_transaccion),
            Transaction("Sara", "Ibrahim", "$400.00", "2024-05-20", imageView = R.drawable.segunda_transaccion),
            Transaction("Ahmad", "Ibrahim", "300.00", "2024-05-15", imageView = R.drawable.tercera_transaccion),
            Transaction("Reem", "Khaled", "200.00", "2024-05-10",imageView = R.drawable.cuarta_transaccion),
            Transaction("Hiba", "Saleh", "100.00", "2024-10-05",imageView = R.drawable.quinta_transaccion),
            Transaction("Ariel", "Caceres", "600.00", "2024-05-01",imageView = R.drawable.profile_icon)
        )

        //aqui vamos a crear el adaptador
        val adapter = ListTransactionAdapter(transacciones.toList())
        binding.recyclerListUser.adapter = adapter
        binding.recyclerListUser.layoutManager = LinearLayoutManager(this)
    }
}