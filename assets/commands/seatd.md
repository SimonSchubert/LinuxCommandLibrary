# TAGLINE

Minimal seat management daemon for Wayland

# TLDR

**Start seatd** with default settings

```seatd```

**Start seatd** with a specific socket path

```seatd -s [/path/to/socket.sock]```

**Start seatd** with specific user and group ownership

```seatd -u [user] -g [group]```

**Start seatd** with debug logging

```seatd -l debug```

**Start seatd** with s6 notification on a file descriptor

```seatd -n [fd]```

# SYNOPSIS

**seatd** [**-h**] [**-v**] [**-n** _fd_] [**-u** _user_] [**-g** _group_] [**-s** _path_] [**-l** _loglevel_]

# PARAMETERS

**-h**
> Display help information and exit.

**-v**
> Display version number and exit.

**-n** _fd_
> File descriptor to notify readiness on. A single newline will be written and the fd closed when seatd is ready to serve requests. Compatible with s6's notification protocol.

**-u** _user_
> User to own the seatd socket.

**-g** _group_
> Group to own the seatd socket.

**-s** _path_
> Where to create the seatd socket. Defaults to `/run/seatd.sock`.

**-l** _loglevel_
> Set logging verbosity. Valid levels are **debug**, **info**, **error**, or **silent**. Defaults to **error**.

# DESCRIPTION

**seatd** is a minimal seat management daemon that mediates access to shared resources such as displays and input devices in a multi-session, multi-seat environment. It provides an alternative to elogind for Wayland compositors, particularly those based on wlroots.

The daemon operates over a UNIX domain socket, with **libseat** providing the client-side protocol. Unlike elogind, seatd focuses solely on seat management without additional session management features, making it lightweight and suitable for minimal setups.

Seat management allows applications like Wayland compositors to access privileged devices (graphics cards, input devices) without requiring root privileges, improving security while maintaining functionality.

# CONFIGURATION

**SEATD_VTBOUND**
> When set to "0", the seat will not be bound to a virtual terminal.

# CAVEATS

seatd requires appropriate permissions to access device nodes. The socket path must be accessible to clients that need seat management. Only one seat management daemon should run at a time. Some compositors may require additional configuration to use libseat with seatd instead of elogind.

# HISTORY

**seatd** was created by Kenny Levinsen as a minimal alternative to the seat management functionality provided by logind/elogind. It was designed specifically to support Wayland compositors, particularly wlroots-based ones like Sway, without requiring the full systemd or elogind stack. The project gained traction as more users sought lightweight alternatives for running Wayland on systems without systemd.

# SEE ALSO

[libseat](/man/libseat)(3), [sway](/man/sway)(1), [elogind](/man/elogind)(8), [logind](/man/logind)(8)
