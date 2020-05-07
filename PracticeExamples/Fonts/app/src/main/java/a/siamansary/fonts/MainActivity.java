package a.siamansary.fonts;

import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView1, textView2;
    private Typeface typeface1, typeface2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView1 = (TextView)findViewById(R.id.textView1Id);
        textView2 = (TextView)findViewById(R.id.textView2Id);

        typeface1 = Typeface.createFromAsset(getAssets(),"font/Cantarell_Bold.ttf");
        textView1.setTypeface(typeface1);

        typeface2 = Typeface.createFromAsset(getAssets(),"font/Cantarell_Oblique.ttf");
        textView2.setTypeface(typeface2);
    }
}
