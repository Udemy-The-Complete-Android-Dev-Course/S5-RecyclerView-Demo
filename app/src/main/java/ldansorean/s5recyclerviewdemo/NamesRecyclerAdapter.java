package ldansorean.s5recyclerviewdemo;

import android.content.Context;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class NamesRecyclerAdapter extends RecyclerView.Adapter<NamesRecyclerAdapter.NamesViewHolder> {
    private String[] names;

    public NamesRecyclerAdapter(String[] names) {
        this.names = names;
    }

    @NonNull
    @Override
    public NamesViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        TextView nameTextView = new TextView(parent.getContext());
        nameTextView.setTextSize(22);
        nameTextView.setPadding(50, 5, 5, 5);
        return new NamesViewHolder(nameTextView);
    }

    @Override
    public void onBindViewHolder(@NonNull NamesViewHolder holder, int position) {
        holder.nameTextView.setText(names[position]);
    }

    @Override
    public int getItemCount() {
        return names.length;
    }

    protected class NamesViewHolder extends RecyclerView.ViewHolder {
        protected TextView nameTextView;

        public NamesViewHolder(@NonNull TextView itemView) {
            super(itemView);
            this.nameTextView = itemView;
        }
    }
}
