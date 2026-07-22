# TAGLINE

displays information about a Linux container including its state, PID, IP

# TLDR

Get container **info**

```sudo lxc-info [container_name]```

Display **help**

```lxc-info --help```

# SYNOPSIS

**lxc-info** **-n** _name_ [_options_]

# DESCRIPTION

**lxc-info** displays information about a Linux container including its state, PID, IP addresses, CPU and memory usage.

# PARAMETERS

**-n, --name NAME**
> Container name

**-s, --state**
> Show state only

**-p, --pid**
> Show PID only

**-i, --ips**
> Show IP addresses only

**-c, --config KEY**
> Show specific config value

**-S, --stats**
> Show usage statistics

**-?, --help**
> Display help information

# OUTPUT

**Name**: Container name
**State**: RUNNING, STOPPED, FROZEN
**PID**: Container init PID
**IP**: IP addresses
**CPU use**: CPU usage
**Memory use**: Memory usage

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

[lxc-ls](/man/lxc-ls)(1), [lxc-start](/man/lxc-start)(1), [lxc-attach](/man/lxc-attach)(1)
