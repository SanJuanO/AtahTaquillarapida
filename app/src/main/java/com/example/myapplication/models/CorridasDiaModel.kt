package com.example.myapplication

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
public class CorridasDiaModel {
 @PrimaryKey
 var PK = 0

 @ColumnInfo(name = "PK_LINEA")
 var PK_LINEA = 0

 @ColumnInfo(name = "LINEA")
 var LINEA = ""

 @ColumnInfo(name = "PK_ROL")
 var PK_ROL = 0

 @ColumnInfo(name = "PK_CORRIDA")
 var ROL = ""

 @ColumnInfo(name = "CORRIDA")
 var PK_CORRIDA = 0

 @ColumnInfo(name = "NO_CORRIDA")
 var NO_CORRIDA = 0

 @ColumnInfo(name = "CORRIDA_DESCRIPCION")
 var CORRIDA_DESCRIPCION = ""

 @ColumnInfo(name = "PK_AUTOBUS")
 var PK_AUTOBUS = 0

 @ColumnInfo(name = "AUTOBUS")
 var AUTOBUS = ""

 @ColumnInfo(name = "TIPO_PK")
 var TIPO_PK = 0

 @ColumnInfo(name = "PK_ORIGEN")
 var PK_ORIGEN = 0

 @ColumnInfo(name = "ORIGEN")
 var ORIGEN = ""

 @ColumnInfo(name = "SALIDA")
 var SALIDA = ""

 @ColumnInfo(name = "PK_DESTINO")
 var PK_DESTINO = 0

 @ColumnInfo(name = "DESTINO")
 var DESTINO = ""

 @ColumnInfo(name = "LLEGADA")
 var LLEGADA = ""

 @ColumnInfo(name = "ESCALA")
 var ESCALA = ""

 @ColumnInfo(name = "FECHA")
 var FECHA = ""

 @ColumnInfo(name = "PK_RUTA")
 var PK_RUTA = 0

 @ColumnInfo(name = "RUTA")
 var RUTA = ""

 @ColumnInfo(name = "PK_CORRIDA_RUTA")
 var PK_CORRIDA_RUTA = 0

 @ColumnInfo(name = "BLOQUEADO")
 var BLOQUEADO = ""

 @ColumnInfo(name = "GUIA")
 var GUIA = ""

 @ColumnInfo(name = "COMPLETO")
 var COMPLETO = ""

 @ColumnInfo(name = "PK_ORIGEN_COMPLETO")
 var PK_ORIGEN_COMPLETO = 0

 @ColumnInfo(name = "ORIGEN_COMPLETO")
 var ORIGEN_COMPLETO = ""

 @ColumnInfo(name = "SALIDA_COMPLETO")
 var SALIDA_COMPLETO = ""

 @ColumnInfo(name = "SALIDA_C")
 var SALIDA_C = ""

 @ColumnInfo(name = "PK_DESTINO_COMPLETO")
 var PK_DESTINO_COMPLETO = 0

 @ColumnInfo(name = "DESTINO_COMPLETO")
 var DESTINO_COMPLETO = ""

 @ColumnInfo(name = "LLEGADA_COMPLETO")
 var LLEGADA_COMPLETO = ""

 @ColumnInfo(name = "LLEGADA_C")
 var LLEGADA_C = ""

 @ColumnInfo(name = "FECHA_C")
 var FECHA_C = ""

 @ColumnInfo(name = "FECHA_M")
 var FECHA_M = ""

 @ColumnInfo(name = "USUARIO")
 var USUARIO = ""

 @ColumnInfo(name = "PK_CHOFER")
 var PK_CHOFER = 0

 @ColumnInfo(name = "NOMBRE")
 var NOMBRE = ""

 @ColumnInfo(name = "APELLIDOS")
 var APELLIDOS = ""

 @ColumnInfo(name = "PISOS")
 var PISOS = ""

 @ColumnInfo(name = "TIEMPO")
 var TIEMPO = ""

 @ColumnInfo(name = "PRECIO")
 var PRECIO = 0.0
}