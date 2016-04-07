package esi.dz.fragmentsimple;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
          listView = (ListView)findViewById(R.id.listView);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                showDetail((Book) listView.getAdapter().getItem(position));
            }
        });
    }

    public boolean isTwoPane() {
        View view = findViewById(R.id.frameLayout); // sur un smatrphone ça n'existe pas
        return (view != null);
    }

    public void showDetail(Book book) {
        if (isTwoPane()) {
            DetailFragment detailFragment = new DetailFragment();
            Bundle bundle = new Bundle();
            bundle.putSerializable("book",book); //j'ai changé putString par putSerializable
            detailFragment.setArguments(bundle);
            FragmentTransaction ft = getFragmentManager().beginTransaction();
            ft.replace(R.id.frameLayout,detailFragment);
            ft.commit();

        }
        else {

            Intent intent = new Intent(this, DetailActivity.class);
            intent.putExtra("book", book);
            startActivity(intent);
        }

    }
}
