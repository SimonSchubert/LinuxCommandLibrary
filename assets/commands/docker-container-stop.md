# TAGLINE

Stop one or more running Docker containers

# TLDR

**Stop a container** gracefully (SIGTERM then SIGKILL after timeout)

```docker container stop mycontainer```

**Stop multiple containers**

```docker container stop container1 container2```

**Stop with a custom timeout** (seconds before SIGKILL)

```docker container stop --time 30 mycontainer```

**Send a specific stop signal**

```docker container stop --signal SIGINT mycontainer```

# SYNOPSIS

**docker** **container** **stop** [_options_] _container_ [_container_...]

# DESCRIPTION

**docker container stop** stops one or more running containers. It sends `SIGTERM` (or the signal specified by `--signal` / the container's `STOPSIGNAL`) to the main process inside the container. If the process does not exit within the timeout (default 10 seconds), `SIGKILL` is sent.

This is the preferred way to stop containers cleanly. The alias `docker stop` is equivalent.

# PARAMETERS

**-t**, **--time** _seconds_
> Seconds to wait before killing the container after sending the stop signal. Default: 10.

**-s**, **--signal** _signal_
> Signal to send to the container (e.g. SIGTERM, SIGINT, SIGKILL). Default is the container's configured stop signal or SIGTERM.

# CAVEATS

If the main process ignores SIGTERM, the container may not stop until the timeout triggers SIGKILL. Use `docker kill` for immediate forceful termination. Stopped containers can be restarted with `docker start`.

# SEE ALSO

docker-start, docker-restart, docker-kill, docker-rm

# RESOURCES

```[Documentation](https://docs.docker.com/reference/cli/docker/container/stop/)```

<!-- verified: 2026-07-09 -->
