package in.casual09.tricy;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class poorva extends AppCompatActivity {

    Button seepost, callme;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_poorva);
        seepost = findViewById(R.id.poorvaposts);
        callme = findViewById(R.id.poorvacall);

        seepost.setOnClickListener( new View.OnClickListener() {
                                        public void onClick(View v) {
                                            Intent intent = new Intent();
                                            intent.setAction(Intent.ACTION_VIEW);
                                            intent.addCategory(Intent.CATEGORY_BROWSABLE);
                                            intent.setData(Uri.parse("http://www.casual09.in/photoshoot/"));
                                            startActivity(intent);
                                        }

                                    }
        );


        callme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                dialContactPhone("+917776063215");
            }
        });
    }

    private void dialContactPhone(final String phoneNumber) {
        startActivity(new Intent(Intent.ACTION_DIAL, Uri.fromParts("tel", phoneNumber, null)));
    }


}

