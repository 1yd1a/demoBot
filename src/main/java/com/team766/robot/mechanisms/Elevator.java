package com.team766.robot.mechanisms;

import com.team766.framework.Mechanism;
import com.team766.hal.MotorController;
import com.team766.hal.RobotProvider;

public class Elevator extends Mechanism {
	private MotorController motor;

	public Elevator(){
		motor = RobotProvider.instance.getMotor("elevator.motor");
	}
	
	public void setMotorPower(double motorPower){
		checkContextOwnership();
		motor.set(motorPower);
	}
}

