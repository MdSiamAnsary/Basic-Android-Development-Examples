package a.siamansary.edittext_button_activitychange;


import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;


public class SecondActivity extends Activity {

    TextView mTextview;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        String str02= getIntent().getStringExtra("mytext");
        String str03= "Name is "+ str02;

        mTextview = (TextView)findViewById(R.id.textView1);
        mTextview.setText(str03);
    }
}
