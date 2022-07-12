package com.gmail.maxhard001.binary;

public class BinaryStr //Translates binary representetion of variables to custom string form
{
    // depricate private String str = "";
    //static String key = "$дs&Й_^d*2@KЫ0э="; // key value for encription. it's used in encriptMessage (String sMessage) and  decriptMessage (String sMessage) calsses

    /* depricate public void setStr (String str)
    {
        this.str = str;
    }

    public String getStr()
    {
        return this.str;
    }
    */

    public static String getIntStr(int iNumber)
    // Translates binary strucrure of integer variable iNumber to string
    // Each bit of iNumber variable is representeted as '0' or '1' symblo
    {
        String str = Integer.toBinaryString(iNumber); // 
        String result = "";
        
        char [] cr = str.toCharArray();
        int iNumBits = 32; // Number of bits in input number. Restricted to 32 (integer iNum) in this realization
        for (int i = 0; i < iNumBits; i++)
        {
            {   if ((i % 8 == 0) && (i > 0)) 
                {
                    result = result + "."; // "." octets devider
                }
                    else
                    {
                        if ((i % 4 == 0) && (i > 0)) result = result + "'"; 
                        // "'" - 4-bit devider inside octet for better octet visualisation
                    }
                     
                if (i < (iNumBits - cr.length)) result = result + "0";
                    else result = result + cr[i - (iNumBits - cr.length)];
            }
        }
        return result;
    }
    // ------

    public static String isEven(int iNum)
    {
        if ((iNum & 1) != 1)
        {
            return "Even";
        }
        else return "Odd";
    }
    
    
}
