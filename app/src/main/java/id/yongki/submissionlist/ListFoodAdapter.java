package id.yongki.submissionlist;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;


public class ListFoodAdapter extends RecyclerView.Adapter<ListFoodAdapter.ListViewHolder> {
    private Context mContext;
    private OnItemListener mOnItemListener;
    private ArrayList<FoodModel> listFood;

    public ListFoodAdapter(Context mContext, ArrayList<FoodModel> list, OnItemListener onItemListener){
        this.mContext = mContext;
        this.listFood = list;
        this.mOnItemListener = onItemListener;
    }
    @NonNull
    @Override
    public ListViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_food, parent, false);
        return new ListViewHolder(view, mOnItemListener);
    }

    @Override
    public void onBindViewHolder(@NonNull final ListViewHolder holder, int position) {
        FoodModel foodModel = listFood.get(position);
        Glide.with(holder.itemView.getContext())
                .load(foodModel.getPhoto())
//                .apply(new RequestOptions().override(55, 55))
                .into(holder.imgPhoto);
        holder.labelName.setText(foodModel.getName());
        holder.labelDetail.setText(foodModel.getDetail());
    }

    @Override
    public int getItemCount() {
        return listFood.size();
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
            cardView = itemView.findViewById(R.id.list_cardview);
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
