# TLDR

**Configure timezone**

```tzconfig```

# SYNOPSIS

**tzconfig** [_options_]

# PARAMETERS

**--help**
> Show help.

# DESCRIPTION

**tzconfig** sets system timezone. It's interactive.

Timezone selection. Region and city.

System-wide setting. Updates /etc/localtime.

Menu-based interface. Easy selection.

Debian-based tool. Distribution specific.

# CAVEATS

Deprecated on many systems. Use timedatectl. Root required.

# HISTORY

**tzconfig** was the traditional Debian tool for timezone configuration, now replaced by **timedatectl** on systemd systems.

# SEE ALSO

[timedatectl](/man/timedatectl)(1), [dpkg-reconfigure](/man/dpkg-reconfigure)(1), [tzselect](/man/tzselect)(1)
