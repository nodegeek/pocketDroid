package com.example.myapplication.app;

import android.app.ListActivity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import java.util.ArrayList;


public class MainActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        NewsArrayAdapter adapter = new NewsArrayAdapter(this, generateData());
        setListAdapter(adapter);

    }
    //public NewsItem(int thumbnail,String title, int logo, String source, String time)
    private ArrayList<NewsItem> generateData(){
        ArrayList<NewsItem> newsItems = new ArrayList<NewsItem>();
        newsItems.add(new NewsItem(R.drawable.my_test_img,"News Mangalore: Stomach this - Dead lizard found in food at Wenlock hospital tilte",R.drawable.daiji_logo,"Daijiworld.com","2hrs ago"));
        newsItems.add(new NewsItem(R.drawable.my_test_img,"Mangalore: Now, gold found in toffees and eyeliner bottles at airport!",R.drawable.daiji_logo,"Daijiworld.com","7hrs ago"));
        newsItems.add(new NewsItem(R.drawable.my_test_img,"Bangalore: Fear of losing Christian votes? AICC summons Sangliana to Delhi",R.drawable.daiji_logo,"Daijiworld.com","6hrs ago"));
        return newsItems;
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}
