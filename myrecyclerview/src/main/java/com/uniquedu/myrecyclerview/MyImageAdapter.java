package com.uniquedu.myrecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Toast;

/**
 * Created by ZhongHang on 2016/4/13.
 */
public class MyImageAdapter extends RecyclerView.Adapter<MyImageAdapter.ImageViewHolder> {
    private int[] imgs;

    public MyImageAdapter(int[] imgs) {
        this.imgs = imgs;
    }

    @Override
    public ImageViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_img, null);
        ImageViewHolder vh = new ImageViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(ImageViewHolder holder, int position) {
        holder.imageView.setImageResource(imgs[position]);
    }

    @Override
    public int getItemCount() {
        return imgs.length;
    }

    class ImageViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;

        public ImageViewHolder(View itemView) {
            super(itemView);
            imageView = (ImageView) itemView.findViewById(R.id.image);
            imageView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(v.getContext(), "点击的第"+getAdapterPosition()+"条图片 ", Toast.LENGTH_SHORT).show();
                }
            });
        }
    }
}
