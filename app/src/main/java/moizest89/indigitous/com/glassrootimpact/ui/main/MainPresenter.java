package moizest89.indigitous.com.glassrootimpact.ui.main;

import android.content.Context;

import moizest89.indigitous.com.glassrootimpact.ui.base.BasePresenter;

/**
 * Created by @moizest89 in SV on 11/6/16.
 */

public class MainPresenter extends BasePresenter<IMainView>{

    private Context context;

    public MainPresenter(Context context) {
        this.context = context;
    }



    public void getData(){

        getMvpView().hideLoader();
        getMvpView().showData();
    }
}
