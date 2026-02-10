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

**-c, --command _string_**
> Ignored (for compatibility with shells)

**--help**
> Display help information

**--version**
> Display version information

# DESCRIPTION

**nologin** is a special shell that politely refuses login attempts. When set as a user's login shell, any attempt to log in as that user (via SSH, console, or su) is rejected with a message.

This is commonly used for system accounts (daemon, nobody, www-data) that should never have interactive logins, or for temporarily disabling user accounts without deleting them.

The default rejection message can be customized by creating **/etc/nologin.txt** with the desired text. If this file exists, its contents are displayed when login is refused.

# CAVEATS

Users with nologin as their shell can still run commands via **su -s /bin/bash username** if the caller has sufficient privileges. For complete account lockout, also lock the password with **passwd -l**. The path to nologin varies: **/usr/sbin/nologin** or **/sbin/nologin**.

# SEE ALSO

[chsh](/man/chsh)(1), [passwd](/man/passwd)(1), [usermod](/man/usermod)(8), [login](/man/login)(1)
