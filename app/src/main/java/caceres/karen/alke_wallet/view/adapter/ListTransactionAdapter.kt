package caceres.karen.alke_wallet.view.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import caceres.karen.alke_wallet.R
import caceres.karen.alke_wallet.model.Transaccion

class ListTransactionAdapter(private val ListaTransacciones: List<Transaccion>) :
    RecyclerView.Adapter<ListTransactionAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {


        val itemName: TextView = view.findViewById(R.id.recycler_list_user)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.activity_home_page, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return ListaTransacciones.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemName.text = ListaTransacciones[position].name
    }


}
