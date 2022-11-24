package org.apache.commons.math3;

import org.apache.commons.math3.geometry.euclidean.oned.Interval;

import static org.junit.jupiter.api.Assertions.*;

class IntervalTest {

    @org.junit.jupiter.api.BeforeEach


    @org.junit.jupiter.api.AfterEach

    @org.junit.jupiter.api.Test
    void getBarycenter() {
        Interval test=new Interval(4,6);
        if(test.getBarycenter()!=5)
        {
            System.err.println("Error:incorred record number");
        }
    }
}