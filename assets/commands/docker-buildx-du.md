# TAGLINE

Show disk usage of Docker build cache

# TLDR

**Show build cache** disk usage

```docker buildx du```

**Show detailed** disk usage with all metadata

```docker buildx du --verbose```

**Show disk usage** for a specific builder

```docker buildx du --builder [builder_name]```

**Filter** cache records by age

```docker buildx du --filter until=[24h]```

**Filter** cache records by type

```docker buildx du --filter type=[regular]```

# SYNOPSIS

**docker buildx du** [_options_]

# PARAMETERS

**--filter** _key=value_
> Filter output using key-value selectors (e.g., `until=24h`, `type=...`).

**--verbose**
> Show detailed output with additional metadata.

**--builder** _name_
> Target a specific builder instance (overrides the default).

# DESCRIPTION

**docker buildx du** displays disk usage information for the build cache of the currently selected (or specified) builder instance. The output lists cache records with their IDs, whether they are reclaimable, their size, and when they were last accessed.

This command is useful for understanding how much disk space the build cache consumes before deciding to prune it with **docker buildx prune**.

# CAVEATS

Asterisks in the output indicate mutable records (size may change) or shared storage that overlaps with other resources. The reported sizes may not reflect actual reclaimable space when records are shared between builds.

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

[docker-buildx-prune](/man/docker-buildx-prune)(1), [docker-buildx-ls](/man/docker-buildx-ls)(1), [docker-build](/man/docker-build)(1), [docker](/man/docker)(1)
