package iilibxc.event;


import java.io.File;

import org.apache.commons.io.monitor.FileAlterationMonitor;
import org.apache.commons.io.monitor.FileAlterationObserver;

public class FileAlterationMonitorTest {

    public static void main(String[] args) {

        File dir = new File("E:\\新建文件夹");
        //监听器
        FileAlterationMonitor monitor = new FileAlterationMonitor();

		/*//1. 不指定监听类型, 则会监听两种类型: 文件 及 子文件夹

		//2. 指定监听类型,只指定监听文件的类型,例如 ".txt"文件, 则在子文件夹下的".txt"文件变化不会监听,只会监听E:\\testDir下的文件变化
		IOFileFilter fileFileter = FileFilterUtils.and(FileFilterUtils.fileFileFilter(),FileFilterUtils.suffixFileFilter(".txt"));

		//3. 指定监听类型,只指定监听文件夹,则文件的变化不会监听到(不论是在文件夹下的还是在子文件夹下的)
		IOFileFilter dirFilter = FileFilterUtils.and(FileFilterUtils.directoryFileFilter(),HiddenFileFilter.VISIBLE);

		//4. 指定两种监听类型,文件及文件夹,则会监听两种,文件夹及文件(不论是在文件夹下的还是在子文件夹下的)
		IOFileFilter filter = FileFilterUtils.or(fileFileter,dirFilter);*/

        //观察者
        FileAlterationObserver observer = new FileAlterationObserver(dir/*,filter*/);
        observer.addListener(new MyFileAlterationListener());

        monitor.addObserver(observer);
        try {
            //开始监听
            monitor.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
