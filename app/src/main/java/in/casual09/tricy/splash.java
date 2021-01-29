package in.casual09.tricy;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.widget.ProgressBar;

public class splash extends AppCompatActivity {

    private static int logofade=2000;
    private ProgressBar mprogress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed( new Runnable() {
            @Override
            public void run() {
                Intent HomeIntent = new Intent(splash.this, DashBoard1.class);
                startActivity(HomeIntent);
                finish();
            }
        }, logofade);

        new Thread(new Runnable() {
            @Override
            public void run() {
                doWork();
                startApp();
                finish();
            }
        } );

    }


    private void doWork() {

        for(int progress=0; progress<100; progress+=10)
        {
            try {
                Thread.sleep( 1000 );
                mprogress.setProgress( progress );
            }catch (Exception e)
            {
                e.printStackTrace();
            }
            }
        }

    private void startApp()
    {
        Intent intent = new Intent(splash.this, DashBoard1.class);
        startActivity(intent);
    }
    }