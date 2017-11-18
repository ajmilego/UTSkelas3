package sttg.inf.utskelas3;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class KumpulanOlahraga extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kumpulan_olahraga);

        String[] mobileArray = {"Lari", "Futsal", "Basket", "Bulutangkis", "Tenis"};
        ArrayAdapter adapter = new ArrayAdapter<String>(this, R.layout.item_olahraga, mobileArray);
        ListView listView = (ListView) findViewById(R.id.or_list);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                String value = (String)adapterView.getItemAtPosition(i);
                Intent intkumpul = new Intent(KumpulanOlahraga.this, DetailActivity.class);
                intkumpul.putExtra("olahraga", value);
                startActivity(intkumpul);

            }
        });

    }
}
