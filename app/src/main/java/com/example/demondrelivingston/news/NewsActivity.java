package com.example.demondrelivingston.news;

import android.app.LoaderManager;
import android.content.Intent;
import android.content.Loader;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class NewsActivity extends AppCompatActivity
        implements LoaderManager.LoaderCallbacks<List<News>> {
    /**
     * Url for news article data from Guardian dataset
     */
    private static final String guardian_URL = "http://content.guardianapis.com/search?q=trump&api-key=test";

    /**
     * Constant value for the news Loader Id. We can choose any integer.
     */
    private static final int NEWS_LOADER_ID = 1;


    /**
     * Adapter for the list of articles
     */
    private NewsAdapter mAdapter;
    private TextView mEmptyStateTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news);
        //Find a reference to the {@link NewsView} in the layout
        ListView newsListView = (ListView) findViewById(R.id.list);
        mEmptyStateTextView = (TextView) findViewById(R.id.empty_view);
        newsListView.setEmptyView(mEmptyStateTextView);

        //Create a new adapter that takes an empty list of articles as input
        mAdapter = new NewsAdapter(this, new ArrayList<News>());

        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface
        newsListView.setAdapter(mAdapter);

        // Set an item click listener on the ListView, which sends an intent to a web browser
        // to open a website with more information about the selected article.
        newsListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Find the current article that was clicked on
                News currentNews = mAdapter.getItem(position);

                //Convert the String URL into a URI object(to pass into the Intent constructor)
                Uri newsUri = Uri.parse(currentNews.getUrl());

                //Create a new intent to view the Book URI
                Intent websiteIntent = new Intent(Intent.ACTION_VIEW, newsUri);


            }
        });


    }

    @Override
    public Loader<List<News>> onCreateLoader(int id, Bundle args) {
        return null;
    }

    @Override
    public void onLoadFinished(Loader<List<News>> loader, List<News> data) {

    }

    @Override
    public void onLoaderReset(Loader<List<News>> loader) {

    }
}
