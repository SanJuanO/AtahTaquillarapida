package com.example.myapplication.models;

import java.lang.System;

@androidx.room.Entity()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0010\u0006\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0012\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u000f\"\u0004\b\u0014\u0010\u0011R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u001e\u0010\u001b\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0018\"\u0004\b\u001d\u0010\u001aR\u001e\u0010\u001e\u001a\u00020\u00168\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001aR\u001e\u0010!\u001a\u00020\"8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001e\u0010\'\u001a\u00020\r8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u000f\"\u0004\b)\u0010\u0011\u00a8\u0006*"}, d2 = {"Lcom/example/myapplication/models/TipoPasajeModel;", "", "()V", "ACTIVO", "", "getACTIVO", "()Z", "setACTIVO", "(Z)V", "BORRADO", "getBORRADO", "setBORRADO", "COLOR", "", "getCOLOR", "()Ljava/lang/String;", "setCOLOR", "(Ljava/lang/String;)V", "PASAJE", "getPASAJE", "setPASAJE", "PERMITIDOS", "", "getPERMITIDOS", "()I", "setPERMITIDOS", "(I)V", "PKI", "getPKI", "setPKI", "PKLINEA", "getPKLINEA", "setPKLINEA", "PORCENTAJE", "", "getPORCENTAJE", "()D", "setPORCENTAJE", "(D)V", "USUARIO_M", "getUSUARIO_M", "setUSUARIO_M", "app_debug"})
public final class TipoPasajeModel {
    @androidx.room.PrimaryKey()
    private int PKI = 0;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "PASAJE")
    private java.lang.String PASAJE = "";
    @androidx.room.ColumnInfo(name = "PKLINEA")
    private int PKLINEA = 0;
    @androidx.room.ColumnInfo(name = "PORCENTAJE")
    private double PORCENTAJE = 0.0;
    @androidx.room.ColumnInfo(name = "BORRADO")
    private boolean BORRADO = false;
    @androidx.room.ColumnInfo(name = "ACTIVO")
    private boolean ACTIVO = false;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "USUARIO_M")
    private java.lang.String USUARIO_M = "";
    @androidx.room.ColumnInfo(name = "PERMITIDOS")
    private int PERMITIDOS = 0;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "COLOR")
    private java.lang.String COLOR = "";
    
    public final int getPKI() {
        return 0;
    }
    
    public final void setPKI(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPASAJE() {
        return null;
    }
    
    public final void setPASAJE(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getPKLINEA() {
        return 0;
    }
    
    public final void setPKLINEA(int p0) {
    }
    
    public final double getPORCENTAJE() {
        return 0.0;
    }
    
    public final void setPORCENTAJE(double p0) {
    }
    
    public final boolean getBORRADO() {
        return false;
    }
    
    public final void setBORRADO(boolean p0) {
    }
    
    public final boolean getACTIVO() {
        return false;
    }
    
    public final void setACTIVO(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUSUARIO_M() {
        return null;
    }
    
    public final void setUSUARIO_M(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getPERMITIDOS() {
        return 0;
    }
    
    public final void setPERMITIDOS(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCOLOR() {
        return null;
    }
    
    public final void setCOLOR(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public TipoPasajeModel() {
        super();
    }
}