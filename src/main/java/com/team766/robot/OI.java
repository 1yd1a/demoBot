package com.team766.robot;

import com.team766.framework.Procedure;
import com.team766.framework.Context;
import com.team766.hal.JoystickReader;
import com.team766.hal.RobotProvider;
import com.team766.logging.Category;
import com.team766.robot.mechanisms.ElevatorWidth;
import com.team766.robot.procedures.*;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the code that allow control of the robot.
 */
public class OI extends Procedure {
	private JoystickReader joystick0;

	private double elevatorUp = 0;
	private double elevatorsWidth = 0;

	public OI() {
		loggerCategory = Category.OPERATOR_INTERFACE;

		joystick0 = RobotProvider.instance.getJoystick(0);
	}
	
	public void run(Context context) {
		context.takeOwnership(Robot.drive);
		context.takeOwnership(Robot.elevator);
		context.takeOwnership(Robot.elevatorWidth);
		
		
		while (2>1) {

			Robot.drive.setArcadeDrivePower((-1) * joystick0.getAxis(1), joystick0.getAxis(0));
			/* 
			if(joystick0.getButton(1)){
				Robot.elevatorWidth.setElevatorWidthMotorPower(1, 1);
			}

			if(joystick0.getButton(2)){
				Robot.elevatorWidth.setElevatorWidthMotorPower(-1, -1);
			}

			if(joystick0.getButton(3)){
				Robot.elevator.setMotorPower(0.5);
			}

			if(joystick0.getButton(4)){
				Robot.elevator.setMotorPower(-0.2);
			}*/

			//REMEMBER: LEFTJOYSTICK1 IS THE X AXIS OF THE LEFT JOYSTICK. LEFTJOYSTICK2 IS THE Y AXIS OF THE LEFT JOYSTICK>
			//CURRENTLY SET TO SPLIT ARCADE DRIVE
/* 
			double leftJoystick1 = joystick0.getAxis(1);
			double leftJoystick2 = joystick0.getAxis(0);
			// Add driver controls here - make sure to take/release ownership
			// of mechanisms when appropriate.
			/**log("J0 A0: " + joystick0.getAxis(0) +
			    "  J0 A1: " + joystick0.getAxis(1) +
			    "  J1 A0: " + joystick1.getAxis(0) +
			    "  J1 A1: " + joystick1.getAxis(1) +
			    "  J0 B1: " + joystick0.getButton(1) +
			    "  J0 B2: " + joystick0.getButton(2) +
			    "  J0 B3: " + joystick0.getButton(3));

			log("J0 A1: " + leftJoystick1);
			log(" J0 A0:" + leftJoystick2);

			//Robot.drive.setArcadeDrivePower(leftJoystick1, leftJoystick2);
			Robot.drive.setArcadeDrivePower((-1) * leftJoystick1, leftJoystick2);     


			if(joystick0.getButton(3)){
				elevatorUp = 1.0;
				log("up button pressed");
			}
			else if(joystick0.getButton(1)){
				elevatorUp = -1.0;
			}
			else {
				elevatorUp = 0.0;
			}


			if(joystick0.getButton(2)){
				elevatorsWidth = 1.0;
			}
			else if(joystick0.getButton(4)){
				elevatorsWidth = -1.0;
			}
			else{
				elevatorsWidth = 0.0;
			}

			Robot.elevatorWidth.setElevatorWidthMotorPower(joystick0.getAxis(2), joystick0.getAxis(5));
			Robot.elevator.setMotorPower(elevatorUp);
			log(" Elevator: " + elevatorUp);*/
			context.waitFor(() -> RobotProvider.instance.hasNewDriverStationData());
		}
	}
}
