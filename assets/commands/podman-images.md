# TAGLINE

List locally stored container images

# TLDR

**List all images**

```podman images```

**List with digests**

```podman images --digests```

**Filter images** by reference

```podman images --filter reference=[nginx*]```

**Show image IDs only**

```podman images -q```

**Show all images** including intermediate layers

```podman images -a```

**Custom output format**

```podman images --format "{{.Repository}}:{{.Tag}} {{.Size}}"```

**List dangling** (untagged) images

```podman images --filter dangling=true```

# SYNOPSIS

**podman images** [_options_] [_repository_[:_tag_]]

# PARAMETERS

**-a**, **--all**
> Show all images including intermediate image layers.

**--digests**
> Show image digests.

**-f**, **--filter** _filter_
> Filter output based on conditions (key=value or key!=value).

**--format** _format_
> Change output format using Go templates or 'json'.

**--history**
> Display the history of image names (useful when images are re-tagged or untagged).

**-n**, **--noheading**
> Omit the table header from the output.

**--no-trunc**
> Do not truncate output (show full image IDs).

**-q**, **--quiet**
> Only display image IDs.

**--sort** _field_
> Sort by: created, id, repository, size, or tag (default: created).

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
dangling=true        - Untagged images (<none> tag)
reference=name:tag   - Match image reference pattern
before=image         - Created before specified image
since=image          - Created after specified image
label=key=value      - Has label (also supports label!=key)
id=image_id          - Match image ID
containers=true      - Images with running containers
intermediate=true    - Intermediate build layers
readonly=true        - Read-only images
```

# CAVEATS

Size shown may be shared between images. Use --all to see intermediate layers.

# HISTORY

podman images is part of **Podman** by **Red Hat**, providing Docker-compatible image listing.

# SEE ALSO

[podman-pull](/man/podman-pull)(1), [podman-rmi](/man/podman-rmi)(1), [podman-image](/man/podman-image)(1), [podman-build](/man/podman-build)(1), [podman-ps](/man/podman-ps)(1), [docker-images](/man/docker-images)(1)
