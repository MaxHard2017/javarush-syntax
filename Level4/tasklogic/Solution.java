package Level4.tasklogic;

import com.gmail.maxhard001.binary.BinaryStr;
import com.gmail.maxhard001.crypto.*;

public class Solution
{
  public static void main(String[] args)
  {
    int octet = 0;
    System.out.println(Integer.toBinaryString(octet).length());
    System.out.println(Integer.numberOfLeadingZeros(octet));
    System.out.println(Math.log(octet)/Math.log(2));
    System.out.println(BinaryStr.getIntStr(octet));

    System.out.println(BinaryStr.isEven(octet));
    String m = new String("The Java Virtual Machine can support many threads of execution at once");
    m = Secure.encryptMessage(m);
    System.out.println(m);
    System.out.println(Secure.decryptMessage(m));
  }   
}
  