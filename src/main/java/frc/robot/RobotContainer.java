// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import frc.robot.subsystems.Info;

public class RobotContainer {
  @SuppressWarnings("unused")
  private Info infoSys;

  /** The container for the robot. Contains subsystems, OI devices, and commands. */
  public RobotContainer() {
    infoSys = new Info();
  }
}
