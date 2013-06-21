package jp.kyuuki.learn.cyrillic;

import jp.kyuuki.learn.cyrillic.R.id;
import jp.kyuuki.learn.cyrillic.model.CyrillicCharacter;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
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
//        adapter.add("А");
//        adapter.add("Б");
//        adapter.add("В");
//        adapter.add("Г");
        CyrillicCharacterArrayAdapter adapter = new CyrillicCharacterArrayAdapter(this, R.layout.row_cyrillic);
        adapter.add(new CyrillicCharacter("А", 1, 1));
        adapter.add(new CyrillicCharacter("Б", 3, 6));
        adapter.add(new CyrillicCharacter("В", 2, 2, true));
        adapter.add(new CyrillicCharacter("Г", 3, 9));
        adapter.add(new CyrillicCharacter("Д", 3, 2));
        
        adapter.add(new CyrillicCharacter("Е", 2, 3));
        adapter.add(new CyrillicCharacter("Ё", 3, 12));
        adapter.add(new CyrillicCharacter("Ж", 3, 7));
        adapter.add(new CyrillicCharacter("З", 3, 4));
        adapter.add(new CyrillicCharacter("И", 3, 4));
        
        adapter.add(new CyrillicCharacter("Й", 4, 5));
        adapter.add(new CyrillicCharacter("К", 2, 3, true));
        adapter.add(new CyrillicCharacter("Л", 3, 7));
        adapter.add(new CyrillicCharacter("М", 2, 7));
        adapter.add(new CyrillicCharacter("Н", 2, 1, true));
        
        adapter.add(new CyrillicCharacter("О", 1, 1));
        adapter.add(new CyrillicCharacter("П", 3, 6));
        adapter.add(new CyrillicCharacter("Р", 4, 4));
        adapter.add(new CyrillicCharacter("С", 2, 3));
        adapter.add(new CyrillicCharacter("Т", 1, 1, true));
        
        adapter.add(new CyrillicCharacter("У", 3, 3));
        adapter.add(new CyrillicCharacter("Ф", 3, 6));
        adapter.add(new CyrillicCharacter("Х", 2, 8));
        adapter.add(new CyrillicCharacter("Ц", 3, 11));
        adapter.add(new CyrillicCharacter("Ч", 3, 4));
        
        adapter.add(new CyrillicCharacter("Ш", 3, 10));
        adapter.add(new CyrillicCharacter("Щ", 3, 14));
        adapter.add(new CyrillicCharacter("Ъ", 3, 15));
        adapter.add(new CyrillicCharacter("Ы", 4, 2));
        adapter.add(new CyrillicCharacter("Ь", 3, 8));
        
        adapter.add(new CyrillicCharacter("Э", 3, 11));
        adapter.add(new CyrillicCharacter("Ю", 3, 13));
        adapter.add(new CyrillicCharacter("Я", 3, 1));
        
        ListView listView = (ListView) findViewById(id.listView);
        listView.setAdapter(adapter);
        
        // Controller
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                ListView listView = (ListView) parent;
                CyrillicCharacter cyrillicCharacter = (CyrillicCharacter) listView.getItemAtPosition(position);
                //Toast.makeText(CharacterListActivity.this, cyrillicCharacter.getCharacter(), Toast.LENGTH_SHORT).show();
                Intent intent = new Intent(CharacterListActivity.this, CharacterActivity.class);
                intent.putExtra("character", cyrillicCharacter);
                CharacterListActivity.this.startActivity(intent);
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
