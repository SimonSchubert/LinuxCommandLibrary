# TAGLINE

special shell that politely refuses login attempts

# TLDR

Set a user's **login shell to nologin** to prevent logging in

```chsh -s nologin [user]```

**Customize message** for users with the login shell of nologin

```echo "[declined_login_message]" > /etc/nologin.txt```

# SYNOPSIS

**nologin** [_options_]

# PARAMETERS

**-c**, **--command** _command_
> Ignored (accepted only for shell compatibility).

**-h**, **--help**
> Display help and exit.

**-V**, **--version**
> Display version information and exit.

Other shell options (**-i**, **-l**, **--noprofile**, **--norc**, **--posix**, **--rcfile**, **-r**) are also accepted and ignored so that programs invoking a shell do not crash.

# DESCRIPTION

**nologin** displays a message that an account is not available and exits non-zero. It is designed as a replacement shell for accounts that should not be able to log in interactively.

When set as a user's login shell, any attempt to log in as that user (via SSH, console, or **su**) is rejected. It is commonly used for system accounts (daemon, nobody, www-data) or to temporarily disable user accounts without deleting them.

If **/etc/nologin.txt** exists, nologin displays its contents instead of the default message. On Linux (util-linux) the attempt is also written to **syslog**.

Note: per-account **nologin** (this tool) is distinct from the **pam_nologin** PAM module, which disables all non-root logins system-wide via **/etc/nologin** or **/var/run/nologin**.

# CAVEATS

Users with nologin as their shell can still run commands via **su -s /bin/bash username** if the caller has sufficient privileges. For complete account lockout, also lock the password with **passwd -l**. The path to nologin varies: **/usr/sbin/nologin** or **/sbin/nologin**.

# SEE ALSO

[chsh](/man/chsh)(1), [passwd](/man/passwd)(1), [usermod](/man/usermod)(8), [login](/man/login)(1)
