package com.example.lingo.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lingo.R;
import com.example.lingo.models.Setting;
import com.example.lingo.models.Settings;

import java.util.ArrayList;

public class SettingsAdapter extends RecyclerView.Adapter<SettingsAdapter.ViewHolder> {


    ArrayList<Settings> dataholder;

    public SettingsAdapter(ArrayList<Settings> dataholder) {
        this.dataholder = dataholder;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.setting_item_layout,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position)
    {
        holder.img.setImageResource(dataholder.get(position).getImg());
        holder.header.setText(dataholder.get(position).getTitle());
    }

    @Override
    public int getItemCount() {
        return dataholder.size();
    }

    class ViewHolder extends RecyclerView.ViewHolder
    {
        ImageView img;
        TextView header;
        public ViewHolder(@NonNull View itemView)
        {
            super(itemView);
            img=itemView.findViewById(R.id.iv_image);
            header=itemView.findViewById(R.id.tv_title);
        }
    }
}
