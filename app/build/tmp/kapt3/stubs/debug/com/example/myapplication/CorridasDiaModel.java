package com.example.myapplication;

import java.lang.System;

@androidx.room.Entity()
@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b5\n\u0002\u0010\b\n\u0002\b2\n\u0002\u0010\u0006\n\u0002\b\u001d\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001e\u0010\t\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001e\u0010\f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001e\u0010\u000f\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001e\u0010\u0012\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001e\u0010\u0015\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001e\u0010\u0018\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001e\u0010\u001b\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001e\u0010\u001e\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001e\u0010!\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001e\u0010$\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR\u001e\u0010\'\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\bR\u001e\u0010*\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0006\"\u0004\b,\u0010\bR\u001e\u0010-\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0006\"\u0004\b/\u0010\bR\u001e\u00100\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0006\"\u0004\b2\u0010\bR\u001e\u00103\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0006\"\u0004\b5\u0010\bR\u001e\u00106\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u0010\u0006\"\u0004\b8\u0010\bR\u001e\u00109\u001a\u00020:8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b;\u0010<\"\u0004\b=\u0010>R\u001e\u0010?\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0006\"\u0004\bA\u0010\bR\u001e\u0010B\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u0006\"\u0004\bD\u0010\bR\u001e\u0010E\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u0006\"\u0004\bG\u0010\bR\u001e\u0010H\u001a\u00020:8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010<\"\u0004\bJ\u0010>R\u001e\u0010K\u001a\u00020:8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u0010<\"\u0004\bM\u0010>R\u001e\u0010N\u001a\u00020:8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bO\u0010<\"\u0004\bP\u0010>R\u001e\u0010Q\u001a\u00020:8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bR\u0010<\"\u0004\bS\u0010>R\u001e\u0010T\u001a\u00020:8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bU\u0010<\"\u0004\bV\u0010>R\u001e\u0010W\u001a\u00020:8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bX\u0010<\"\u0004\bY\u0010>R\u001e\u0010Z\u001a\u00020:8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b[\u0010<\"\u0004\b\\\u0010>R\u001e\u0010]\u001a\u00020:8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b^\u0010<\"\u0004\b_\u0010>R\u001e\u0010`\u001a\u00020:8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\ba\u0010<\"\u0004\bb\u0010>R\u001e\u0010c\u001a\u00020:8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bd\u0010<\"\u0004\be\u0010>R\u001e\u0010f\u001a\u00020:8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bg\u0010<\"\u0004\bh\u0010>R\u001e\u0010i\u001a\u00020:8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bj\u0010<\"\u0004\bk\u0010>R\u001e\u0010l\u001a\u00020m8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\u001e\u0010r\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bs\u0010\u0006\"\u0004\bt\u0010\bR\u001e\u0010u\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bv\u0010\u0006\"\u0004\bw\u0010\bR\u001e\u0010x\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\by\u0010\u0006\"\u0004\bz\u0010\bR\u001e\u0010{\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b|\u0010\u0006\"\u0004\b}\u0010\bR\u001f\u0010~\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000f\n\u0000\u001a\u0004\b\u007f\u0010\u0006\"\u0005\b\u0080\u0001\u0010\bR!\u0010\u0081\u0001\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0082\u0001\u0010\u0006\"\u0005\b\u0083\u0001\u0010\bR!\u0010\u0084\u0001\u001a\u00020:8\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0085\u0001\u0010<\"\u0005\b\u0086\u0001\u0010>R!\u0010\u0087\u0001\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0088\u0001\u0010\u0006\"\u0005\b\u0089\u0001\u0010\b\u00a8\u0006\u008a\u0001"}, d2 = {"Lcom/example/myapplication/CorridasDiaModel;", "", "()V", "APELLIDOS", "", "getAPELLIDOS", "()Ljava/lang/String;", "setAPELLIDOS", "(Ljava/lang/String;)V", "AUTOBUS", "getAUTOBUS", "setAUTOBUS", "BLOQUEADO", "getBLOQUEADO", "setBLOQUEADO", "COMPLETO", "getCOMPLETO", "setCOMPLETO", "CORRIDA_DESCRIPCION", "getCORRIDA_DESCRIPCION", "setCORRIDA_DESCRIPCION", "DESTINO", "getDESTINO", "setDESTINO", "DESTINO_COMPLETO", "getDESTINO_COMPLETO", "setDESTINO_COMPLETO", "ESCALA", "getESCALA", "setESCALA", "FECHA", "getFECHA", "setFECHA", "FECHA_C", "getFECHA_C", "setFECHA_C", "FECHA_M", "getFECHA_M", "setFECHA_M", "GUIA", "getGUIA", "setGUIA", "LINEA", "getLINEA", "setLINEA", "LLEGADA", "getLLEGADA", "setLLEGADA", "LLEGADA_C", "getLLEGADA_C", "setLLEGADA_C", "LLEGADA_COMPLETO", "getLLEGADA_COMPLETO", "setLLEGADA_COMPLETO", "NOMBRE", "getNOMBRE", "setNOMBRE", "NO_CORRIDA", "", "getNO_CORRIDA", "()I", "setNO_CORRIDA", "(I)V", "ORIGEN", "getORIGEN", "setORIGEN", "ORIGEN_COMPLETO", "getORIGEN_COMPLETO", "setORIGEN_COMPLETO", "PISOS", "getPISOS", "setPISOS", "PK", "getPK", "setPK", "PK_AUTOBUS", "getPK_AUTOBUS", "setPK_AUTOBUS", "PK_CHOFER", "getPK_CHOFER", "setPK_CHOFER", "PK_CORRIDA", "getPK_CORRIDA", "setPK_CORRIDA", "PK_CORRIDA_RUTA", "getPK_CORRIDA_RUTA", "setPK_CORRIDA_RUTA", "PK_DESTINO", "getPK_DESTINO", "setPK_DESTINO", "PK_DESTINO_COMPLETO", "getPK_DESTINO_COMPLETO", "setPK_DESTINO_COMPLETO", "PK_LINEA", "getPK_LINEA", "setPK_LINEA", "PK_ORIGEN", "getPK_ORIGEN", "setPK_ORIGEN", "PK_ORIGEN_COMPLETO", "getPK_ORIGEN_COMPLETO", "setPK_ORIGEN_COMPLETO", "PK_ROL", "getPK_ROL", "setPK_ROL", "PK_RUTA", "getPK_RUTA", "setPK_RUTA", "PRECIO", "", "getPRECIO", "()D", "setPRECIO", "(D)V", "ROL", "getROL", "setROL", "RUTA", "getRUTA", "setRUTA", "SALIDA", "getSALIDA", "setSALIDA", "SALIDA_C", "getSALIDA_C", "setSALIDA_C", "SALIDA_COMPLETO", "getSALIDA_COMPLETO", "setSALIDA_COMPLETO", "TIEMPO", "getTIEMPO", "setTIEMPO", "TIPO_PK", "getTIPO_PK", "setTIPO_PK", "USUARIO", "getUSUARIO", "setUSUARIO", "app_debug"})
public final class CorridasDiaModel {
    @androidx.room.PrimaryKey()
    private int PK = 0;
    @androidx.room.ColumnInfo(name = "PK_LINEA")
    private int PK_LINEA = 0;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "LINEA")
    private java.lang.String LINEA = "";
    @androidx.room.ColumnInfo(name = "PK_ROL")
    private int PK_ROL = 0;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "PK_CORRIDA")
    private java.lang.String ROL = "";
    @androidx.room.ColumnInfo(name = "CORRIDA")
    private int PK_CORRIDA = 0;
    @androidx.room.ColumnInfo(name = "NO_CORRIDA")
    private int NO_CORRIDA = 0;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "CORRIDA_DESCRIPCION")
    private java.lang.String CORRIDA_DESCRIPCION = "";
    @androidx.room.ColumnInfo(name = "PK_AUTOBUS")
    private int PK_AUTOBUS = 0;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "AUTOBUS")
    private java.lang.String AUTOBUS = "";
    @androidx.room.ColumnInfo(name = "TIPO_PK")
    private int TIPO_PK = 0;
    @androidx.room.ColumnInfo(name = "PK_ORIGEN")
    private int PK_ORIGEN = 0;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "ORIGEN")
    private java.lang.String ORIGEN = "";
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "SALIDA")
    private java.lang.String SALIDA = "";
    @androidx.room.ColumnInfo(name = "PK_DESTINO")
    private int PK_DESTINO = 0;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "DESTINO")
    private java.lang.String DESTINO = "";
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "LLEGADA")
    private java.lang.String LLEGADA = "";
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "ESCALA")
    private java.lang.String ESCALA = "";
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "FECHA")
    private java.lang.String FECHA = "";
    @androidx.room.ColumnInfo(name = "PK_RUTA")
    private int PK_RUTA = 0;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "RUTA")
    private java.lang.String RUTA = "";
    @androidx.room.ColumnInfo(name = "PK_CORRIDA_RUTA")
    private int PK_CORRIDA_RUTA = 0;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "BLOQUEADO")
    private java.lang.String BLOQUEADO = "";
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "GUIA")
    private java.lang.String GUIA = "";
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "COMPLETO")
    private java.lang.String COMPLETO = "";
    @androidx.room.ColumnInfo(name = "PK_ORIGEN_COMPLETO")
    private int PK_ORIGEN_COMPLETO = 0;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "ORIGEN_COMPLETO")
    private java.lang.String ORIGEN_COMPLETO = "";
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "SALIDA_COMPLETO")
    private java.lang.String SALIDA_COMPLETO = "";
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "SALIDA_C")
    private java.lang.String SALIDA_C = "";
    @androidx.room.ColumnInfo(name = "PK_DESTINO_COMPLETO")
    private int PK_DESTINO_COMPLETO = 0;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "DESTINO_COMPLETO")
    private java.lang.String DESTINO_COMPLETO = "";
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "LLEGADA_COMPLETO")
    private java.lang.String LLEGADA_COMPLETO = "";
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "LLEGADA_C")
    private java.lang.String LLEGADA_C = "";
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "FECHA_C")
    private java.lang.String FECHA_C = "";
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "FECHA_M")
    private java.lang.String FECHA_M = "";
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "USUARIO")
    private java.lang.String USUARIO = "";
    @androidx.room.ColumnInfo(name = "PK_CHOFER")
    private int PK_CHOFER = 0;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "NOMBRE")
    private java.lang.String NOMBRE = "";
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "APELLIDOS")
    private java.lang.String APELLIDOS = "";
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "PISOS")
    private java.lang.String PISOS = "";
    @org.jetbrains.annotations.NotNull()
    @androidx.room.ColumnInfo(name = "TIEMPO")
    private java.lang.String TIEMPO = "";
    @androidx.room.ColumnInfo(name = "PRECIO")
    private double PRECIO = 0.0;
    
    public final int getPK() {
        return 0;
    }
    
    public final void setPK(int p0) {
    }
    
    public final int getPK_LINEA() {
        return 0;
    }
    
    public final void setPK_LINEA(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLINEA() {
        return null;
    }
    
    public final void setLINEA(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getPK_ROL() {
        return 0;
    }
    
    public final void setPK_ROL(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getROL() {
        return null;
    }
    
    public final void setROL(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getPK_CORRIDA() {
        return 0;
    }
    
    public final void setPK_CORRIDA(int p0) {
    }
    
    public final int getNO_CORRIDA() {
        return 0;
    }
    
    public final void setNO_CORRIDA(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCORRIDA_DESCRIPCION() {
        return null;
    }
    
    public final void setCORRIDA_DESCRIPCION(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getPK_AUTOBUS() {
        return 0;
    }
    
    public final void setPK_AUTOBUS(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAUTOBUS() {
        return null;
    }
    
    public final void setAUTOBUS(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getTIPO_PK() {
        return 0;
    }
    
    public final void setTIPO_PK(int p0) {
    }
    
    public final int getPK_ORIGEN() {
        return 0;
    }
    
    public final void setPK_ORIGEN(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getORIGEN() {
        return null;
    }
    
    public final void setORIGEN(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSALIDA() {
        return null;
    }
    
    public final void setSALIDA(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getPK_DESTINO() {
        return 0;
    }
    
    public final void setPK_DESTINO(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDESTINO() {
        return null;
    }
    
    public final void setDESTINO(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLLEGADA() {
        return null;
    }
    
    public final void setLLEGADA(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getESCALA() {
        return null;
    }
    
    public final void setESCALA(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFECHA() {
        return null;
    }
    
    public final void setFECHA(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getPK_RUTA() {
        return 0;
    }
    
    public final void setPK_RUTA(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getRUTA() {
        return null;
    }
    
    public final void setRUTA(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getPK_CORRIDA_RUTA() {
        return 0;
    }
    
    public final void setPK_CORRIDA_RUTA(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getBLOQUEADO() {
        return null;
    }
    
    public final void setBLOQUEADO(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getGUIA() {
        return null;
    }
    
    public final void setGUIA(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCOMPLETO() {
        return null;
    }
    
    public final void setCOMPLETO(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getPK_ORIGEN_COMPLETO() {
        return 0;
    }
    
    public final void setPK_ORIGEN_COMPLETO(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getORIGEN_COMPLETO() {
        return null;
    }
    
    public final void setORIGEN_COMPLETO(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSALIDA_COMPLETO() {
        return null;
    }
    
    public final void setSALIDA_COMPLETO(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSALIDA_C() {
        return null;
    }
    
    public final void setSALIDA_C(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getPK_DESTINO_COMPLETO() {
        return 0;
    }
    
    public final void setPK_DESTINO_COMPLETO(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDESTINO_COMPLETO() {
        return null;
    }
    
    public final void setDESTINO_COMPLETO(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLLEGADA_COMPLETO() {
        return null;
    }
    
    public final void setLLEGADA_COMPLETO(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getLLEGADA_C() {
        return null;
    }
    
    public final void setLLEGADA_C(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFECHA_C() {
        return null;
    }
    
    public final void setFECHA_C(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFECHA_M() {
        return null;
    }
    
    public final void setFECHA_M(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUSUARIO() {
        return null;
    }
    
    public final void setUSUARIO(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getPK_CHOFER() {
        return 0;
    }
    
    public final void setPK_CHOFER(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNOMBRE() {
        return null;
    }
    
    public final void setNOMBRE(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getAPELLIDOS() {
        return null;
    }
    
    public final void setAPELLIDOS(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getPISOS() {
        return null;
    }
    
    public final void setPISOS(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTIEMPO() {
        return null;
    }
    
    public final void setTIEMPO(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final double getPRECIO() {
        return 0.0;
    }
    
    public final void setPRECIO(double p0) {
    }
    
    public CorridasDiaModel() {
        super();
    }
}