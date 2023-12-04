// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
/**
 * The VM is configured to automatically run this class, and to call the functions corresponding to
 * each mode, as described in the TimedRobot documentation. If you change the name of this class or
 * the package after creating this project, you must also update the build.gradle file in the
 * project.
 */
import edu.wpi.first.wpilibj.drive.MecanumDrive;
public class Robot extends TimedRobot {
  XboxController controller = new XboxController(0);
  Drivetrain drivetrain = new Drivetrain();
 
  @Override
  public void teleopPeriodic() {
    drivetrain.arcadeDrive(controller.getLeftY()*-1,controller.getRightY()*-1);
  }
}
