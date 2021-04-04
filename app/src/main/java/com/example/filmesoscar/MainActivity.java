package com.example.filmesoscar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

//classe implementa o clickListener da classe AdapterView
public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {


    private ListView listViewLanche;  //ListView para as opções
    private AdapterPersonalizado adapterPersonalizado;  //AdapterView personalizado para o ItemLanche
    private ArrayList<ItemFilme> dados;  //lista com os itens do ListView



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listViewLanche = findViewById(R.id.listViewFilmes);  // refernciamento do ListView

        criarLista();  //Metodo para Adicionar itens a Lista
        listViewLanche.setAdapter(new AdapterPersonalizado(getApplicationContext(),dados));  //Carrega o ListView com os itens da lista atraves do Adapter

        listViewLanche.setOnItemClickListener(this);  //Listview é referenciado para pegar os eventos de toque no item da lista
    }

    private void criarLista() {
        dados = new ArrayList<>();
        dados.add(new ItemFilme("1917", R.drawable.ic_1917));
        dados.add(new ItemFilme("Adoráveis mulheres", R.drawable.ic_adoraveismulheres ));
        dados.add(new ItemFilme("Historias de um casamento", R.drawable.ic_casamento));
        dados.add(new ItemFilme("Coringa", R.drawable.ic_coringa));
        dados.add(new ItemFilme("Ford vs Ferrari", R.drawable.ic_fvsf));
        dados.add(new ItemFilme("Era uma vez em... Hollywood", R.drawable.ic_hollywood));
        dados.add(new ItemFilme("O irlandes", R.drawable.ic_irlandes));
        dados.add(new ItemFilme("Jojo Hobbit", R.drawable.ic_jojo));
        dados.add(new ItemFilme("Parasita", R.drawable.ic_parasita));
    }

    //Metodo obrigatorio da classe AdapterView.OnItemClickListener
    @Override
    public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
        ItemFilme itemSelecionado = (ItemFilme) adapterView.getItemAtPosition(i);//pega o objeto da posição do listView clicado
        //Toast.makeText(getApplicationContext(), "Você clicou em: "+itemSelecionado.getNomeFilme(), Toast.LENGTH_SHORT).show();

        abrirTela(itemSelecionado.getNomeFilme());


    }

    //metodo para abrir uma noja janela/Activity
    private void abrirTela(String item) {
        if(item.equals("1917")){
            Intent intent = new Intent(getApplicationContext(),SegundaActivity.class);
            intent.putExtra("filme", "1917");
            startActivity(intent);

        }else if(item.equals("Adoráveis mulheres")) {
            Intent intent = new Intent(getApplicationContext(), SegundaActivity.class);
            intent.putExtra("filme", "Adoráveis mulheres");
            startActivity(intent);

        }else if(item.equals("Historias de um casamento")){
            Intent intent = new Intent(getApplicationContext(),SegundaActivity.class);
            intent.putExtra("filme", "Historias de um casamento");
            startActivity(intent);

        }else if(item.equals("Ford vs Ferrari")){
            Intent intent = new Intent(getApplicationContext(),SegundaActivity.class);
            intent.putExtra("filme", "Ford vs Ferrari");
            startActivity(intent);

        }else if(item.equals("Coringa")){
            Intent intent = new Intent(getApplicationContext(),SegundaActivity.class);
            intent.putExtra("filme", "Coringa");
            startActivity(intent);

        }else if(item.equals("Era uma vez em... Hollywood")){
            Intent intent = new Intent(getApplicationContext(),SegundaActivity.class);
            intent.putExtra("filme", "Era uma vez em... Hollywood");
            startActivity(intent);

        }else if(item.equals("O irlandes")){
            Intent intent = new Intent(getApplicationContext(),SegundaActivity.class);
            intent.putExtra("filme", "O irlandes");
            startActivity(intent);

        }else if(item.equals("Jojo Hobbit")){
            Intent intent = new Intent(getApplicationContext(),SegundaActivity.class);
            intent.putExtra("filme", "Jojo Hobbit");
            startActivity(intent);

        }else if(item.equals("Parasita")){
            Intent intent = new Intent(getApplicationContext(),SegundaActivity.class);
            intent.putExtra("filme", "Parasita");
            startActivity(intent);

        }//if
    }//abrirTela
}