package moizest89.indigitous.com.glassrootimpact.ui.base;

/**
 * Created by @moizest89 in SV on 11/6/16.
 */

public class BasePresenter <T extends MvpView> implements Presenter<T> {

    private T mMvpView;

    @Override
    public void attachView(T mvpView) {
        mMvpView = mvpView;
        sendData("");
    }


    private void sendData(String name_view){

    }

    @Override
    public void detachView() {
        mMvpView = null;

    }

    public boolean isViewAttached() {
        return mMvpView != null;
    }

    public T getMvpView() {
        return mMvpView;
    }

    public void checkViewAttached() {
        if (!isViewAttached()) throw new MvpViewNotAttachedException();
    }

    public static class MvpViewNotAttachedException extends RuntimeException {
        public MvpViewNotAttachedException() {
            super("Please call Presenter.attachView(MvpView) before" +
                    " requesting data to the Presenter");
        }
    }
}
