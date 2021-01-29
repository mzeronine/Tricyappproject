package in.casual09.tricy;


import android.app.Dialog;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;

public class DashBoard1 extends AppCompatActivity {
    Button button, startbtn;
    FirebaseAuth mAuth;
    FirebaseAuth.AuthStateListener mAuthListener;
    Button btn_Membership, btn_Service, btn_Team, btn_Help, btn_About;
    Dialog mydialog;




    @Override
    public void onBackPressed() {
        moveTaskToBack( true );
        android.os.Process.killProcess( android.os.Process.myPid() );
        System.exit( 1 );
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_dashboard1 );

        mydialog = new Dialog( this );

        mAuth = FirebaseAuth.getInstance();
        btn_Membership = (Button) findViewById( R.id.membstn );
        btn_Service = (Button) findViewById( R.id.servicebtn );
        btn_Team = (Button) findViewById( R.id.tmbtn );
        btn_Help = (Button) findViewById( R.id.helpbtn );
        btn_About = (Button) findViewById( R.id.Aboutus );


        btn_Membership.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity( new Intent( DashBoard1.this, Membership.class ) );
            }
        } );


        btn_Team.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity( new Intent( DashBoard1.this, team.class ) );
            }
        } );


        btn_Service.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity( new Intent( DashBoard1.this, Oservice.class ) );
            }
        } );


        btn_Help.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity( new Intent( DashBoard1.this, Help.class ) );
            }
        } );


        btn_About.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                startActivity( new Intent( DashBoard1.this, Aboutus.class ) );

            }
        } );


    }
}


