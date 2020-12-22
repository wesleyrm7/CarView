package adapter;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cardview.R;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View itemLista = LayoutInflater.from(parent.getContext()).inflate(R.layout.postagem_detalhe,parent,false);

        return new MyViewHolder(itemLista);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        holder.textNome.setText("Wesley Mendes");
        holder.TextPostagem.setText(" #tbt Viagem Legal ");
        holder.TextImagem.setImageResource(R.drawable.imagem1);

    }

    @Override
    public int getItemCount() {
        return 6;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder{

        private TextView TextPostagem;
        private ImageView TextImagem;
        private TextView textNome;

        public MyViewHolder(View itemLista){
            super(itemLista);
            textNome= itemView.findViewById(R.id.textNome);
            TextImagem= itemView.findViewById(R.id.TextImagem);
            TextPostagem= itemView.findViewById(R.id.TextPostagem);

        }




    }
}