package com.example.android.cprpro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class InfantActivity extends AppCompatActivity {

    ArrayList<InfoClass> arrcontent = new ArrayList<>();  //instantiating a list of infoclass type
    RecyclerView rv;
    infoadapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

        arrcontent.add(new InfoClass("1. Shout and Tap\n" +
                "Shout and gently tap the child on the shoulder. " +
                "If there is no response and not breathing or not breathing normally, " +
                "position the infant on his or her back and begin CPR.", R.drawable.infant1));

        arrcontent.add(new InfoClass("2. Give 30 Compressions\n" +
                "Give 30 gentle chest compressions at the rate of 100-120/minute." +
                " Use two or three fingers in the center of the chest just below the nipples. Press down" +
                " approximately one-third the depth of the chest (about 1 and a half inches).", R.drawable.infant2));

        arrcontent.add(new InfoClass("3. Open The Airway\n" +
                "Open the airway using a head tilt lifting of chin. Do not tilt" +
                " the head too far back", R.drawable.infant3));

        arrcontent.add(new InfoClass("4. Give 2 Gentle Breaths\n" +
                "If the baby is not breathing or not breathing normally, cover" +
                " the baby's mouth and nose with your mouth and give 2 gentle breaths. Each breath " +
                "should be 1 second long. You should see the baby's chest rise with each breath.", R.drawable.infant4));


        rv = (RecyclerView)findViewById(R.id.content_rv);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        rv.setLayoutManager(layoutManager);

        rv.setHasFixedSize(true);

        mAdapter = new infoadapter(arrcontent);
        rv.setAdapter(mAdapter);

    }
}
