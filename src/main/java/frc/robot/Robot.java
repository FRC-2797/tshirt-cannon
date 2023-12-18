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
  GuitarHeroController controller = new GuitarHeroController(0);
  CANSparkMax aim = new CANSparkMax(3, MotorType.kBrushless);
  Drivetrain drivetrain = new Drivetrain();
 
  @Override
  public void teleopPeriodic() {
    final double speed = (controller.getFiddleStick()*0.5)+0.54;
    final double turn = 0.5;
    double xSpeed = 0;
    double rotation = 0;
    double aimPower = 0;

    if (controller.getStrumUp()) {
      xSpeed += speed;
    } else if (controller.getStrumDown()) {
      xSpeed -= speed;
    }
    if (controller.getGreenButton()) {
      rotation += speed;
    } else if (controller.getRedButton()) {
      rotation -= speed;
    } 
    if (controller.getStartButton()) {
      aimPower += 0.1;
    } else if (controller.getMinusButton()) {
      aimPower += -0.1;
    }

    aim.set(aimPower);
    drivetrain.arcadeDrive(xSpeed, rotation);
  }
}
