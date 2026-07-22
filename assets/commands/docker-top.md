# TAGLINE

Display the running processes of a container

# TLDR

**Show running processes in container**

```docker top [container]```

**Show with BSD-style ps options (full info)**

```docker top [container] aux```

**Show with specific columns**

```docker top [container] -o pid,user,comm```

**Use container ID instead of name**

```docker top [container_id]```

# SYNOPSIS

**docker top** _CONTAINER_ [_ps OPTIONS_]

# PARAMETERS

_CONTAINER_
> Name or ID of a running container.

_ps OPTIONS_
> Optional **ps**(1) flags forwarded to the host's ps to format output (e.g., `aux`, `-eo pid,comm`).

# DESCRIPTION

**docker top** displays the processes running inside a container by querying the host's process list and filtering for that container's namespace. It is conceptually the same as **docker container top** and accepts arbitrary **ps**(1) options to control the output format.

The container must be running; stopped containers cannot be inspected with this command. Output reflects the host's view of the processes (host PIDs), not the in-container PIDs.

# CAVEATS

Process IDs shown are the host's PIDs, not the PIDs as seen from inside the container. The available **ps** options depend on the host's ps implementation (procps on Linux). Does not work on Windows containers in the same way.

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

[docker](/man/docker)(1), [docker-container-top](/man/docker-container-top)(1), [docker-ps](/man/docker-ps)(1), [docker-stats](/man/docker-stats)(1), [ps](/man/ps)(1), [top](/man/top)(1)

