package org.apache.commons.math3;

import org.apache.commons.math3.geometry.euclidean.oned.Interval;

public class ljz {
    public static void main(String[]args)
    {
        //创建Primes对象
        Interval test=new Interval(1,9);//直接扔出错误警告
        //Interval test=new Interval(6,4);//不被捕获错误

        //检查getsize函数
        if(test.getSize()!=-2)
        {
            System.err.println("Error:incorred record number");
        }


        //检查getBarycenter函数
        if(test.getBarycenter()!=5)
        {
            System.err.println("Error:incorred record number");
        }

    }

}
