package iilibxc.future.completable;
public class CustomerInfoService implements RemoteLoader {
    public Info load() {
        this.delay();
        return new Info("基本信息");
    }
}
