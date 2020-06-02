package com.example.sakuisyarat2.Control;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.sakuisyarat2.Activity_Abjad;
import com.example.sakuisyarat2.Activity_KataGantiOrang;
import com.example.sakuisyarat2.Activity_KataSapaan;
import com.example.sakuisyarat2.Activity_KataTanya;
import com.example.sakuisyarat2.Activity_KataUmum;
import com.example.sakuisyarat2.R;
import com.flaviofaria.kenburnsview.KenBurnsView;
import com.squareup.picasso.Picasso;

import java.util.List;

public class ModalAdapter1 extends RecyclerView.Adapter<ModalAdapter1.ModelViewHolder> {

    private List<Model> modelList;

    public ModalAdapter1 ( List<Model> modelList ) {
        this.modelList = modelList;
    }

    @NonNull
    @Override
    public ModelViewHolder onCreateViewHolder ( @NonNull ViewGroup parent , int viewType ) {
        return new ModelViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.design_card, parent, false));
    }

    @Override
    public void onBindViewHolder ( @NonNull ModelViewHolder holder , int position ) {
        holder.setModelData(modelList.get(position));
    }

    @Override
    public int getItemCount () {
        return modelList.size();
    }

    static class ModelViewHolder extends RecyclerView.ViewHolder {

        private KenBurnsView kbvfoto ;
        private TextView tulisTitle, keterangan, starRating;
        private Context context ;
        private CardView cardView ;


        public ModelViewHolder ( @NonNull View itemView ) {
            super(itemView);
            context = itemView.getContext();


            kbvfoto = itemView.findViewById(R.id.kbvfoto);
            tulisTitle = itemView.findViewById(R.id.tulisTitle);
            keterangan = itemView.findViewById(R.id.keterangan);
            starRating = itemView.findViewById(R.id.startRating);

            cardView = itemView.findViewById(R.id.CardTol);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick ( View v ) {
                    Intent intent = new Intent();
                    switch (getAdapterPosition()) {
                        case 0 :
                            intent = new Intent(context, Activity_Abjad.class);
                            break;
                        case 1 :
                            intent = new Intent(context, Activity_KataTanya.class);
                            break;
                        case 2 :
                            intent = new Intent(context, Activity_KataGantiOrang.class);
                            break;
                        case 3 :
                            intent = new Intent(context, Activity_KataUmum.class);
                            break;
                        case 4 :
                            intent = new Intent(context, Activity_KataSapaan.class);
                            break;
                    }
                    context.startActivity(intent);
                }
            });

        }

        public void setModelData (Model modelData1) {
            Picasso.get().load(modelData1.foto).into(kbvfoto);
            tulisTitle.setText(modelData1.tulis);
            keterangan.setText(modelData1.keterangan);
            starRating.setText(String.valueOf(modelData1.starRating));

        }
    }
}