package com.example.myapplication

import android.app.AlertDialog
import android.app.ProgressDialog
import android.content.Context
import android.content.Intent
import android.os.Build
import android.os.Bundle
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
import com.example.myapplication.utilidades.Utilidades
import kotlinx.android.synthetic.main.activity_detalle.*
import kotlinx.android.synthetic.main.activity_generar_guia.*
import kotlinx.android.synthetic.main.activity_infracciones.*
import kotlinx.android.synthetic.main.activity_infracciones.destino
import kotlinx.android.synthetic.main.activity_perfil.*
import kotlinx.android.synthetic.main.item_corridas.*
import org.json.JSONArray
import org.json.JSONException
import org.json.JSONObject
import java.util.ArrayList


class Perfil : Fragment() {
    var pkusuario = "";
    var bestado = ArrayList<String>()
    var btotal = ArrayList<String>()
    var pkboletos = ArrayList<String>()

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
                    generar()
                }else{
                    Toast.makeText(requireActivity(), "Conecte una impresora", Toast.LENGTH_SHORT)


                }
            }
            // Display a negative button on alert dialog
            builder.setNegativeButton("Cancelar"){dialog,which ->
            }
            builder.show()        })
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

                        for (i in 0 until vendidos.length()) {
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

                        for (o in 0 until guias.length()) {
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
                            ggimporte = ggimporte+ guia.getDouble("importe");
                            ggaportacion = ggaportacion+ guia.getDouble("aportacion") ;
                            ggcompbanco = ggcompbanco+ guia.getDouble("compban") ;
                            ggdisel = ggdisel+ guia.getDouble("diesel") ;
                            ggcaseta = ggcaseta+ guia.getDouble("caseta") ;

                            ggtturno = ggtturno+ guia.getDouble("tturno") ;
                            ggtpaso = ggtpaso+ guia.getDouble("tpaso") ;
                            ggtsalida = ggtsalida+ guia.getDouble("tsalida") ;
                            ggiva = ggiva+ guia.getDouble("iva") ;

                            gggastos = gggastos+ guia.getDouble("anticipo") ;
                            ggtotal = ggtotal+ guia.getDouble("total") ;

ctarjetas=ctarjetas+guia.getDouble("tturno")+guia.getDouble("tpaso")+guia.getDouble("tsalida")
                        }

                        ggemitidas = guias.length();
                        ggcanceladas = 0;






                        cventa = biemitios;
                        cancelado = bicancelados;
                        canticipo = gggastos;
                        ccomision = 0.0;
                        caportacion = ggaportacion;
                        ctarjetadebito = 0.0;
                        ctarjetacredio = 0.0;
                        cefectivo = biventa-gggastos;
                        ctotalentregar =  biventa-gggastos;
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
}
