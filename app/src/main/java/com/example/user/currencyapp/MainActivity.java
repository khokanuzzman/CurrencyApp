package com.example.user.currencyapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    public void DollerConvert(View view){
        EditText getdoller =(EditText) findViewById(R.id.doller);
        Double dollerDouble= Double.parseDouble(getdoller.getText().toString());
        Double taka= dollerDouble*82.94;
        Toast.makeText(MainActivity.this, taka.toString(), Toast.LENGTH_LONG).show();
    }

    public void poundToTakaConvert(View view){
        EditText getPound =(EditText) findViewById(R.id.pound);
        Double poundDouble= Double.parseDouble(getPound.getText().toString());
        Double takaPound= poundDouble*114.93;
        Toast.makeText(MainActivity.this, takaPound.toString(),Toast.LENGTH_LONG).show();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
