package a.siamansary.edittext_button_activitychange;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    private Button btn01 , btn02;
    private EditText text01;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn01 = (Button) findViewById(R.id.btn01);
        btn01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                EditText editText = (EditText)findViewById(R.id.text01);
                String text = editText.getText().toString();

                Intent myIntent = new Intent(MainActivity.this,SecondActivity.class);
                myIntent.putExtra("mytext",text);
                startActivity(myIntent);
            }
        });

        btn02= (Button) findViewById(R.id.btn02);
        btn02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                text01= findViewById(R.id.text01);
                text01.setText("");

            }
        });
    }


}
