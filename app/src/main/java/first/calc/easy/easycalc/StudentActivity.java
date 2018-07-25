package first.calc.easy.easycalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class StudentActivity extends AppCompatActivity {

    RecyclerView view;
    RecyclerView.LayoutManager layoutManager;
    ArrayList<Student> list;
    StudentAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_student);

        view = findViewById(R.id.recyle);
        layoutManager = new LinearLayoutManager(this);
        view.setLayoutManager(layoutManager);
        view.setHasFixedSize(true);
        list = new ArrayList<>();
        list.add(new Student("Mujahid","02/N/63",R.drawable.student));
        list.add(new Student("Muhit","04/N/63",R.drawable.student));
        list.add(new Student("Ashik","05/N/63",R.drawable.student));
        list.add(new Student("Masum","06/N/63",R.drawable.student));
        list.add(new Student("Mijan","07/N/63",R.drawable.student));
        list.add(new Student("Sumon","08/N/63",R.drawable.student));
        list.add(new Student("Moen","01/N/63",R.drawable.student));
        list.add(new Student("Hridoy","04/N/63",R.drawable.student));
        list.add(new Student("Halim","07/N/63",R.drawable.student));
        list.add(new Student("Sojib","09/N/63",R.drawable.student));


        adapter = new StudentAdapter(list);

        view.setAdapter(adapter);


    }
}
