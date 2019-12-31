package com.eivier.nutritionalapp.adapterRecyclerView

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.eivier.nutritionalapp.ClickListener
import com.eivier.nutritionalapp.R
import com.eivier.nutritionalapp.model.Recetas
import kotlinx.android.synthetic.main.layout_recycler_view.view.*

class AdapterReceta(var recetas: ArrayList<Recetas>, var clickListener: ClickListener) :
    RecyclerView.Adapter<AdapterReceta.ViewHolder>() {

    //var recetas: ArrayList<Recetas>
    lateinit var viewHolder: ViewHolder

    init {
        this.recetas = recetas
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.layout_recycler_view, parent, false)
        viewHolder = ViewHolder(view, clickListener)
        return viewHolder
    }

    override fun getItemCount(): Int {
        return this.recetas.count()
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val receta = recetas.get(position)
        holder.nombre.text = receta.nombre
        holder.tiempo.text = receta.tiempo
        holder.imagen.setImageResource(receta.imagen)
    }

    class ViewHolder(view: View, listener: ClickListener) : RecyclerView.ViewHolder(view),
        View.OnClickListener {

        var view = view
        var nombre: TextView
        var tiempo: TextView
        var imagen: ImageView
        var listener: ClickListener

        init {
            nombre = view.NombreReceta
            tiempo = view.Duracion
            imagen = view.imgReceta
            this.listener = listener
            view.setOnClickListener(this)
        }

        override fun onClick(view: View?) {
            this.listener.onClick(view!!, adapterPosition)
        }
    }

}