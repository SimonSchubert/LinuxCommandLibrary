# TLDR

Run a command as a **specific user**

```gksu -u [userid] [command]```

Run the command while **preserving** the current environment

```gksu -u [userid] -k [command]```

Force gksu to use **su** to run the command

```gksu -u [userid] -w [command]```

Force gksu to use **sudo** to run the command

```gksu -u [userid] -S [command]```

Output **debug** info for the given command

```gksu -u [userid] -d [command]```

# SYNOPSIS

**gksu** [_options_] _command_

# PARAMETERS

**-u**, **--user** _USER_
> Run command as specified user (default: root)

**-k**, **--preserve-env**
> Preserve current environment variables

**-w**, **--su-mode**
> Force use of su for authentication

**-S**, **--sudo-mode**
> Force use of sudo for authentication

**-d**, **--debug**
> Output debug information

**-m**, **--message** _MSG_
> Custom message in password dialog

**-D**, **--description** _DESC_
> Description for the command being run

# DESCRIPTION

**gksu** is a graphical frontend for su that prompts for a password using a GTK dialog. It allows running graphical applications with elevated privileges from the command line or menu entries without needing a terminal.

The tool can operate in either su mode (authenticate as target user, typically root) or sudo mode (use current user's sudo privileges), with automatic detection based on system configuration.

> **DEPRECATED**: gksu is no longer maintained and has security issues. Use **pkexec** from PolicyKit for graphical privilege escalation instead.

# CAVEATS

Deprecated and unmaintained. Running graphical applications as root can cause permission problems with user files (.Xauthority, config files). Modern desktop environments discourage running GUI apps as root entirely.

# HISTORY

gksu was created in the early 2000s for GNOME to provide a graphical password prompt for privileged operations. It was deprecated around **2012** in favor of PolicyKit (pkexec), which provides finer-grained authorization controls.

# SEE ALSO

[pkexec](/man/pkexec)(1), [sudo](/man/sudo)(8), [su](/man/su)(1), [gksudo](/man/gksudo)(1)
