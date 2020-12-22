package activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.cardview.R;

import adapter.Adapter;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recyclerViewPostagem;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerViewPostagem=findViewById(R.id.recyclerPostagem);

        //define Layout
        RecyclerView.LayoutManager layoutManager=new LinearLayoutManager(this);
        recyclerViewPostagem.setLayoutManager(layoutManager);

        //define adapter
        Adapter adapter=new Adapter();
        recyclerViewPostagem.setAdapter(adapter);


    }
}