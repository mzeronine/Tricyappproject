package in.casual09.tricy;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

public class verifyno extends AppCompatActivity {


    private EditText editTextMobile;
    private Spinner spinner;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_verifyno);

        spinner = findViewById(R.id.spi);
        spinner.setAdapter(new ArrayAdapter<String>(this, android.R.layout.simple_spinner_dropdown_item, countrydata.CountryNames) );
        editTextMobile= findViewById(R.id.editTextMobile);

        findViewById(R.id.buttonContinue).setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v)
            {

                String code = countrydata.CountryAreaCodes[spinner.getSelectedItemPosition()];
                String number = editTextMobile.getText().toString().trim();

                if(number.isEmpty() || number.length()<10)
                {
                    editTextMobile.setError(" Valid NUMBER IS REQUIRED");
                    editTextMobile.requestFocus();
                    return;
                }

                String phoneNumber = "+"+code + number;

                Intent intent =(new Intent(verifyno.this, DashBoard1.class));
                intent.putExtra("phonenumber", phoneNumber);
                startActivity(intent);
            }
        } );

    }
}


