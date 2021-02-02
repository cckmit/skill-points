package iilibxc.future.completable;

public class WatchRecordService implements RemoteLoader {
    @Override
    public Info load() {
        this.delay();
        return new Info("观看记录");
    }
}
