# TAGLINE

Graphical frontend for sudo with GTK password dialog

# TLDR

Run a command as a **specific user**

```gksudo -u [userid] [command]```

Run the command while **preserving** the current environment

```gksudo -u [userid] -k [command]```

Force gksudo to use **su** to run the command

```gksudo -u [userid] -w [command]```

Force gksudo to use **sudo** to run the command

```gksudo -u [userid] -S [command]```

Output **debug** info for the given command

```gksudo -u [userid] -d [command]```

# SYNOPSIS

**gksudo** [_options_] _command_

# PARAMETERS

**-u**, **--user** _USER_
> Run command as specified user (default: root)

**-k**, **--preserve-env**
> Preserve current environment variables

**-w**, **--su-mode**
> Force use of su for authentication

**-S**, **--sudo-mode**
> Force use of sudo for authentication (default)

**-d**, **--debug**
> Output debug information

**-m**, **--message** _MSG_
> Custom message in password dialog

**-D**, **--description** _DESC_
> Description for the command being run

# DESCRIPTION

**gksudo** is a graphical frontend for `sudo` that prompts for a password using a GTK dialog. It is essentially `gksu` configured to use sudo-mode by default, authenticating with the current user's password and sudo privileges.

This allows running graphical applications with elevated privileges while using sudo's configuration for permission control.

> **DEPRECATED**: gksudo is no longer maintained and has security issues. Use **pkexec** from PolicyKit for graphical privilege escalation instead.

# CAVEATS

Deprecated and unmaintained. Running graphical applications as root can cause permission problems with user config files and X authority. Modern systems discourage running GUI applications as root.

# HISTORY

gksudo was created alongside gksu for Ubuntu and other distributions that preferred sudo over su for privilege escalation. Both were deprecated around **2012** in favor of PolicyKit's pkexec mechanism.

# SEE ALSO

[pkexec](/man/pkexec)(1), [sudo](/man/sudo)(8), [gksu](/man/gksu)(1)
