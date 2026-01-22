# TLDR

Open the **GUI**

```kinfocenter```

**List** all available KCM modules

```kinfocenter --list```

Display **help**

```kinfocenter -h```

# SYNOPSIS

**kinfocenter** [_options_]

# PARAMETERS

**--list**
> List all available KCM (KDE Control Module) modules

**-h**, **--help**
> Display help message

# DESCRIPTION

**kinfocenter** is the KDE information center application that displays detailed system information. It provides a centralized view of hardware and software configuration including CPU, memory, graphics, audio, network, and USB devices.

The application loads various KCM modules, each providing information about different system aspects. It's useful for troubleshooting and understanding system capabilities.

# CAVEATS

Only available on KDE Plasma desktop. Some information modules may require additional packages. Hardware detection depends on kernel and driver support.

# HISTORY

kinfocenter has been part of KDE since the early KDE 3 era, evolving with each major KDE release to provide comprehensive system information in a user-friendly interface.

# SEE ALSO

[inxi](/man/inxi)(1), [lshw](/man/lshw)(1), [systemctl](/man/systemctl)(1)
