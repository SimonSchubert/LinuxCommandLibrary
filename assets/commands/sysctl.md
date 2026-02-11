# TAGLINE

View and modify kernel parameters

# TLDR

**Show** all available variables and their values

```sysctl -a```

**Set** a changeable kernel state variable

```sysctl -w [section.tunable]=[value]```

**Get** currently open file handlers

```sysctl fs.file-nr```

**Get** limit for simultaneous open files

```sysctl fs.file-max```

**Apply** changes from /etc/sysctl.conf

```sysctl -p```

# SYNOPSIS

**sysctl** [_options_] [_variable_[=_value_]] ...

# PARAMETERS

**-a, --all**
> Display all available variables

**-w, --write**
> Write value to variable

**-p, --load [_file_]**
> Load settings from file (default: /etc/sysctl.conf)

**-n, --values**
> Print only values, not variable names

**-e, --ignore**
> Ignore unknown variables

**-q, --quiet**
> Suppress error messages

**--system**
> Load settings from all system configuration files

# DESCRIPTION

**sysctl** is used to examine and modify kernel parameters at runtime. Parameters available are listed under **/proc/sys/** and can be read or written using this tool.

Common categories include **kernel.** (core kernel settings), **net.** (networking), **vm.** (virtual memory), and **fs.** (filesystem). Changes made with sysctl are temporary unless persisted to configuration files.

# CONFIGURATION

**/etc/sysctl.conf**
> Main configuration file for persistent kernel parameter settings, loaded at boot.

**/etc/sysctl.d/*.conf**
> Drop-in directory for modular kernel parameter configuration files.

# CAVEATS

Changes are lost on reboot unless saved to **/etc/sysctl.conf** or files in **/etc/sysctl.d/**. Some parameters are read-only. Incorrect values can destabilize the system. Requires root privileges to modify values.

# SEE ALSO

[sysctl.conf](/man/sysctl.conf)(5), [proc](/man/proc)(5), [systemd-sysctl](/man/systemd-sysctl)(8)
