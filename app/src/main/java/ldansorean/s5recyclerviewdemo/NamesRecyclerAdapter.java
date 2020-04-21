package ldansorean.s5recyclerviewdemo;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;

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
        //nameTextView.setBackgroundColor(Color.rgb(255, 0, 0));

        LayoutParams params = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT, 0);
        nameTextView.setLayoutParams(params);

        return new NamesViewHolder(parent.getContext(), nameTextView);
    }

    @Override
    public void onBindViewHolder(@NonNull final NamesViewHolder holder, final int position) {
        holder.nameTextView.setText(names[position]);
        holder.nameTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(holder.context, "Hello " + names[position] + "!", Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public int getItemCount() {
        return names.length;
    }

    protected class NamesViewHolder extends RecyclerView.ViewHolder {
        protected TextView nameTextView;
        protected Context context;

        public NamesViewHolder(Context context, @NonNull TextView itemView) {
            super(itemView);
            this.nameTextView = itemView;
            this.context = context;
        }
    }
}
