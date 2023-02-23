package com.darshan.radio_group;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup RG;
    Button btn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Binding();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int id = RG.getCheckedRadioButtonId();
                RadioButton RB = findViewById(id);

                Toast.makeText(MainActivity.this,"Your Gender is="+RB.getText().toString(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void Binding() {
        RG.findViewById(R.id.RG);
        btn.findViewById(R.id.btn);
    }
}