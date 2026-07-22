# TAGLINE

Stop one or more running Docker containers (alias)

# TLDR

**Stop a container** (alias of `docker container stop`)

```docker stop mycontainer```

**Stop multiple containers**

```docker stop container1 container2```

**Stop with a custom timeout** (seconds before SIGKILL)

```docker stop --timeout 30 mycontainer```

**Send a specific stop signal**

```docker stop --signal SIGINT mycontainer```

# SYNOPSIS

**docker** **stop** [_options_] _container_ [_container_...]

# DESCRIPTION

**docker stop** is an alias for `docker container stop`. It stops one or more running containers by sending a termination signal (`SIGTERM` by default, or the container's `STOPSIGNAL` / `--signal`) and waiting for a graceful shutdown. If the process does not exit within the timeout (default 10 seconds on Linux unless configured otherwise), `SIGKILL` is sent.

For full option details, prefer the canonical form documented under `docker container stop`.

# PARAMETERS

**-t**, **--timeout** _seconds_
> Seconds to wait before killing the container after the stop signal. Set to `-1` to wait indefinitely.

**-s**, **--signal** _signal_
> Signal to send to the container (e.g. `SIGTERM`, `SIGINT`).

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

[docker-container-stop](/man/docker-container-stop)(1), [docker-start](/man/docker-start)(1), [docker-container-start](/man/docker-container-start)(1), [docker-rm](/man/docker-rm)(1), [docker-ps](/man/docker-ps)(1)

# RESOURCES

```[Documentation](https://docs.docker.com/reference/cli/docker/container/stop/)```

<!-- verified: 2026-07-11 -->
