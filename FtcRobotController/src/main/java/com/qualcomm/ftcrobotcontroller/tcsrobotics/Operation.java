package com.qualcomm.ftcrobotcontroller.tcsrobotics;

import javax.xml.datatype.Duration;

/**
 * Created by mpclayton on 9/26/15.
 *Jerry Beans */
public class Operation {

    private double startTime;
    private double duration;


    public Operation(double startTime, double duration ){
        this.startTime = startTime;
        this.duration = duration;

    }
}
