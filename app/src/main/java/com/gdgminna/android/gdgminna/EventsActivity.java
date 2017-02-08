package com.gdgminna.android.gdgminna;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class EventsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_events);

        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.inner_menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_share) {
            Intent share = new Intent (Intent.ACTION_SEND);
            share.setType("text/plain");
            share.putExtra(Intent.EXTRA_SUBJECT,"GDG Minna");
            share.putExtra(Intent.EXTRA_TEXT,"Download GDG Minna App to know more about Google Developers Group Minna Community");
            startActivity(share);
            return true;
        } else if (id == R.id.action_about){
            Intent intent = new Intent(this,AboutActivity.class);
            startActivity(intent);
            return true;
        }if (id == R.id.action_feedback) {
            Intent intent = new Intent(this,FeedbackActivity.class);
            startActivity(intent);
            return true;
        } else if (id == R.id.action_help_faq){
            Intent intent = new Intent(this,FAQActivity.class);
            startActivity(intent);
            return true;
        }else if (id == R.id.action_disclaimer){
            Intent intent = new Intent(this,DisclaimerActivity.class);
            startActivity(intent);
            return true;
        } if (id == android.R.id.home) {
            onBackPressed();
            return true;
        }else
            return super.onOptionsItemSelected(item);
    }
}