# TAGLINE

Interactive system timezone configuration

# TLDR

**Configure timezone**

```tzconfig```

# SYNOPSIS

**tzconfig** [_options_]

# PARAMETERS

**--help**
> Show help.

# DESCRIPTION

**tzconfig** is an interactive Debian utility for configuring the system timezone. It presents a menu-based interface that guides users through selecting a geographic region and city to determine the correct timezone, then updates the system-wide timezone configuration by modifying **/etc/localtime**.

This tool has been deprecated on systemd-based systems in favor of **timedatectl**, which provides timezone management along with broader time and date configuration capabilities. On older Debian systems without systemd, **dpkg-reconfigure tzdata** is the preferred alternative.

# CAVEATS

Deprecated on many systems. Use timedatectl. Root required.

# HISTORY

**tzconfig** was the traditional Debian tool for timezone configuration, now replaced by **timedatectl** on systemd systems.

# SEE ALSO

[timedatectl](/man/timedatectl)(1), [dpkg-reconfigure](/man/dpkg-reconfigure)(1), [tzselect](/man/tzselect)(1)
