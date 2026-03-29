# TAGLINE

Run continuous integration builds for PlatformIO projects

# TLDR

**Build library in CI**

```pio ci --lib [.] --board [uno] [examples/Blink]```

**Build with multiple boards**

```pio ci --board [uno] --board [esp32dev] [src/]```

**Build with project config**

```pio ci --project-conf [platformio.ini] [src/]```

**Exclude files** from the build

```pio ci --exclude [src/examples] --board [esp32dev] [src/]```

**Pass project options** inline

```pio ci --board [uno] -O "lib_deps=[ArduinoJSON]" [src/]```

**Build with verbose output**

```pio ci --board [uno] --verbose [src/]```

# SYNOPSIS

**pio ci** [_OPTIONS_] [_SRC_]

# PARAMETERS

**-l**, **--lib** _path_
> Source code which will be copied to the build directory's lib folder. Can be specified multiple times.

**-b**, **--board** _id_
> Build project with automatically pre-generated environments based on board settings. Can be specified multiple times.

**--exclude** _path_
> Exclude directories and/or files from the build directory. Path must be relative to the PlatformIO project within the build directory. Supports glob patterns.

**-c**, **--project-conf** _file_
> Build project using a pre-configured platformio.ini file.

**-O**, **--project-option** _option_
> Pass additional project configuration options. Can be specified multiple times for different options.

**-e**, **--environment** _name_
> Process specified environments declared in the project configuration. Can be specified multiple times.

**--build-dir** _path_
> Path to directory where PlatformIO will initialise the new project. Defaults to a temporary directory.

**--keep-build-dir**
> Don't remove the build directory after the build process.

**-v**, **--verbose**
> Show detailed information when processing environments.

# DESCRIPTION

**pio ci** runs continuous integration builds for PlatformIO projects. It builds source files against specified boards without requiring an existing project structure. Using the provided source and library contents, PlatformIO initialises a new project in a build directory and processes it via the **pio run** command. Commonly used in CI/CD pipelines.

# SEE ALSO

[pio-run](/man/pio-run)(1), [pio-test](/man/pio-test)(1), [pio](/man/pio)(1)

