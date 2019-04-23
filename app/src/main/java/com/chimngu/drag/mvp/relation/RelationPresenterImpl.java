package com.chimngu.drag.mvp.relation;

import com.chimngu.drag.data.model.Video;
import com.chimngu.drag.data.network.ApiHelper;
import com.chimngu.drag.mvp.BasePresenter;

import java.util.ArrayList;

import io.reactivex.Observable;
import io.reactivex.functions.Consumer;

public class RelationPresenterImpl extends BasePresenter<RelationContact.RelationView> implements RelationContact.RelationPresenter {

    private ApiHelper apiHelper;

    public RelationPresenterImpl(RelationContact.RelationView view, ApiHelper apiHelper) {
        super(view);
        this.apiHelper = apiHelper;
    }

    @Override
    public void getRelationVideo() {
        compositeDisposable.add(getRelationVideoObservable().subscribe(new Consumer<ArrayList<Video>>() {
            @Override
            public void accept(ArrayList<Video> videos) throws Exception {
                view.bindRelationVideo(videos);
            }
        }, throwable -> {
        }, () -> {
        }, disposable -> {
        }));
    }

    private Observable<ArrayList<Video>> getRelationVideoObservable() {
        return Observable.just("").map(s -> apiHelper.getRelationVideo());
    }
}
