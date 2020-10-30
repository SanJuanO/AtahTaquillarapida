package com.example.myapplication.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.myapplication.models.TipoPasajeModel

@Dao
interface TipoPasajeModelDao {
    @Query("SELECT * FROM TipoPasajeModel")
    fun getAll(): List<TipoPasajeModel?>?

    @Query("SELECT * FROM TipoPasajeModel WHERE PKI IN (:Pks)")
    fun loadAllByIds(Pks: IntArray): List<TipoPasajeModel>

    @Insert
    fun insertAll(tipoPasajeModelList: List<TipoPasajeModel?>?)

    @Delete
    fun delete(tipoPasajeModel: TipoPasajeModel?)

    @Query("DELETE FROM TipoPasajeModel")
    fun deleteAllTipoPasajeModel()

    @Query("SELECT * FROM TipoPasajeModel WHERE PKLINEA = :pklinea")
    fun loadAllByPkLinea(pklinea: Int): List<TipoPasajeModel>

}