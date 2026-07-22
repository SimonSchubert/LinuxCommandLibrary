# TAGLINE

list Docker images stored locally

# TLDR

**List all images**

```docker images```

**List with digests**

```docker images --digests```

**List only image IDs**

```docker images -q```

**Filter by repository**

```docker images [repository]```

**Show dangling images**

```docker images -f dangling=true```

# SYNOPSIS

**docker** **images** [_options_] [_repository[:tag]_]

# PARAMETERS

**-a**, **--all**
> Show all images (including intermediate layers).

**-q**, **--quiet**
> Only show image IDs.

**--digests**
> Show digests.

**-f**, **--filter** _filter_
> Filter output.

**--format** _string_
> Format output using a custom template: table, table TEMPLATE, json, or a Go template string.

**--no-trunc**
> Don't truncate output.

# DESCRIPTION

**docker images** lists images stored on the local system. Shorthand for docker image ls. Shows repository, tag, image ID, creation time, and size. Images are the templates from which containers are created, containing the filesystem and configuration needed to run an application.

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

[docker-image-ls](/man/docker-image-ls)(1), [docker-rmi](/man/docker-rmi)(1), [docker-pull](/man/docker-pull)(1)

