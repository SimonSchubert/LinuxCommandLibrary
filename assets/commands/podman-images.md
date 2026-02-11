# TAGLINE

List locally stored container images

# TLDR

**List all images**

```podman images```

**List with digests**

```podman images --digests```

**Filter images**

```podman images --filter [reference=nginx*]```

**Show image IDs only**

```podman images -q```

**Show all including intermediate**

```podman images -a```

# SYNOPSIS

**podman images** [_options_] [_repository_[:_tag_]]

# PARAMETERS

**-a**, **--all**
> Show all images.

**-q**, **--quiet**
> Only show IDs.

**--digests**
> Show digests.

**--filter**, **-f** _filter_
> Filter output.

**--format** _format_
> Go template format.

**--no-trunc**
> Don't truncate output.

**--sort** _field_
> Sort by field.

# DESCRIPTION

**podman images** lists container images stored locally. It shows repository, tag, image ID, creation date, and size for each image.

# EXAMPLES

```bash
# List all images
podman images

# With full IDs
podman images --no-trunc

# Filter dangling images
podman images --filter dangling=true

# Custom format
podman images --format "{{.Repository}}:{{.Tag}} {{.Size}}"

# Filter by label
podman images --filter label=maintainer=me

# Sort by size
podman images --sort size
```

# FILTERS

```
dangling=true      - Untagged images
reference=name     - Match reference
before=image       - Created before
since=image        - Created after
label=key=value    - Has label
```

# CAVEATS

Size shown may be shared between images. Use --all to see intermediate layers.

# HISTORY

podman images is part of **Podman** by **Red Hat**, providing Docker-compatible image listing.

# SEE ALSO

[podman-pull](/man/podman-pull)(1), [podman-rmi](/man/podman-rmi)(1), [podman-image](/man/podman-image)(1)
