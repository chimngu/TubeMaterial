package com.chimngu.drag.mvp.trending;

import com.chimngu.drag.data.model.Video;
import com.chimngu.drag.mvp.BaseView;
import com.chimngu.drag.mvp.Presenter;

import java.util.ArrayList;

public interface TrendingContact {
     interface TrendingView extends BaseView {
         void bindTrendingVideo(ArrayList<Video> results);
     }

     interface TrendingPresenter extends Presenter{
         void getTrendingVideo();
     }
}
