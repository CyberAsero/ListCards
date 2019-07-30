package com.enfrausa.listcards;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Window;
import android.view.WindowManager;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // set the statue bar background to transparent

        Window w = getWindow();
        w.setFlags(WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS,WindowManager.LayoutParams.FLAG_LAYOUT_NO_LIMITS);

        // setup recyclerview with the adapter

        RecyclerView recyclerView = findViewById(R.id.rv_list);
        List<item> mlist = new ArrayList<>();

        mlist.add(new item(R.drawable.for_profile_a,"Anne",R.drawable.profile_a,2500));
        mlist.add(new item(R.drawable.for_profile_b,"Yesha",R.drawable.profile_b,1655));
        mlist.add(new item(R.drawable.for_profile_c,"Ashley",R.drawable.profile_c,2365));
        mlist.add(new item(R.drawable.for_profile_a,"Lauren",R.drawable.profile_a,856));
        mlist.add(new item(R.drawable.for_profile_b,"Gia",R.drawable.profile_b,1487));
        mlist.add(new item(R.drawable.for_profile_c,"Heather",R.drawable.profile_c,2986));
        mlist.add(new item(R.drawable.for_profile_a,"Naomi",R.drawable.profile_a,2500));
        mlist.add(new item(R.drawable.for_profile_b,"Anne",R.drawable.profile_b,2500));
        mlist.add(new item(R.drawable.for_profile_c,"Kiesha",R.drawable.profile_c,2500));
        mlist.add(new item(R.drawable.for_profile_a,"Lea",R.drawable.profile_a,2500));
        mlist.add(new item(R.drawable.for_profile_b,"Andrea",R.drawable.profile_b,2500));
        mlist.add(new item(R.drawable.for_profile_c,"Jose",R.drawable.profile_c,2500));

        Adapter adapter = new Adapter(this, mlist);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
