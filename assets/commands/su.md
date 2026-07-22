# TAGLINE

Switch user identity or run commands

# TLDR

**Switch** to superuser (root)

```su```

**Switch** to a specific user

```su [username]```

**Switch** to user with full login shell

```su - [username]```

**Execute** a command as another user

```su - [username] -c "[command]"```

**Switch** to user with a specific shell

```su -s /[path/to/shell] [username]```

# SYNOPSIS

**su** [_options_] [_-_] [_user_]

# PARAMETERS

**-, -l, --login**
> Provide a login shell environment

**-c, --command _command_**
> Pass a single command to the shell

**-s, --shell _shell_**
> Use the specified shell instead of the default

**-p, --preserve-environment**
> Preserve the entire environment

**-m**
> Preserve environment (same as -p)

**-g, --group _group_**
> Specify the primary group

# DESCRIPTION

**su** (substitute user) allows running a shell or command as a different user. Without a username, it switches to the root user by default.

The difference between **su** and **su -** is that the latter provides a full login environment, resetting environment variables and changing to the target user's home directory.

# CAVEATS

Requires the target user's password (or root privileges). On many modern systems, **sudo** is preferred for running commands as root. Using **su -** is recommended over plain **su** to get a clean environment.

# INSTALL

```apt: sudo apt install util-linux```

```dnf: sudo dnf install util-linux```

```pacman: sudo pacman -S util-linux```

```apk: sudo apk add heimdal-su```

```zypper: sudo zypper install util-linux```

```brew: brew install util-linux```

```nix: nix profile install nixpkgs#util-linux```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[sudo](/man/sudo)(8), [login](/man/login)(1), [runuser](/man/runuser)(1)
