package axl.com.aframe.kit.rx;

import axl.com.aframe.ui.utils.FileLog;
import rx.Subscriber;

public abstract class SimpleSubscriber<T> extends Subscriber<T> {
    @Override
    public void onCompleted() {

    }

    @Override
    public void onError(Throwable e) {
        FileLog.e("Simple", e);
    }
}