package sg.edu.rp.c346.id20014063.mymodules;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ModuleDetailActivity extends AppCompatActivity {
    TextView tvedit;
    Button back;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module_detail);
        back = findViewById(R.id.button);
        tvedit = findViewById(R.id.textView);
        Intent intent =getIntent();
        String code = intent.getStringExtra("ModuleCode");
        String name = intent.getStringExtra("ModuleName");
        int year = intent.getIntExtra("AcademicYear",1);
        int semester = intent.getIntExtra("Semester", 1);
        int credit = intent.getIntExtra("ModuleCredit",4);
        String venue = intent.getStringExtra("Venue");

        tvedit.setText("Module Code: " + code
                    + "\nModule Name: " + name
                    + "\nYear: " + year
                    + "\nSemester: " + semester
                    + "\nModule Credit: " + credit
                    + "\nVenue: " + venue
        );

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(ModuleDetailActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}