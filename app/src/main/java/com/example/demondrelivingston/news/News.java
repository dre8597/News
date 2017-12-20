package com.example.demondrelivingston.news;

/**
 * Created by demondrelivingston on 12/20/17.
 */

public class News {
    /**
     * Title of the news article
     */
    private String mArticleTitle;

    /**
     * Title of the news article
     */
    private String mAuthor;

    /**
     * date of the news article in milliseconds
     */
    private long mDate;


    /**
     * Website URL of the news article
     */
    private String mUrl;

    public News(String articleTitle, String author, long date, String url) {
        mArticleTitle = articleTitle;
        mAuthor = author;
        mDate = date;
        mUrl = url;
    }

    /**
     * Returns the title of the article.
     */
    public String getArticleTitle() {
        return mArticleTitle;
    }

    /**
     * Returns the author of the article.
     */
    public String getAuthor() {
        return mAuthor;
    }

    /**
     * Returns the date of the article.
     */
    public long getDate() {
        return mDate;
    }

    /**
     * Returns the url to find more information about the article.
     */
    public String getUrl() {
        return mUrl;
    }


}
