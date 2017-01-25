package com.gdgminna.android.gdgminna;

import android.app.Activity;
import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;

import java.util.ArrayList;
import java.util.List;


public class OrganizersActivity extends AppCompatActivity {

    private RecyclerView recyclerview;
    private String[] names;
    private String[] offices;
    private TypedArray profile_pics;
    private String[] emails;
    private List<Member> memberList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_organizers);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        names = getResources().getStringArray(R.array.names);
        offices = getResources().getStringArray(R.array.offices);
        profile_pics = getResources().obtainTypedArray(R.array.profile_pics);
        emails = getResources().getStringArray(R.array.emails);

        memberList = new ArrayList<Member>();
        for (int i = 0; i < names.length; i++) {
            Member member = new Member(names[i], offices[i], emails[i], profile_pics.getResourceId(i,-1));
            memberList.add(member);
        }

        recyclerview = (RecyclerView) findViewById(R.id.recyclerview);
        LinearLayoutManager layoutManager = new LinearLayoutManager(OrganizersActivity.this);
        recyclerview.setLayoutManager(layoutManager);
        RecyclerViewAdapter adapter= new RecyclerViewAdapter(memberList, OrganizersActivity.this);
        recyclerview.setAdapter(adapter);
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_share) {
            return true;
        } else if (id == R.id.action_about) {
            return true;
        }
        if (id == R.id.action_feedback) {
            return true;
        } else if (id == R.id.action_help_faq) {
            return true;
        } else if (id == R.id.action_disclaimer) {
            return true;
        } else if (id == android.R.id.home) {
            onBackPressed();
            return true;
        } else
            return super.onOptionsItemSelected(item);

    }
   }

