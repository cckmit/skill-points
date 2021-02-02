package iilibxc.future.completable;

public class LabelService implements RemoteLoader {
    @Override
    public Info load() {
        this.delay();
        return new Info("标签信息");
    }
}
