import java.util.List;

public class Runner {

    public static void main(String[] args){

        Folder folder1 = new Folder("Documents");
            DBHelper.save(folder1);
        Folder folder2 = new Folder("Work");
            DBHelper.save(folder2);
        Folder folder3 = new Folder("Downloads");
            DBHelper.save(folder3);

        File file1 = new File("Resume", FileType.TXT, 100, folder1);
                DBHelper.save(file1);
        File file2 = new File("Work Presentation", FileType.PPT, 500, folder3);
            DBHelper.save(file2);
        File file3 = new File("App", FileType.JAVA, 50, folder2);
            DBHelper.save(file3);
        File file4 = new File("Ruby Tutorial", FileType.RB, 15,folder3);
            DBHelper.save(file4);
        File file5 = new File("Work Details", FileType.TXT, 20, folder2);
            DBHelper.save(file5);

            List<File> files = DBHelper.getAll(File.class);

            List<Folder> folder = DBHelper.getAll(Folder.class);

            File foundFile = DBHelper.find(File.class, file4.getId());

            Folder foundFolder = DBHelper.find(Folder.class, folder2.getId());

            List<File> contents = DBFolder.getContentsForFolder(folder3);
;    }
}
