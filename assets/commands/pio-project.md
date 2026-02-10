# TAGLINE

inspects PlatformIO project configuration and metadata

# TLDR

**Show project configuration**

```pio project config```

**Show project metadata**

```pio project metadata -e [uno]```

**Initialize project data**

```pio project init```

# SYNOPSIS

**pio project** _command_ [_options_]

# PARAMETERS

**config**
> Show project configuration.

**metadata**
> Show project metadata.

**init**
> Initialize project.

**-e**, **--environment** _name_
> Target environment.

**-d**, **--project-dir** _dir_
> Project directory.

**--json-output**
> Output in JSON format.

# DESCRIPTION

**pio project** inspects PlatformIO project configuration and metadata. Shows parsed platformio.ini settings, resolved dependencies, and build information.

# SEE ALSO

[pio-init](/man/pio-init)(1), [pio-run](/man/pio-run)(1)

