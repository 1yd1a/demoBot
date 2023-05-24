package com.team766.robot;

import com.team766.robot.mechanisms.*;

public class Robot {
	// Declare mechanisms here
	public static Drive drive;
	public static Elevator elevator;
	public static OI m_oi;
	public static ElevatorWidth elevatorWidth;

	public static void robotInit() {
		// Initialize mechanisms here
		drive = new Drive();
		elevator = new Elevator();
		m_oi = new OI();
		elevatorWidth = new ElevatorWidth();
	}
}
