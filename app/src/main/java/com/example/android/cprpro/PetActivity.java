package com.example.android.cprpro;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class PetActivity extends AppCompatActivity {ArrayList<InfoClass> arrcontent = new ArrayList<>();  //instantiating a list of infoclass type
    RecyclerView rv;
    infoadapter mAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);

        arrcontent.add(new InfoClass("1. Remove any obstruction.\n" +
                "Open animals mouth and make sure the air passage is clear. " +
                "If not remove the object obstructing the air passage."));

        arrcontent.add(new InfoClass("2. Extend the head and give several artificial respirations:\n" +
                "A. For large dogs: close the animal's jaw tightly and breathe into " +
                "the nose. The animal's chest should rise. Give 2 breaths.\n" +
                "B. For small dogs and cats you may be able to cover the nose" +
                " and mouth with your mouth as you breathe. The animal's chest" +
                " should rise. Give 2 breaths."));

        arrcontent.add(new InfoClass("3. Next perform chest compression\n" +
                "A. For large dogs you may be able to position the dogs on its back and " +
                "compress the chest just like for humans.\n" +
                "B. For small dogs and cats as well as large dogs with funnel chests," +
                " you may need to lie the animal on its side and compress the side of the " +
                "rib cage. Alternatively you can position the animal on its back and press on " +
                "both sides of the rib cage.\n" +
                "C. The rate of chest compressions varies with the size of the animal\n" +
                "i. Dogs over 60 lbs: 60 compressions per minute\n" +
                "ii. Animals 11 to 60 lbs: 80-100 compressions per minute\n" +
                "iii. Animals 10 lbs or less: 120 compressions per minute"));


        arrcontent.add(new InfoClass("4. Alternate breaths with compressions\n" +
                "\n" +
                "The ratio of compressions to breaths should be approximately " +
                "the same as for humans - 30:2 Continue doing this until the animal " +
                "responds or begins to breathe on its own."));


        rv = (RecyclerView)findViewById(R.id.content_rv);

        LinearLayoutManager layoutManager = new LinearLayoutManager(this);
        rv.setLayoutManager(layoutManager);

        rv.setHasFixedSize(true);

        mAdapter = new infoadapter(arrcontent);
        rv.setAdapter(mAdapter);

    }

}
