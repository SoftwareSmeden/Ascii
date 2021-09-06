package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner userInput = new Scanner(System.in);

        System.out.println("Indtast et tal mellem 1-3");

        // Ascii Exercise
        String ascii =
                "     _____  \n" +
                "   .'     `.\n" +
                "  /         \\\n" +
                " |           | \n" +
                " '.  +^^^+  .'\n" +
                "   `. \\./ .'\n" +
                "     |_|_|  \n" +
                "     (___)    \n" +
                "     (___)\n" +
                "     `---'";

        String ascii2 =
                ".'`~~~~~~~~~~~`'.\n" +
                "(  .'11 12 1'.  )\n" +
                "|  :10 \\|   2:  |\n" +
                "|  :9   @   3:  |\n" +
                "|  :8       4;  |\n" +
                "'. '..7 6 5..' .'\n" +
                " ~-------------~";

        String ascii3 =
                " _   |~  _\n" +
                "[_]--'--[_]\n" +
                "|'|\"\"`\"\"|'|\n" +
                "| | /^\\ | |\n" +
                "|_|_|I|_|_|";

        //System.out.println(ascii + "\n" + ascii2 + "\n" + ascii3);

        for (int i = 0; i < 12; i++) {

            int scannerInput = userInput.nextInt();

            if (scannerInput == 1)
                System.out.println(ascii);

            else if (scannerInput == 2)
                System.out.println(ascii2);

            else if (scannerInput == 3)
                System.out.println(ascii3);

        }
    }
}
