# TAGLINE

Official command-line tool for Arduino development

# TLDR

**List connected boards**

```arduino-cli board list```

**Compile a sketch** for a specific board

```arduino-cli compile --fqbn [arduino:avr:uno] [path/to/sketch]```

**Upload a compiled sketch** to a board

```arduino-cli upload --port [/dev/ttyACM0] --fqbn [arduino:avr:uno] [path/to/sketch]```

**Compile and upload** in one command

```arduino-cli compile --fqbn [arduino:avr:uno] --port [/dev/ttyACM0] --upload [path/to/sketch]```

**Create a new sketch**

```arduino-cli sketch new [MySketch]```

**Install a board platform**

```arduino-cli core install [arduino:avr]```

**Search for a library**

```arduino-cli lib search [servo]```

**Install a library**

```arduino-cli lib install "[Servo]"```

# SYNOPSIS

**arduino-cli** _command_ [_flags_]

# PARAMETERS

**board list**
> List connected Arduino boards with ports and FQBNs

**board listall**
> List all known board types

**compile**
> Compile an Arduino sketch

**upload**
> Upload compiled binaries to a board

**sketch new** _name_
> Create a new sketch in the sketchbook

**core install** _platform_
> Install a board platform (e.g., arduino:avr)

**core update-index**
> Update the platform index

**lib install** _name_
> Install a library from the library manager

**lib search** _query_
> Search for libraries

**monitor**
> Open serial monitor to communicate with the board

**-b**, **--fqbn** _string_
> Fully Qualified Board Name (e.g., arduino:avr:uno)

**-p**, **--port** _string_
> Port address (e.g., /dev/ttyACM0 or COM3)

**-e**, **--export-binaries**
> Export compiled binaries to the sketch folder

**--output-dir** _path_
> Directory for compiled artifacts

**-t**, **--verify**
> Verify uploaded binary after upload

**-P**, **--programmer** _name_
> Use a specific programmer for upload

# DESCRIPTION

**arduino-cli** is the official command-line tool for Arduino development. It provides board and library management, sketch compilation, upload functionality, and serial monitoring without requiring the Arduino IDE.

The tool uses Fully Qualified Board Names (FQBNs) to identify target boards, formatted as **vendor:architecture:board** (e.g., arduino:avr:uno). Board platforms must be installed before compiling for them.

Typical workflow: install the target platform with **core install**, compile the sketch with **compile**, and upload with **upload**. The **--upload** flag can be added to compile to perform both steps together.

The tool supports custom libraries via **--libraries** flag, board configuration via **--build-property**, and integrates well with IDEs like VS Code for Arduino development workflows.

# CONFIGURATION

**~/.arduino15/arduino-cli.yaml**
> Main configuration file controlling board manager URLs, library paths, logging, and build defaults.

# CAVEATS

Upload requires appropriate permissions for serial ports; on Linux, users typically need membership in the **dialout** or **uucp** group. The **upload** command does not compile automatically; use **compile --upload** for a combined operation. Board platforms must be installed before first use.

# HISTORY

**arduino-cli** was developed by **Arduino** and released in **2018** as a modern replacement for the older Arduino command-line tools. It was created to enable headless Arduino development, support CI/CD pipelines, and provide a foundation for third-party IDE integrations. The tool shares its core with the Arduino IDE 2.0 and is actively maintained.

# SEE ALSO

[avrdude](/man/avrdude)(1), [platformio](/man/platformio)(1), [screen](/man/screen)(1), [minicom](/man/minicom)(1)
