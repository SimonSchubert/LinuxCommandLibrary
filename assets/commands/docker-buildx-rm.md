# TAGLINE

Remove Docker Buildx builder instances

# TLDR

**Remove a specific** builder instance

```docker buildx rm [builder_name]```

**Remove a builder** without confirmation prompt

```docker buildx rm -f [builder_name]```

**Remove all inactive** builders

```docker buildx rm --all-inactive```

**Remove a builder** but keep the BuildKit daemon running

```docker buildx rm --keep-daemon [builder_name]```

**Remove a builder** but preserve its state for reuse

```docker buildx rm --keep-state [builder_name]```

# SYNOPSIS

**docker buildx rm** [_options_] [_name..._]

# PARAMETERS

**--all-inactive**
> Remove all inactive builder instances.

**-f**, **--force**
> Do not prompt for confirmation.

**--keep-daemon**
> Keep the BuildKit daemon running after removing the builder. Supported by docker-container and kubernetes drivers only.

**--keep-state**
> Preserve BuildKit state so a new builder with the same name can reuse it. Supported by docker-container driver only.

**--timeout** _duration_
> Override default timeout for loading builder status (default: 20s).

# DESCRIPTION

**docker buildx rm** removes the specified builder instance or, if no name is given, the currently selected builder. Removing the **default** builder is a no-op since it uses the Docker daemon's built-in build capabilities.

The command stops the associated BuildKit daemon and cleans up its state by default. Use **--keep-daemon** to leave the daemon running independently, or **--keep-state** to preserve build cache and state for a future builder with the same name.

# CAVEATS

The default builder cannot be removed. The **--keep-daemon** flag only works with docker-container and kubernetes drivers. The **--keep-state** flag only works with the docker-container driver.

# SEE ALSO

[docker-buildx-ls](/man/docker-buildx-ls)(1), [docker-buildx-prune](/man/docker-buildx-prune)(1), [docker-build](/man/docker-build)(1), [docker](/man/docker)(1)
