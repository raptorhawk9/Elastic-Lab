// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.smartdashboard.Field2d;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Info extends SubsystemBase {
  private int meaningOfLife;
  private boolean progIsBest;
  private Field2d field;

  /** Creates a new Info. */
  public Info() {
    meaningOfLife = 42;
    progIsBest = true;
    field = new Field2d();
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
