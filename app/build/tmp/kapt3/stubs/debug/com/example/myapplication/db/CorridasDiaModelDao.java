package com.example.myapplication.db;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\'J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\'J\b\u0010\b\u001a\u00020\u0005H\'J\u0012\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\nH\'J6\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00070\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u0011\u001a\u00020\rH\'J\u001e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00130\n2\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u0003H\'J&\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00150\n2\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0010\u001a\u00020\u0003H\'J\u000e\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00170\nH\'J\u001a\u0010\u0018\u001a\u00020\u00052\u0010\u0010\u0019\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0007\u0018\u00010\nH\'J\u0016\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00070\n2\u0006\u0010\u001b\u001a\u00020\u001cH\'J\u0010\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u0003H\'\u00a8\u0006\u001f"}, d2 = {"Lcom/example/myapplication/db/CorridasDiaModelDao;", "", "countCorridas", "", "delete", "", "corridasModel", "Lcom/example/myapplication/CorridasDiaModel;", "deleteAllCorridas", "getAll", "", "getCorridaFiltro", "guia", "", "pk_linea", "pk_origen", "pk_destino", "salida", "getDestinos", "Lcom/example/myapplication/models/DestinosModel;", "getHorarios", "Lcom/example/myapplication/models/HorariosModel;", "getLineas", "Lcom/example/myapplication/models/LineasModel;", "insertAll", "corridasModelList", "loadAllByIds", "Pks", "", "updateCorridaGuiaGenerada", "pk", "app_debug"})
public abstract interface CorridasDiaModelDao {
    
    @org.jetbrains.annotations.Nullable()
    @androidx.room.Query(value = "SELECT * FROM CorridasDiaModel")
    public abstract java.util.List<com.example.myapplication.CorridasDiaModel> getAll();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM CorridasDiaModel WHERE PK IN (:Pks)")
    public abstract java.util.List<com.example.myapplication.CorridasDiaModel> loadAllByIds(@org.jetbrains.annotations.NotNull()
    int[] Pks);
    
    @androidx.room.Insert()
    public abstract void insertAll(@org.jetbrains.annotations.Nullable()
    java.util.List<com.example.myapplication.CorridasDiaModel> corridasModelList);
    
    @androidx.room.Delete()
    public abstract void delete(@org.jetbrains.annotations.Nullable()
    com.example.myapplication.CorridasDiaModel corridasModel);
    
    @androidx.room.Query(value = "DELETE FROM CorridasDiaModel")
    public abstract void deleteAllCorridas();
    
    @androidx.room.Query(value = "select Count(PK) FROM CorridasDiaModel")
    public abstract int countCorridas();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT PK_LINEA,LINEA FROM CorridasDiaModel GROUP BY PK_LINEA,LINEA")
    public abstract java.util.List<com.example.myapplication.models.LineasModel> getLineas();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT PK_DESTINO,DESTINO,PRECIO FROM CorridasDiaModel WHERE PK_ORIGEN=:pk_origen and PK_LINEA =:pk_linea  GROUP BY PK_DESTINO,DESTINO,PRECIO")
    public abstract java.util.List<com.example.myapplication.models.DestinosModel> getDestinos(int pk_origen, int pk_linea);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT SALIDA,PRECIO FROM CorridasDiaModel WHERE PK_LINEA =:pk_linea and PK_ORIGEN=:pk_origen and PK_DESTINO=:pk_destino  GROUP BY SALIDA,PRECIO")
    public abstract java.util.List<com.example.myapplication.models.HorariosModel> getHorarios(int pk_linea, int pk_origen, int pk_destino);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM CorridasDiaModel WHERE GUIA=:guia AND PK_LINEA=:pk_linea AND PK_ORIGEN=:pk_origen AND PK_DESTINO=:pk_destino and SALIDA=:salida")
    public abstract java.util.List<com.example.myapplication.CorridasDiaModel> getCorridaFiltro(@org.jetbrains.annotations.NotNull()
    java.lang.String guia, int pk_linea, int pk_origen, int pk_destino, @org.jetbrains.annotations.NotNull()
    java.lang.String salida);
    
    @androidx.room.Query(value = "UPDATE CorridasDiaModel SET GUIA=\'True\' WHERE PK=:pk")
    public abstract void updateCorridaGuiaGenerada(int pk);
}