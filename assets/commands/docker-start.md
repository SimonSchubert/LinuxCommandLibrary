# TAGLINE

start stopped containers

# TLDR

**Start a stopped container**

```docker start [container]```

**Start multiple containers**

```docker start [container1] [container2]```

**Start with attached output**

```docker start -a [container]```

**Start interactively**

```docker start -ai [container]```

# SYNOPSIS

**docker** **start** [_options_] _container_ [_container..._]

# PARAMETERS

**-a**, **--attach**
> Attach STDOUT/STDERR and forward signals.

**-i**, **--interactive**
> Attach container's STDIN.

**--detach-keys** _string_
> Override the key sequence for detaching a container.

**--checkpoint** _string_
> Restore from this checkpoint.

**--checkpoint-dir** _string_
> Use a custom checkpoint storage directory.

# DESCRIPTION

**docker start** starts one or more stopped containers. Containers retain their configuration from when they were created or last run.

# INSTALL

```apt: sudo apt install docker-cli```

```dnf: sudo dnf install docker-cli```

```pacman: sudo pacman -S docker```

```apk: sudo apk add docker-cli```

```zypper: sudo zypper install docker```

```brew: brew install docker```

```nix: nix profile install nixpkgs#docker```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[docker-container-start](/man/docker-container-start)(1), [docker-run](/man/docker-run)(1)

