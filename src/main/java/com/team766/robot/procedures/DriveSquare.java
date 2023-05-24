	package com.team766.robot.procedures;
	import com.team766.logging.Category;
	import com.team766.framework.Procedure;
	import com.team766.framework.Context;

	public class DriveSquare extends Procedure{

		public DriveSquare(){
			loggerCategory = Category.AUTONOMOUS;
		}
		
		public void run(Context context) {
			for (int i =0; i<4; i++){
				new AutonomosModeProcedure().run(context);
				log("DriveSquare, DriveStraight Completed");
				new TurnRight().run(context);
				log("DriveSquare, TurnRight Completed");
			}
			
		}
		
	}