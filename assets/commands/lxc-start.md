# TAGLINE

starts a stopped Linux container

# TLDR

Start **lxc service**

```systemctl start lxc-net```

**Start** container

```sudo lxc-start [container_name]```

Start in **foreground**

```sudo lxc-start [container_name] --foreground```

Start with **debug logging**

```sudo lxc-start [container_name] -l DEBUG -o [path/to/logfile]```

Display **help**

```lxc-start --help```

# SYNOPSIS

**lxc-start** **-n** _name_ [_options_]

# DESCRIPTION

**lxc-start** starts a stopped Linux container. By default it runs in the background. Use foreground mode for debugging.

# PARAMETERS

**-n, --name NAME**
> Container name

**-F, --foreground**
> Run in foreground

**-d, --daemon**
> Run as daemon (default)

**-l, --logpriority LEVEL**
> Log priority (DEBUG, INFO, etc.)

**-o, --logfile FILE**
> Log output file

**-p, --pidfile FILE**
> PID file for daemon mode

**-?, --help**
> Display help information

# CAVEATS

Requires root privileges. Container must exist and be stopped. Use lxc-stop to stop foreground containers.

# INSTALL

```apt: sudo apt install lxc```

```dnf: sudo dnf install lxc```

```pacman: sudo pacman -S lxc```

```apk: sudo apk add lxc```

```zypper: sudo zypper install lxc```

```brew: brew install lxc```

```nix: nix profile install nixpkgs#lxc```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[lxc-stop](/man/lxc-stop)(1), [lxc-create](/man/lxc-create)(1), [lxc-attach](/man/lxc-attach)(1)
