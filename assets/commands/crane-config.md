# TAGLINE

retrieve container image configuration

# TLDR

**Get image configuration**

```crane config [image]```

**Get config as JSON**

```crane config [image] | jq .```

# SYNOPSIS

**crane** **config** [_options_] _image_

# PARAMETERS

_image_
> Container image reference (e.g., `ubuntu:latest`, `ghcr.io/org/image:tag`).

**--platform** _os/arch_
> Specify platform for multi-arch images (e.g., `linux/amd64`).

# DESCRIPTION

**crane config** retrieves the configuration blob for a container image. This includes environment variables, entrypoint, command, working directory, labels, exposed ports, and other image metadata defined in the OCI image specification.

Output is in JSON format, making it easy to pipe to **jq** for field extraction.

# CAVEATS

Requires network access to the container registry. Private registries require authentication via `crane auth login`. Multi-arch images return the config for the host platform unless `--platform` is specified.

# SEE ALSO

[crane](/man/crane)(1), [crane-manifest](/man/crane-manifest)(1)
