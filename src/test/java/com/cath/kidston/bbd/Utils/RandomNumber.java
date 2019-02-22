package com.cath.kidston.bbd.Utils;

import java.util.Random;

public class RandomNumber {
public static int getRandomNumber(int rnum)
    {
        Random rnd=new Random ();

        int num=rnd.nextInt (rnum);

        return num;
    }
}
