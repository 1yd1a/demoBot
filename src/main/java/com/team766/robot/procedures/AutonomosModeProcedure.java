package com.team766.robot.procedures;

import com.team766.framework.Procedure;
import com.team766.framework.Context;
import com.team766.robot.Robot;

public class AutonomosModeProcedure extends Procedure {


	public void run(Context context) {
		double seconds = 3.0;
		//on run AutonomousMode, it drives straight for double seconds, the variable above.
		context.takeOwnership(Robot.drive);
		log("Context has taken ownership.");
		Robot.drive.setDrivePower (1,1);
		log("Setting the drive power to leftPower 1.0 and rightPower 1.0 in order to try to collect blocks for " + seconds + "seconds.");
		context.waitForSeconds(seconds);
		log("wating for " + seconds + " seconds until spinning the robot around");
		log("turning the robot around, hopefully with some blocks in the intake");
		Robot.drive.setDrivePower(-1, -1);
		context.waitForSeconds(0.25);
		Robot.drive.setDrivePower(0.02, 0.25);
		context.waitForSeconds(4);
		Robot.drive.setDrivePower(1, 1);
		context.waitForSeconds(3);
		Robot.drive.setDrivePower(-1, -1);
		context.waitForSeconds(1);
		Robot.drive.setDrivePower(0,0);
		log("shutting down the motors");
		
	}
	
}