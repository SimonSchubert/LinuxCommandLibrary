# TAGLINE

Remove Docker Buildx build cache

# TLDR

**Prune all build cache** with confirmation prompt

```docker buildx prune```

**Force prune** without confirmation

```docker buildx prune -f```

**Prune all cache** including internal and frontend images

```docker buildx prune --all```

**Prune cache** older than 24 hours

```docker buildx prune --filter until=[24h]```

**Prune cache** and keep at most 2 GB

```docker buildx prune --max-used-space [2gb]```

**Prune cache** ensuring at least 10 GB free disk space

```docker buildx prune --min-free-space [10gb]```

# SYNOPSIS

**docker buildx prune** [_options_]

# PARAMETERS

**-a**, **--all**
> Remove all cache including internal and frontend images.

**-f**, **--force**
> Skip the confirmation prompt.

**--filter** _key=value_
> Filter cache records to prune (e.g., until=24h, type, inuse, shared).

**--max-used-space** _size_
> Maximum total disk space for the cache (e.g., 2gb, 512mb).

**--min-free-space** _size_
> Target amount of free disk space after pruning.

**--reserved-space** _size_
> Minimum disk space permanently reserved for cache.

**--timeout** _duration_
> Override default timeout for loading builder status (default: 20s).

**--verbose**
> Show detailed output.

# DESCRIPTION

**docker buildx prune** clears the build cache of the currently selected builder instance. By default it removes only reclaimable cache entries, prompting for confirmation. With **--all**, it also removes internal and frontend images.

The space management flags (**--max-used-space**, **--min-free-space**, **--reserved-space**) allow fine-grained control over disk usage. The **--filter** flag supports selectors like **until**, **id**, **type**, **inuse**, **mutable**, **shared**, and **private**, combined with AND logic.

# CAVEATS

Without **--all**, internal images and frontend cache are preserved. Space flags accept human-readable values (e.g., 128mb, 2gb). When multiple space flags are specified, all constraints are honored simultaneously.

# SEE ALSO

[docker-buildx-du](/man/docker-buildx-du)(1), [docker-buildx-rm](/man/docker-buildx-rm)(1), [docker-build](/man/docker-build)(1), [docker](/man/docker)(1)
