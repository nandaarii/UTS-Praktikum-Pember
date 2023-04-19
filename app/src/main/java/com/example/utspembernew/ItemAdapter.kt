package com.example.utspembernew

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ItemAdapter (private val Datadata: ArrayList<Data>, private val context: Context): RecyclerView.Adapter<ItemAdapter.CourseViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemAdapter.CourseViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(
            R.layout.data_layout,
            parent, false
        )
        return CourseViewHolder(itemView)
    }
    override fun onBindViewHolder(holder: ItemAdapter.CourseViewHolder, position: Int) {
        holder.Namafilm.text = Datadata.get(position).NamaFilm
        holder.Durasi.text = Datadata.get(position).Durasi
        holder.Tahuntayang.text = Datadata.get(position).TahunTayang
        holder.foto.setImageResource(Datadata.get(position).foto)
    }
    override fun getItemCount(): Int {
        return Datadata.size
    }
    class CourseViewHolder (itemView: View) : RecyclerView.ViewHolder(itemView) {
        val foto: ImageView = itemView.findViewById(R.id.idfoto)
        val Namafilm: TextView = itemView.findViewById(R.id.idnama)
        val Durasi: TextView = itemView.findViewById(R.id.idnim)
        val Tahuntayang: TextView = itemView.findViewById(R.id.idumur)

    }
}
