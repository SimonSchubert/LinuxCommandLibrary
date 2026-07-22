# TAGLINE

Integrated development environment for Arduino boards

# TLDR

**Start** Arduino IDE

```arduino```

**Open** a sketch

```arduino [sketch.ino]```

**Compile** a sketch

```arduino --verify [sketch.ino]```

**Upload** to board

```arduino --upload [sketch.ino]```

Specify **board** and **port**

```arduino --board [arduino:avr:uno] --port [/dev/ttyACM0] --upload [sketch.ino]```

# SYNOPSIS

**arduino** [_--verify_|_--upload_] [_--board board_] [_--port port_] [_sketch_]

# DESCRIPTION

**arduino** is the Arduino Integrated Development Environment (IDE) for programming Arduino microcontroller boards. It provides a code editor, compiler, and upload functionality for Arduino sketches.

The command-line interface enables headless compilation and upload, useful for CI/CD pipelines and scripting.

# PARAMETERS

**--verify**
> Compile sketch without uploading

**--upload**
> Compile and upload to board

**--board** _fqbn_
> Fully qualified board name

**--port** _port_
> Serial port for upload

**--pref** _name=value_
> Set preference

**--save-prefs**
> Save preferences and exit

**--get-pref** _name_
> Print preference value

**--install-boards** _package:platform_
> Install board package

**--install-library** _name_
> Install library

# CONFIGURATION

**~/.arduino15/preferences.txt**
> IDE preferences including board defaults, editor settings, and additional board manager URLs.

# CAVEATS

These command-line flags belong to the **legacy Arduino IDE 1.x**, which is no longer in active development. Arduino IDE 2.x and the standalone **arduino-cli** are the recommended tools for headless builds and scripting. Board support packages may need installation for non-AVR boards, and serial port permissions may require adding your user to the **dialout** group on Linux.

# HISTORY

The **Arduino** project was started at the Ivrea Interaction Design Institute in **2005**. The classic IDE (and its `arduino` command-line interface) served as the primary development environment until it was superseded by **Arduino IDE 2.x** and **arduino-cli**.

# INSTALL

```apt: sudo apt install arduino```

```aur: yay -S arduino```

```nix: nix profile install nixpkgs#arduino```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[arduino-cli](/man/arduino-cli)(1), [avrdude](/man/avrdude)(1), [platformio](/man/platformio)(1)

# RESOURCES

```[Source code](https://github.com/arduino/Arduino)```

```[Homepage](https://www.arduino.cc)```

```[Documentation](https://docs.arduino.cc)```

<!-- verified: 2026-06-15 -->
