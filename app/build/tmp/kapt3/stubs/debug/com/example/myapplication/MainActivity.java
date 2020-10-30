package com.example.myapplication;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 16}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010Y\u001a\u00020ZH\u0002J\u0006\u0010[\u001a\u00020ZJ\u0006\u0010\\\u001a\u00020ZJ\"\u0010]\u001a\u00020Z2\u0006\u0010^\u001a\u00020\u00042\u0006\u0010_\u001a\u00020\u00042\b\u0010`\u001a\u0004\u0018\u00010aH\u0014J\b\u0010b\u001a\u00020ZH\u0016J\u0012\u0010c\u001a\u00020Z2\b\u0010d\u001a\u0004\u0018\u00010eH\u0014J\b\u0010f\u001a\u00020ZH\u0014J\u0010\u0010g\u001a\u00020Z2\u0006\u0010h\u001a\u00020iH\u0002J\u0006\u0010j\u001a\u00020ZR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082D\u00a2\u0006\u0002\n\u0000R\u0014\u0010\u0012\u001a\u00020\u0007X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\tR\u001a\u0010\u0014\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\t\"\u0004\b\u0016\u0010\u000bR\u001a\u0010\u0017\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\t\"\u0004\b\u0019\u0010\u000bR\u001a\u0010\u001a\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\t\"\u0004\b\u001c\u0010\u000bR\u0016\u0010\u001d\u001a\n \u001f*\u0004\u0018\u00010\u001e0\u001eX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010 \u001a\u0004\u0018\u00010!X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u001c\u0010&\u001a\u0004\u0018\u00010\'X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b(\u0010)\"\u0004\b*\u0010+R\u001a\u0010,\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010\t\"\u0004\b.\u0010\u000bR\u001c\u0010/\u001a\u0004\u0018\u000100X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u00102\"\u0004\b3\u00104R\u001c\u00105\u001a\u0004\u0018\u000106X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b7\u00108\"\u0004\b9\u0010:R\u001a\u0010;\u001a\u00020\u0007X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b<\u0010\t\"\u0004\b=\u0010\u000bR\u001c\u0010>\u001a\u0004\u0018\u00010?X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u000e\u0010D\u001a\u00020EX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u001c\u0010F\u001a\u0004\u0018\u00010GX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u000e\u0010L\u001a\u00020MX\u0082\u000e\u00a2\u0006\u0002\n\u0000R \u0010N\u001a\b\u0012\u0004\u0012\u00020\u00070OX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bP\u0010Q\"\u0004\bR\u0010SR\u001a\u0010T\u001a\u00020MX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\bU\u0010V\"\u0004\bW\u0010X\u00a8\u0006k"}, d2 = {"Lcom/example/myapplication/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "ANCHO_IMG_58_MM", "", "COD_PERMISOS", "HOST", "", "getHOST", "()Ljava/lang/String;", "setHOST", "(Ljava/lang/String;)V", "INTENT_CAMARA", "INTENT_GALERIA", "IR_A_DIBUJAR", "LIMITE_CARACTERES_POR_LINEA", "MODE_PRINT_IMG", "REQUEST_DISPOSITIVO", "TAG_DEBUG", "getTAG_DEBUG", "TOKEN", "getTOKEN", "setTOKEN", "URL", "getURL", "setURL", "URL_CORRIDAS", "getURL_CORRIDAS", "setURL_CORRIDAS", "aplicacionUUID", "Ljava/util/UUID;", "kotlin.jvm.PlatformType", "bluetoothAdapter", "Landroid/bluetooth/BluetoothAdapter;", "getBluetoothAdapter", "()Landroid/bluetooth/BluetoothAdapter;", "setBluetoothAdapter", "(Landroid/bluetooth/BluetoothAdapter;)V", "bluetoothSocket", "Landroid/bluetooth/BluetoothSocket;", "getBluetoothSocket", "()Landroid/bluetooth/BluetoothSocket;", "setBluetoothSocket", "(Landroid/bluetooth/BluetoothSocket;)V", "correo", "getCorreo", "setCorreo", "db", "Lcom/example/myapplication/db/AppDatabase;", "getDb", "()Lcom/example/myapplication/db/AppDatabase;", "setDb", "(Lcom/example/myapplication/db/AppDatabase;)V", "dispositivoBluetooth", "Landroid/bluetooth/BluetoothDevice;", "getDispositivoBluetooth", "()Landroid/bluetooth/BluetoothDevice;", "setDispositivoBluetooth", "(Landroid/bluetooth/BluetoothDevice;)V", "id", "getId", "setId", "inputStream", "Ljava/io/InputStream;", "getInputStream", "()Ljava/io/InputStream;", "setInputStream", "(Ljava/io/InputStream;)V", "mOnNavigationItemSelectedListener", "Lcom/google/android/material/bottomnavigation/BottomNavigationView$OnNavigationItemSelectedListener;", "outputStream", "Ljava/io/OutputStream;", "getOutputStream", "()Ljava/io/OutputStream;", "setOutputStream", "(Ljava/io/OutputStream;)V", "pararLectura", "", "permisos", "Ljava/util/ArrayList;", "getPermisos", "()Ljava/util/ArrayList;", "setPermisos", "(Ljava/util/ArrayList;)V", "toque", "getToque", "()Z", "setToque", "(Z)V", "cerrarConexion", "", "lista", "loadCorridas", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "openFragment", "fragment", "Landroidx/fragment/app/Fragment;", "permisosobtener", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    @org.jetbrains.annotations.NotNull()
    private java.lang.String TOKEN = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String id = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String HOST = "";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String URL_CORRIDAS = "api/Corridas/getCorridasDia";
    @org.jetbrains.annotations.NotNull()
    private java.lang.String correo;
    private boolean toque = false;
    @org.jetbrains.annotations.NotNull()
    private java.util.ArrayList<java.lang.String> permisos;
    @org.jetbrains.annotations.Nullable()
    private android.bluetooth.BluetoothAdapter bluetoothAdapter;
    @org.jetbrains.annotations.Nullable()
    private android.bluetooth.BluetoothDevice dispositivoBluetooth;
    @org.jetbrains.annotations.Nullable()
    private android.bluetooth.BluetoothSocket bluetoothSocket;
    @org.jetbrains.annotations.Nullable()
    private com.example.myapplication.db.AppDatabase db;
    private final int REQUEST_DISPOSITIVO = 425;
    private final int LIMITE_CARACTERES_POR_LINEA = 32;
    @org.jetbrains.annotations.NotNull()
    private final java.lang.String TAG_DEBUG = "tag_debug";
    private final int IR_A_DIBUJAR = 632;
    private final int COD_PERMISOS = 872;
    private final int INTENT_CAMARA = 123;
    private final int INTENT_GALERIA = 321;
    private final int ANCHO_IMG_58_MM = 384;
    private final int MODE_PRINT_IMG = 0;
    private final java.util.UUID aplicacionUUID = null;
    @org.jetbrains.annotations.Nullable()
    private java.io.OutputStream outputStream;
    @org.jetbrains.annotations.Nullable()
    private java.io.InputStream inputStream;
    private volatile boolean pararLectura = false;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String URL = "https://appis-apizaco.gesdesapplication.com/api/";
    private final com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener = null;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTOKEN() {
        return null;
    }
    
    public final void setTOKEN(@org.jetbrains.annotations.NotNull()
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
    public final java.lang.String getHOST() {
        return null;
    }
    
    public final void setHOST(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getURL_CORRIDAS() {
        return null;
    }
    
    public final void setURL_CORRIDAS(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getCorreo() {
        return null;
    }
    
    public final void setCorreo(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean getToque() {
        return false;
    }
    
    public final void setToque(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<java.lang.String> getPermisos() {
        return null;
    }
    
    public final void setPermisos(@org.jetbrains.annotations.NotNull()
    java.util.ArrayList<java.lang.String> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.bluetooth.BluetoothAdapter getBluetoothAdapter() {
        return null;
    }
    
    public final void setBluetoothAdapter(@org.jetbrains.annotations.Nullable()
    android.bluetooth.BluetoothAdapter p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.bluetooth.BluetoothDevice getDispositivoBluetooth() {
        return null;
    }
    
    public final void setDispositivoBluetooth(@org.jetbrains.annotations.Nullable()
    android.bluetooth.BluetoothDevice p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final android.bluetooth.BluetoothSocket getBluetoothSocket() {
        return null;
    }
    
    public final void setBluetoothSocket(@org.jetbrains.annotations.Nullable()
    android.bluetooth.BluetoothSocket p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.example.myapplication.db.AppDatabase getDb() {
        return null;
    }
    
    public final void setDb(@org.jetbrains.annotations.Nullable()
    com.example.myapplication.db.AppDatabase p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getTAG_DEBUG() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.io.OutputStream getOutputStream() {
        return null;
    }
    
    public final void setOutputStream(@org.jetbrains.annotations.Nullable()
    java.io.OutputStream p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final java.io.InputStream getInputStream() {
        return null;
    }
    
    public final void setInputStream(@org.jetbrains.annotations.Nullable()
    java.io.InputStream p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getURL() {
        return null;
    }
    
    public final void setURL(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void onBackPressed() {
    }
    
    private final void cerrarConexion() {
    }
    
    public final void lista() {
    }
    
    private final void openFragment(androidx.fragment.app.Fragment fragment) {
    }
    
    public final void permisosobtener() {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    public final void loadCorridas() {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    public MainActivity() {
        super();
    }
}