package com.example.myapplication

import android.app.AlertDialog
import android.app.ProgressDialog
import android.content.Context
import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import android.graphics.Color
import android.os.Build
import android.os.Bundle
import android.util.Base64
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.annotation.RequiresApi
import com.android.volley.DefaultRetryPolicy
import com.android.volley.Response
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import com.example.myapplication.R
import com.example.myapplication.utilidades.PrintBitmap
import com.example.myapplication.utilidades.Utilidades
import com.example.myapplication.utilidades.Utilidades.outputStream
import com.google.zxing.BarcodeFormat
import com.google.zxing.EncodeHintType
import com.google.zxing.Writer
import com.google.zxing.common.BitMatrix
import com.google.zxing.oned.Code128Writer
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel
import kotlinx.android.synthetic.main.activity_detalle.*
import kotlinx.android.synthetic.main.activity_generar_guia.*
import kotlinx.android.synthetic.main.activity_infracciones.*
import kotlinx.android.synthetic.main.activity_infracciones.destino
import kotlinx.android.synthetic.main.activity_perfil.*
import kotlinx.android.synthetic.main.item_corridas.*
import org.json.JSONArray
import org.json.JSONException
import org.json.JSONObject
import java.io.UnsupportedEncodingException
import java.text.SimpleDateFormat
import java.util.*


class Perfil : Fragment() {
    var pkusuario = "";
    var bestado = ArrayList<String>()
    var btotal = ArrayList<String>()
    var pkboletos = ArrayList<String>()

    var imagenlogo ="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"

    var desde="";
    var hasta="";

    var bcemitidos = 0;
    var bccancelados = 0;
    var biemitios = 0.0;
    var bicancelados = 0.0;
    var brexpedidos = 0;
    var biexpedidos = 0.0;
    var bcventa = 0;
    var biventa = 0.0;


    var gimporte = ArrayList<String>()
    var gcombanco = ArrayList<String>()
    var gaportacion = ArrayList<String>()
    var gturno = ArrayList<String>()
    var gpaso = ArrayList<String>()
    var gsalida = ArrayList<String>()
    var giva = ArrayList<String>()
    var ggastos = ArrayList<String>()
    var gtotal = ArrayList<String>()
    var gdisel = ArrayList<String>()
    var gcaseta = ArrayList<String>()
    var pkguias = ArrayList<String>()

    var ggemitidas = 0;
    var ggcanceladas = 0;
    var ggimporte = 0.0;
    var ggcompbanco = 0.0;
    var ggaportacion = 0.0;
    var ggdisel = 0.0;
    var ggcaseta = 0.0;
    var ggcomision = 0.0;

    var ggtturno = 0.0;
    var ggtpaso = 0.0;
    var ggtsalida = 0.0;
    var ggiva = 0.0;
    var gggastos = 0.0;
    var ggtotal = 0.0;



    var ccaseta=0.0;
    var cdiesel=0.0;
    var cventa = 0.0;
    var cancelado = 0.0;
    var canticipo = 0.0;
    var ctarjetas = 0.0;
    var ccomision = 0.0;
    var caportacion = 0.0;
    var ctarjetadebito = 0.0;
    var ctarjetacredio = 0.0;
    var cefectivo = 0.0;
    var ctotalentregar = 0.0;
    var cvales = 0.0;
var nombre="";
    var sucursal="";
    var folio="";

