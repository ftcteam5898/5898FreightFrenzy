package org.firstinspires.ftc.robotcontroller.external.samples;

import com.qualcomm.robotcore.eventloop.opmode.Disabled;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.util.ElapsedTime;

@TeleOp(name="Test2", group="Iterative OpMode")
@Disabled
public class Test2 extends OpMode
{
    private ElapsedTime runtime = new ElapsedTime();
    private DcMotor frontRightMotor = null;
    private DcMotor backRightMotor = null;
    private DcMotor frontLeftMotor = null;
    private DcMotor backLeftMotor = null;

    @Override
    public void init() {

    }

    @Override
    public void loop() {

    }
}

