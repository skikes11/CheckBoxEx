package com.example.checkboxex;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    CheckBox cbChocolate, cbSprink, cbCrush, cbCherries, cbOrio;
    Button btnShowToast;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Mapping();

        btnShowToast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String order = "Toppings: ";

                if(cbChocolate.isChecked()){
                    order+= cbChocolate.getText() + ", ";
                }
                if(cbSprink.isChecked()){
                    order+= cbSprink.getText() + ", ";
                }
                if(cbCrush.isChecked()){
                    order+= cbCrush.getText() + ", ";
                }
                if(cbCherries.isChecked()){
                    order+= cbCherries.getText() + ", ";
                }
                if(cbOrio.isChecked()){
                    order+= cbOrio.getText() + ", ";
                }
                Toast.makeText(MainActivity.this, order, Toast.LENGTH_SHORT).show();
            }
        });


    }

    private void Mapping(){
        cbChocolate = (CheckBox) findViewById(R.id.cbChoclate);
        cbSprink = (CheckBox) findViewById(R.id.cbSprink);
        cbCrush = (CheckBox) findViewById(R.id.cbCrush);
        cbCherries = (CheckBox) findViewById(R.id.cbCherries);
        cbOrio = (CheckBox) findViewById(R.id.cbOrio);
        btnShowToast = (Button) findViewById(R.id.btnShowToast);
    }
}