package ldansorean.s5recyclerviewdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    private String[] names;
    private RecyclerView namesListView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        names = generateNamesArray();
        namesListView = findViewById(R.id.listView);

        // use this setting to improve performance if you know that changes
        // in content do not change the layout size of the RecyclerView
        namesListView.setHasFixedSize(true);

        namesListView.setAdapter(new NamesRecyclerAdapter(names));
        namesListView.setLayoutManager(new LinearLayoutManager(this));
    }

    private String[] generateNamesArray() {
        int size = 100;
        String[] names = new String[size];
        for (int i = 0; i < size; i++)
            names[i] = "Name " + i;
        return names;
    }
}
