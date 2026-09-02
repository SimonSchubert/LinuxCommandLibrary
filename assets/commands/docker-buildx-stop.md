# TAGLINE

Stop a Docker Buildx builder instance

# TLDR

**Stop** the current builder

```docker buildx stop```

**Stop a named** builder

```docker buildx stop [builder_name]```

# SYNOPSIS

**docker buildx stop** [_name_]

# PARAMETERS

**--builder** _name_
> Target a specific builder instance (overrides the currently selected builder).

# DESCRIPTION

**docker buildx stop** stops the current builder, or the named builder if _name_ is given. What "stop" does depends on the driver: a **docker-container** builder stops its BuildKit container; a **kubernetes** builder stops the BuildKit pods; a **remote** builder disconnects from the daemon. The builder instance itself remains registered and still appears in **docker buildx ls**.

Stopping is not permanent. The next **docker buildx build** (or **docker buildx inspect --bootstrap**) starts the builder again. Use **docker buildx rm** when you want to delete the instance and its resources.

# CAVEATS

Stop does not block later builds from restarting the same builder. The default **docker** driver uses the Docker daemon's built-in builder, so stop typically has no lasting effect there. Driver-specific stop behavior is not configurable from this command.

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

[docker-buildx-ls](/man/docker-buildx-ls)(1), [docker-buildx-rm](/man/docker-buildx-rm)(1), [docker-buildx-inspect](/man/docker-buildx-inspect)(1), [docker](/man/docker)(1)

# RESOURCES

```[Source code](https://github.com/docker/buildx)```

```[Documentation](https://docs.docker.com/reference/cli/docker/buildx/stop/)```

<!-- verified: 2026-09-02 -->
