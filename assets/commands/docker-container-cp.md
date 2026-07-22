# TAGLINE

copy files between container and host

# TLDR

**Copy file from container to host**

```docker container cp [container]:[/path/in/container] [/local/path]```

**Copy file from host to container**

```docker container cp [/local/file] [container]:[/path/in/container]```

**Copy directory**

```docker container cp [container]:[/src/dir] [/dest/dir]```

# SYNOPSIS

**docker** **container** **cp** [_options_] _src_ _dest_

# PARAMETERS

**-a**, **--archive**
> Archive mode (preserve permissions).

**-L**, **--follow-link**
> Follow symbolic links.

# DESCRIPTION

**docker container cp** copies files between containers and the local filesystem. Works with running or stopped containers.

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

[docker-cp](/man/docker-cp)(1), [docker-container](/man/docker-container)(1)

# RESOURCES

```[Source code](https://github.com/docker/cli)```

```[Documentation](https://docs.docker.com/reference/cli/docker/)```

<!-- verified: 2026-07-11 -->
