package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.hardware.DcMotor;

import java.util.ArrayList;

/**
 * Created by mpclayton on 9/24/15.
 */
public class ScooterAuto extends OpMode {

    private DcMotor motorRight;
    private DcMotor motorLeft;


    public ScooterAuto() {

    }

    @Override
    public void init() {

    }

    @Override
    public void start() {
        motorRight = hardwareMap.dcMotor.get("RightWheels");
        motorLeft = hardwareMap.dcMotor.get("LeftWheels");
        motorLeft.setDirection(DcMotor.Direction.REVERSE);

        // ArrayList operations = new ArrayList();


    }

    @Override
    public void loop() {

        double left;
        double right;

        if (this.time <= 2) {
            // from 0 to 1 seconds, run the motors for five seconds.
            left = 0.50;
            right = 0.50;
        } else if (this.time > 2 && this.time <= 2.5) {
            // between 5 and 8.5 seconds, point turn right.
            left = 0.15;
            right = -0.15;
        } else {
            left = 0;
            right = 0;
        }

        motorRight.setPower(left);
        motorLeft.setPower(right);


    }

    @Override
    public void stop() {

    }
}
