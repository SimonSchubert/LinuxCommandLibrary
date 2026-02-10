# TAGLINE

runs continuous integration builds for PlatformIO projects

# TLDR

**Build library in CI**

```pio ci --lib [.] --board [uno] [examples/Blink]```

**Build with multiple boards**

```pio ci --board [uno] --board [esp32dev] [src/]```

**Build with project config**

```pio ci --project-conf [platformio.ini] [src/]```

# SYNOPSIS

**pio ci** [_options_] _source_...

# PARAMETERS

**--lib** _path_
> Library path to include.

**--board** _id_
> Target board.

**--project-conf** _file_
> Use existing platformio.ini.

**--keep-build-dir**
> Don't delete build directory.

**-O** _option_
> Project option.

# DESCRIPTION

**pio ci** runs continuous integration builds for PlatformIO projects. Builds source files against specified boards without requiring a project structure. Used in CI/CD pipelines.

# SEE ALSO

[pio-run](/man/pio-run)(1), [pio-test](/man/pio-test)(1)

