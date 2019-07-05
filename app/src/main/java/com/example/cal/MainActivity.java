package com.example.cal;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    int modev=0;
    double ans;
    Button mode1,calculate1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mode1=findViewById(R.id.button2);
        calculate1=findViewById(R.id.button1);
    }

    public void calculate(View view)
    {
        EditText et = (EditText)findViewById(R.id.field1);
        EditText et2 = (EditText)findViewById(R.id.field2);
        EditText et3 = (EditText)findViewById(R.id.field3);

        String n1 = et.getText().toString();
        double num1 = Double.parseDouble(n1);

        String n2 = et2.getText().toString();
        double num2 = Double.parseDouble(n2);

        switch(modev)
        {
            case 0: ans = num1+num2;
                break;
            case 1: ans= num1-num2;
                break;
            case 2:
                ans=num1*num2;
                break;
            case 3:
                ans=num1/num2;
        }
        et3.setText(String.valueOf(ans));

    }
    public void mode(View view)
    {
        modev++;
        modev=modev%4;
        switch(modev)
        {
            case 0: mode1.setText("Mode Add");
                break;
            case 1: mode1.setText("Mode Subtract");
                break;
            case 2:
                mode1.setText("Mode Multiply");
                break;
            case 3: mode1.setText("Mode Divide");
                break;
        }
    }
}