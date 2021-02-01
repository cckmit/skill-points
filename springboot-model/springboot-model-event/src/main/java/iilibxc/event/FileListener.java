package iilibxc.event;

/**
 * @author wby
 * @author wby
 */
/**
 * @author wby
 *
 */


import java.io.File;


public class FileListener {

    public static void main(String[] args) {
        String path = "e:/";
        Thread listener = new Thread(new FileListenerThread(path));
        listener.start();
    }
}

class FileListenerThread implements Runnable {

    private String path;

    @Override
    public void run() {
        System.out.println("running.....");
        //需要监听的文件夹
        File file = new File(path);
        //原始文件中的文件数量
        int orginalSize = file.list().length;
        while (true) {
            int size = file.list().length;
            if (size > orginalSize) {
                System.out.println("文件目录:" + file.getName() + "\t文件新增，数量为： " + (size - orginalSize));
                orginalSize = size;
            } else if (size < orginalSize) {
                System.out.println("文件目录:" + file.getName() + "\t文件删除，数量为： " + (orginalSize - size));
                orginalSize = size;
            }
            try {
                //睡1秒
                Thread.sleep(1000);
            } catch (InterruptedException e) {
            }
            System.out.println("监控中......");
        }
    }

    public void setPath(String path) {
        System.out.println(path);
        this.path = path;
    }

    public FileListenerThread(String path) {
        System.out.println("开始监听中,监听目录为" + path + "...");
        this.path = path;
    }
}
