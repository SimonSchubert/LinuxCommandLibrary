# TAGLINE

Stop one or more running Docker containers

# TLDR

**Stop a container** gracefully (SIGTERM then SIGKILL after timeout)

```docker container stop mycontainer```

**Stop multiple containers**

```docker container stop container1 container2```

**Stop with a custom timeout** (seconds before SIGKILL)

```docker container stop --timeout 30 mycontainer```

**Send a specific stop signal**

```docker container stop --signal SIGINT mycontainer```

# SYNOPSIS

**docker** **container** **stop** [_options_] _container_ [_container_...]

# DESCRIPTION

**docker container stop** stops one or more running containers. It sends `SIGTERM` (or the signal specified by `--signal` / the container's `STOPSIGNAL`) to the main process inside the container. If the process does not exit within the timeout (default 10 seconds on Linux, 30 on Windows unless configured with `--stop-timeout` at create/run time), `SIGKILL` is sent.

This is the preferred way to stop containers cleanly. The alias `docker stop` is equivalent.

# PARAMETERS

**-t**, **--timeout** _seconds_
> Seconds to wait for the container to stop after sending the stop signal before forcibly killing it with `SIGKILL`. Set to `-1` to wait indefinitely. Default: daemon default (10s Linux / 30s Windows) or the container's configured stop timeout.

**-s**, **--signal** _signal_
> Signal to send to the container (e.g. `SIGTERM`, `SIGINT`, `SIGKILL`, or a number). Default is the container's configured stop signal or `SIGTERM`.

# CAVEATS

If the main process ignores SIGTERM, the container may not stop until the timeout triggers SIGKILL. Stopped containers remain on disk and can be restarted with `docker start` / `docker container start`, or removed with `docker rm`.

# SEE ALSO

[docker-stop](/man/docker-stop)(1), [docker-start](/man/docker-start)(1), [docker-container-start](/man/docker-container-start)(1), [docker-rm](/man/docker-rm)(1), [docker-ps](/man/docker-ps)(1)

# RESOURCES

```[Documentation](https://docs.docker.com/reference/cli/docker/container/stop/)```

<!-- verified: 2026-07-11 -->
