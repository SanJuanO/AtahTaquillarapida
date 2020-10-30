package com.example.myapplication.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.myapplication.CorridasDiaModel
import com.example.myapplication.models.TipoPasajeModel

@Database(
    entities = [CorridasDiaModel::class, TipoPasajeModel::class],
    version = 2
)

abstract class AppDatabase : RoomDatabase() {
    abstract fun CorridasDiaModelDao(): CorridasDiaModelDao
    abstract fun TipoPasajeModelDao(): TipoPasajeModelDao

}