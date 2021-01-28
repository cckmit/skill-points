package future.completable;

public interface RemoteLoader {

    Info load();

    default void delay() {
        try {
            Thread.sleep(1000L);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}




