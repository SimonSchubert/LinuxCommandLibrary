# TAGLINE

display running processes inside a container

# TLDR

**Show running processes** in a container

```docker container top [container]```

**Show with custom ps options**

```docker container top [container] aux```

# SYNOPSIS

**docker** **container** **top** _container_ [_ps options_]

# DESCRIPTION

**docker container top** displays the running processes inside a container, similar to the Unix **ps** command but scoped to a specific container's process namespace. This provides visibility into what is actually executing within the container at any given moment.

The command accepts standard **ps** options to customize the output format and control which process attributes are displayed. This is particularly useful for debugging containers, verifying that expected processes are running, and investigating resource usage at the process level.

# SEE ALSO

[docker-top](/man/docker-top)(1), [docker-container-stats](/man/docker-container-stats)(1)
