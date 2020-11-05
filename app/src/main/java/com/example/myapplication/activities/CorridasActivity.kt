package com.example.myapplication.activities

import android.app.ProgressDialog
import android.content.Context
import android.content.SharedPreferences
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.room.Room
import com.android.volley.DefaultRetryPolicy
import com.android.volley.Request
import com.android.volley.Response
import com.android.volley.VolleyError
import com.android.volley.toolbox.JsonObjectRequest
import com.android.volley.toolbox.Volley
import com.example.myapplication.CorridasDiaModel
import com.example.myapplication.Infracciones
import com.example.myapplication.R
import com.example.myapplication.adapters.CorridasAdapter
import com.example.myapplication.db.AppDatabase
import com.example.myapplication.models.TipoPasajeModel
import com.google.android.material.bottomnavigation.BottomNavigationView
import kotlinx.android.synthetic.main.activity_corridas.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_reimprimir.*
import org.json.JSONException
import org.json.JSONObject
import java.text.SimpleDateFormat
import java.time.LocalDateTime
import java.time.format.DateTimeFormatter
import java.util.*
import kotlin.collections.ArrayList

class CorridasActivity : AppCompatActivity() {

    private lateinit var recyclerView: RecyclerView
    private lateinit var viewAdapter: RecyclerView.Adapter<*>
    private lateinit var viewManager: RecyclerView.LayoutManager
    var db : AppDatabase?=null
    var pk_origen:String="53"
    var pk_linea:String="6"
    var pk_rol:String="19"
    var pk_corrida:String=""
    var Corridas:ArrayList<CorridasDiaModel>?=null
    var HOST:String=""
    var URL_CORRIDAS:String="api/Corridas/getCorridasDiaCambioAutobus"
    var URL_ACTUALIZA_AUTOBUS:String="api/Corridas/CambioAutobusApp"
    var usuario=""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_corridas)

        HOST=getString(R.string.HOST)
        URL_CORRIDAS=HOST+URL_CORRIDAS
        URL_ACTUALIZA_AUTOBUS=HOST+URL_ACTUALIZA_AUTOBUS

        pk_corrida = intent.getStringExtra("PK_CORRIDA")

        db= Room.databaseBuilder(
            applicationContext,
            AppDatabase::class.java, "autobuses"
        ).allowMainThreadQueries().fallbackToDestructiveMigration().build()
        Corridas=ArrayList<CorridasDiaModel>()

        val preferencias = getSharedPreferences("VARIABLES", Context.MODE_PRIVATE)
        usuario=preferencias.getString("usuario","").toString()
        /*pk_origen= preferencias.getString("sucursal","0")!!

        Corridas=db?.CorridasDiaModelDao()?.loadCorridasByFiltro(pk_origen.toInt(),pk_linea.toInt())
*/
        viewManager = LinearLayoutManager(this)
        viewAdapter = CorridasAdapter(this,Corridas!!)
        my_recycler_view.adapter = viewAdapter
        /*
        recyclerView = findViewById<RecyclerView>(R.id.my_recycler_view).apply {
            // use this setting to improve performance if you know that changes
            // in content do not change the layout size of the RecyclerView
            setHasFixedSize(true)

            // use a linear layout manager
            layoutManager = viewManager

            // specify an viewAdapter (see also next example)
            adapter = viewAdapter

        }*/
        obtenerCorridas1();

        btnCambiarAutobus.setOnClickListener(View.OnClickListener {

            ActualizaAutobus()

        })

    }

    fun obtenerCorridas1() {

        val datos = JSONObject()
        try {
            datos.put("PK",pk_corrida)
        } catch (e: Exception) {
            e.printStackTrace()
        }

        val requstQueue = Volley.newRequestQueue(this)
        val progressDialog = ProgressDialog(this,
            R.style.Theme_AppCompat_Light_Dialog)
        progressDialog.isIndeterminate = true
        progressDialog.setMessage("Descargando corridas...")
        progressDialog.show()
        val jsonObjectRequest = object : JsonObjectRequest(
            Request.Method.POST, URL_CORRIDAS, datos,
            Response.Listener<JSONObject> { response ->
                try {
                    progressDialog?.dismiss()
                    val result = response.get("resultado") as Int
                    progressDialog?.dismiss()
                    if (result == 1) {
                        try {

                            Corridas?.clear()

                            val corridas = response.getJSONArray("corridas")

                            for (i in 0 until corridas.length()) {
                                val corrida = corridas.getJSONObject(i)
                                var corridaM=CorridasDiaModel();
                                corridaM.PK=corrida.getInt("pk")
                                corridaM.PK_LINEA=corrida.getInt("pK_LINEA")
                                corridaM.LINEA=corrida.getString("linea")
                                corridaM.PK_ROL=corrida.getInt("pK_ROL")
                                corridaM.ROL=corrida.getString("rol")
                                corridaM.PK_CORRIDA=corrida.getInt("pK_CORRIDA")
                                corridaM.NO_CORRIDA=corrida.getInt("nO_CORRIDA")
                                corridaM.CORRIDA_DESCRIPCION=corrida.getString("corridA_DESCRIPCION")
                                corridaM.PK_AUTOBUS=corrida.getInt("pK_AUTOBUS")
                                corridaM.AUTOBUS=corrida.getString("autobus")
                                corridaM.TIPO_PK=corrida.getInt("tipO_PK")
                                corridaM.PK_ORIGEN=corrida.getInt("pK_ORIGEN")
                                corridaM.ORIGEN=corrida.getString("origen")
                                corridaM.SALIDA=corrida.getString("salida")
                                corridaM.PK_DESTINO=corrida.getInt("pK_DESTINO")
                                corridaM.DESTINO=corrida.getString("destino")
                                corridaM.LLEGADA=corrida.getString("llegada")
                                corridaM.ESCALA=corrida.getString("escala")
                                corridaM.FECHA=corrida.getString("fecha")
                                corridaM.PK_RUTA=corrida.getInt("pK_RUTA")
                                corridaM.RUTA=corrida.getString("ruta")
                                corridaM.PK_CORRIDA_RUTA=corrida.getInt("pK_CORRIDA_RUTA")
                                corridaM.BLOQUEADO=corrida.getString("bloqueado")
                                corridaM.GUIA=corrida.getString("guia")
                                corridaM.COMPLETO=corrida.getString("completo")
                                corridaM.PK_ORIGEN_COMPLETO=corrida.getInt("pK_ORIGEN_COMPLETO")
                                corridaM.ORIGEN_COMPLETO=corrida.getString("origeN_COMPLETO")
                                corridaM.SALIDA_COMPLETO=corrida.getString("salidA_COMPLETO")
                                corridaM.SALIDA_C=corrida.getString("salidA_C")
                                corridaM.PK_DESTINO_COMPLETO=corrida.getInt("pK_DESTINO_COMPLETO")
                                corridaM.DESTINO_COMPLETO=corrida.getString("destinO_COMPLETO")
                                corridaM.LLEGADA_COMPLETO=corrida.getString("llegadA_COMPLETO")
                                corridaM.LLEGADA_C=corrida.getString("llegadA_C")
                                corridaM.FECHA_C=corrida.getString("fechA_C")
                                corridaM.FECHA_M=corrida.getString("fechA_M")
                                corridaM.USUARIO=corrida.getString("usuario")
                                //corridaM.PK_CHOFER=corrida.getInt("pK_CHOFER")
                               // corridaM.NOMBRE=corrida.getString("nombre")
                                //corridaM.APELLIDOS=corrida.getString("apellidos")
                                //corridaM.PISOS=corrida.getString("pisos")
                                corridaM.TIEMPO=corrida.getString("tiempo")
                                //corridaM.PRECIO=corrida.getDouble("precio")
                                Corridas?.add(corridaM)

                            }
                            viewAdapter = CorridasAdapter(this,Corridas!!)
                            my_recycler_view.adapter = viewAdapter
                            my_recycler_view.adapter?.notifyDataSetChanged()

                        } catch (es: Exception) {
                            Log.d("sergio1", "" + es.toString())
                            //finish()
                            Toast.makeText(this,es.message, Toast.LENGTH_LONG).show()
                            progressDialog?.dismiss()
                        }

                    } else {
                        Toast.makeText(this, "sin conexion", Toast.LENGTH_SHORT).show()
                    }

                } catch (e: JSONException) {
                    e.printStackTrace()
                    progressDialog?.dismiss()
                }
            },
            object : Response.ErrorListener {
                override fun onErrorResponse(error: VolleyError) {

                }
            }
        ) {

            //here I want to post data to sever
        }

        val MY_SOCKET_TIMEOUT_MS = 15000
        val maxRetries = 2
        jsonObjectRequest.setRetryPolicy(
            DefaultRetryPolicy(
                MY_SOCKET_TIMEOUT_MS,
                maxRetries,
                DefaultRetryPolicy.DEFAULT_BACKOFF_MULT
            )
        )

        requstQueue.add(jsonObjectRequest)
    }


    fun ActualizaAutobus() {

        var eco=editTextTextPersonName.text.toString()
        if(eco.isNullOrEmpty()){
            Toast.makeText(this,"Ingrese eco del nuevo autobus",Toast.LENGTH_LONG).show()
            return
        }
        val datos = JSONObject()
        try {
            datos.put("PK",pk_corrida)
            datos.put("AUTOBUS",eco)
            datos.put("USUARIO",usuario)
        } catch (e: Exception) {
            e.printStackTrace()
        }

        val requstQueue = Volley.newRequestQueue(this)
        val progressDialog = ProgressDialog(this,
            R.style.Theme_AppCompat_Light_Dialog)
        progressDialog.isIndeterminate = true
        progressDialog.setMessage("Descargando corridas...")
        progressDialog.show()
        val jsonObjectRequest = object : JsonObjectRequest(
            Request.Method.POST, URL_ACTUALIZA_AUTOBUS, datos,
            Response.Listener<JSONObject> { response ->
                try {
                    progressDialog?.dismiss()
                    val result = response.get("resultado") as Int
                    progressDialog?.dismiss()
                    if (result == 1) {
                        try {
                            var msg=response.get("mensaje")
                            Toast.makeText(this,""+msg, Toast.LENGTH_LONG).show()
                            setResult(RESULT_OK)
                            finish()
                        } catch (es: Exception) {
                            Log.d("sergio1", "" + es.toString())
                            //finish()
                            Toast.makeText(this,es.message, Toast.LENGTH_LONG).show()
                            progressDialog?.dismiss()
                        }

                    } else {
                        Toast.makeText(this, "sin conexion", Toast.LENGTH_SHORT).show()
                    }

                } catch (e: JSONException) {
                    e.printStackTrace()
                    progressDialog?.dismiss()
                }
            },
            object : Response.ErrorListener {
                override fun onErrorResponse(error: VolleyError) {
                    progressDialog?.dismiss()
                    Toast.makeText(this@CorridasActivity,error.toString(),Toast.LENGTH_LONG).show()
                }
            }
        ) {

            //here I want to post data to sever
        }

        val MY_SOCKET_TIMEOUT_MS = 15000
        val maxRetries = 2
        jsonObjectRequest.setRetryPolicy(
            DefaultRetryPolicy(
                MY_SOCKET_TIMEOUT_MS,
                maxRetries,
                DefaultRetryPolicy.DEFAULT_BACKOFF_MULT
            )
        )

        requstQueue.add(jsonObjectRequest)
    }


    fun obtenerCorridas(origen:String = "", fecha:String = "", pkRol:String = "", pkLinea:String = "")
    {

        var sql = "SELECT ROW_NUMBER()over( order by SALIDA asc) as 'no',PK_LINEA,LINEA,PK_ROL,ROL,PK_CORRIDA,NO_CORRIDA,CORRIDA_DESCRIPCION,PK_AUTOBUS,AUTOBUS," +
        " PK_ORIGEN,ORIGEN,SALIDA,PK_DESTINO_COMPLETO PK_DESTINO,DESTINO_COMPLETO DESTINO,LLEGADA_COMPLETO LLEGADA," +
                " ESCALA,PK_RUTA,RUTA,FECHA,PK_CORRIDA_RUTA,BLOQUEADO,GUIA " +
                " FROM CorridasDiaModel WHERE 1=1 ";

        var sql2 = "select COUNT(PK) MAX FROM CorridasDiaModel WHERE 1=1 ";


        if (!origen.isNullOrEmpty())
        {
            sql += " AND PK_ORIGEN = " + origen;
        }
        if (!fecha.isNullOrEmpty())
        {
            sql += " AND FECHA = '" + fecha + "'";
            sql2 += " AND FECHA = '" + fecha + "'";
        }
        if (!pkRol.isNullOrEmpty())
        {
            sql += " AND PK_ROL = " + pkRol;
            sql2 += " AND PK_ROL = " + pkRol;
        }
        if (!pkLinea.isNullOrEmpty())
        {
            sql += " AND PK_LINEA = " + pkLinea;
            sql2 += " AND PK_LINEA = " + pkLinea;
        }

        sql += " GROUP BY PK_LINEA,LINEA,PK_ROL," +
                " ROL,PK_CORRIDA,NO_CORRIDA,CORRIDA_DESCRIPCION,PK_AUTOBUS,AUTOBUS,PK_ORIGEN,ORIGEN,SALIDA," +
                " PK_DESTINO_COMPLETO,DESTINO_COMPLETO,LLEGADA_COMPLETO,ESCALA,PK_RUTA,RUTA,FECHA," +
                " PK_CORRIDA_RUTA,BLOQUEADO,GUIA ORDER BY SALIDA ";

    }

}