// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.smartdashboard.Field2d;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class Info extends SubsystemBase {
  private int meaningOfLife;
  private boolean progIsBest;
  private Field2d field;
  private SendableChooser<String> select;

  /** Creates a new Info. */
  public Info() {
    meaningOfLife = 42;
    progIsBest = true;
    field = new Field2d();

    select = new SendableChooser<>();
    select.addOption("prog", "prog");
    select.addOption("systems", "systems");
    select.addOption("cad", "cad");
    select.addOption("mech", "mech");
  }

  @Override
  public void periodic() {
    SmartDashboard.putNumber("Meaning of Life", meaningOfLife);
    SmartDashboard.putBoolean("Prog is best? ", progIsBest);
    SmartDashboard.putData("Field", field);
    SmartDashboard.putData("best subgroup", select);

    System.out.println(select.getSelected());
  }
}
