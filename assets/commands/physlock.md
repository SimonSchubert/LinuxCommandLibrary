# TAGLINE

locks all virtual consoles and prevents unauthorized access to the system

# TLDR

**Lock** all consoles

```physlock```

Lock and **mute** kernel messages

```physlock -m```

Lock and **disable SysRq**

```physlock -s```

Lock with **custom message**

```physlock -p "[Locked!]"```

Lock and **detach** (for suspend scripts)

```physlock -d```

# SYNOPSIS

**physlock** [**-d**] [**-m**] [**-s**] [**-p** _message_] [**-l**]

# PARAMETERS

**-d**
> Fork and detach (daemonize)

**-m**
> Mute kernel messages while locked

**-s**
> Disable SysRq key while locked

**-p _message_**
> Display message before password prompt

**-l**
> Only lock the current tty

# DESCRIPTION

**physlock** locks all virtual consoles and prevents unauthorized access to the system. Unlike screen lockers that only protect graphical sessions, physlock secures all TTYs, preventing access through Ctrl+Alt+F1-F6 switching.

Authentication is required from the current user or root to unlock. This makes it suitable for securing systems with physical access concerns, particularly servers or kiosks.

# CAVEATS

Does not lock graphical displays (use with screen locker). Requires PAM for authentication. Detach mode useful for suspend/hibernate scripts. SysRq disable only effective if kernel supports it.

# HISTORY

**physlock** was created by **Bert Muennich** as a lightweight alternative to vlock. It focuses on securing physical console access with minimal dependencies, making it suitable for embedded and minimal systems.

# SEE ALSO

[vlock](/man/vlock)(1), [xlock](/man/xlock)(1), [loginctl](/man/loginctl)(1)
