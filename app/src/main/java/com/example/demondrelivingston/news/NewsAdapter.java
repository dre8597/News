package com.example.demondrelivingston.news;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 * Created by demondrelivingston on 12/20/17.
 */

public class NewsAdapter extends ArrayAdapter<News> {

    public NewsAdapter(Context context, ArrayList<News> news) {
        super(context, 0, news);
    }

    /**
     * Returns a list item view that displays information about the earthquake at the given position
     * in the list of earthquakes.
     */
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Check if there is an existing list item view (called convertView) that we can reuse,
        // otherwise, if convertView is null, then inflate a new list item layout.
        View listItemView = convertView;
        if (listItemView == null) {
            listItemView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        //Find the article at the given position in the list of articles
        News currentNews = getItem(position);

        //Find the TextView with view ID Title
        TextView titleView = (TextView) listItemView.findViewById(R.id.article_title);
        titleView.setText(currentNews.getArticleTitle());

        //Find the TextView with view ID Author
        TextView authorView = (TextView) listItemView.findViewById(R.id.author);
        authorView.setText(currentNews.getAuthor());

        //Find the TextView with view ID Site
        TextView siteView = (TextView) listItemView.findViewById(R.id.site);
        siteView.setText(currentNews.getSite());

        //Find the TextView with the View ID date
        TextView dateView = (TextView) listItemView.findViewById(R.id.date);
        dateView.setText(currentNews.getDate());


        return listItemView;

    }

}
