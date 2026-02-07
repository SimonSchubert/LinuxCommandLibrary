# TAGLINE

terminal login session manager

# TLDR

**Start getty on** terminal

```getty [tty1] [38400]```

**Auto-login user**

```getty -a [username] [tty1]```

**With specific term**

```getty -T [linux] [tty1] [38400]```

**Wait for carrier**

```getty -w [ttyS0] [9600]```

# SYNOPSIS

**getty** [_options_] _port_ [_baud_]

# PARAMETERS

_PORT_
> Terminal device (tty1, ttyS0).

_BAUD_
> Baud rate.

**-a** _USER_, **--autologin** _USER_
> Auto-login specified user.

**-n**, **--skip-login**
> Don't prompt for login.

**-T** _TERM_, **--term** _TERM_
> Terminal type.

**-w**, **--wait-cr**
> Wait for carrier/carriage return.

**--help**
> Display help information.

# DESCRIPTION

**getty** (get teletype) opens terminal ports, sets modes, and invokes login. It manages the login prompt on system consoles and serial ports.

The program is started by init/systemd for each terminal requiring login access. It handles baud rate detection for serial terminals and terminal type configuration.

getty provides the foundational login interface for Unix systems.

# CONFIGURATION

**/etc/inittab**
> System V init configuration defining getty instances for each terminal (legacy systems).

**/etc/systemd/system/getty@.service**
> Systemd service template for getty instances on modern Linux systems.

# CAVEATS

Usually started by init/systemd. Direct invocation rare. Serial configuration complex.

# HISTORY

getty dates back to **early Unix**, managing teletypes and terminals. Modern Linux uses agetty (alternative getty), which provides additional features.

# SEE ALSO

[agetty](/man/agetty)(1), [login](/man/login)(1), [init](/man/init)(1)
