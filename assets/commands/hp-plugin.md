# TLDR

**Install plugin**

```sudo hp-plugin```

**Interactive install**

```sudo hp-plugin -i```

**Automatic install**

```sudo hp-plugin -a```

**Download only**

```hp-plugin -d```

# SYNOPSIS

**hp-plugin** [_options_]

# PARAMETERS

**-i**, **--interactive**
> Interactive mode.

**-a**, **--auto**
> Automatic mode.

**-d**, **--download-only**
> Download without install.

**-p** _PATH_
> Plugin file path.

**--force**
> Force reinstall.

**--help**
> Display help information.

# DESCRIPTION

**hp-plugin** installs the HP proprietary plugin. Some HP printers require this binary plugin for full functionality like scanning.

The tool downloads and installs the plugin package. It must be run as root and requires network access.

hp-plugin installs HP proprietary driver.

# CAVEATS

Requires root access. Downloads from HP servers. Some countries may have restrictions.

# HISTORY

hp-plugin is part of **HPLIP** for installing proprietary components needed by certain HP devices.

# SEE ALSO

[hp-setup](/man/hp-setup)(1), [hp-check](/man/hp-check)(1), [hplip](/man/hplip)(1)
