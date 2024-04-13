import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;


//删除目录或文件
public class Test071_DeleteFile {

    public static void main(String[] args) throws IOException {
        //创建目录
        String dirname = "./tmp/javas";
        File d = new File(dirname);
        d.mkdirs();

        //复制文件
        File source1 = new File("./README.md");
        File dest1 = new File("./tmp/javas/test.md");
        copyFileUsingStream(source1, dest1);

        File source2 = new File("./Test009.java");
        File dest2 = new File("./tmp/javas/Test009.java");
        copyFileUsingStream(source2, dest2);

        //删除目录
        File folder = new File(dirname);
        deleteFolder(folder);
    }

    //复制文件
    private static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
    }

    // 删除文件及目录
    public static void deleteFolder(File folder) {
        File[] files = folder.listFiles();
        if (files != null) {
            for (File f : files) {
                if (f.isDirectory()) {
                    deleteFolder(f);
                } else {
                    f.delete();
                }
            }
        }
        folder.delete();
    }

}
