package com.example.dell.questionnaire;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    int correct=0;
    int incorrect=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    String q1ans="Ram Nath Kovind";
    int q2ans=R.id.a2b;
    int q3ans=R.id.a3b;
    public void subans(View v)
    {
        correct=0;
        incorrect=0;
        EditText et1=(EditText)findViewById(R.id.a1);
        boolean a1sub=et1.getText().toString().equalsIgnoreCase(q1ans);
        if(a1sub)
            correct+=1;
        else
            incorrect+=1;


        RadioGroup a2sub=(RadioGroup)findViewById(R.id.a2);
        if(a2sub.getCheckedRadioButtonId()==q2ans)
            correct+=1;
        else
            incorrect+=1;

        RadioGroup a3sub=(RadioGroup)findViewById(R.id.a3);
        if(a3sub.getCheckedRadioButtonId()==q3ans)
            correct+=1;
        else
            incorrect+=1;



        CheckBox cb14=(CheckBox)findViewById(R.id.a4cb1);
        CheckBox cb24=(CheckBox)findViewById(R.id.a4cb2);
        CheckBox cb34=(CheckBox)findViewById(R.id.a4cb3);
        CheckBox cb44=(CheckBox)findViewById(R.id.a4cb4);
        if(cb14.isChecked() && !cb24.isChecked() && cb34.isChecked() && !cb44.isChecked())
            correct+=1;
        else
            incorrect+=1;



        CheckBox cb15=(CheckBox)findViewById(R.id.a5cb1);
        CheckBox cb25=(CheckBox)findViewById(R.id.a5cb2);
        CheckBox cb35=(CheckBox)findViewById(R.id.a5cb3);
        CheckBox cb45=(CheckBox)findViewById(R.id.a5cb4);
        if(cb15.isChecked() && !cb25.isChecked() && !cb35.isChecked() && cb45.isChecked())
            correct+=1;
        else
            incorrect+=1;

        TextView tv1=(TextView)findViewById(R.id.sco);
        TextView tv2=(TextView)findViewById(R.id.sinco);
        tv1.setText(String.valueOf(correct));
        tv2.setText(String.valueOf(incorrect));
        Toast.makeText(this,"Correct: " + correct + "\nIncorrect: " + incorrect, Toast.LENGTH_LONG).show();
    }

}
