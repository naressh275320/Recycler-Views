package com.example.recycleviewstest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class Books_RecyclerAdapter extends RecyclerView.Adapter<Books_RecyclerAdapter.MyViewHolder> {
    Context context;
    ArrayList<MenuModel> menu = new ArrayList<>();

    public Books_RecyclerAdapter(Context context, ArrayList<MenuModel> menu) {
        this.context = context;
        this.menu = menu;
    }

    @NonNull
    @Override
    public Books_RecyclerAdapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(context);
        View view = inflater.inflate(R.layout.recycle_view_row,parent,false);
        return new Books_RecyclerAdapter.MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Books_RecyclerAdapter.MyViewHolder holder, int position) {

        holder.title.setText(menu.get(position).getName());
        holder.id.setText(menu.get(position).getId());
        holder.Author.setText(menu.get(position).getAuthor());
        holder.year.setText(menu.get(position).getYear());
    }

    @Override
    public int getItemCount() {
        return menu.size();
    }

    public static class MyViewHolder extends RecyclerView.ViewHolder{

        TextView id,title,Author,year;
        public MyViewHolder(@NonNull View itemView)
        {
            super(itemView);
            id = itemView.findViewById(R.id.textView1);
            title = itemView.findViewById(R.id.textView2);
            Author = itemView.findViewById(R.id.textView3);
            year = itemView.findViewById(R.id.textView4);
        }
    }
}

