package com.example.myapplication.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.myapplication.CorridasDiaModel
import com.example.myapplication.models.DestinosModel
import com.example.myapplication.models.HorariosModel
import com.example.myapplication.models.LineasModel

@Dao
interface CorridasDiaModelDao {
    @Query("SELECT * FROM CorridasDiaModel")
    fun getAll(): List<CorridasDiaModel?>?

    @Query("SELECT * FROM CorridasDiaModel WHERE PK IN (:Pks)")
    fun loadAllByIds(Pks: IntArray): List<CorridasDiaModel>

    @Insert
    fun insertAll(corridasModelList: List<CorridasDiaModel?>?)

    @Delete
    fun delete(corridasModel: CorridasDiaModel?)

    @Query("DELETE FROM CorridasDiaModel")
    fun deleteAllCorridas()

    @Query("select Count(PK) FROM CorridasDiaModel")
    fun countCorridas():Int

    @Query("SELECT PK_LINEA,LINEA FROM CorridasDiaModel GROUP BY PK_LINEA,LINEA")
    fun getLineas():List<LineasModel>

    @Query("SELECT PK_DESTINO,DESTINO,PRECIO FROM CorridasDiaModel WHERE PK_ORIGEN=:pk_origen and PK_LINEA =:pk_linea  GROUP BY PK_DESTINO,DESTINO,PRECIO")
    fun getDestinos(pk_origen:Int,pk_linea:Int):List<DestinosModel>

    @Query("SELECT SALIDA,PRECIO FROM CorridasDiaModel WHERE PK_LINEA =:pk_linea and PK_ORIGEN=:pk_origen and PK_DESTINO=:pk_destino  GROUP BY SALIDA,PRECIO")
    fun getHorarios(pk_linea:Int,pk_origen:Int,pk_destino:Int):List<HorariosModel>

    @Query("SELECT * FROM CorridasDiaModel WHERE GUIA=:guia AND PK_LINEA=:pk_linea AND PK_ORIGEN=:pk_origen AND PK_DESTINO=:pk_destino and SALIDA=:salida")
    fun getCorridaFiltro(guia:String,pk_linea:Int,pk_origen:Int,pk_destino:Int,salida:String):List<CorridasDiaModel>

    @Query("UPDATE CorridasDiaModel SET GUIA='True' WHERE PK=:pk")
    fun updateCorridaGuiaGenerada(pk:Int)



}