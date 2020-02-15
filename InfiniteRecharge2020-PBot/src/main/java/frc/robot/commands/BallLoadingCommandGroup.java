/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.ParallelCommandGroup;

import frc.robot.subsystems.HopperSubsystem;
import frc.robot.subsystems.IntakeSubsystem;

/**
 * A complex auto command that drives forward, releases a hatch, and then drives backward.
 */
public class BallLoadingCommandGroup extends ParallelCommandGroup {
  /**
   * Creates a new Command Group.
   * There are 4 types of command groups:
   * SequentialCommandGroup - first command is executed, then the second, etc. and so on until the list finishes
   * ParallelCommandGroup - ends commands when they finish
   * ParallelRaceGroup - ends as soon as any command in the group ends
   * ParallelDeadlineGroup - ends when a specific command (the “deadline”) ends
   *
   * @param subsystem1 The subsystem this command will run on
   * @param subsystem2 The subsystem this command will run on
   */
  public BallLoadingCommandGroup(HopperSubsystem hopper, IntakeSubsystem intake) {
    addCommands(
        // Example 1
        new IntakeOn(intake),

        // Example 2
        new MoveBall(hopper)
    );
  }
  // @Override
  // public void end(boolean interrupted){
  //   if (interrupted){
  //     intake
  //   }
  //
  //}
}