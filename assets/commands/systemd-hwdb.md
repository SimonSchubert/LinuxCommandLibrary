# TAGLINE

Manage udev hardware database

# TLDR

**Update** hardware database

```systemd-hwdb update```

**Query** database for modalias

```systemd-hwdb query [modalias]```

Update with **strict** error checking

```systemd-hwdb -s update```

Update in **/usr/lib/udev**

```systemd-hwdb --usr update```

Update for **alternate root**

```systemd-hwdb -r [/path/to/root] update```

# SYNOPSIS

**systemd-hwdb** [_OPTIONS_] _COMMAND_

# COMMANDS

**update**
> Compile hwdb source files into binary database

**query** _MODALIAS_
> Query database for a specific modalias

# PARAMETERS

**-s, --strict**
> Return non-zero exit on parsing errors

**--usr**
> Update database in /usr/lib/udev instead of /etc/udev

**-r, --root=** _PATH_
> Operate on alternate root filesystem

# DESCRIPTION

**systemd-hwdb** manages the udev hardware database, which maps hardware identifiers (modalias) to properties and metadata. The database is compiled from text files in `/usr/lib/udev/hwdb.d/` and `/etc/udev/hwdb.d/` into a binary format for fast lookup.

This database is used by udev rules to identify hardware and set appropriate properties.

# CAVEATS

Must run `systemd-hwdb update` after modifying hwdb source files. The binary database is architecture-specific. Changes in /etc override /usr/lib entries.

# HISTORY

**systemd-hwdb** replaces the older udev hwdb management, providing hardware identification data used throughout the system for device setup.

# SEE ALSO

[udevadm](/man/udevadm)(8), [hwdb](/man/hwdb)(7)
