package com.example.lingo.adapters;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.lingo.R;
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

            Intent mailIntent;

            switch (getAdapterPosition()){

                case 0:
                    mailIntent = new Intent(Intent.ACTION_SEND);
                    mailIntent.setType("text/plain");
                    mailIntent.putExtra(Intent.EXTRA_EMAIL, new String[] { "roman.kasarab.pz.2018@lpnu.ua" });
                    mailIntent.putExtra(Intent.EXTRA_SUBJECT, "Lingo");
                    mailIntent.putExtra(Intent.EXTRA_TEXT, "Best app for learn English :)");

                    context.startActivity(Intent.createChooser(mailIntent, "Send Email"));
                    break;

                case 1:
                    try {
                        context.startActivity(new Intent(Intent.ACTION_VIEW,
                                Uri.parse("market://details?id=" + "com.android.store")));
                    } catch (ActivityNotFoundException e) {
                        context.startActivity(new Intent(Intent.ACTION_VIEW,
                                Uri.parse("http://play.google.com/store/apps/details?id=" + context.getPackageName())));
                    }
                    break;

                default:

                    break;
            }
        }
    }
}
