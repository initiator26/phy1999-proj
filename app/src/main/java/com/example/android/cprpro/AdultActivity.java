package com.example.android.cprpro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class AdultActivity extends AppCompatActivity {
    ArrayList<InfoClass> arrcontent = new ArrayList<>();  //instantiating a list of infoclass type
    RecyclerView rv;
    infoadapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

        arrcontent.add(new InfoClass("1. CALL\n" +
                "Check the victim for unresponsiveness. If the person is not responsive and not" +
                " breathing or not breathing normally. Call 911 and return to the victim. If possible" +
                " bring the phone next to the person and place on speaker mode. In most locations the" +
                " emergency dispatcher can assist you with CPR instructions.\n" +
                "\n", R.drawable.adult1));

        arrcontent.add(new InfoClass("2. PUMP\n" +
                "If the victim is still not breathing normally, coughing or moving, begin chest compressions." +
                "  Push down in the center of the chest 2-2.4 inches 30 times. Pump hard and fast at the rate" +
                " of 100-120/minute, faster than once per second.", R.drawable.adult2));

        arrcontent.add(new InfoClass("3. BLOW\n" +
                "Tilt the head back and lift the chin. Pinch nose and cover the mouth with yours and blow until" +
                " you see the chest rise. Give 2 breaths.  Each breath should take 1 second.", R.drawable.adult3));

        arrcontent.add(new InfoClass("4. CONTINUE WITH 30 PUMPS AND 2 BREATHS UNTIL HELP ARRIVES \n" +
                "NOTE: This ratio is the same for one-person & two-person CPR.  In two-person CPR " +
                "the person pumping the chest stops while the other gives mouth-to-mouth breathing", R.drawable.adult4));


        rv = (RecyclerView)findViewById(R.id.content_rv);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        rv.setLayoutManager(layoutManager);

        rv.setHasFixedSize(true);

        mAdapter = new infoadapter(arrcontent);
        rv.setAdapter(mAdapter);

    }

}
