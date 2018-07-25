package first.calc.easy.easycalc;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class ListExample extends AppCompatActivity {

    ListView firstLIst;
    ArrayAdapter<String> adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_example);

        firstLIst = findViewById(R.id.list);

        ArrayList<String>  data = new ArrayList<>();

        data.add("Mujahid");
        data.add("Imran");
        data.add("Faisal");
        data.add("Muhit");
        data.add("Sojib");

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, data);

        firstLIst.setAdapter(adapter);

        firstLIst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {

                Toast.makeText(ListExample.this, String.format("user clicked on %d index",position), Toast.LENGTH_SHORT).show();
            }
        });



    }
}
