package moizest89.indigitous.com.glassrootimpact.ui.base;

/**
 * Created by @moizest89 in SV on 11/6/16.
 */

public interface Presenter <V extends MvpView> {

    void attachView(V mvpView);
    void detachView();

}
