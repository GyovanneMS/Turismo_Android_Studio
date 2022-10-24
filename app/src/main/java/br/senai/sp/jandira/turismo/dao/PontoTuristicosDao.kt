package br.senai.sp.jandira.turismo.dao

import android.content.Context
import br.senai.sp.jandira.turismo.R
import br.senai.sp.jandira.turismo.model.PontoTuristico

class PontoTuristicosDao (context: Context) {

    //Tudo que está dentro do método companion é estático
    companion object {
        fun getPontosTuristucos(context: Context): List<PontoTuristico> {

            val pt1 = PontoTuristico();
            val pt2 = PontoTuristico();
            val pt3 = PontoTuristico();
            val pt4 = PontoTuristico();
            val pt5 = PontoTuristico();
            val pt6 = PontoTuristico();
            val pt7 = PontoTuristico();
            val pt8 = PontoTuristico();

            pt1.codigo = 1;
            pt1.nomePontoTuristico = "Osasco";
            pt1.descricao = "Osasco é um município brasileiro localizado na Região Metropolitana de São Paulo, no estado de São Paulo, no Brasil. Nascido como um bairro da capital paulista no final do século XIX, tornou-se município emancipado após um plebiscito em 1962."
            pt1.imageTuristico = context.getDrawable(R.drawable.osasco)

            pt2.codigo = 2;
            pt2.nomePontoTuristico = "Toronto";
            pt2.descricao = "Toronto, a capital da província de Ontário, é uma grande cidade canadense localizada ao longo da costa noroeste do Lago Ontário. Ela é uma metrópole dinâmica com um centro de arranha-céus imponentes, todos ofuscados pela famosa Torre CN. "
            pt2.imageTuristico = context.getDrawable(R.drawable.toronto)

            pt3.codigo = 3;
            pt3.nomePontoTuristico = "Africa do Sul";
            pt3.descricao = "A África do Sul é um país situado na extremidade sul do continente africano e marcado por vários ecossistemas diferentes. O Parque Nacional Kruger, um destino para safári no interior do país, é repleto de animais de grande porte. "
            pt3.imageTuristico = context.getDrawable(R.drawable.africadosul)

            pt4.codigo = 4;
            pt4.nomePontoTuristico = "Marte";
            pt4.descricao = "Marte é o quarto planeta a partir do Sol, o segundo menor do Sistema Solar. Batizado em homenagem ao deus romano da guerra, muitas vezes é descrito como o \"Planeta Vermelho\", porque o óxido de ferro predominante em sua superfície lhe dá uma aparência avermelhada. "
            pt4.imageTuristico = context.getDrawable(R.drawable.marte)

            pt5.codigo = 5;
            pt5.nomePontoTuristico = "Nadar com polvos, RN";
            pt5.descricao = "Natal é a capital do estado de Rio Grande do Norte, na extremidade nordeste do Brasil. É conhecida pelas extensas dunas de areia costeiras e pelo Forte dos Reis Magos, em forma de estrela, uma fortaleza portuguesa do século XVI na foz do rio Potengi."
            pt5.imageTuristico = context.getDrawable(R.drawable.nadarcompolvos)

            pt6.codigo = 6;
            pt6.nomePontoTuristico = "Ilha Tinteiros";
            pt6.descricao = "A Ilha Tinteiro Três é o terceiro mundo em Cuphead. A área consiste em uma cidade à beira-mar. O jogador precisam derrotar a abelha rainha Rumor Honeybottoms e seus funcionários/súditos dentro de sua colmeia/escritório."
            pt6.imageTuristico = context.getDrawable(R.drawable.cuphead)

            pt7.codigo = 7;
            pt7.nomePontoTuristico = "Mundo de Wall-e";
            pt7.descricao = "\n" +
                    "E é uma sigla para Waste Allocation Load Lifters -Earth Class, algo como \"Levantadores de Cargas e de Distribuição de Dejetos da Terra\", e o protagonista da animação é o último robô de sua linha a continuar na ativa, compactando e organizando o lixo que cobre o planeta."
            pt7.imageTuristico = context.getDrawable(R.drawable.walle)

            pt8.codigo = 8;
            pt8.nomePontoTuristico = "Teatro do Amazonas";
            pt8.descricao = "O Teatro Amazonas é um dos mais importantes teatros do Brasil e o principal cartão-postal da cidade de Manaus. Localizado no Largo de São Sebastião, no Centro Histórico, foi inaugurado em 1896 para atender ao desejo da elite amazonense da época, que idealizava a cidade à altura dos grandes centros culturais."
            pt8.imageTuristico = context.getDrawable(R.drawable.teatroamazonas)

            val pontosTuristicos = listOf<PontoTuristico>(pt1, pt2, pt3, pt4, pt5, pt6, pt7, pt8,);

            return pontosTuristicos
        }
    }

}