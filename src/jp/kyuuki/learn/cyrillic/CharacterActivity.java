package jp.kyuuki.learn.cyrillic;

import jp.kyuuki.learn.cyrillic.model.CyrillicCharacter;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.widget.TextView;

public class CharacterActivity extends Activity {

    // 引数のキー
    public static final String INTENT_EXTRA_CHARACTER = "character";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_character);

        // 引数処理
        Intent intent = getIntent();
        CyrillicCharacter character = (CyrillicCharacter) intent.getSerializableExtra(INTENT_EXTRA_CHARACTER);
        
        TextView mUpperCaseText = ((TextView) findViewById(R.id.upperCaseText));
        mUpperCaseText.setText(character.getCharacter());
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }   
}
