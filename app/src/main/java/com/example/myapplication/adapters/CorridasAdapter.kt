package com.example.myapplication.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication.CorridasDiaModel
import com.example.myapplication.Planet
import com.example.myapplication.R
import kotlinx.android.synthetic.main.item_corridas.view.*

class CorridasAdapter (): RecyclerView.Adapter<CorridasAdapter.CorridasViewHolder>() {

    var CorridasDiaModelList:List<CorridasDiaModel>?=null
    private var mContext: Context? = null

    constructor(context: Context, corridas: List<CorridasDiaModel>):this(){
        mContext = context
        this.CorridasDiaModelList = corridas

    }
    class CorridasViewHolder(view: View, itemView: View): RecyclerView.ViewHolder(itemView) {
        var i=0
        val tvNoItemCorrida: TextView=itemView.tvNoItemCorrida
        val tvLineaItemCorrida: TextView=itemView.tvLineaItemCorrida
        val tvRolItemCorrida: TextView=itemView.tvRolItemCorrida
        val tvOrigenCorridaItemCorrida: TextView=itemView.tvOrigenCorridaItemCorrida
        val tvAutobusItemCorrida: TextView=itemView.tvAutobusItemCorrida
        val tvOrigenItemCorrida: TextView=itemView.tvOrigenItemCorrida
        val tvSalidaItemCorrida: TextView=itemView.tvSalidaItemCorrida
        val tvDestinoItemCorrida: TextView=itemView.tvDestinoItemCorrida
        val tvLlegadaItemCorrida: TextView=itemView.tvLegadaItemCorrida
        val tvRutaItemCorrida: TextView=itemView.tvRutaItemCorrida

        fun bind(corrida: CorridasDiaModel?) {
            tvNoItemCorrida.text=""+i
            tvLineaItemCorrida.text=corrida?.LINEA
            tvRolItemCorrida.text=corrida?.ROL
            tvOrigenCorridaItemCorrida.text=corrida?.CORRIDA_DESCRIPCION
            tvAutobusItemCorrida.text=corrida?.AUTOBUS
            tvOrigenItemCorrida.text=corrida?.ORIGEN
            tvSalidaItemCorrida.text=corrida?.SALIDA
            tvDestinoItemCorrida.text=corrida?.DESTINO
            tvLlegadaItemCorrida.text=corrida?.LLEGADA
            tvRutaItemCorrida.text=corrida?.RUTA
            i++
        }

        fun setDetails(corrida: CorridasDiaModel) {

        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, i: Int): CorridasAdapter.CorridasViewHolder {
        val view: View =
            LayoutInflater.from(mContext).inflate(R.layout.item_corridas, parent, false)
        return CorridasAdapter.CorridasViewHolder(parent,view)
    }

    override fun onBindViewHolder(holder: CorridasViewHolder, position: Int) {
        val corrida: CorridasDiaModel = CorridasDiaModelList?.get(position)!!
        holder.bind(CorridasDiaModelList?.get(position))
        holder.setDetails(corrida)
    }

    override fun getItemCount(): Int {
        return CorridasDiaModelList?.size!!
    }

}