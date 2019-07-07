package siamansary.checkboxexample;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btn = (Button) findViewById(R.id.btn01);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CheckBox chk1 = (CheckBox)findViewById(R.id.chk01);
                CheckBox chk2 = (CheckBox)findViewById(R.id.chk02);
                CheckBox chk3 = (CheckBox)findViewById(R.id.chk03);

                String str="", str1="", str2="", str3="";

                if(chk1.isChecked())
                    str1="\nOption 1 selected";

                if(chk2.isChecked())
                    str2="\nOption 2 selected";

                if(chk3.isChecked())
                    str3="\nOption 3 selected";

                str= str1+str2+str3;

                Toast.makeText(getApplicationContext(), str.toString(), Toast.LENGTH_LONG).show();
            }
        });
    }
}
