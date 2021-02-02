package iilibxc.future.completable;

public class LearnRecordService implements RemoteLoader {
    public Info load() {
        this.delay();
        return new Info("学习信息");
    }
}