package jp.kyuuki.learn.cyrillic;

import jp.kyuuki.learn.cyrillic.model.CyrillicCharacter;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

public class CyrillicCharacterArrayAdapter extends ArrayAdapter<CyrillicCharacter> {
    LayoutInflater mInflater;
    
    public CyrillicCharacterArrayAdapter(Context context, int textViewResourceId) {
        super(context, textViewResourceId);
        // TODO Auto-generated constructor stub
        mInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view = convertView;
        if (view == null) {
            view = mInflater.inflate(R.layout.row_cyrillic, null);
        }
        
        CyrillicCharacter cyrillicCharacter = getItem(position);
        
        TextView text1 = (TextView) view.findViewById(R.id.textView1);
        TextView text2 = (TextView) view.findViewById(R.id.textView2);
        
        text1.setText(cyrillicCharacter.getCharacter());
        text2.setText("Lesson " + cyrillicCharacter.getLesson());

        return view;
    }
   
}
