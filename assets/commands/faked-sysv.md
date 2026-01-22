# TLDR

**Start fakeroot** daemon

```faked-sysv```

**Run with specific** socket

```faked-sysv --socket [/tmp/fakeroot.sock]```

**Debug mode**

```faked-sysv --debug```

# SYNOPSIS

**faked-sysv** [_options_]

# PARAMETERS

**--socket** _PATH_
> Unix socket path for communication.

**--debug**
> Enable debug output.

**--foreground**
> Run in foreground (don't daemonize).

**--help**
> Display help information.

# DESCRIPTION

**faked-sysv** is the daemon component of fakeroot using System V IPC. It maintains a database of fake file ownerships and permissions, allowing unprivileged users to create archives with root-owned files.

The daemon intercepts file operations via LD_PRELOAD and returns fake ownership/permission information. This enables building packages with correct ownership without actual root privileges.

faked-sysv uses System V shared memory for communication, as opposed to faked-tcp which uses TCP sockets.

# CAVEATS

Only fakes metadata, not actual permissions. Requires corresponding fakeroot wrapper. SysV IPC has system limits. Not security isolation.

# HISTORY

faked-sysv is part of the **fakeroot** package created for Debian package building. It enables creating .deb packages with proper file ownership without requiring root privileges during the build process.

# SEE ALSO

[fakeroot](/man/fakeroot)(1), [faked-tcp](/man/faked-tcp)(1), [dpkg-buildpackage](/man/dpkg-buildpackage)(1)
