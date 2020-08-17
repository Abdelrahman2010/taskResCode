package com.adwya.task.ui.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.adwya.task.R;
import com.adwya.task.data.model.Task;
import com.bumptech.glide.Glide;

import java.util.ArrayList;


import io.reactivex.annotations.NonNull;

public class MapAdapter extends RecyclerView.Adapter<MapAdapter.ViewHolder> {

    private LayoutInflater mInflater;

    ArrayList<Task.feed.entry> citys;
    Context context;




    public MapAdapter(Context context, ArrayList<Task.feed.entry> citys) {


        if (context != null) {
            this.mInflater = LayoutInflater.from(context);
            this.citys = citys;
            this.context = context;


        }

    }


    @Override
    public MapAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_location, parent, false);


        return new MapAdapter.ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull MapAdapter.ViewHolder holder, int position) {

        String split[] =citys.get(position).getContent().get$t().split(",");
        String split2[] = split[1].split(":");

        holder.message.setText(split2[1]);


        if(citys.get(position).getContent().get$t().contains("Negative")){

            holder.state.setText("Negative");
            holder.state.setTextColor(context.getResources().getColor(R.color.red));

        }else if(citys.get(position).getContent().get$t().contains("Positive")){

            holder.state.setText("Positive");
            holder.state.setTextColor(context.getResources().getColor(R.color.com_facebook_blue));



        }else{

            holder.state.setText("Neutral");

            holder.state.setTextColor(context.getResources().getColor(R.color.green));

        }





    }


    @Override
    public int getItemCount() {
        return citys.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder {

        public TextView message,state;





        public ViewHolder(View itemView) {
            super(itemView);

            message   = (TextView) itemView.findViewById(R.id.message);
            state   = (TextView) itemView.findViewById(R.id.state);


        }
    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }


}
