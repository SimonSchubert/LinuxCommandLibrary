# TLDR

**Compile** a sketch

```arduino-builder -hardware [/usr/share/arduino/hardware] -tools [/usr/share/arduino/tools-builder] -libraries [/usr/share/arduino/libraries] -fqbn [arduino:avr:uno] [sketch.ino]```

Compile with **verbose** output

```arduino-builder -verbose -fqbn [arduino:avr:uno] [sketch.ino]```

# SYNOPSIS

**arduino-builder** [_-hardware path_] [_-tools path_] [_-libraries path_] [_-fqbn board_] [_options_] _sketch_

# DESCRIPTION

**arduino-builder** is the command-line tool that compiles Arduino sketches. It was the build system used by Arduino IDE and can be invoked separately for automated builds.

The tool handles preprocessing, compilation, and linking of Arduino sketches with required libraries and core files.

# PARAMETERS

**-hardware** _path_
> Hardware definitions directory

**-tools** _path_
> Tools (compilers, uploaders) directory

**-libraries** _path_
> Libraries directory

**-fqbn** _board_
> Fully qualified board name

**-build-path** _dir_
> Build output directory

**-verbose**
> Verbose output

**-warnings** _level_
> Warning level (none, default, more, all)

**-prefs** _key=value_
> Build preferences

# CAVEATS

Deprecated in favor of arduino-cli. Requires specifying multiple paths. Board packages must be installed separately.

# HISTORY

**arduino-builder** was developed as a standalone build tool extracted from the Arduino IDE. It has been superseded by **arduino-cli** for most use cases.

# SEE ALSO

[arduino](/man/arduino)(1), [arduino-cli](/man/arduino-cli)(1), [avr-gcc](/man/avr-gcc)(1)
