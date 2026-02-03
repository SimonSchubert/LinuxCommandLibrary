# TLDR

**Start GNOME Display Manager**

```gdm-binary```

**Start with debugging**

```gdm-binary --debug```

# SYNOPSIS

**gdm-binary** [_options_]

# PARAMETERS

**--debug**
> Enable debug output.

**--nodaemon**
> Don't become a daemon.

**--preserve-ld-vars**
> Preserve LD_* environment variables.

# DESCRIPTION

**gdm-binary** is the GNOME Display Manager daemon binary. Manages graphical logins and user sessions. Usually started by systemd, not invoked directly.

# SEE ALSO

[gdm](/man/gdm)(8), [gdm-restart](/man/gdm-restart)(1)

