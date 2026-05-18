# TAGLINE

Simple alternative to xinit and startx

# TLDR

**Start an X session** running the commands in _$XDG_CONFIG_HOME/sx/sxrc_

```sx```

**Start an X session** running a specific window manager directly

```sx [dwm]```

**Start an X session** with an explicit command line

```sx [exec] [i3]```

**Run** a one-off X program after starting the server

```sx [xterm]```

# SYNOPSIS

**sx** [_command_ [_args_...]]

# DESCRIPTION

**sx** is a small POSIX shell script that starts an **Xorg** server, sets up an authority cookie, and then runs a user-supplied command (or _sxrc_) as the X session. It is intended as a minimal, transparent replacement for **xinit** and **startx**, exposing the same basic mechanics without their many optional behaviors.

The X server is started on the same TTY where **sx** is invoked, with the display number derived from the TTY number (so VT1 becomes _:1_). A fresh MIT-MAGIC-COOKIE-1 is generated from _/dev/urandom_ and registered with **xauth** before the server is launched with **-keeptty -noreset**.

If no arguments are passed, **sx** runs the executable file at _$XDG_CONFIG_HOME/sx/sxrc_ (defaulting to _~/.config/sx/sxrc_). Otherwise the supplied command and its arguments become the session leader: when it exits, **sx** tears down the server.

# CONFIGURATION

**$XDG_CONFIG_HOME/sx/sxrc**
> Executable script run as the X session when **sx** is invoked without arguments. Must have the executable bit set. A typical _sxrc_ launches a window manager as the last (foreground) command, for example:

```
#!/bin/sh
xrdb -merge ~/.Xresources &
xsetroot -cursor_name left_ptr &
exec dwm
```

**$XAUTHORITY**
> Path to the X authority file. **sx** generates this file under _$XDG_DATA_HOME/sx/_ and exports it for child processes.

# PARAMETERS

**sx** does not parse flags of its own. Any arguments are treated as the session command and its arguments. Use **--** before the command if it begins with something that could be mistaken for an option.

# CAVEATS

The Xorg command line is **hardcoded**: server flags cannot be customized through **sx** itself. Only **Unix domain** sockets are configured; TCP listening is not enabled. The display number is tied to the TTY number, so starting **sx** on _tty1_ always produces display _:1_, which differs from **startx**, where _:0_ is the default. **sx** requires **Xorg**, **xauth**, and a readable _/dev/urandom_; error checking is intentionally minimal, leaving most reporting to the underlying tools.

# HISTORY

**sx** was written by **Earnest Wieczorek** (Earnestly) as a proof-of-concept response to the comment in **xinit(1)** urging "site administrators" to write nicer wrappers. First published on GitHub around **2015**, it has remained a tiny shell script (around 70 lines) and is packaged in several distributions, notably **Arch Linux**, as a lightweight way to launch an X session without **startx**.

# SEE ALSO

[xinit](/man/xinit)(1), [startx](/man/startx)(1), [Xorg](/man/Xorg)(1), [xauth](/man/xauth)(1)
