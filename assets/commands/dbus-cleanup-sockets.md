# TAGLINE

utility to remove leftover D-Bus Unix domain sockets

# TLDR

**Clean up leftover** D-Bus sockets

```dbus-cleanup-sockets```

**Clean sockets in specific** directory

```dbus-cleanup-sockets [/run/user/1000/bus]```

# SYNOPSIS

**dbus-cleanup-sockets** [_directory_]

# PARAMETERS

_DIRECTORY_
> Directory containing D-Bus sockets to clean. Defaults to standard D-Bus socket locations.

# DESCRIPTION

**dbus-cleanup-sockets** removes leftover Unix domain sockets created by D-Bus that are no longer in use. These orphaned sockets can accumulate when D-Bus sessions terminate abnormally without proper cleanup.

The utility scans the specified directory (or default D-Bus socket locations) and removes socket files that don't have any active listeners. This helps prevent socket namespace pollution and potential connection issues.

This command is typically run automatically by system initialization scripts or as part of periodic maintenance tasks.

# CAVEATS

Running on active sockets may disrupt D-Bus connections. Requires appropriate permissions to remove socket files. Should not be run while D-Bus sessions are actively initializing.

# HISTORY

dbus-cleanup-sockets is part of the **D-Bus** message bus system, originally developed by **Red Hat** and the freedesktop.org project starting in **2003**. The cleanup utility helps maintain system hygiene in long-running systems.

# SEE ALSO

[dbus-daemon](/man/dbus-daemon)(1), [dbus-launch](/man/dbus-launch)(1), [dbus-send](/man/dbus-send)(1)
