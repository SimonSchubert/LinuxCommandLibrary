# TAGLINE

builds PlatformIO projects

# TLDR

**Build project**

```pio run```

**Build and upload to device**

```pio run --target upload```

**Build specific environment**

```pio run -e [uno]```

**Clean build files**

```pio run --target clean```

# SYNOPSIS

**pio run** [_options_]

# PARAMETERS

**-e**, **--environment** _name_
> Process specific environment.

**-t**, **--target** _target_
> Process target (upload, clean, program, etc.).

**-d**, **--project-dir** _dir_
> Project directory.

**--upload-port** _port_
> Upload port.

**-j**, **--jobs** _num_
> Parallel jobs.

**-v**, **--verbose**
> Verbose output.

# DESCRIPTION

**pio run** builds PlatformIO projects. Compiles source code, links libraries, and optionally uploads firmware to target devices. Core command for embedded development workflow.

# SEE ALSO

[pio-init](/man/pio-init)(1), [pio-device](/man/pio-device)(1), [pio-test](/man/pio-test)(1)

