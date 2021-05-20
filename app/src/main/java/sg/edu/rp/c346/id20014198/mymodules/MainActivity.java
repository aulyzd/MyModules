package sg.edu.rp.c346.id20014198.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView c346;
    TextView c349;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        c346 = findViewById(R.id.textViewC346);
        c349 = findViewById(R.id.textViewC349);

        c346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, MainActivityDetails.class);
                i.putExtra("Module Code", "C346");
                i.putExtra("Module Name", "Android Programming");
                i.putExtra("Academic Year", 2020);
                i.putExtra("Semester", 1);
                i.putExtra("Module Credit", 4);
                i.putExtra("Venue", "W66M");
                startActivity(i);
            }
        });

        c349.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, MainActivityDetails.class);
                i.putExtra("Module Code", "C349");
                i.putExtra("Module Name", "Ipad Programming");
                i.putExtra("Academic Year", "2020");
                i.putExtra("Semester", 1);
                i.putExtra("Module Credit", 4);
                i.putExtra("Venue", "W66M");
                startActivity(i);
            }
        });

    }
}