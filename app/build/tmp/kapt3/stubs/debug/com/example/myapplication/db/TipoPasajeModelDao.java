package com.example.myapplication.db;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\bg\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\'J\b\u0010\u0006\u001a\u00020\u0003H\'J\u0012\u0010\u0007\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\bH\'J\u001a\u0010\t\u001a\u00020\u00032\u0010\u0010\n\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0018\u00010\bH\'J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\f\u001a\u00020\rH\'J\u0016\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\u000f\u001a\u00020\u0010H\'\u00a8\u0006\u0011"}, d2 = {"Lcom/example/myapplication/db/TipoPasajeModelDao;", "", "delete", "", "tipoPasajeModel", "Lcom/example/myapplication/models/TipoPasajeModel;", "deleteAllTipoPasajeModel", "getAll", "", "insertAll", "tipoPasajeModelList", "loadAllByIds", "Pks", "", "loadAllByPkLinea", "pklinea", "", "app_debug"})
public abstract interface TipoPasajeModelDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM TipoPasajeModel")
    public abstract java.util.List<com.example.myapplication.models.TipoPasajeModel> getAll();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM TipoPasajeModel WHERE PKI IN (:Pks)")
    public abstract java.util.List<com.example.myapplication.models.TipoPasajeModel> loadAllByIds(@org.jetbrains.annotations.NotNull()
    int[] Pks);
    
    @androidx.room.Insert()
    public abstract void insertAll(@org.jetbrains.annotations.Nullable()
    java.util.List<com.example.myapplication.models.TipoPasajeModel> tipoPasajeModelList);
    
    @androidx.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.Nullable()
    com.example.myapplication.models.TipoPasajeModel tipoPasajeModel);
    
    @androidx.room.Query(value = "DELETE FROM TipoPasajeModel")
    public abstract void deleteAllTipoPasajeModel();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM TipoPasajeModel WHERE PKLINEA = :pklinea")
    public abstract java.util.List<com.example.myapplication.models.TipoPasajeModel> loadAllByPkLinea(int pklinea);
}