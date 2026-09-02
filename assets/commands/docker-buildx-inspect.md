# TAGLINE

Inspect a Docker Buildx builder instance

# TLDR

**Inspect** the current builder

```docker buildx inspect```

**Inspect a named** builder

```docker buildx inspect [builder_name]```

**Start the builder** if it is stopped, then inspect it

```docker buildx inspect --bootstrap [builder_name]```

**Wait longer** for remote builder status

```docker buildx inspect --timeout [60s] [builder_name]```

# SYNOPSIS

**docker buildx inspect** [_options_] [_name_]

# PARAMETERS

**--bootstrap**
> Start the builder (for example the BuildKit container) and wait until it is operational before printing details.

**--timeout** _duration_
> Override the default timeout for loading builder status (default: **20s**).

**--builder** _name_
> Target a specific builder instance (overrides the currently selected builder).

# DESCRIPTION

**docker buildx inspect** prints details about the current builder, or a named builder if _name_ is given. The report includes the builder name, driver, last activity, and each node: endpoint, driver options, status, BuildKit version, platforms, labels, and garbage-collection policy.

Platforms marked with an asterisk (**\***) were set explicitly with **docker buildx create --platform**. Unmarked platforms were detected automatically.

**--bootstrap** is useful for **docker-container** builders that are not running yet. It pulls the BuildKit image if needed, creates the container, and waits until the node is up. Builds already bootstrap the same container, so this flag is only needed when you want the inspect output of a live node without running a build.

# CAVEATS

A builder that is inactive or unreachable within **--timeout** may show incomplete status. The default **docker** driver has no separate BuildKit container, so **--bootstrap** has little effect there. **docker --debug buildx inspect** prints extra diagnostic fields that the default output omits.

# INSTALL

```apt: sudo apt install docker-cli```

```dnf: sudo dnf install docker-cli```

```pacman: sudo pacman -S docker```

```apk: sudo apk add docker-cli```

```zypper: sudo zypper install docker```

```brew: brew install docker```

```nix: nix profile install nixpkgs#docker```

<!-- packages: 2026-09-02 -->

# SEE ALSO

[docker-buildx-ls](/man/docker-buildx-ls)(1), [docker-buildx-create](/man/docker-buildx-create)(1), [docker-buildx-use](/man/docker-buildx-use)(1), [docker](/man/docker)(1)

# RESOURCES

```[Source code](https://github.com/docker/buildx)```

```[Documentation](https://docs.docker.com/reference/cli/docker/buildx/inspect/)```

<!-- verified: 2026-09-02 -->
