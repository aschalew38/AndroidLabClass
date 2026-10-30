package com.example.lab1_;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {
    TextView ftxt;
    EditText name_edit1;
    Button bt1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.lab_demo);
       ftxt = (TextView) findViewById(R.id.fname);
       name_edit1 = (EditText) findViewById(R.id.fname_edit);
        bt1 = (Button) findViewById(R.id.btsave);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
       String userinput =
               name_edit1.getText().toString();
      Toast.makeText(getApplicationContext(),
              "hello"+userinput,Toast.LENGTH_LONG).show();
            }
        });
}
}