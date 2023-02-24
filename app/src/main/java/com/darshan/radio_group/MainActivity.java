package com.darshan.radio_group;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    RadioGroup rgp;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Binding();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {
                int id = rgp.getCheckedRadioButtonId();
                RadioButton rb =findViewById(id);
                Toast.makeText(MainActivity.this,"Your Gender is ="+rb.getText().toString(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void Binding() {
        rgp = findViewById(R.id.rg);
        btn = findViewById(R.id.btn);
    }


}