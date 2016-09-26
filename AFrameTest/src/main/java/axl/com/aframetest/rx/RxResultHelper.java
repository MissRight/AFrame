package axl.com.aframetest.rx;

import axl.com.aframe.kit.exception.ApiException;
import axl.com.aframetest.model.entity.BaseResult;
import rx.Observable;
import rx.Subscriber;
import rx.functions.Func1;

/**
 * User: Axl_Jacobs(Axl.Jacobs@gmail.com)
 * Date: 2016-09-22
 * Time: 18:20
 * FIXME
 */
public class RxResultHelper {
    public static <T> Observable.Transformer<BaseResult<T>, T> handleResult() {
        return tObservable -> tObservable.flatMap(new Func1<BaseResult<T>, Observable<T>>(){

            @Override
            public Observable<T> call(BaseResult<T> entity) {
                if (entity.isOk()) {
                    return createData(entity.content);
                }  else if (entity.getCode().equals("315")) {
                    return Observable.error(new ApiException(entity.error_code, entity.getMessage()));//不允许评论
                }else {
                    return Observable.error(new ApiException(entity.error_code, entity.getMessage()));//不允许评论
                }
            }
        });

    }


    private static <T> Observable<T> createData(T t) {
        return Observable.create(new Observable.OnSubscribe<T>() {
            @Override
            public void call(Subscriber<? super T> subscriber) {
                try {
                    subscriber.onNext(t);
                    subscriber.onCompleted();
                } catch (Exception e) {
                    subscriber.onError(e);
                }
            }
        });
    }
}
