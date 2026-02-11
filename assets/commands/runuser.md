# TAGLINE

Run commands as a different user

# TLDR

Run command as **different user**

```runuser [user] -c '[command]'```

Run as user and **group**

```runuser [user] -g [group] -c '[command]'```

Start **login shell**

```runuser [user] -l```

Use **specific shell**

```runuser [user] -s /bin/bash```

**Preserve** environment

```runuser [user] -p -c '[command]'```

# SYNOPSIS

**runuser** [**-l**] [**-c** _command_] [**-g** _group_] [**-s** _shell_] [**-p**] _user_

# PARAMETERS

**-c, --command _command_**
> Command to execute

**-g, --group _group_**
> Specify group

**-l, --login**
> Start login shell

**-s, --shell _shell_**
> Use specific shell

**-p, --preserve-environment**
> Keep environment variables

**-w, --whitelist-environment**
> Preserve specific variables

# DESCRIPTION

**runuser** runs commands as another user without requiring password authentication. Unlike su, it's designed for use by root in system scripts and services where interactive authentication isn't appropriate.

The tool is commonly used in init scripts and system services to drop privileges to a specific user before executing commands.

# CAVEATS

Requires root to run. No password prompt (unlike su). Environment handling depends on options. Login shell resets most environment.

# HISTORY

**runuser** is part of **util-linux**, providing a non-interactive way for root to run commands as other users. It's preferred over su in scripts due to its predictable behavior.

# SEE ALSO

[su](/man/su)(1), [sudo](/man/sudo)(8), [runcon](/man/runcon)(1)
