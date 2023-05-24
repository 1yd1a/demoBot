
package com.team766.robot.mechanisms;

import com.team766.framework.Mechanism;
import com.team766.hal.MotorController;
import com.team766.hal.RobotProvider;

public class ElevatorWidth extends Mechanism {
	private MotorController motorA;
	private MotorController motorB;

	public ElevatorWidth(){
		motorA = RobotProvider.instance.getMotor("elevatorWidth.motorAWidth");
		motorB = RobotProvider.instance.getMotor("elevatorWidth.motorBWidth");
		//needs 2 motors (because max is clueless)
	}

	public void setElevatorWidthMotorPower(double motorAPower, double motorBPower){
		checkContextOwnership();
		motorA.set(motorAPower);
		motorB.set(motorBPower);

	}
}

