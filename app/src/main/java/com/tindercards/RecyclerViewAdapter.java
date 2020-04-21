package com.tindercards;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.ViewHolder> {

    private Context context;
    private ArrayList<Profile> profileArrayList;

    RecyclerViewAdapter(Context context, ArrayList<Profile> profileArrayList) {
        this.context = context;
        this.profileArrayList = profileArrayList;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        ImageView profile;
        TextView title, desc;
        ViewHolder(View itemView) {
            super(itemView);
            this.profile = (ImageView) itemView.findViewById(R.id.image_view_profile_pic);
            this.title = (TextView) itemView.findViewById(R.id.title);
            this.desc = (TextView) itemView.findViewById(R.id.desc);
        }
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.profile_row, parent, false);

        return new ViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final Profile myListData = profileArrayList.get(position);
        holder.title.setText(myListData.getName() +", "+ myListData.getAge());
        Picasso.with(context).load(myListData.getProfile_pic()).into(holder.profile);
        holder.desc.setText(myListData.getDistance()+" Miles Away");
    }

    @Override
    public int getItemCount() {
        return profileArrayList.size();
    }
}
