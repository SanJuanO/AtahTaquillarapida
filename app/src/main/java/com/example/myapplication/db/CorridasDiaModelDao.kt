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
/*
    @Query(" SELECT ROW_NUMBER()over( order by SALIDA asc) as `no`,PK_LINEA,LINEA,PK_ROL,ROL,PK_CORRIDA,NO_CORRIDA,CORRIDA_DESCRIPCION,PK_AUTOBUS,AUTOBUS," +
            " PK_ORIGEN,ORIGEN,SALIDA,PK_DESTINO_COMPLETO PK_DESTINO,DESTINO_COMPLETO DESTINO,LLEGADA_COMPLETO LLEGADA," +
            " ESCALA,PK_RUTA,RUTA,FECHA,PK_CORRIDA_RUTA,BLOQUEADO,GUIA " +
            " FROM CorridasDiaModel " +
            " WHERE PK_ORIGEN=:pk_origen and PK_LINEA=:pk_linea " +
            " GROUP BY PK_LINEA,LINEA,PK_ROL," +
            " ROL,PK_CORRIDA,NO_CORRIDA,CORRIDA_DESCRIPCION,PK_AUTOBUS,AUTOBUS,PK_ORIGEN,ORIGEN,SALIDA," +
            " PK_DESTINO_COMPLETO,DESTINO_COMPLETO,LLEGADA_COMPLETO,ESCALA,PK_RUTA,RUTA,FECHA," +
            " PK_CORRIDA_RUTA,BLOQUEADO,GUIA ORDER BY SALIDA ")
    fun loadCorridasByFiltro(pk_origen: Int, pk_linea: Int): List<CorridasDiaModel>

    @Query(" SELECT ROW_NUMBER()over( order by SALIDA asc) as 'no',PK_LINEA,LINEA,PK_ROL,ROL,PK_CORRIDA,NO_CORRIDA,CORRIDA_DESCRIPCION,PK_AUTOBUS,AUTOBUS," +
            " PK_ORIGEN,ORIGEN,SALIDA,PK_DESTINO_COMPLETO PK_DESTINO,DESTINO_COMPLETO DESTINO,LLEGADA_COMPLETO LLEGADA," +
            " ESCALA,PK_RUTA,RUTA,FECHA,PK_CORRIDA_RUTA,BLOQUEADO,GUIA " +
            " FROM CorridasDiaModel " +
            " WHERE PK_ORIGEN=:pk_origen and PK_LINEA=:pk_linea and PK_ROL=:pk_rol " +
            " GROUP BY PK_LINEA,LINEA,PK_ROL," +
            " ROL,PK_CORRIDA,NO_CORRIDA,CORRIDA_DESCRIPCION,PK_AUTOBUS,AUTOBUS,PK_ORIGEN,ORIGEN,SALIDA," +
            " PK_DESTINO_COMPLETO,DESTINO_COMPLETO,LLEGADA_COMPLETO,ESCALA,PK_RUTA,RUTA,FECHA," +
            " PK_CORRIDA_RUTA,BLOQUEADO,GUIA ORDER BY SALIDA ")
    fun loadCorridasByFiltro2(pk_origen: Int,pk_linea: Int, pk_rol: Int): List<CorridasDiaModel>

    @Query(" SELECT ROW_NUMBER()over( order by SALIDA asc) as 'no',PK_LINEA,LINEA,PK_ROL,ROL,PK_CORRIDA,NO_CORRIDA,CORRIDA_DESCRIPCION,PK_AUTOBUS,AUTOBUS," +
            " PK_ORIGEN,ORIGEN,SALIDA,PK_DESTINO_COMPLETO PK_DESTINO,DESTINO_COMPLETO DESTINO,LLEGADA_COMPLETO LLEGADA," +
            " ESCALA,PK_RUTA,RUTA,FECHA,PK_CORRIDA_RUTA,BLOQUEADO,GUIA " +
            " FROM CorridasDiaModel " +
            " WHERE PK_ORIGEN=:pk_origen and PK_LINEA=(SELECT PK_LINEA FROM CorridasDiaModel WHERE PK=:pk_corrida) and PK_ROL=(SELECT PK_ROL FROM CorridasDiaModel WHERE PK=:pk_corrida) " +
            " GROUP BY PK_LINEA,LINEA,PK_ROL," +
            " ROL,PK_CORRIDA,NO_CORRIDA,CORRIDA_DESCRIPCION,PK_AUTOBUS,AUTOBUS,PK_ORIGEN,ORIGEN,SALIDA," +
            " PK_DESTINO_COMPLETO,DESTINO_COMPLETO,LLEGADA_COMPLETO,ESCALA,PK_RUTA,RUTA,FECHA," +
            " PK_CORRIDA_RUTA,BLOQUEADO,GUIA ORDER BY SALIDA ")
    fun loadCorridasByFiltro0(pk_origen: Int,pk_corrida: Int): List<CorridasDiaModel>
*/
}