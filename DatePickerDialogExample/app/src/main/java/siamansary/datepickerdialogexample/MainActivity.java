package siamansary.datepickerdialogexample;

import android.app.DatePickerDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView textView;
    private Button button;
    private DatePickerDialog datePickerDialog;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView=(TextView)findViewById(R.id.textViewId);
        button = (Button)findViewById(R.id.buttonId);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                DatePicker datePicker;
                datePicker = new DatePicker(MainActivity.this);
                int currentDay = datePicker.getDayOfMonth();
                int currentMonth = datePicker.getMonth() +1 ;
                int currentYear = datePicker.getYear();


                datePickerDialog = new DatePickerDialog(MainActivity.this,
                        new DatePickerDialog.OnDateSetListener() {
                            @Override
                            public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                                textView.setText(dayOfMonth+"/"+(month+1)+"/"+year);
                            }
                        },currentYear, currentMonth, currentDay);
                datePickerDialog.show();
            }
        });
    }
}
