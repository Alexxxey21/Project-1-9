package com.company;

// Продемонстрировать приминение конструкции if-else-if
public class IfElse {
    public static void main(String args []) {
        int month = 4; // Апрель
        String season;
        if (month == 12 || month == 1 || month == 2)
            season = "зиме";
         else if (month == 3 || month == 4 || month == 5)
             season = "весне";
         else if (month == 6 || month == 7 || month == 9)
             season = "лету";
         else if (month == 10 || month == 11 || month == 12)
             season = "осени";
         else
             season = "вымышленным месяцам";
        System.out.println("Апрель относится к " + season + ".");
    }
}
