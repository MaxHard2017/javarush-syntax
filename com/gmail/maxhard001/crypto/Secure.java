/*
 * @(#)Secure.java    0.01 2022/06/26
 * 
 * CC0
 * CC-BY-NC-SA
 */
package com.gmail.maxhard001.crypto;


/**
 * The Secure.java provides methods for encrypting and decrypting text
 */
public class Secure {
    /**
     * @variable key - stores a pattern string for encryption.
     * It is used in encryptMessage() and  decryptMessage() methods  
     */
    private static String key = "ЉѠѮѺѬ";

    /**
     * encryptMessage() - ecrypts string using XOR bit operation for every byte of input string.
     * @param sMessage - input string with the message which we woud like to encrypt.
     * @return - result string with encrypted message (safe for sendig).
     */
    public static String encryptMessage(final String sMessage) {
        final char[] cMessage = sMessage.toCharArray();     /* will operate whith the char array */
        String encryptedResult = new String();
        encryptedResult = "";
        /* 
         * bytes of a char [i] of input message in cMessage array XOR-ed with the bytes
         * of char[i] of <key> class variariable. We will get 1-st, 2-nd and so on char
         * of input message and XOR it with apropriated 1-st, 2-nd and so on char 
         * of the <key> variable, which implements a pattern for encryption.
         */
        for (int i = 0; i< cMessage.length; i++) {
            int iEncryptVal = 0;
            iEncryptVal = cMessage[i]^key.toCharArray()[i%key.length()];
             /* 
              * in case of encrypted message is longer then <key> sring
              * <i%key.length()> let us get chars form the <key> form 0 to its last char 
              * repeatedly
              */
            encryptedResult += (char) iEncryptVal;
        }
        return encryptedResult;
    }
    /**
     * decryptMessag() - decryptes input message using XOR byte algorithm giving 
     * reversed transformation. Its implementetion is alike encryptMessage() - see detais
     * in encryptMessage() documentation.
     * @param sMessage - input string with the message which we woud like to decrypt
     * @return - result string with decrypted message
     */
    public static String decryptMessage(final String sMessage) {
        final char[] cMessage = sMessage.toCharArray();
        String decryptedString = new String();

        for (int i = 0; i< cMessage.length; i++) {
            int iDecryptVal = 0;
            iDecryptVal = cMessage[i]^key.toCharArray()[i%key.length()];
            decryptedString += (char) iDecryptVal;
        }
        return decryptedString;
    }
    
}
