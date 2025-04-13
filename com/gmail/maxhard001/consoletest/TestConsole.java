import java.nio.charset.Charset;
import java.util.*;
import java.util.stream.*;
// import com.sun.jna.platform.win32.Kernel32;
      
public class TestConsole {


    


    public static void main(String[] args) throws Exception {
     
        final String fenc = System.getProperty("file.encoding");
        final String cenc = System.getProperty("console.encoding", "UTF-8");

        System.out.println("file encding" + Locale.getDefault() + "/" + fenc);
        System.out.println("console encoding" + Locale.getDefault() + "/" + cenc);
        System.out.println("efault charset: " + Charset.defaultCharset().toString());
        //System.out.println("Active code page - " + getActiveInputCodePage());
    
        System.out.println("привет");
        try (Scanner in = new Scanner(System.in, cenc)) {
            String input;

            while (!"exit".equalsIgnoreCase(input = in.nextLine())) {
                System.out.println("> '" + input + "': " + hexBytes(input.getBytes(cenc)));
            }
        }
        
        System.out.println("----");
    }
    
    private static String hexBytes(byte... arr) {
        return IntStream.range(0, arr.length)
                .map(i -> Byte.toUnsignedInt(arr[i]))
                .mapToObj(Integer::toHexString)
                .collect(Collectors.joining(" ", "[", "]"));
    }

    


    // /**
    //  * Calls the Windows function GetConsoleCP() to get the active code page using JNA.
    //  * "jna.jar" and "jna-platform.jar" must be on the classpath.
    //  *
    //  * @return the code page number.
    //  */
    // private static int getActiveInputCodePage() {
    //     return Kernel32.INSTANCE.GetConsoleCP();
    //}
}