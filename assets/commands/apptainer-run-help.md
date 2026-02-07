# TAGLINE

Display embedded help text from a container.

# TLDR

**Display the run-help** for a container

```apptainer run-help [container.sif]```

**Show help for a Docker Hub image**

```apptainer run-help docker://[image:tag]```

**Display help from a library image**

```apptainer run-help library://[user/collection/image:tag]```

**Get run-help for an OCI archive**

```apptainer run-help oci-archive://[path/to/archive.tar]```

# SYNOPSIS

**apptainer run-help** [_options_] _container_

# PARAMETERS

_container_
> Path to a SIF file or URI to a container image (docker://, library://, oci-archive://).

**--help**, **-h**
> Display help for the run-help command.

# DESCRIPTION

**apptainer run-help** displays help text embedded within an Apptainer/Singularity container. This help information is defined during container build time using the **%help** section in a definition file.

Container authors use the %help section to document how to use their container, including expected arguments, required bind mounts, environment variables, and example commands. This provides users with container-specific usage information without needing external documentation.

When called on a container without a help section, the command returns with no output. The help text is stored in the container's metadata and does not affect the container's runtime size significantly.

This command is particularly useful in HPC environments where users may encounter unfamiliar containers and need quick usage guidance. It complements **apptainer inspect** which shows technical metadata rather than user-facing documentation.

# CAVEATS

Only displays help if the container author included a %help section during build. Returns nothing (not an error) if no help is defined. Cannot add help to an existing container without rebuilding it.

# HISTORY

The run-help feature has been part of Singularity/Apptainer since early versions, providing a standardized way for container authors to document container usage. The command was retained when Singularity became Apptainer under the Linux Foundation in **2021**.

# SEE ALSO

[apptainer](/man/apptainer)(1), [apptainer-run](/man/apptainer-run)(1), [apptainer-inspect](/man/apptainer-inspect)(1), [apptainer-build](/man/apptainer-build)(1)
