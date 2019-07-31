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

        mlist.add(new item(R.drawable.ls_a,"Yesha",R.drawable.profile_b,1655));
        mlist.add(new item(R.drawable.ls_b,"Ashley",R.drawable.profile_c,2365));
        mlist.add(new item(R.drawable.ls_c,"Lauren",R.drawable.profile_a,856));
        mlist.add(new item(R.drawable.ls_d,"Yesha",R.drawable.profile_b,1655));
        mlist.add(new item(R.drawable.ls_e,"Ashley",R.drawable.profile_c,2365));
        mlist.add(new item(R.drawable.ls_f,"Lauren",R.drawable.profile_a,856));
        mlist.add(new item(R.drawable.ls_g,"Yesha",R.drawable.profile_b,1655));
        mlist.add(new item(R.drawable.ls_a,"Yesha",R.drawable.profile_b,1655));
        mlist.add(new item(R.drawable.ls_b,"Ashley",R.drawable.profile_c,2365));
        mlist.add(new item(R.drawable.ls_c,"Lauren",R.drawable.profile_a,856));
        mlist.add(new item(R.drawable.ls_d,"Yesha",R.drawable.profile_b,1655));
        mlist.add(new item(R.drawable.ls_e,"Ashley",R.drawable.profile_c,2365));
        mlist.add(new item(R.drawable.ls_f,"Lauren",R.drawable.profile_a,856));
        mlist.add(new item(R.drawable.ls_g,"Yesha",R.drawable.profile_b,1655));


        Adapter adapter = new Adapter(this, mlist);

        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

    }
}
