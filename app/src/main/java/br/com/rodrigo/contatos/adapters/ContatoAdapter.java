package br.com.rodrigo.contatos.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

import br.com.rodrigo.contatos.R;
import br.com.rodrigo.contatos.models.Contato;

public class ContatoAdapter extends RecyclerView.Adapter<ContatoAdapter.ContatoViewHolder> {
        private Context context;
        private List<Contato> contatos;

    public ContatoAdapter(Context context, List<Contato> contatos) {
            this.context = context;
        this.contatos = contatos;
    }

    @NonNull
    @Override
    public ContatoViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.item_contato, parent, false);

        return new ContatoViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ContatoViewHolder holder, int position) {
        holder.nome.setText(contatos.get(position).getNome());
    }

    @Override
    public int getItemCount() {
        return contatos.size();
    }

    public class ContatoViewHolder extends RecyclerView.ViewHolder {
        public TextView nome;
        public ImageView imagem;

        public ContatoViewHolder(@NonNull View view) {
            super(view);
            nome = view.findViewById(R.id.nome);
        }
    }
}
