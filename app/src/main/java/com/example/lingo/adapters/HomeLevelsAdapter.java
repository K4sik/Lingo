package com.example.lingo.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lingo.R;
import com.example.lingo.activities.Level2Activity;
import com.example.lingo.models.HomeLevels;

import java.util.ArrayList;

public class HomeLevelsAdapter extends RecyclerView.Adapter<HomeLevelsAdapter.ViewHolder> {

    ArrayList<HomeLevels> dataholder;

    public HomeLevelsAdapter(ArrayList<HomeLevels> dataholder) {
        this.dataholder = dataholder;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.level_item_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imgTitle.setImageResource(dataholder.get(position).getImgTitle());
        holder.img.setImageResource(dataholder.get(position).getImg());
        holder.header.setText(dataholder.get(position).getTitle());
        holder.imgStat.setImageResource(dataholder.get(position).getImgStat());
    }

    @Override
    public int getItemCount() {
        return dataholder.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {
        private final Context context;
        ImageView img;
        ImageView imgTitle;
        TextView header;
        ImageView imgStat;
        public ViewHolder(@NonNull View itemView)
        {
            super(itemView);
            context = itemView.getContext();
            img = itemView.findViewById(R.id.iv_image);
            imgTitle = itemView.findViewById(R.id.iv_imageTitle);
            header = itemView.findViewById(R.id.tv_title);
            imgStat = itemView.findViewById(R.id.iv_arrow);

//            itemView.setClickable(true);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

            final Intent intent;
            switch (getAdapterPosition()){

                default:
                    intent =  new Intent(context, Level2Activity.class);
                    break;
            }
            context.startActivity(intent);
        }


    }


}
