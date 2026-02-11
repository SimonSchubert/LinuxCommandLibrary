# TAGLINE

HPC container runtime without root privileges

# TLDR

**Run container**

```singularity run [container.sif]```

**Execute command**

```singularity exec [container.sif] [command]```

**Shell into container**

```singularity shell [container.sif]```

**Build from definition**

```singularity build [output.sif] [definition.def]```

**Pull from registry**

```singularity pull [docker://ubuntu:latest]```

**Build sandbox**

```singularity build --sandbox [directory] [docker://ubuntu]```

# SYNOPSIS

**singularity** _command_ [_options_] _container_ [_args_]

# PARAMETERS

**run**
> Run container.

**exec**
> Execute command.

**shell**
> Interactive shell.

**build**
> Build container.

**pull**
> Download image.

**--sandbox**
> Writable directory.

**--fakeroot**
> Rootless build.

# DESCRIPTION

**Singularity** (now **Apptainer**) is a container runtime designed for high-performance computing (HPC) environments where Docker's root-privilege model is not practical. Containers run as the invoking user without requiring a daemon or elevated privileges, making it safe for shared multi-tenant clusters.

Unlike Docker, Singularity integrates tightly with the host system by default, sharing the user's home directory, network, and other filesystems. This makes it straightforward to use existing data and tools inside containers. Images are stored as single SIF files that are portable and can be built from Docker images, definition files, or pulled directly from registries.

The tool enables reproducible science by packaging complete software environments into immutable containers that produce consistent results across different computing systems.

# CAVEATS

Different from Docker. HPC focused. Root needed to build.

# HISTORY

**Singularity** was created at **Lawrence Berkeley Lab** for running containers in HPC environments without privileged access.

# SEE ALSO

[docker](/man/docker)(1), [podman](/man/podman)(1), [apptainer](/man/apptainer)(1)
