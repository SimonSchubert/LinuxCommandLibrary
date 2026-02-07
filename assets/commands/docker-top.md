# TAGLINE

display running processes in a container

# TLDR

**Show running processes in container**

```docker top [container]```

**Show with custom ps options**

```docker top [container] aux```

**Show with specific columns**

```docker top [container] -o pid,comm```

# SYNOPSIS

**docker** **top** _container_ [_ps options_]

# DESCRIPTION

**docker top** displays the running processes inside a container, similar to the Unix top command. Accepts ps options to customize output format.

# SEE ALSO

[docker-container-top](/man/docker-container-top)(1), [docker-stats](/man/docker-stats)(1)

