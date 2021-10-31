package br.com.rodrigo.contatos.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

import br.com.rodrigo.contatos.R;
import br.com.rodrigo.contatos.adapters.ContatoAdapter;
import br.com.rodrigo.contatos.models.Contato;

public class MainActivity extends AppCompatActivity {
    private List<Contato> contatos = new ArrayList<Contato>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mockContatos();
        configurarRecyclerView();
    }

    private void configurarRecyclerView() {
        RecyclerView listaContatos = findViewById(R.id.lista_contatos);

        listaContatos.setAdapter(new ContatoAdapter(this, contatos));
        listaContatos.setLayoutManager(new
                LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
    }

    private void mockContatos() {
        contatos.add(new Contato("Pedro"));
        contatos.add(new Contato("Felipe"));
        contatos.add(new Contato("João"));
        contatos.add(new Contato("Carlos"));
    }
}