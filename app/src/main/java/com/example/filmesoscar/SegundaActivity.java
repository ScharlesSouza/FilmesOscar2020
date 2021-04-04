package com.example.filmesoscar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;

public class SegundaActivity extends AppCompatActivity {

    private TextView tvSinopse, tvDetalhe, tvOscar;
    String dado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        tvDetalhe = findViewById(R.id.textViewDetalhe);
        tvOscar = findViewById(R.id.textViewOscar);

        Intent intent = getIntent();
        if(intent != null){
            dado = intent.getStringExtra("filme");
            tvSinopse = findViewById(R.id.textViewSinopse);
            tvSinopse.setText("Sinopse "+dado);

            if(dado.equals("1917")) {
                tvDetalhe.setText("Na Primeira Guerra Mundial, dois soldados britânicos recebem ordens aparentemente impossíveis de cumprir." +
                        " Em uma corrida contra o tempo, eles precisam atravessar o território inimigo " +
                        "e entregar uma mensagem que pode salvar 1.600 de seus companheiros.");
                tvOscar.setText("Melhor Foografia\n" +
                        "Melhor mixagem de som\n" +
                        "Melhor efeitos visuais\n");

            }else  if(dado.equals("Adoráveis mulheres")) {
                tvDetalhe.setText("Nos anos seguintes à Guerra de Secessão, Jo March e suas duas irmãs voltam para casa quando Beth, a tímida irmã caçula, desenvolve uma doença devastadora que muda para sempre a vida delas.");
                tvOscar.setText("Melhor Figurino");

            }else  if(dado.equals("Coringa")) {
                tvDetalhe.setText("Isolado, intimidado e desconsiderado pela sociedade, o fracassado comediante Arthur Fleck inicia seu caminho como uma mente criminosa após assassinar três homens em pleno metrô. Sua ação inicia um movimento popular contra a elite de Gotham City, da qual Thomas Wayne é seu maior representante.");
                tvOscar.setText("Melhor ator principal (Joaquim Phoenix )\n" +
                        "Melhor trilha original");

            }else  if(dado.equals("Era uma vez em... Hollywood")) {
                tvDetalhe.setText("No final da década de 1960, Hollywood começa a se transformar e o astro de TV Rick Dalton e seu dublê Cliff Booth tentam acompanhar as mudanças.");
                tvOscar.setText("Melhor ator coadjuvante (Brad Pitt)\n" +
                        "Melhor design de produção\n");

            }else  if(dado.equals("Ford vs Ferrari")) {
                tvDetalhe.setText("O projetista Carroll Shelby e o piloto Ken Miles enfrentaram a interferência empresarial, as leis da física e os próprios demônios para construir um carro de corrida para a Ford Motor derrotar a hegemonia de Enzo Ferrari nas 24 horas de Le Mans.");
                tvOscar.setText("Melhor edição\n" +
                        "Melhor edição de som");

            }else  if(dado.equals("O irlandes")) {
                tvDetalhe.setText("O Irlandês é baseado no livro I Heard You Paint Houses, de Charles Brandt, que conta a saga de Frank Sheeran (interpretado por De Niro nas telonas), um veterano de guerra dividido entre dois trabalhos: ser caminhoneiro e assassino de aluguel preferido da máfia.");
                tvOscar.setText("");

            }else  if(dado.equals("Jojo Hobbit")) {
                tvDetalhe.setText("Jojo é um garoto alemão solitário que descobre que sua mãe está escondendo uma garota judia no sótão. Ajudado apenas por seu amigo imaginário, Adolf Hitler, Jojo deve enfrentar seu nacionalismo cego enquanto a Segunda Guerra Mundial prossegue.");
                tvOscar.setText("Melhor roteiro adaptado\n");

            }else  if(dado.equals("Historias de um casamento")) {
                tvDetalhe.setText("A trama narra as complicações matrimoniais de Charlie, diretor de teatro em ascensão, e Nicole, atriz promissora que deixou sua carreira em segundo para cuidar do marido e do seu filho, Henry. Com a iminência do divórcio, os dois precisam encontrar uma forma de sobreviver ao doloroso processo.");
                tvOscar.setText("Melhor atriz coadjuvante (Laura Dern)\n");

            }else  if(dado.equals("Parasita")) {
                tvDetalhe.setText("Toda a família de Ki-taek está desempregada, vivendo em um porão sujo e apertado, mas uma obra do acaso faz com que ele comece a dar aulas de inglês a uma garota de família rica. Fascinados com a vida luxuosa destas pessoas, pai, mãe e filhos bolam um plano para se infiltrarem também na família burguesa, um a um. No entanto, os segredos e mentiras necessários à ascensão social custam caro a todos.");
                tvOscar.setText("Melhor Filme\n" +
                        "Melhor diretor (Bong Joon Ho)\n" +
                        "Melhor roteiro original\n" +
                        "Melhor filme internacional\n");
            }
        }


    }//onCreate
}