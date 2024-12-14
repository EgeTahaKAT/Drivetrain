package frc.robot;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.Joystick;

public class Robot extends TimedRobot {

  private CANSparkMax leftMotor;
  private CANSparkMax rightMotor;
  private DifferentialDrive driveTrain;
  private Joystick joystick;

  @Override
  public void robotInit() {

    leftMotor = new CANSparkMax(11, MotorType.kBrushless);
    rightMotor = new CANSparkMax(12, MotorType.kBrushless);

    rightMotor.setInverted(true);

    driveTrain = new DifferentialDrive(leftMotor, rightMotor);

    joystick = new Joystick(0);
  }

  
  @Override
  public void robotPeriodic() {}

  
  @Override
  public void disabledInit() {}

  @Override
  public void disabledPeriodic() {}

 
  @Override
  public void autonomousInit() {}


  @Override
  public void autonomousPeriodic() {}

  @Override
  public void teleopInit() {}


  @Override
  public void teleopPeriodic() {
    double leftSpeed = joystick.getRawAxis(1);
    double rightSpeed = joystick.getRawAxis(5);

    driveTrain.tankDrive(leftSpeed, rightSpeed);
  }

  @Override
  public void testInit() {}


  @Override
  public void testPeriodic() {}


  @Override
  public void simulationInit() {}


  @Override
  public void simulationPeriodic() {}
}
