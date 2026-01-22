# TLDR

Set login shell **interactively**

```chsh```

**List** available shells

```chsh -l```

Set a **specific login shell** for current user

```chsh -s [path/to/shell]```

Set login shell for a **specific user**

```sudo chsh -s [path/to/shell] [username]```

# SYNOPSIS

**chsh** [_options_] [_username_]

# DESCRIPTION

**chsh** changes a user's login shell. The new shell must be listed in /etc/shells unless the change is made by root.

Users can change their own shell; root can change any user's shell.

# PARAMETERS

**-s, --shell** _shell_
> Specify the new login shell

**-l, --list-shells**
> List shells from /etc/shells

**-h, --help**
> Display help message

# CAVEATS

The shell must exist and be listed in /etc/shells. An invalid shell can lock users out of their accounts. Changes take effect on next login. Part of the util-linux package.

# SEE ALSO

[usermod](/man/usermod)(8), [passwd](/man/passwd)(1), [login](/man/login)(1)
