# TAGLINE

LightDM display manager control

# TLDR

Show **greeter** (login screen)

```dm-tool switch-to-greeter```

**Lock** the current session

```dm-tool lock```

**Switch** to a specific user

```dm-tool switch-to-user [username] [session]```

**Add** a dynamic seat

```dm-tool add-seat [xlocal] [name]=[value]```

# SYNOPSIS

**dm-tool** _command_ [_arguments_]

# DESCRIPTION

**dm-tool** is a command-line utility for interacting with the LightDM display manager. It provides session management capabilities including locking the current session, switching between users, and displaying the greeter (login screen) without logging out.

The tool enables multi-user workflows by allowing quick user switching while preserving all open sessions. It can also manage display seats, which are independent workstations consisting of a display, keyboard, and mouse.

dm-tool communicates with LightDM via D-Bus, sending commands that control the display manager's behavior. This makes it useful for scripting and custom session management workflows on systems using LightDM.

# PARAMETERS

**switch-to-greeter**
> Show login screen, keep current session

**lock**
> Lock current session

**switch-to-user** _user_ [_session_]
> Switch to specified user

**add-seat** _type_ _options_
> Add dynamic seat

**list-seats**
> List available seats

# CAVEATS

Only works with LightDM display manager. Other display managers (GDM, SDDM) have different tools. Session type must be valid.

# SEE ALSO

[lightdm](/man/lightdm)(1), [loginctl](/man/loginctl)(1)
