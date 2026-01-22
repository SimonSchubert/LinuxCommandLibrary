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

**dm-tool** communicates with the LightDM display manager. It can lock sessions, switch users, and manage display seats.

Used for session management and multi-user switching on systems using LightDM.

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
