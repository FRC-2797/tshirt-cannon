// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.drive.MecanumDrive;
public class Robot extends TimedRobot {
  XboxController controller = new XboxController(0);
  Drivetrain drivetrain = new Drivetrain();
 
  @Override
  public void teleopPeriodic() {
    drivetrain.arcadeDrive(controller.getLeftY()*-1,controller.getRightY()*-1);
  }
}
