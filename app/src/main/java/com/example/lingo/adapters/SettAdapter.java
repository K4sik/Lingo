package com.example.lingo.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.lingo.R;
import com.example.lingo.models.Settings;

import java.util.List;

public class SettingsAdapter extends RecyclerView.Adapter<SettingsAdapter.ViewHolder> {

    private final LayoutInflater inflater;
    private final List<Settings> settings;

    public SettingsAdapter(Context context, List<Settings> settings) {
        this.settings = settings;
        this.inflater = LayoutInflater.from(context);
    }

    @Override
    public SettingsAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View view = inflater.inflate(R.layout.setting_item_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(SettingsAdapter.ViewHolder holder, int position) {
        Settings setting = settings.get(position);
        holder.imageView.setImageResource(setting.getImageResource());
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
            imageView = (ImageView)view.findViewById(R.id.iv_image);
            title = (TextView) view.findViewById(R.id.tv_title);
        }
    }
}
