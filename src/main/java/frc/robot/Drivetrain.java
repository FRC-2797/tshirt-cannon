package frc.robot;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

import edu.wpi.first.wpilibj.drive.DifferentialDrive;

public class Drivetrain {
    CANSparkMax right = new CANSparkMax(1, MotorType.kBrushless);
    CANSparkMax left = new CANSparkMax(2, MotorType.kBrushless);
    DifferentialDrive differentialDrive = new DifferentialDrive(left, right);

    public Drivetrain() {
        right.setInverted(true);
        left.setInverted(false);

        
    }

    public void driveForwardSlowly() {
        final double speed = 0.15;
        right.set(speed);
        left.set(speed);
    }

    public void arcadeDrive(double xSpeed, double zRotation) {
        differentialDrive.arcadeDrive(xSpeed, zRotation);
    }
}
