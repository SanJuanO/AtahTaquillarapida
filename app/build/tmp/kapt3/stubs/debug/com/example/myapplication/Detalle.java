package com.example.myapplication;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b2\n\u0002\u0018\u0002\n\u0002\bk\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u00a2\u0001\u001a\u00030\u00a3\u0001J\u0016\u0010\u00a4\u0001\u001a\u00030\u00a3\u00012\n\u0010\u00a5\u0001\u001a\u0005\u0018\u00010\u00a6\u0001H\u0014J\u0012\u0010\u00a7\u0001\u001a\u00030\u00a3\u00012\b\u0010\u00a8\u0001\u001a\u00030\u00a9\u0001R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u0006\"\u0004\b\u000b\u0010\bR\u001a\u0010\f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0006\"\u0004\b\u000e\u0010\bR\u001a\u0010\u000f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0006\"\u0004\b\u0011\u0010\bR\u001a\u0010\u0012\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0006\"\u0004\b\u0014\u0010\bR\u001a\u0010\u0015\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0006\"\u0004\b\u0017\u0010\bR\u001a\u0010\u0018\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u0006\"\u0004\b\u001a\u0010\bR\u001a\u0010\u001b\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u0006\"\u0004\b\u001d\u0010\bR\u001a\u0010\u001e\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u0006\"\u0004\b \u0010\bR\u001a\u0010!\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0006\"\u0004\b#\u0010\bR\u001a\u0010$\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010\u0006\"\u0004\b&\u0010\bR\u001a\u0010\'\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010\u0006\"\u0004\b)\u0010\bR\u001a\u0010*\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0006\"\u0004\b,\u0010\bR\u001a\u0010-\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b.\u0010\u0006\"\u0004\b/\u0010\bR\u001a\u00100\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u0006\"\u0004\b2\u0010\bR\u001a\u00103\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b4\u0010\u0006\"\u0004\b5\u0010\bR \u00106\u001a\b\u0012\u0004\u0012\u00020\u000407X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b8\u00109\"\u0004\b:\u0010;R\u001a\u0010<\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b=\u0010\u0006\"\u0004\b>\u0010\bR\u001a\u0010?\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010\u0006\"\u0004\bA\u0010\bR\u001a\u0010B\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bC\u0010\u0006\"\u0004\bD\u0010\bR\u001a\u0010E\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bF\u0010\u0006\"\u0004\bG\u0010\bR\u001a\u0010H\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bI\u0010\u0006\"\u0004\bJ\u0010\bR\u001a\u0010K\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bL\u0010\u0006\"\u0004\bM\u0010\bR\u001a\u0010N\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bO\u0010\u0006\"\u0004\bP\u0010\bR\u001a\u0010Q\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bR\u0010\u0006\"\u0004\bS\u0010\bR\u001a\u0010T\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bU\u0010\u0006\"\u0004\bV\u0010\bR\u001a\u0010W\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bX\u0010\u0006\"\u0004\bY\u0010\bR\u001a\u0010Z\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b[\u0010\u0006\"\u0004\b\\\u0010\bR\u001a\u0010]\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b^\u0010\u0006\"\u0004\b_\u0010\bR\u001a\u0010`\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\ba\u0010\u0006\"\u0004\bb\u0010\bR\u001a\u0010c\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bd\u0010\u0006\"\u0004\be\u0010\bR\u001a\u0010f\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bg\u0010\u0006\"\u0004\bh\u0010\bR\u001a\u0010i\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bj\u0010\u0006\"\u0004\bk\u0010\bR \u0010l\u001a\b\u0012\u0004\u0012\u00020\u000407X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bm\u00109\"\u0004\bn\u0010;R\u001a\u0010o\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bp\u0010\u0006\"\u0004\bq\u0010\bR\u001a\u0010r\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bs\u0010\u0006\"\u0004\bt\u0010\bR\u001a\u0010u\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bv\u0010\u0006\"\u0004\bw\u0010\bR \u0010x\u001a\b\u0012\u0004\u0012\u00020\u000407X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\by\u00109\"\u0004\bz\u0010;R \u0010{\u001a\b\u0012\u0004\u0012\u00020\u000407X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b|\u00109\"\u0004\b}\u0010;R\u001b\u0010~\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u000f\n\u0000\u001a\u0004\b\u007f\u0010\u0006\"\u0005\b\u0080\u0001\u0010\bR\u001d\u0010\u0081\u0001\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0082\u0001\u0010\u0006\"\u0005\b\u0083\u0001\u0010\bR\u001d\u0010\u0084\u0001\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0085\u0001\u0010\u0006\"\u0005\b\u0086\u0001\u0010\bR\u001d\u0010\u0087\u0001\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0088\u0001\u0010\u0006\"\u0005\b\u0089\u0001\u0010\bR\u001d\u0010\u008a\u0001\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008b\u0001\u0010\u0006\"\u0005\b\u008c\u0001\u0010\bR\u001d\u0010\u008d\u0001\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u008e\u0001\u0010\u0006\"\u0005\b\u008f\u0001\u0010\bR\u001d\u0010\u0090\u0001\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0091\u0001\u0010\u0006\"\u0005\b\u0092\u0001\u0010\bR\u001d\u0010\u0093\u0001\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0094\u0001\u0010\u0006\"\u0005\b\u0095\u0001\u0010\bR\u001d\u0010\u0096\u0001\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u0097\u0001\u0010\u0006\"\u0005\b\u0098\u0001\u0010\bR\u001d\u0010\u0099\u0001\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u009a\u0001\u0010\u0006\"\u0005\b\u009b\u0001\u0010\bR\u001d\u0010\u009c\u0001\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u009d\u0001\u0010\u0006\"\u0005\b\u009e\u0001\u0010\bR\u001d\u0010\u009f\u0001\u001a\u00020\u0004X\u0086\u000e\u00a2\u0006\u0010\n\u0000\u001a\u0005\b\u00a0\u0001\u0010\u0006\"\u0005\b\u00a1\u0001\u0010\b\u00a8\u0006\u00aa\u0001"}, d2 = {"Lcom/example/myapplication/Detalle;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "URL", "", "getURL", "()Ljava/lang/String;", "setURL", "(Ljava/lang/String;)V", "URL2", "getURL2", "setURL2", "area", "getArea", "setArea", "cantidad", "getCantidad", "setCantidad", "cantidadAviso", "getCantidadAviso", "setCantidadAviso", "centroCostos", "getCentroCostos", "setCentroCostos", "ciudadano", "getCiudadano", "setCiudadano", "clase", "getClase", "setClase", "codigo", "getCodigo", "setCodigo", "color", "getColor", "setColor", "correoResponsableArea", "getCorreoResponsableArea", "setCorreoResponsableArea", "correoResponsableUbicacion", "getCorreoResponsableUbicacion", "setCorreoResponsableUbicacion", "costo", "getCosto", "setCosto", "descripcion", "getDescripcion", "setDescripcion", "diasAviso", "getDiasAviso", "setDiasAviso", "diasMantenimiento", "getDiasMantenimiento", "setDiasMantenimiento", "estado", "Ljava/util/ArrayList;", "getEstado", "()Ljava/util/ArrayList;", "setEstado", "(Ljava/util/ArrayList;)V", "estadot", "getEstadot", "setEstadot", "fechaAlta", "getFechaAlta", "setFechaAlta", "fechaAviso", "getFechaAviso", "setFechaAviso", "fechaMantenimiento", "getFechaMantenimiento", "setFechaMantenimiento", "fechaUltimoMantenimiento", "getFechaUltimoMantenimiento", "setFechaUltimoMantenimiento", "id", "getId", "setId", "idArea", "getIdArea", "setIdArea", "idCentroCostos", "getIdCentroCostos", "setIdCentroCostos", "idClase", "getIdClase", "setIdClase", "idEstadoArticulo", "getIdEstadoArticulo", "setIdEstadoArticulo", "idProveedor", "getIdProveedor", "setIdProveedor", "idResponsableArea", "getIdResponsableArea", "setIdResponsableArea", "idResponsableUbicacion", "getIdResponsableUbicacion", "setIdResponsableUbicacion", "idSubarea", "getIdSubarea", "setIdSubarea", "idUbicacion", "getIdUbicacion", "setIdUbicacion", "idUnidadMedida", "getIdUnidadMedida", "setIdUnidadMedida", "idestado", "getIdestado", "setIdestado", "imagen", "getImagen", "setImagen", "imagenArea", "getImagenArea", "setImagenArea", "imagenUbicacion", "getImagenUbicacion", "setImagenUbicacion", "imagenes", "getImagenes", "setImagenes", "imagenessin", "getImagenessin", "setImagenessin", "modelo", "getModelo", "setModelo", "noFactura", "getNoFactura", "setNoFactura", "nombre", "getNombre", "setNombre", "nota", "getNota", "setNota", "proveedor", "getProveedor", "setProveedor", "subarea", "getSubarea", "setSubarea", "telefono", "getTelefono", "setTelefono", "titulod", "getTitulod", "setTitulod", "tokenResponsableArea", "getTokenResponsableArea", "setTokenResponsableArea", "tokenResponsableUbicacion", "getTokenResponsableUbicacion", "setTokenResponsableUbicacion", "ubicacion", "getUbicacion", "setUbicacion", "unidadMedida", "getUnidadMedida", "setUnidadMedida", "abordo", "", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "withEditText", "view", "Landroid/view/View;", "app_debug"})
public final class Detalle extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<java.lang.String> imagenes;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<java.lang.String> imagenessin;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<java.lang.String> estado;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<java.lang.String> idestado;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String ciudadano = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String telefono = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String imagen;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String titulod;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String id;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String URL;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String URL2;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String codigo;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String nombre;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String descripcion;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String idClase;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String clase;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String modelo;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String costo;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String cantidad;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String cantidadAviso;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String idUnidadMedida;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String unidadMedida;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String nota;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String idProveedor;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String proveedor;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String idUbicacion;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String ubicacion;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String imagenUbicacion;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String idArea;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String area;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String idSubarea;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String subarea;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String imagenArea;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String idCentroCostos;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String centroCostos;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String noFactura;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String diasMantenimiento;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String diasAviso;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String fechaAlta;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String fechaUltimoMantenimiento;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String fechaMantenimiento;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String fechaAviso;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String idResponsableUbicacion;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String correoResponsableUbicacion;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String tokenResponsableUbicacion;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String idResponsableArea;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String correoResponsableArea;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String tokenResponsableArea;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String idEstadoArticulo;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String estadot;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String color;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> getImagenes() {
        return null;
    }
    
    public final void setImagenes(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> getImagenessin() {
        return null;
    }
    
    public final void setImagenessin(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> getEstado() {
        return null;
    }
    
    public final void setEstado(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> getIdestado() {
        return null;
    }
    
    public final void setIdestado(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCiudadano() {
        return null;
    }
    
    public final void setCiudadano(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTelefono() {
        return null;
    }
    
    public final void setTelefono(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getImagen() {
        return null;
    }
    
    public final void setImagen(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTitulod() {
        return null;
    }
    
    public final void setTitulod(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getId() {
        return null;
    }
    
    public final void setId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getURL() {
        return null;
    }
    
    public final void setURL(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getURL2() {
        return null;
    }
    
    public final void setURL2(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCodigo() {
        return null;
    }
    
    public final void setCodigo(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNombre() {
        return null;
    }
    
    public final void setNombre(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescripcion() {
        return null;
    }
    
    public final void setDescripcion(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIdClase() {
        return null;
    }
    
    public final void setIdClase(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getClase() {
        return null;
    }
    
    public final void setClase(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getModelo() {
        return null;
    }
    
    public final void setModelo(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCosto() {
        return null;
    }
    
    public final void setCosto(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCantidad() {
        return null;
    }
    
    public final void setCantidad(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCantidadAviso() {
        return null;
    }
    
    public final void setCantidadAviso(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIdUnidadMedida() {
        return null;
    }
    
    public final void setIdUnidadMedida(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUnidadMedida() {
        return null;
    }
    
    public final void setUnidadMedida(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNota() {
        return null;
    }
    
    public final void setNota(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIdProveedor() {
        return null;
    }
    
    public final void setIdProveedor(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getProveedor() {
        return null;
    }
    
    public final void setProveedor(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIdUbicacion() {
        return null;
    }
    
    public final void setIdUbicacion(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUbicacion() {
        return null;
    }
    
    public final void setUbicacion(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getImagenUbicacion() {
        return null;
    }
    
    public final void setImagenUbicacion(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIdArea() {
        return null;
    }
    
    public final void setIdArea(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getArea() {
        return null;
    }
    
    public final void setArea(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIdSubarea() {
        return null;
    }
    
    public final void setIdSubarea(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getSubarea() {
        return null;
    }
    
    public final void setSubarea(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getImagenArea() {
        return null;
    }
    
    public final void setImagenArea(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIdCentroCostos() {
        return null;
    }
    
    public final void setIdCentroCostos(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCentroCostos() {
        return null;
    }
    
    public final void setCentroCostos(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNoFactura() {
        return null;
    }
    
    public final void setNoFactura(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDiasMantenimiento() {
        return null;
    }
    
    public final void setDiasMantenimiento(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDiasAviso() {
        return null;
    }
    
    public final void setDiasAviso(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFechaAlta() {
        return null;
    }
    
    public final void setFechaAlta(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFechaUltimoMantenimiento() {
        return null;
    }
    
    public final void setFechaUltimoMantenimiento(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFechaMantenimiento() {
        return null;
    }
    
    public final void setFechaMantenimiento(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFechaAviso() {
        return null;
    }
    
    public final void setFechaAviso(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIdResponsableUbicacion() {
        return null;
    }
    
    public final void setIdResponsableUbicacion(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCorreoResponsableUbicacion() {
        return null;
    }
    
    public final void setCorreoResponsableUbicacion(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTokenResponsableUbicacion() {
        return null;
    }
    
    public final void setTokenResponsableUbicacion(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIdResponsableArea() {
        return null;
    }
    
    public final void setIdResponsableArea(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCorreoResponsableArea() {
        return null;
    }
    
    public final void setCorreoResponsableArea(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTokenResponsableArea() {
        return null;
    }
    
    public final void setTokenResponsableArea(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getIdEstadoArticulo() {
        return null;
    }
    
    public final void setIdEstadoArticulo(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getEstadot() {
        return null;
    }
    
    public final void setEstadot(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getColor() {
        return null;
    }
    
    public final void setColor(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final void withEditText(@org.jetbrains.annotations.NotNull()
    android.view.View view) {
    }
    
    public final void abordo() {
    }
    
    public Detalle() {
        super();
    }
}