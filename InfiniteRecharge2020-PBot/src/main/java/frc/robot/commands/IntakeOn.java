package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.IntakeSubsystem;

public class IntakeOn extends CommandBase {

    IntakeSubsystem m_intakeSubsystem;

	public IntakeOn(IntakeSubsystem intakeSubsystem) {
        m_intakeSubsystem = intakeSubsystem;
	}

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {
        m_intakeSubsystem.intakeOn();    
    }

}