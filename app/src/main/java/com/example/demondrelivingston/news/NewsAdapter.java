package com.example.demondrelivingston.news;

import android.content.Context;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

/**
 * Created by demondrelivingston on 12/20/17.
 */

public class NewsAdapter extends ArrayAdapter<News> {
    public NewsAdapter(Context context, ArrayList<News> news) {
        super(context, 0, news);
    }
}
