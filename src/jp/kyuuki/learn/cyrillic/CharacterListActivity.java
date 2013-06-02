package jp.kyuuki.learn.cyrillic;

import jp.kyuuki.learn.cyrillic.R.id;
import jp.kyuuki.learn.cyrillic.model.CyrillicCharacter;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class CharacterListActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character_list);
        
//        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1);
//        adapter.add("„@");
//        adapter.add("„A");
//        adapter.add("„B");
//        adapter.add("„C");
        CyrillicCharacterArrayAdapter adapter = new CyrillicCharacterArrayAdapter(this, R.layout.row_cyrillic);
        adapter.add(new CyrillicCharacter("„@", 1, 1));
        adapter.add(new CyrillicCharacter("„A", 3, -1));
        adapter.add(new CyrillicCharacter("„B", 2, 2));
        adapter.add(new CyrillicCharacter("„C", 3, -1));

        adapter.add(new CyrillicCharacter("„D", 3, -1));
        adapter.add(new CyrillicCharacter("„E", 3, -1));
        adapter.add(new CyrillicCharacter("„G", 3, -1));
        adapter.add(new CyrillicCharacter("„N", 2, 1));
        adapter.add(new CyrillicCharacter("„O", 1, 1));
        adapter.add(new CyrillicCharacter("„S", 1, 1));
        adapter.add(new CyrillicCharacter("„`", 3, 1));
        
        ListView listView = (ListView) findViewById(id.listView);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view,
                    int position, long id) {
                ListView listView = (ListView) parent;
                CyrillicCharacter cyrillicCharacter = (CyrillicCharacter) listView.getItemAtPosition(position);
                Toast.makeText(CharacterListActivity.this, cyrillicCharacter.getCharacter(), Toast.LENGTH_SHORT).show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }    
}
