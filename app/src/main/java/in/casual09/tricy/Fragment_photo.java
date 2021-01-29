package in.casual09.tricy;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

public class Fragment_photo  extends Fragment {


    Intent intenta, intentp,intentS;
    Button amanposts,sahilposts,poorvaposts;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View rootView = inflater.inflate( R.layout.fragment_photo, container, false );

        intenta = new Intent( getActivity(), aman.class );
        amanposts = (Button) rootView.findViewById( R.id.plbtn );

        intentS = new Intent(getActivity(), sahil.class);
        sahilposts =(Button) rootView.findViewById(R.id.membst);

        intentp = new Intent(getActivity(), poorva.class);
        poorvaposts =(Button) rootView.findViewById(R.id.pbtn);


        amanposts.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {
                startActivity( intenta );
            }
        } );

        sahilposts.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(intentS);
            }
        } );



        poorvaposts.setOnClickListener( new View.OnClickListener() {
            public void onClick(View v) {
                startActivity( intentp);
            }
        } );

        return rootView;
    }
}

