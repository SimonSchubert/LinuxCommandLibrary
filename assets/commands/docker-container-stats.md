# TLDR

**Show live resource usage**

```docker container stats```

**Show stats for specific containers**

```docker container stats [container1] [container2]```

**Show one-time snapshot**

```docker container stats --no-stream```

**Custom format**

```docker container stats --format "{{.Name}}: {{.CPUPerc}}"```

# SYNOPSIS

**docker** **container** **stats** [_options_] [_container..._]

# PARAMETERS

**--no-stream**
> Disable streaming, show single snapshot.

**-a**, **--all**
> Show all containers (default shows running).

**--format** _string_
> Format output using Go template.

# DESCRIPTION

**docker container stats** displays a live stream of container resource usage statistics including CPU, memory, network I/O, and block I/O.

# SEE ALSO

[docker-stats](/man/docker-stats)(1), [docker-container-top](/man/docker-container-top)(1)
