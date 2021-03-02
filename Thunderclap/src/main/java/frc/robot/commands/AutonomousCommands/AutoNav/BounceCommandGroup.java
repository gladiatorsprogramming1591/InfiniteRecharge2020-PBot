package frc.robot.commands.AutonomousCommands.AutoNav;

import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import frc.robot.commands.AutonomousCommands.DriveDistance.DriveInches;
import frc.robot.subsystems.DriveTrainC;
import frc.robot.commands.AutonomousCommands.Rotation.TurnToDegrees;

/**
 * Robot drives the Bounce Path from the AutoNav challenge
 */
public class BounceCommandGroup extends SequentialCommandGroup{

    /**
     * Create a new BounceCommandGroup SequentialCommand Group.
     * 
     * @param driveTrain The DriveTrain to be used.
     */
    public BounceCommandGroup(DriveTrainC driveTrain) {
        addCommands(
            new DriveInches(driveTrain, 126),
            new TurnToDegrees(driveTrain, -50, false),
            new DriveInches(driveTrain, 85),
            new TurnToDegrees(driveTrain, 98.14, false),
            new DriveInches(driveTrain, 67.08),
            new TurnToDegrees(driveTrain, -10, false),
            new DriveInches(driveTrain, 66)
        );
    }
}