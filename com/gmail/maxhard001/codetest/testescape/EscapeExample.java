package com.gmail.maxhard001.codetest.testescape;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class EscapeExample {
    public static void main(String[] args) throws IOException {


        System.out.println("\u001b[31mThis text has a red foreground using SGR.31.\u001b7"); // \u001b7 запоминает положение курсора
        System.out.println("\u001b[1mThis text has a bright (bold) red foreground using SGR.1 to affect the previous color setting.");
        System.out.println("\u001b[mThis text has returned to default colors using SGR.0 implicitly.");
        System.out.println("\u001b[34;46mThis text shows the foreground and background change at the same time.");
        System.out.println("\u001b[0mThis text has returned to default colors using SGR.0 explicitly.");
        System.out.println("\u001b[31;32;33;34;35;36;101;102;103;104;105;106;107mThis text attempts to apply many colors in the same command. Note the colors are applied from left to right so only the right-most option of foreground cyan (SGR.36) and background bright white (SGR.107) is effective.\r\n");
        System.out.println("\u001b[39mThis text has restored the foreground color only.");
        System.out.println("\u001b[49mThis text has restored the background color only.");
        // System.out.println("\u001b8TEST");  // \u001b8 возвращает курсор в положение сохраненное \u001b7
        // System.out.println("\033[H\033[2J");// очищает консоль
        System.out.println("\033[31mThis text has a red foreground using SGR.31."); // \033=\u00b1=эскейп символ для ввода эскейп последовательности
        System.out.println("\u001b[0mThis text has returned to default colors using SGR.0 explicitly.");
        // последовательности для терминала Windows https://learn.microsoft.com/en-us/windows/console/console-virtual-terminal-sequences#example
        System.out.println("\u001b[?25l"); // спрятать курсор
        System.out.println("test");

        new BufferedReader(new InputStreamReader(System.in)).readLine();

        System.out.println("\u001b[?25h"); // показать курсор
    }
}