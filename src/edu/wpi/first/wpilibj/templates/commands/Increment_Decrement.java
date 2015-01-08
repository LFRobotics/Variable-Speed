/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.templates.subsystems.XBox;

/**
 *
 * @author Kristen
 */
public class Increment_Decrement extends CommandBase {
    
    double rspeed = .5;
    
    public Increment_Decrement() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
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
