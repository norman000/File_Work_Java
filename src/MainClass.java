/**
 * Created with IntelliJ IDEA.
 */
public class MainClass {
    private static String fileName = "file.txt";
    public static void main(String[] args) {
        String res = ReadClass.read(fileName);
        int count = 0;
        if (res.length() != 0)
        {
            count = res.split(" +").length + 2;
        }
        System.out.println(count);
    }
}
