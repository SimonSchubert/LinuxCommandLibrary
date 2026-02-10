# TAGLINE

unified package manager for PlatformIO

# TLDR

**Install package**

```pio pkg install -l [library_name]```

**Install platform**

```pio pkg install -p [espressif32]```

**Install tool**

```pio pkg install -t [openocd]```

**List installed packages**

```pio pkg list```

**Update packages**

```pio pkg update```

# SYNOPSIS

**pio pkg** _command_ [_options_]

# PARAMETERS

**install**
> Install packages.

**uninstall**
> Remove packages.

**update**
> Update packages.

**list**
> List installed packages.

**show**
> Show package details.

**-l**, **--library** _name_
> Library package.

**-p**, **--platform** _name_
> Platform package.

**-t**, **--tool** _name_
> Tool package.

# DESCRIPTION

**pio pkg** is the unified package manager for PlatformIO. Manages libraries, platforms, and tools through a single interface. Replaces legacy pio lib and pio platform commands.

# SEE ALSO

[pio-lib](/man/pio-lib)(1), [pio-platform](/man/pio-platform)(1)

