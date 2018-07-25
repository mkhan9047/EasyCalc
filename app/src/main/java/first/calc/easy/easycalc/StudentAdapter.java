package first.calc.easy.easycalc;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;

/**
 * Created by Mujahid on 7/25/2018.
 */

public class StudentAdapter extends RecyclerView.Adapter<StudentAdapter.MyViewHolder> {

 private ArrayList<Student> studentArrayList;

    public StudentAdapter(ArrayList<Student> studentArrayList) {
        this.studentArrayList = studentArrayList;
    }



    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {

        View data = LayoutInflater.from(parent.getContext()).inflate(R.layout.student_custom_layout,parent, false);

        return new MyViewHolder(data);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        holder.image.setImageResource(studentArrayList.get(position).getImage());
        holder.name.setText(studentArrayList.get(position).getName());
        holder.reg.setText(studentArrayList.get(position).getReg_no());
    }

    @Override
    public int getItemCount() {
        return studentArrayList.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder{

        TextView name, reg;
        ImageView image;

        public MyViewHolder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.name);
            reg = itemView.findViewById(R.id.reg);
            image = itemView.findViewById(R.id.image);
        }
    }
}
