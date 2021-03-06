package com.example.myapplication.db;

import java.lang.System;

@androidx.room.Database(entities = {com.example.myapplication.CorridasDiaModel.class, com.example.myapplication.models.TipoPasajeModel.class}, version = 2)
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&J\b\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u0007"}, d2 = {"Lcom/example/myapplication/db/AppDatabase;", "Landroidx/room/RoomDatabase;", "()V", "CorridasDiaModelDao", "Lcom/example/myapplication/db/CorridasDiaModelDao;", "TipoPasajeModelDao", "Lcom/example/myapplication/db/TipoPasajeModelDao;", "app_debug"})
public abstract class AppDatabase extends androidx.room.RoomDatabase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.myapplication.db.CorridasDiaModelDao CorridasDiaModelDao();
    
    @org.jetbrains.annotations.NotNull()
    public abstract com.example.myapplication.db.TipoPasajeModelDao TipoPasajeModelDao();
    
    public AppDatabase() {
        super();
    }
}