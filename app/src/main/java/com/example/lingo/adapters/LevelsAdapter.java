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
import com.example.lingo.activities.PodcastActivity;
import com.example.lingo.activities.PracticeActivity;
import com.example.lingo.activities.TheoryActivity;
import com.example.lingo.models.Levels;

import java.util.ArrayList;

public class LevelsAdapter extends RecyclerView.Adapter<LevelsAdapter.ViewHolder> {

    ArrayList<Levels> dataholder;

    public LevelsAdapter(ArrayList<Levels> dataholder) {
        this.dataholder = dataholder;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.setting_item_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
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
        TextView header;
        ImageView imgStat;
        public ViewHolder(@NonNull View itemView)
        {
            super(itemView);
            context = itemView.getContext();
            img = itemView.findViewById(R.id.iv_image);
            header = itemView.findViewById(R.id.tv_title);
            imgStat = itemView.findViewById(R.id.iv_arrow);

//            itemView.setClickable(true);
            itemView.setOnClickListener(this);
        }

        @Override
        public void onClick(View v) {

            final Intent intent;
            switch (getAdapterPosition()){

                case 0:
                    intent =  new Intent(context, TheoryActivity.class);
                    break;

                case 1:
                    intent =  new Intent(context, PracticeActivity.class);
                    break;

                default:
                    intent =  new Intent(context, PodcastActivity.class);
                    break;
            }
            context.startActivity(intent);
        }
    }
}
