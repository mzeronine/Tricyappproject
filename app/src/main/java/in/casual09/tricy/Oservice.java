package in.casual09.tricy;


import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class Oservice extends AppCompatActivity {

    Button service;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView(R.layout.activity_oservice);
        service =findViewById(R.id.tservice);


        service.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent( Oservice.this, serviceform.class ));
            }
        } );


    }
}