    companion object {
        fun newInstance(): Perfil = Perfil()
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? =
        inflater.inflate(R.layout.activity_perfil, container, false)

    @RequiresApi(Build.VERSION_CODES.O)
    override fun onActivityCreated(state: Bundle?) {
        super.onActivityCreated(state)
        val preferencias =
            this.requireActivity().getSharedPreferences("variables", Context.MODE_PRIVATE)

        pkusuario = preferencias.getString("pk", "").toString()

         nombre = preferencias.getString("nombre", "").toString() + " " +
                preferencias.getString("apellidos", "").toString()

         sucursal = preferencias.getString("sucursaltext", "").toString()

        nombretext.text = "Usuario:" + nombre
        direcciontext.text = "Sucursal:" + sucursal
        cerrarcesion.setOnClickListener(View.OnClickListener {
            cerrarsesio()
        })
        generarcorte.setOnClickListener(View.OnClickListener {
            val builder = AlertDialog.Builder(requireActivity())

            // Set the alert dialog title
            builder.setTitle("Generar corte de caja?")

            // Display a message on alert dialog
            builder.setMessage("Estas seguro?")
            // Set a positive button and its click listener on alert dialog
            builder.setPositiveButton("Aceptar") { dialog, which ->
                // Do something when user press the positive button
                if (Utilidades.bluetoothSocket != null) {
                    reimprimir()
                }else{
                    Toast.makeText(requireActivity(), "Conecte una impresora", Toast.LENGTH_SHORT)


                }
            }
            // Display a negative button on alert dialog
            builder.setNegativeButton("Cancelar"){dialog,which ->
            }
            builder.show()        })

         bcemitidos = 0;
         bccancelados = 0;
         biemitios = 0.0;
         bicancelados = 0.0;
         brexpedidos = 0;
         biexpedidos = 0.0;
         bcventa = 0;
         biventa = 0.0;
         ggemitidas = 0;
         ggcanceladas = 0;
         ggimporte = 0.0;
         ggcompbanco = 0.0;
         ggaportacion = 0.0;
         ggdisel = 0.0;
         ggcaseta = 0.0;
         ggcomision = 0.0;

         ggtturno = 0.0;
         ggtpaso = 0.0;
         ggtsalida = 0.0;
         ggiva = 0.0;
         gggastos = 0.0;
         ggtotal = 0.0;



         ccaseta=0.0;
         cdiesel=0.0;
         cventa = 0.0;
         cancelado = 0.0;
         canticipo = 0.0;
         ctarjetas = 0.0;
         ccomision = 0.0;
         caportacion = 0.0;
         ctarjetadebito = 0.0;
         ctarjetacredio = 0.0;
         cefectivo = 0.0;
         ctotalentregar = 0.0;
         cvales = 0.0;
          bestado.clear()
        btotal.clear()
          pkboletos.clear()
          gimporte.clear()
          gcombanco.clear()
          gaportacion.clear()
          gturno.clear()
          gpaso.clear()
          gsalida.clear()
          giva.clear()
          ggastos.clear()
          gtotal.clear()
          gdisel.clear()
          gcaseta.clear()
          pkguias.clear()

infrome()
    }

    fun cerrarsesio() {
        val preferencias =
            this.requireActivity().getSharedPreferences("variables", Context.MODE_PRIVATE)

        val editor = preferencias.edit()
        editor.putString("sesion", "no")
        editor.commit()
        val intent = Intent(requireActivity(), Login::class.java)

        // start your next activity
        startActivity(intent)
        requireActivity().finish();
    }

    fun infrome() {


        val datos = JSONObject()
        try {


            datos.put("PK_USUARIO", pkusuario)


        } catch (e: JSONException) {
            e.printStackTrace()
        }
        val requstQueue = Volley.newRequestQueue(requireActivity())
        val jsonObjectRequest: JsonObjectRequest = object : JsonObjectRequest(
            Method.POST,
            "https://appis.atah.online/api/CorteCaja/ObtienerDatosCorteCaja",
            datos,
            Response.Listener { response ->
                try {
                    val result = response["result"] as Int
                    if (result == 1) {

                        val vendidos = response.getJSONArray("vendidos")
var canceladosuma=0;
                        var vendidosuma=0;
var cantidadvendidos= vendidos.length()
                        for (i in 0 until cantidadvendidos) {
                            val vend = vendidos.getJSONObject(i)

                            bestado.add( vend.getString("status"))
                            btotal.add( vend.getString("precio"))
                                pkboletos.add( vend.getString("pk"))

                            if( vend.getString("status")=="CANCELADO") {

                                bicancelados = bicancelados+ vend.getDouble("precio");
                                canceladosuma=canceladosuma+1;
                                bccancelados = canceladosuma;

                            }
                            if( vend.getString("status")=="VENDIDO") {

                                biventa = biventa+ vend.getDouble("precio");

                                vendidosuma=vendidosuma+1;
                                bcventa = vendidosuma;

                            }
                            biemitios = biemitios+ vend.getDouble("precio");

                        }

                        bcemitidos = vendidos.length();
                        brexpedidos = 0;
                        biexpedidos = 0.0;

                        val guias = response.getJSONArray("guias")
                            var cantidadguias=guias.length()
                        for (o in 0 until cantidadguias) {
                            val guia = guias.getJSONObject(o)

                            gimporte.add( guia.getString("importe"))
                            gcombanco.add( guia.getString("compban"))
                            gaportacion.add( guia.getString("aportacion"))
                            gdisel.add( guia.getString("diesel"))
                            gcaseta.add( guia.getString("caseta"))


                            gturno.add( guia.getString("tturno"))
                            gpaso.add( guia.getString("tpaso"))
                            gsalida.add( guia.getString("tsalida"))
                            giva.add( guia.getString("iva"))
                            ggastos.add( guia.getString("anticipo"))
                            gtotal.add( guia.getString("total"))
                            pkguias.add( guia.getString("pk"))
                            ggimporte =String.format("%.1f",  ggimporte+ guia.getDouble("importe")).toDouble();
                            ggaportacion =String.format("%.1f",  ggaportacion+ guia.getDouble("aportacion") ).toDouble();
                            ggcompbanco =String.format("%.1f",  ggcompbanco+ guia.getDouble("compban") ).toDouble();
                            ggdisel =String.format("%.1f",  ggdisel+ guia.getDouble("diesel") ).toDouble();
                            ggcaseta =String.format("%.1f",  ggcaseta+ guia.getDouble("caseta") ).toDouble();

                            ggtturno =String.format("%.1f",  ggtturno+ guia.getDouble("tturno") ).toDouble();
                            ggtpaso =String.format("%.1f",  ggtpaso+ guia.getDouble("tpaso") ).toDouble();
                            ggtsalida = String.format("%.1f", ggtsalida+ guia.getDouble("tsalida") ).toDouble();
                            ggiva =String.format("%.1f",  ggiva+ guia.getDouble("iva") ).toDouble();

                                gggastos = String.format("%.1f", gggastos+ guia.getDouble("anticipo") ).toDouble();
                                        ggtotal = String.format("%.1f", ggtotal+ guia.getDouble("total") ).toDouble();

ctarjetas=String.format("%.1f", ctarjetas+guia.getDouble("tturno")+guia.getDouble("tpaso")+guia.getDouble("tsalida")).toDouble();



                        }

                        ggemitidas = guias.length();
                        ggcanceladas = 0;






                        cventa =String.format("%.1f", biemitios).toDouble();
                        cancelado = String.format("%.1f", bicancelados).toDouble();
                        canticipo = String.format("%.1f", gggastos).toDouble();
                        ccomision = String.format("%.1f", 0.0).toDouble();
                        caportacion =String.format("%.1f", ggaportacion).toDouble();
                        ctarjetadebito =  String.format("%.1f", 0.0).toDouble();
                        ctarjetacredio = String.format("%.1f", 0.0).toDouble();
                        cefectivo = biventa-gggastos;
                        cefectivo =String.format("%.1f", cefectivo).toDouble();

                        ctotalentregar =  biventa-gggastos;
                        ctotalentregar =String.format("%.1f", ctotalentregar).toDouble();
                        cvales = 0.0;


                        emitidoscantidad.setText(bcemitidos.toString())
                        emitidosimporte.setText("$"+biemitios.toString())
                        canceladoscantidad.setText(bccancelados.toString())
                        canceladosimporte.setText("$"+bicancelados.toString())
                        ventacantidad.setText(bcventa.toString())
                        ventaimporte.setText("$"+biventa.toString())



                        gemitidas.setText(guias.length().toString())
                        gcanceladas.setText(ggcanceladas.toString())
                        gimportet.setText("$"+ggimporte.toString())
                        gcompbancot.setText("$"+ggcompbanco.toString())
                        gaportaciont.setText("$"+ggaportacion.toString())
                        gturnot.setText("$"+ggtturno.toString())
                        gsalidat.setText("$"+ggtsalida.toString())
                        gpasot.setText("$"+ggtpaso.toString())
                        givat.setText("$"+ggiva.toString())
                        ggastost.setText("$"+gggastos.toString())
                        gtotalt.setText("$"+ggtotal.toString())

                        cventat.setText("$"+cventa.toString())
                        ccanceladost.setText("$"+bicancelados.toString())
                        ccomisiont.setText("$"+"0.0")
                        caportaciont.setText("$"+caportacion.toString())
                        canticipadost.setText("$"+gggastos.toString())
                        ctarjetast.setText("$"+ctarjetas.toString())
                        ctdebito.setText("$"+ctarjetadebito.toString())
                        ctcredito.setText("$"+ctarjetacredio.toString())
                        cefectivot.setText("$"+cefectivo.toString())
                        cvalest.setText("$"+cvales.toString())
                        centregart.setText("$"+ctotalentregar.toString())

                    } else {


                    }


                } catch (e: JSONException) {
                    e.printStackTrace()
                }
            },
            Response.ErrorListener { error ->
                Log.e("Rest Response", error.toString())
            }
        ) {


        }
        val MY_SOCKET_TIMEOUT_MS = 15000
        val maxRetries = 2
        jsonObjectRequest.retryPolicy = DefaultRetryPolicy(
            MY_SOCKET_TIMEOUT_MS,
            maxRetries,
            DefaultRetryPolicy.DEFAULT_BACKOFF_MULT
        )
        requstQueue.add(jsonObjectRequest)
    }
    fun generar() {


        val arregloboletos = JSONArray()


        for (a in 0..pkboletos.size-1) {

            val boletospk = JSONObject()
            boletospk.put("pk",pkboletos[a] )
            arregloboletos.put(boletospk)
        }
        val arregloguias = JSONArray()


        for (b in 0..pkguias.size-1) {

            val guiaspk = JSONObject()
            guiaspk.put("pk",pkguias[b] )
            arregloguias.put(guiaspk)
        }




        val progressDialog = ProgressDialog(requireActivity(),
            R.style.Theme_AppCompat_Light_Dialog)
        progressDialog.isIndeterminate = true
        progressDialog.setMessage("Generando guia...")
        progressDialog.show()


        val datos = JSONObject()
        try {



            datos.put("APARTIR", desde)
            datos.put("HASTA", hasta)
            datos.put("BCEMITIDOS", bcemitidos)
            datos.put("BIEMITIDOS", biemitios)
            datos.put("BCCANCELADOS", bccancelados)
            datos.put("BICANCELADOS", bicancelados)
            datos.put("BCCANCFUERADT", 0)
            datos.put("BICANCFUERADT", 0)
            datos.put("BCREEXPEDIDOS", 0)
            datos.put("BIREEXPEDIDOS", 0)
            datos.put("BCVENTA", bcventa)
            datos.put("BIVENTA", biventa)
            datos.put("GEMITIDOS", ggemitidas)
            datos.put("GCANCELADAS", 0)
            datos.put("GIMPORT", ggimporte)
            datos.put("GCOMISION", ggcomision)
            datos.put("GCOMISIONBANCO", ggcompbanco)
            datos.put("GAPORTACION", ggaportacion)
            datos.put("GDIESEL", ggdisel)
            datos.put("GCASETAS", ggcaseta)
            datos.put("GIVA", ggiva)
            datos.put("GANTICIPO", gggastos)
            datos.put("GTOTAL", ggtotal)
            datos.put("CVENTA", cventa)
            datos.put("CCANCFUERADTURNO", "0")
            datos.put("CANTICIPOS", canticipo)
            datos.put("CTARJETAS", ctarjetas)
            datos.put("CCOUTASSALIDA", "0")
            datos.put("CCOMISION", ccomision)
            datos.put("CAPORTACION", caportacion)
            datos.put("CDIESEL", cdiesel)
            datos.put("CCASETA", ccaseta)
            datos.put("CTOTALaENTREGAR", ctotalentregar)
            datos.put("CEFECTIVO", cefectivo)
            datos.put("CTARJETACREDITO", ctarjetacredio)
            datos.put("CTARJETADEBITO", ctarjetadebito)
            datos.put("FOLIO", folio)
            datos.put("SUCURSAL", sucursal)
            datos.put("USUARIO", nombre)
            datos.put("CVALES", cvales)
            datos.put("GTTURNO", ggtturno)
            datos.put("GTPASO", ggtpaso)
            datos.put("GTSALIDA", ggtsalida)
            datos.put("PKUSUARIO", pkusuario)
            datos.put("ListaVendidos", arregloboletos)
            datos.put("ListaGuias", arregloguias)

        } catch (e: JSONException) {
            e.printStackTrace()
        }
        val requstQueue = Volley.newRequestQueue(requireActivity())
        val jsonObjectRequest: JsonObjectRequest = object : JsonObjectRequest(Method.POST, "https://appis.atah.online/api/Guias2/Generaguia", datos,
            Response.Listener { response ->
                try {
                    progressDialog?.dismiss()
                    val result = response["result"] as Int
                    if (result == 1) {

                    } else {
                        val error = response.getString("mensaje")
                        _ShowAlert("Error", error)
                    }
                } catch (e: JSONException) {
                    e.printStackTrace()
                }
            },
            Response.ErrorListener { error ->
                progressDialog?.dismiss()
                Log.e("Rest Response", error.toString())
            }
        ) { //here I want to post data to sever
        }
        val MY_SOCKET_TIMEOUT_MS = 15000
        val maxRetries = 2
        jsonObjectRequest.retryPolicy = DefaultRetryPolicy(
            MY_SOCKET_TIMEOUT_MS,
            maxRetries,
            DefaultRetryPolicy.DEFAULT_BACKOFF_MULT
        )
        requstQueue.add(jsonObjectRequest)
    }
    private fun _ShowAlert(title: String, mensaje: String) {
        val alertDialog = AlertDialog.Builder(requireActivity()).create()
        alertDialog.setTitle(title)
        alertDialog.setMessage(mensaje)
        alertDialog.setButton(
            AlertDialog.BUTTON_NEUTRAL, "OK"
        ) { dialog, which ->
            dialog.dismiss()
        }
        alertDialog.show()
    }


    private fun reimprimir(){
        val fech = SimpleDateFormat("dd/MM/yyyy")

        var  fecha = fech.format(Date())

        val ifecha = "FECHA:   " + fecha+ "\n"
        val iusuario="USUARIO: " + nombre + "\n"
        val ifolio = "FOLIO:   " + folio+ "\n"
        val irango="       RANGO DE FECHA:" +"\n"
        val idesde = "DESDE:  "+desde  +"\n"
        val ihasta=  "HASTA:  " + hasta + "\n"
        val iboletos= "      BOLETOS"  + "\n"
        val icantidadimporte= "            " + "CANTIDAD "  + "IMPORTE" +  "\n"
        val   ibemitidos=     "EMITIDOS:   " + bcemitidos +"         $" + biemitios +  "\n"
        val ibcancelados=     "CANCELADOS: " + bccancelados +"         $" + bicancelados + "\n"
        val ibrexpedidos=     "REEXPEDIDOS:" + "0" +"  " + "       $0 " +  "\n"
        val      ibventa=     "VENTA:      " + bcventa +"          $" + biventa +  "\n"


        val iguias= "         GUIAS"  + "\n"


        val iguiasdatos = "EMITIDOS:    "+ggemitidas+"\n"+
                          "CANCELADAS:  "+"0"+"\n"+
                          "IMPORTE:     $"+ggimporte+"\n"+
                          "COMP. BANCO: $"+"0"+"\n"+
                          "APORTACIÓN:  $" +ggaportacion+"\n"+
                          "T. TURNO:    $"+ggtturno+"\n"+
                          "T. PASO:     $"+ggtpaso+"\n"+
                          "T. SALIDA:   $"+ggtsalida+"\n"+
                          "IVA:         $"+ggiva+"\n"+
                          "GASTOS:      $"+gggastos+"\n"+
                          "TOTAL:       $"+ggtotal+"\n"
        val icaja= "          CAJA"  + "\n"


        val icajadatos = "VENTA:        $"+cventa+"\n"+
                         "CANCELADOS:   $"+bicancelados+"\n"+
                         "GASTOS:       $"+gggastos+"\n"+
                         "TARJETAS:     $"+ctarjetas+"\n"+
                         "COMISIÓN:     $"+ccomision+"\n"+
                         "APORTACIÓN:   $"+ggaportacion+"\n"+
                         "T. DEBITO:    $"+"0"+"\n"+
                         "T. CREDITO:   $"+"0"+"\n"+
                         "VALES:        $"+"0"+"\n"+
                         "EFECTIVO:     $"+cefectivo+"\n"+
                         "T. A ENTREGAR:$"+ctotalentregar+"\n"
        val fuente1 = 1
        val negrita1 = 1
        val ancho2 = 1

        val fuente = 0
        val negrita = 0
        val ancho = 0
        val alto = 0
        val ANCHO_IMG_58_MM = 384
        val MODE_PRINT_IMG = 0

        val decodedString =
            Base64.decode(imagenlogo, Base64.DEFAULT)
        val bitmap =
            BitmapFactory.decodeByteArray(decodedString, 0, decodedString.size)

        outputStream!!.write(PrintBitmap.POS_PrintBMP(bitmap, 100, MODE_PRINT_IMG))

              outputStream!!.write(getByteString(ifecha,negrita, fuente1,  ancho, alto   )  )
        outputStream!!.write(getByteString("   CORTE DE CAJA  \n",2, 1,  1, 1   )  )

        outputStream!!.write(getByteString(iusuario,negrita, fuente1,  ancho, alto   )  )
              outputStream!!.write(getByteString(ifolio,negrita, fuente1,  ancho, alto   )  )
              outputStream!!.write(getByteString(irango,negrita, fuente1,  ancho, alto   )  )
              outputStream!!.write(getByteString(idesde,negrita, fuente1,  ancho, alto   ) )
              outputStream!!.write(getByteString(ihasta,negrita, fuente1,  ancho, alto   )  )
              outputStream!!.write(getByteString(iboletos,2, fuente1,  1, 1   )  )
              outputStream!!.write(getByteString(icantidadimporte,negrita, fuente,  ancho, alto   )  )
              outputStream!!.write(getByteString(ibemitidos,negrita, fuente,  ancho, alto   )  )
              outputStream!!.write(getByteString(ibcancelados,negrita, fuente,  ancho, alto   )  )
              outputStream!!.write(getByteString(ibrexpedidos,negrita, fuente,  ancho, alto   )  )
              outputStream!!.write(getByteString(ibventa,negrita, fuente,  ancho, alto   )  )
              outputStream!!.write(getByteString(iguias,2, fuente1,  1, 1   )  )
              outputStream!!.write(getByteString(iguiasdatos,negrita, fuente,  ancho, alto     ))
              outputStream!!.write(getByteString(icaja,2, fuente1,  1, 1   )  )
              outputStream!!.write(getByteString(icajadatos,negrita, fuente,  ancho, alto     ))
        outputStream!!.write(getByteString(" \n\n\n\n",negrita, fuente,  ancho, alto     ))



        outputStream.write("\n".toByteArray())



        try {
            val productId: String = folio
            val hintMap: Hashtable<EncodeHintType, ErrorCorrectionLevel> =
                Hashtable<EncodeHintType, ErrorCorrectionLevel>()
            hintMap[EncodeHintType.ERROR_CORRECTION] = ErrorCorrectionLevel.L
            val codeWriter: Writer
            codeWriter = Code128Writer()
            val byteMatrix: BitMatrix = codeWriter.encode(
                productId,
                BarcodeFormat.CODE_128,
                400,
                100,
                hintMap
            )
            val width: Int = byteMatrix.getWidth()
            val height: Int = byteMatrix.getHeight()
            val bitmap =
                Bitmap.createBitmap(width, height, Bitmap.Config.ARGB_8888)
            for (i in 0 until width) {
                for (j in 0 until height) {
                    bitmap.setPixel(
                        i,
                        j,
                        if (byteMatrix.get(i, j)) Color.BLACK else Color.WHITE
                    )
                }
            }
            val bitmapqr = bitmap

            Utilidades.outputStream!!.write(
                PrintBitmap.POS_PrintBMP(
                    bitmapqr,
                    380,
                    MODE_PRINT_IMG
                )
            )

        } catch (e: Exception) {
            val a = e
        }

    }

    fun getByteString(
        str: String,
        bold: Int,
        font: Int,
        widthsize: Int,
        heigthsize: Int
    ): ByteArray? {
        if ((str.length == 0) or (widthsize < 0) or (widthsize > 3) or (heigthsize < 0) or (heigthsize > 3
                    ) or (font < 0) or (font > 1)
        ) return null
        var strData: ByteArray? = null
        strData = try {
            str.toByteArray(charset("iso-8859-1"))
        } catch (e: UnsupportedEncodingException) {
            e.printStackTrace()
            return null
        }
        val command = ByteArray(strData.size + 9)
        val intToWidth = byteArrayOf(0x00, 0x10, 0x20, 0x30) //
        val intToHeight = byteArrayOf(0x00, 0x01, 0x02, 0x03) //
        command[0] = 27 // caracter ESC para darle comandos a la impresora
        command[1] = 69
        command[2] = bold.toByte()
        command[3] = 27
        command[4] = 77
        command[5] = font.toByte()
        command[6] = 29
        command[7] = 33
        command[8] = (intToWidth[widthsize] + intToHeight[heigthsize]).toByte()
        System.arraycopy(strData, 0, command, 9, strData.size)
        return command
    }
}

