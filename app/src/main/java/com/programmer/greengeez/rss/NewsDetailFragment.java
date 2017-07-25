package com.programmer.greengeez.rss;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class NewsDetailFragment extends Fragment {

    private long newsId;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        if(savedInstanceState != null)
            newsId = savedInstanceState.getLong("newsId");

        return inflater.inflate(R.layout.fragment_news, container, false);
    }

    @Override
    public void onStart() {
        super.onStart();
        View view = getView();
        if (view != null)
        {
            TextView title = (TextView) view.findViewById(R.id.textTitle);
            News news = News.news[(int) newsId];
            title.setText(news.getName());
            TextView description = (TextView) view.findViewById(R.id.textDescription);
            description.setText(news.getDescription());
        }
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putLong("newsId", newsId);
    }

    public void setNewsId(long newsId) {
        this.newsId = newsId;
    }
}
