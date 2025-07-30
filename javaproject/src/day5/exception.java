package day5;
    import java.io.File;


    public class exception {
     public static void main(String a[])
     {
        File file = new File("C:\\Users\\DELL\\Documents\\java_anan\\.t\\.txt");
        String[] fileList = file.list();
        for(String name:fileList){
            System.out.println(name);
        }
    }
}
