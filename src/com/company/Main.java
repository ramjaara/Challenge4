package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Total marks in paper");
        int totalPaperMarks = input.nextInt();
        int studenMarks = 0;
        while (true) {
            System.out.println("Enter a student mark");
            studenMarks = input.nextInt();
            if (studenMarks == totalPaperMarks * 0.8 - 1) {
                System.out.println("Grade A");
            }
            if (studenMarks == totalPaperMarks * 0.7 ) {
                System.out.println("Grade B");
            }
            if (studenMarks == totalPaperMarks * 0.6 ) {
                System.out.println("Grade C");
            }
            if (studenMarks == totalPaperMarks * 0.5 ) {
                System.out.println("Grade D");
            }
            if (studenMarks == totalPaperMarks * 0.4) {
                System.out.println("Grade E");
            }
            if (studenMarks < totalPaperMarks * 0.4) {
                System.out.println("Grade U");
            }
        }
    }
}
