package sg.edu.rp.c346.id20014198.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivityDetails extends AppCompatActivity {

    TextView tvdisplay;
    Button backbutton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_details);

        tvdisplay = findViewById(R.id.textView);
        backbutton = findViewById(R.id.buttonBack);

        Intent intentReceived = getIntent();
        String module_code = intentReceived.getStringExtra("Module Code");
        String module_name = intentReceived.getStringExtra("Module Name");
        int academic_year = intentReceived.getIntExtra("Year", 2020);
        int semester = intentReceived.getIntExtra("Semester", 1);
        int module_credit = intentReceived.getIntExtra("ModuleCredit",4);
        String venue = intentReceived.getStringExtra("Venue");
        tvdisplay.setText(" Module Code: " + module_code + " \n Module Name: " + module_name + "\n Academic Year: " + academic_year + "\n Semester: " + semester
                + "\n Module Credit: " + module_credit + "\n Venue: " + venue);
        backbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });
    }
}