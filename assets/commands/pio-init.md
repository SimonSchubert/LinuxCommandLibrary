# TAGLINE

initializes a new PlatformIO project

# TLDR

**Initialize project in current directory**

```pio init```

**Initialize with specific board**

```pio init --board [uno]```

**Initialize with IDE support**

```pio init --ide [vscode]```

**Initialize in specific directory**

```pio init -d [project_dir]```

# SYNOPSIS

**pio init** [_options_]

# PARAMETERS

**-b**, **--board** _id_
> Board ID to initialize for.

**-d**, **--project-dir** _dir_
> Project directory.

**--ide** _ide_
> Generate IDE project files (vscode, atom, etc.).

**-O** _option_
> Project option in format section.option=value.

**-e**, **--environment** _name_
> Default environment name.

# DESCRIPTION

**pio init** initializes a new PlatformIO project. Creates project structure with platformio.ini configuration file. Supports multiple boards and IDE integrations for embedded development.

# SEE ALSO

[pio-run](/man/pio-run)(1), [pio-boards](/man/pio-boards)(1), [pio-lib](/man/pio-lib)(1)

