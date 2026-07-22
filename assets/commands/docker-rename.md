# TAGLINE

change container name identifier

# TLDR

**Rename a container**

```docker rename [old_name] [new_name]```

# SYNOPSIS

**docker** **rename** _container_ _new_name_

# DESCRIPTION

**docker rename** renames an existing container. Works on both running and stopped containers. Useful for giving meaningful names to containers created without --name. Container names must be unique within the Docker host and follow naming conventions (alphanumeric characters, underscores, periods, and hyphens).

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

[docker-container-rename](/man/docker-container-rename)(1), [docker-run](/man/docker-run)(1)

# RESOURCES

```[Source code](https://github.com/docker/cli)```

```[Documentation](https://docs.docker.com/reference/cli/docker/)```

<!-- verified: 2026-07-11 -->

