package br.senai.sp.jandira.turismo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import br.senai.sp.jandira.turismo.adapter.PontosTuristicosAdapter
import br.senai.sp.jandira.turismo.dao.PontoTuristicosDao
import br.senai.sp.jandira.turismo.model.PontoTuristico

class MainActivity : AppCompatActivity() {

    lateinit var rvPontosTuristicos: RecyclerView
    lateinit var adapterPontosTuristicos: PontosTuristicosAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Criar intância da RecyclerView
        rvPontosTuristicos = findViewById(R.id.recycler_view_pt)

        //Determinar o layout
        rvPontosTuristicos.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false);

        //Criar uma instância do adapter
        adapterPontosTuristicos = PontosTuristicosAdapter(this);
        adapterPontosTuristicos.updatePontosTuristicosList(PontoTuristicosDao.getPontosTuristucos(this))

        //Ligar o adapter à nossa Recycler

        rvPontosTuristicos.adapter = adapterPontosTuristicos;
    }

}