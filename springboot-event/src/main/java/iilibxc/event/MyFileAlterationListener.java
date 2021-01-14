package iilibxc.event;

import java.io.File;

import org.apache.commons.io.monitor.FileAlterationListenerAdaptor;

/**
 * 适配器,告知调用者文件状态变化
 *
 */
public class MyFileAlterationListener extends FileAlterationListenerAdaptor {

    //文件夹创建
    @Override
    public void onDirectoryCreate(File directory) {
        System.out.println(directory.getName() + " directory Create");
    }

    //文件夹改变
    @Override
    public void onDirectoryChange(File directory) {
        System.out.println(directory.getName() + " directory Change");
    }

    //文件夹删除
    @Override
    public void onDirectoryDelete(File directory) {
        System.out.println(directory.getName() + " directory Delete");
    }

    //文件创建
    @Override
    public void onFileCreate(File file) {
        super.onFileCreate(file);
        System.out.println(file.getName() + " file Create");
    }

    //文件夹改变
    @Override
    public void onFileChange(File file) {
        super.onFileChange(file);
        System.out.println(file.getName() + " file Change");
    }

    //文件删除
    @Override
    public void onFileDelete(File file) {
        super.onFileDelete(file);
        System.out.println(file.getName() + " file Delete");
    }

}