package com.example.lingo.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.lingo.R;
import com.example.lingo.models.Settings;

import java.util.List;

public class SettAdapter extends RecyclerView.Adapter<SettAdapter.ViewHolder> {

    private final List<Settings> settings;

    public SettAdapter(List<Settings> settings) {
        this.settings = settings;
    }

    @Override
    public SettAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.setting_item_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(SettAdapter.ViewHolder holder, int position) {
        Settings setting = settings.get(position);
        holder.imageView.setImageResource(setting.getImg());
        holder.title.setText(setting.getTitle());
    }

    @Override
    public int getItemCount() {
        return settings.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {
        final ImageView imageView;
        final TextView title;
        ViewHolder(View view){
            super(view);
            imageView = view.findViewById(R.id.iv_image);
            title = view.findViewById(R.id.tv_title);
        }
    }
}
