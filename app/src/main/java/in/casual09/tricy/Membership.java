package in.casual09.tricy;



import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebChromeClient;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.ProgressBar;
import android.widget.Toast;


public class Membership extends AppCompatActivity {

    private WebView webView;
    ProgressBar progressbarweb;

    private  String webUrl= "https://www.covid19india.org";



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_membership );

        checkConnection();


        webView = findViewById( R.id.webView );
        webView.setWebViewClient( new WebViewClient() );
        webView.loadUrl( webUrl );

        progressbarweb = findViewById( R.id.ProgressBar );

        WebSettings webSettings = webView.getSettings();
        webSettings.setJavaScriptEnabled( true );

        webView.setWebChromeClient( new WebChromeClient() {

            @Override
            public void onProgressChanged(WebView view, int newProgress) {

                progressbarweb.setVisibility( View.VISIBLE );
                progressbarweb.setProgress( newProgress );

                if (newProgress == 100) {
                    progressbarweb.setVisibility( View.GONE );
                }


                super.onProgressChanged( view, newProgress );
            }
        } );


    }


    @Override
    public void onBackPressed() {
        if (webView.canGoBack()) {
            webView.goBack();


        } else {


            super.onBackPressed();


        }
    }


    public  void  checkConnection() {
        ConnectivityManager manager = (ConnectivityManager) getApplicationContext().getSystemService( Context.CONNECTIVITY_SERVICE );

        NetworkInfo activeNetwork = manager.getActiveNetworkInfo();

        try {


            if (null != activeNetwork) {
                if (activeNetwork.getType() == ConnectivityManager.TYPE_WIFI) {
                    Toast.makeText( this, "Thanks for staying home..!", Toast.LENGTH_SHORT ).show();
                }
            } else if (activeNetwork.getType() == ConnectivityManager.TYPE_MOBILE) {
                if (activeNetwork.getType() == ConnectivityManager.TYPE_WIFI) {
                    Toast.makeText( this, "Thanks for staying home..!", Toast.LENGTH_SHORT ).show();
                }
            }

        }
        catch (NullPointerException e) {


            Toast.makeText( this, "No Internet Connection", Toast.LENGTH_LONG).show();

        }
    }

}

