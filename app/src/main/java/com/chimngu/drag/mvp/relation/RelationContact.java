package com.chimngu.drag.mvp.relation;

import com.chimngu.drag.data.model.Video;
import com.chimngu.drag.mvp.BaseView;
import com.chimngu.drag.mvp.Presenter;

import java.util.ArrayList;

public interface RelationContact {
     interface RelationView extends BaseView {
         void bindRelationVideo(ArrayList<Video> results);
     }

     interface RelationPresenter extends Presenter{
         void getRelationVideo();
     }
}
