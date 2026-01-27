# TLDR

**Start X with the default window manager**

```xinit```

**Start X with a specific window manager**

```xinit /usr/bin/[openbox]```

**Start X on a different display**

```xinit -- :1```

**Start X with a specific server**

```xinit -- /usr/bin/Xorg :0```

**Start X with server options**

```xinit -- -depth 24```

# SYNOPSIS

**xinit** [_client_] [_options_] [_--_] [_server_] [_display_] [_options_]

# PARAMETERS

**client**
> Client program to start (must begin with / or .)

**--**
> Separator between client and server arguments

**server**
> X server program to run (must begin with / or .)

**display**
> Display number (:0, :1, etc.)

# CONFIGURATION FILES

**~/.xinitrc**
> Shell script for starting client programs; last program should run in foreground

**~/.xserverrc**
> Shell script for starting the X server

**/etc/X11/xinit/xinitrc**
> System-wide default client script

**/etc/X11/xinit/xserverrc**
> System-wide default server script

# DESCRIPTION

**xinit** starts the X Window System server and an initial client program. It is typically used on systems without a display manager or when running multiple window systems.

Without arguments, xinit reads ~/.xinitrc to determine which clients to start, or uses a default (xterm). For the server, it checks ~/.xserverrc or uses the default X server.

Programs in .xinitrc should run in the background except the last one (usually a window manager), which keeps the session alive. When the foreground client exits, xinit kills the X server and terminates.

# CAVEATS

xinit is a low-level utility; **startx** provides a friendlier interface for typical use. Programs in .xinitrc must be backgrounded except the final window manager. Display managers like GDM or SDDM are preferred for production systems.

# HISTORY

xinit has been part of X11 since the early X Window System releases. The X Window System was developed at MIT starting in **1984**, with xinit providing the fundamental mechanism for starting X sessions without a display manager.

# SEE ALSO

[startx](/man/startx)(1), [Xorg](/man/Xorg)(1), [xdm](/man/xdm)(1), [xterm](/man/xterm)(1)
