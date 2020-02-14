package com.company;

import by.belstu.it.ginko.TextFunction;

import java.awt.image.WritableRaster;
import java.lang.reflect.Array;

import static java.lang.Integer.valueOf;
import static java.lang.StrictMath.*;

public class Main {
    public static void main(String[] args) {
	    System.out.println("Hello world");
        TextFunction q = new TextFunction();
        System.out.println(q.getValue());

        for (int i=0; i<9; i++) {
            if (i > -1)
                if (i < 10)
                    System.out.println(i);
        }

        //////////////////Task 1////////////////////////
        char char_variable = 'q';
        int int_variable = 10;
        short short_variable = 3233;
        byte byte_variable = 22;
        long long_variable = 313242331;
        String String_variable = "test";
        boolean boolean_variable = true;
        double double_variable = 23.5664;
        var test1 = String_variable + int_variable;
        var test2 = String_variable + char_variable;
        var test3 = String_variable + double_variable;
        byte test4 = (byte) (byte_variable + int_variable);
        int test5 = (int) (double_variable + long_variable);
        long test6 = int_variable + 2147483647;
        System.out.println(TextFunction.counter);
        boolean test7 = true && false;
        boolean test8 = true ^ false;
        long test9 = 9223372036854775807l;
        //boolean test10 = true + false;

        System.out.println(test1);
        System.out.println(test2);
        System.out.println(test3);
        System.out.println(test4);
        System.out.println(test5);
        System.out.println(test6);
        System.out.println(test7);
        System.out.println(test8);
        System.out.println(test9);
        System.out.println(3.45 % 2.4);
        System.out.println(1.0 / 0.0);
        System.out.println(0.0 / 0.0);
        System.out.println(log(-345));
        System.out.println(Float.intBitsToFloat(0x7F800000));
        System.out.println(Float.intBitsToFloat(0xFF800000));

        System.out.println(Math.PI);
        System.out.println(Math.round(Math.E));
        System.out.println(min(Math.PI, Math.E));
        System.out.println(Math.random());
        Boolean test100 = true;
        Character test101;
        Integer test102 = 101;
        Byte test104 = 1;
        Short test105 = 32000;
        Integer test106 = test105 + test104;
        System.out.println(Long.MIN_VALUE);
        System.out.println(Double.MAX_VALUE);

        int i = 5;
        Integer i2 = i;
        i2.toString();
        Integer r = new Integer("2345");
        int r2 = Integer.valueOf("2345");
        int r3 = Integer.parseInt("2345");
        System.out.println(r + " " + r2 + " " + r3);
        /////////////////////////////////////////////////
        String inputString = "prologistic.com.ua";

        // преобразуем нашу строку в массив байт
        byte[] byteArray = inputString.getBytes();
        System.out.println("Строку в массив байт : " + byteArray.toString());

        // конвертируем байты в строку
        String string = new String(byteArray);
        System.out.println("байты в строку : " + string);

        // давайте посмотрим, равны ли наши строки
        System.out.println("inputString == string : " + (inputString == string));
        System.out.println("inputString.equals(string) : " + (inputString.equals(string)));

        String str = "true";
        System.out.println(Boolean.parseBoolean(str));
        System.out.println(Boolean.valueOf(str));

        String first = "string";
        String second = "string";
        System.out.println("Сравнение строк:");
        System.out.println(first == second);
        System.out.println(first.equals(second));
        System.out.println(first.compareTo(first));
        System.out.println(first.length());
        String[] parts = first.split("i");
        for (String x : parts)
            System.out.println(x);
        System.out.println(first.contains("s"));
        System.out.println(first.hashCode());
        System.out.println(first.indexOf('t'));
        System.out.println(first.replace('s', 'p'));

        String[][] c1 = new String[3][];
        String h = "ttt";
        for(int t = 0; t < c1.length; t++)
        {
            c1[t] =  new String[5];
            System.out.println("qqqq");
            for (int m = 0; m < c1[t].length; m++){
            h = h +"r";
            c1[t][m] = h;
            System.out.println(c1[t][m]);
            }
        }
        String[][] c2 = new String[3][];
        String[][] c3 = new String[3][];
        boolean comRez = c2 == c3;
        System.out.println(comRez);
        //c1[10][10] = "qwe";
        WrapperString hi = new WrapperString("hello");
        hi.Replace('e','o');
        System.out.println(hi.getValue());
        WrapperString n = new WrapperString("hi"){
            public void Replace (char old, char new7c) {
                this.setValue(this.getValue().replace(old, new7c));
                System.out.println("Символ '" + old + "' изменён на '" + new7c + "'");
            }
        };
        n.Replace('e','o');
        }
}
