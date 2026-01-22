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

# CAVEATS

Board support packages may need installation for non-AVR boards. Serial port permissions may require user group configuration on Linux. Legacy IDE differs from Arduino IDE 2.0.

# HISTORY

The **Arduino** project was started at the Ivrea Interaction Design Institute in **2005**. The IDE has been the primary development environment for Arduino boards since the platform's inception.

# SEE ALSO

[arduino-cli](/man/arduino-cli)(1), [avrdude](/man/avrdude)(1), [platformio](/man/platformio)(1)
