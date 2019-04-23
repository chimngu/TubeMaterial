package com.chimngu.drag.mvp.home;

import com.chimngu.drag.data.model.Video;
import com.chimngu.drag.mvp.BaseView;
import com.chimngu.drag.mvp.Presenter;

import java.util.ArrayList;

public interface HomeContact {
     interface HomeView extends BaseView {
         void bindHomeVideo(ArrayList<Video> results);
     }

     interface HomePresenter extends Presenter{
         void getHomeVideo();
     }
}
