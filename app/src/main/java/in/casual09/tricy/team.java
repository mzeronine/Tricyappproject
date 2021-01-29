package in.casual09.tricy;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.RequiresApi;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageView;

public class team extends AppCompatActivity {


    ImageView photo, video, dev;
    ViewPager viewPager;
    PagerViewAdapter pagerViewAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_team);


        photo = (ImageView) findViewById( R.id.photo_id );
        video = (ImageView) findViewById( R.id.video_id );
        dev = (ImageView) findViewById(R.id.code);

        viewPager = (ViewPager) findViewById( R.id.fragment_container );

        pagerViewAdapter = new PagerViewAdapter( getSupportFragmentManager());

        viewPager.setAdapter( pagerViewAdapter );

        photo.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {
                viewPager.setCurrentItem( 0 );

            }
        } );

        video.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {
                viewPager.setCurrentItem( 1 );

            }
        } );


        dev.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {
                viewPager.setCurrentItem( 2 );

            }
        } );


        viewPager.addOnPageChangeListener( new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @RequiresApi(api = Build.VERSION_CODES.M)
            @Override
            public void onPageSelected(int position) {
                onChangeTab( position );
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        } );


    }



    private void onChangeTab(int position)
    {

        if (position == 0) {
            photo.setBackgroundColor(Color.WHITE);
            video.setBackgroundColor(Color.GRAY);
            dev.setBackgroundColor(Color.GRAY);
        }
        if (position == 1) {

            video.setBackgroundColor(Color.WHITE);
            photo.setBackgroundColor(Color.GRAY);
            dev.setBackgroundColor(Color.GRAY);
        }


        if (position == 2) {

            dev.setBackgroundColor(Color.WHITE);
            photo.setBackgroundColor(Color.GRAY);
           video.setBackgroundColor(Color.GRAY);
        }


    }
}
