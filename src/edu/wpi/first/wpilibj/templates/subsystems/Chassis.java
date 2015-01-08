/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.RobotMap;
import edu.wpi.first.wpilibj.templates.commands.DriveTele;

/**
 *
 * @author FrankyMonezz
 */
public class Chassis extends Subsystem {
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
    RobotDrive drive;
    
    double rspeed = .5;
    
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        setDefaultCommand(new DriveTele());
    }
    
    public Chassis(){
        drive = new RobotDrive(RobotMap.leftMotorPort, RobotMap.rightMotorPort);
        drive.setSafetyEnabled(false);
    }
    
    public void driveTele(double moveValue, double turnValue){
        drive.arcadeDrive(moveValue, turnValue);
    }
    
    public void setSpeed() {
        drive.setMaxOutput(rspeed);
    }
     
    public void driveAuton(double speed, double turnRate)
{
	drive.arcadeDrive(speed, turnRate);
}

     void increment() {
        if(XBox.RIGHTJOY_Y < 0){
            while(rspeed >= 0 && rspeed <= 1) {
                rspeed--;
            }
        }
      }
    
   void  decrement() {
         if(XBox.RIGHTJOY_Y > 0) {
            while(rspeed >= 0 && rspeed <= 1) {
              rspeed++;  
        }
      }
    }
    
}