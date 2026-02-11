# TAGLINE

Run commands as another user via systemd

# TLDR

Run command as **root**

```run0 [command]```

Run as **specific user**

```run0 -u [username] [command]```

Run as user and **group**

```run0 -u [username] -g [group] [command]```

# SYNOPSIS

**run0** [**-u**|**--user** _user_] [**-g**|**--group** _group_] [_command_]

# PARAMETERS

**-u, --user _user_**
> Run as specified user

**-g, --group _group_**
> Run with specified group

**--no-ask-password**
> Don't prompt for password

**--machine _machine_**
> Execute on container/VM

# DESCRIPTION

**run0** elevates privileges without being a SUID binary. Unlike sudo, it authenticates via polkit and spawns commands through a systemd service, providing better security isolation.

The tool is designed as a more secure alternative to sudo, avoiding the security concerns of SUID binaries while maintaining familiar privilege escalation semantics.

# CAVEATS

Requires systemd 256+. Authentication through polkit. Environment handling differs from sudo. Some sudo features not available.

# HISTORY

**run0** was introduced in **systemd 256** by Lennart Poettering as a secure alternative to sudo. It addresses SUID-related security concerns by using polkit for authentication and service-based command execution.

# SEE ALSO

[sudo](/man/sudo)(8), [pkexec](/man/pkexec)(1), [doas](/man/doas)(1), [systemd-run](/man/systemd-run)(1)
