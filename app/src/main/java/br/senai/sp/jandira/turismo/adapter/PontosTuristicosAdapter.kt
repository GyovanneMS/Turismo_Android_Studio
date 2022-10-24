package br.senai.sp.jandira.turismo.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import br.senai.sp.jandira.turismo.R
import br.senai.sp.jandira.turismo.model.PontoTuristico

class PontosTuristicosAdapter(val context: Context ) : RecyclerView.Adapter<PontosTuristicosAdapter.HolderPt>() {


    private var pontosTuristicosList = listOf<PontoTuristico>();

    fun updatePontosTuristicosList(pontosTuristicos: List<PontoTuristico>){
        this.pontosTuristicosList = pontosTuristicos;
        notifyDataSetChanged();
    }

    // Criar uma innerClass
    class HolderPt(view: View): RecyclerView.ViewHolder(view) {

        val textTituloPt = view.findViewById<TextView>(R.id.text_view_titulo);
        val textDescricao = view.findViewById<TextView>(R.id.text_view_info);
        val imageHolder = view.findViewById<ImageView>(R.id.image_holder);
        val buttonDetalhes = view.findViewById<Button>(R.id.button_details);

        fun bind(pontoTuristico: PontoTuristico) {
            textTituloPt.text = pontoTuristico.nomePontoTuristico;
            textDescricao.text = pontoTuristico.descricao;
            imageHolder.setImageDrawable(pontoTuristico.imageTuristico);
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HolderPt {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.holder_layout, parent, false);
        return HolderPt(view);
    }

    override fun onBindViewHolder(holder: HolderPt, position: Int) {
        holder.bind(pontosTuristicosList.get(position));
    }

    override fun getItemCount(): Int {
        return pontosTuristicosList.size;
    }

}