# TAGLINE

Package management daemon via D-Bus

# TLDR

**Start** the APT daemon

```sudo aptd```

Run in **foreground** with debugging

```sudo aptd --disable-timeout --debug```

# SYNOPSIS

**aptd** [_--disable-timeout_] [_--debug_]

# DESCRIPTION

**aptd** is the APT daemon that provides a D-Bus interface for package management. It allows GUI applications like Update Manager and Software Center to perform package operations without requiring direct root access to APT.

The daemon handles authentication through PolicyKit and queues package operations for execution.

# PARAMETERS

**--disable-timeout**
> Don't exit after idle timeout

**--debug**
> Enable debug output

**--dummy**
> Run in simulation mode

**-h**, **--help**
> Show help

# CONFIGURATION

**/etc/apt/apt.conf.d/**
> APT configuration fragments used by the daemon.

**/usr/share/dbus-1/system-services/org.debian.apt.service**
> D-Bus service activation file for aptd.

**/usr/share/polkit-1/actions/org.debian.apt.policy**
> PolicyKit policy file controlling authentication requirements.

# CAVEATS

Typically started automatically by D-Bus activation. GUI package managers depend on this service. Manual invocation is rarely needed.

# HISTORY

**aptd** was developed for Ubuntu to provide a user-friendly interface for package management, enabling GUI tools to safely perform root operations.

# SEE ALSO

[aptdcon](/man/aptdcon)(1), [apt](/man/apt)(8), [packagekit](/man/packagekit)(8)
