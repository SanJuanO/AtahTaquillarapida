package com.example.myapplication.models

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
public class TipoPasajeModel {
    @PrimaryKey
    var PKI :Int=0
    @ColumnInfo(name = "PASAJE")
    var PASAJE :String=""
    @ColumnInfo(name = "PKLINEA")
    var PKLINEA :Int=0
    @ColumnInfo(name = "PORCENTAJE")
    var PORCENTAJE :Double=0.0
    @ColumnInfo(name = "BORRADO")
    var BORRADO :Boolean=false
    @ColumnInfo(name = "ACTIVO")
    var ACTIVO :Boolean=false
    @ColumnInfo(name = "USUARIO_M")
    var USUARIO_M :String=""
    @ColumnInfo(name = "PERMITIDOS")
    var PERMITIDOS :Int=0
    @ColumnInfo(name = "COLOR")
    var COLOR :String=""
}