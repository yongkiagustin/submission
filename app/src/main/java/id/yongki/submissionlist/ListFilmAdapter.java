package id.yongki.submissionlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;


public class ListFilmAdapter extends RecyclerView.Adapter<ListFilmAdapter.ListViewHolder> {
    private Context mContext;
    private OnItemListener mOnItemListener;
    private ArrayList<FilmModel> listFilm;

    public ListFilmAdapter(Context mContext, ArrayList<FilmModel> list, OnItemListener onItemListener){
        this.mContext = mContext;
        this.listFilm = list;
        this.mOnItemListener = onItemListener;
    }
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_film, parent, false);
        return new ListViewHolder(view, mOnItemListener);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        FilmModel film = listFilm.get(position);
        Glide.with(holder.itemView.getContext())
                .load(film.getPhoto())
                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.labelName.setText(film.getName());
        holder.labelDetail.setText(film.getDetail());
    }

    @Override
    public int getItemCount() {
        return listFilm.size();
    }

    public class ListViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
        ImageView imgPhoto;
        TextView labelName, labelDetail;
        CardView cardView;
        OnItemListener onItemListener;

        public ListViewHolder(View itemView, OnItemListener onItemListener) {
            super(itemView);
            imgPhoto = itemView.findViewById(R.id.img_item_photo);
            labelName = itemView.findViewById(R.id.label_item_name);
            labelDetail = itemView.findViewById(R.id.label_item_detail);
            cardView = itemView.findViewById(R.id.rv_film);
            this.onItemListener = onItemListener;
            cardView.setOnClickListener(this);
        }


        @Override
        public void onClick(View view) {
            onItemListener.onItemClick(getAdapterPosition());
        }
    }
    public interface OnItemListener{
        void onItemClick(int position);

    }
}
