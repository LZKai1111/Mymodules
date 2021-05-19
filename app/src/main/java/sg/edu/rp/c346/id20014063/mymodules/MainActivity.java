package sg.edu.rp.c346.id20014063.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView C346, C349;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        C346 = findViewById(R.id.C346);
        C349 = findViewById(R.id.C349);

        C346.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("ModuleCode","C346");
                intent.putExtra("ModuleName", "Android Programming");
                intent.putExtra("AcademicYear", 2020);
                intent.putExtra("Semester", 1);
                intent.putExtra("ModuleCredit", 4);
                intent.putExtra("Venue", "W66M");
                startActivity(intent);
            }
        });

        C349.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, ModuleDetailActivity.class);
                intent.putExtra("ModuleCode","C349");
                intent.putExtra("ModuleName", "iPad Programming");
                intent.putExtra("AcademicYear", 2020);
                intent.putExtra("Semester", 2);
                intent.putExtra("ModuleCredit", 4);
                intent.putExtra("Venue", "W65E");
                startActivity(intent);
            }
        });
    }
}