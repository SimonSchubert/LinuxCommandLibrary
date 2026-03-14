# TAGLINE

Linux kernel manager and activity monitor

# TLDR

**Launch the kernel module manager**

```kmon```

**Set the refresh rate** in milliseconds

```kmon -t [ms]```

**Set the main color**

```kmon -c [color]```

**Launch with Unicode block titles**

```kmon -u```

**Launch with reversed module list**

```kmon -r```

# SYNOPSIS

**kmon** [_options_]

# PARAMETERS

**-t**, **--tickrate** _MS_
> Set the refresh rate of the terminal UI in milliseconds.

**-c**, **--color** _COLOR_
> Set the main color [default: darkgray]. Supported: black, red, green, yellow, blue, magenta, cyan, gray, darkgray, lightred, lightgreen, lightyellow, lightblue, lightmagenta, lightcyan, white, or a hex value.

**-a**, **--accent-color** _COLOR_
> Set the accent color [default: white].

**-r**, **--reverse**
> Reverse the kernel module list.

**-u**, **--unicode**
> Show Unicode symbols for the block titles.

**-E**, **--regex**
> Interpret the module search query as a regular expression.

# DESCRIPTION

**kmon** provides a text-based user interface for managing Linux kernel modules and monitoring kernel activities. It supports loading, unloading, blacklisting, and displaying information about kernel modules, all from an interactive terminal interface.

The TUI displays kernel activities in real time and provides navigation through loaded modules with detailed information about each one.

# CAVEATS

Requires root privileges for loading and unloading kernel modules. Only works on Linux systems.

# HISTORY

**kmon** was created by **Orhun Parmaksız** (orhun) and is written in **Rust**. It aims to be a standard tool for Linux kernel management while supporting most Linux distributions.

# SEE ALSO

[lsmod](/man/lsmod)(8), [modprobe](/man/modprobe)(8), [modinfo](/man/modinfo)(8)
