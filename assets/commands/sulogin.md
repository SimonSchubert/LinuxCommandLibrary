# TAGLINE

Single-user mode root login prompt

# TLDR

**Start** sulogin on the default console

```sudo sulogin```

**Start** sulogin on a specific TTY device

```sudo sulogin [/dev/ttyX]```

**Set** a maximum timeout for entering the password

```sudo sulogin -t [timeout]```

**Start** root's shell as a login shell

```sudo sulogin -p```

**Force** a root shell without asking for a password

```sudo sulogin -e```

# SYNOPSIS

**sulogin** [_options_] [_tty_device_]

# PARAMETERS

**-t, --timeout _seconds_**
> Maximum time to wait for password before continuing boot

**-p, --login-shell**
> Start the shell as a login shell

**-e, --force**
> Examine default password files and skip prompt if root has no password

**-h, --help**
> Display help information

**-V, --version**
> Display version information

# DESCRIPTION

**sulogin** is invoked by init when the system enters single-user mode. It prompts for the root password and starts a root shell. This is used for system maintenance and recovery.

The command is typically called automatically during boot when entering single-user or rescue mode. It provides secure access to the system when normal multi-user services are not running.

# CAVEATS

Requires physical console access. The **-e** option should only be used when root has no password set (common in initramfs environments). Part of the util-linux package.

# SEE ALSO

[init](/man/init)(8), [login](/man/login)(1), [su](/man/su)(1), [agetty](/man/agetty)(8)
