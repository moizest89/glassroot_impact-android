package moizest89.indigitous.com.glassrootimpact.ui.main;

import java.util.List;

import moizest89.indigitous.com.glassrootimpact.data.models.Request;
import moizest89.indigitous.com.glassrootimpact.ui.base.MvpView;

/**
 * Created by @moizest89 in SV on 11/6/16.
 */

public interface IMainView extends MvpView{

    void hideData();
    void showData();
    void hideLoader();
    void showLoader();
    void setData(List<Request> requests);
}
