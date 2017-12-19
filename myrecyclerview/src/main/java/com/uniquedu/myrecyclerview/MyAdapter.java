package com.uniquedu.myrecyclerview;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by ZhongHang on 2016/4/11.
 */
public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {
    private LayoutInflater mInflater;
    private List<Student> mStudents;

    public MyAdapter(LayoutInflater mInflater, List<Student> mStudents) {
        this.mInflater = mInflater;
        this.mStudents = mStudents;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = mInflater.inflate(R.layout.item_student, parent,false);//使用这个方法可以充满父控件
        MyViewHolder viewHolder = new MyViewHolder(view);
        return viewHolder;
    }


    @Override
    public int getItemCount() {
        return mStudents.size();
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        //将学生的信息绑定到holder上
        Student student = mStudents.get(position);
        holder.imageView.setImageResource(student.getImg());
        holder.textViewName.setText("学生姓名:" + student.getName());
        holder.textViewAge.setText("学生年龄" + student.getAge());
    }

     class MyViewHolder extends RecyclerView.ViewHolder {
        TextView textViewName;
        TextView textViewAge;
        ImageView imageView;

        public MyViewHolder(View itemView) {
            super(itemView);
            textViewName = (TextView) itemView.findViewById(R.id.textviewname);
            textViewAge = (TextView) itemView.findViewById(R.id.textviewage);
            imageView = (ImageView) itemView.findViewById(R.id.image_head);
        }
    }
}
