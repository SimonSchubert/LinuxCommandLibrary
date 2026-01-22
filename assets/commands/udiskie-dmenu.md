# TLDR

**Launch** mount/unmount menu

```udiskie-dmenu```

Use **rofi** instead of dmenu

```udiskie-dmenu --rofi```

Display **help**

```udiskie-dmenu --help```

# SYNOPSIS

**udiskie-dmenu** [_OPTIONS_]

# PARAMETERS

**--rofi**
> Use rofi instead of dmenu

**--help**
> Display help information

# DESCRIPTION

**udiskie-dmenu** provides a dmenu or rofi-based frontend for udiskie to mount and unmount devices interactively. It presents a menu of available devices for quick selection.

This tool integrates with tiling window managers that use dmenu or rofi as their primary launcher interface.

# CAVEATS

Requires udiskie and either dmenu or rofi installed. Available devices depend on connected hardware and udiskie configuration.

# SEE ALSO

[udiskie](/man/udiskie)(1), [dmenu](/man/dmenu)(1), [rofi](/man/rofi)(1)
