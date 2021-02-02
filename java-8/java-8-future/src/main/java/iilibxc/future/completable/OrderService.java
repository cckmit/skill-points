package iilibxc.future.completable;

public class OrderService implements RemoteLoader {
    @Override
    public Info load() {
        this.delay();
        return new Info("订单信息");
    }
}
