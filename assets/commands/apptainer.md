# TAGLINE

Build, run, and manage application containers for HPC

# TLDR

**Download a container** from Docker Hub

```apptainer pull [path/to/image.sif] docker://[image]:[tag]```

**Download a container** from the Container Library

```apptainer pull [path/to/image.sif] library://[user/collection/container]:[tag]```

**Build a container** from a definition file

```apptainer build [path/to/image.sif] [path/to/definition.def]```

Start an **interactive shell** inside a container

```apptainer shell [path/to/image.sif]```

**Execute a command** inside a container

```apptainer exec [path/to/image.sif] [command]```

**Run the default runscript** of a container

```apptainer run [path/to/image.sif]```

**Inspect** a container's metadata

```apptainer inspect [path/to/image.sif]```

# SYNOPSIS

**apptainer** [_global options_] _command_ [_command options_]

# DESCRIPTION

**Apptainer** is a container platform designed for High Performance Computing (HPC), scientific computing, and AI/ML workloads. Unlike Docker, it runs containers without requiring root privileges and integrates seamlessly with existing HPC schedulers like Slurm, PBS, and SGE.

Containers are stored as single **SIF** (Singularity Image Format) files, making them highly portable. Apptainer supports pulling containers from Docker Hub, OCI registries, and the Sylabs Container Library.

Key features include GPU and MPI support, cryptographic container signing, overlay filesystems for persistent storage, and OCI runtime compatibility.

# SUBCOMMANDS

**build**
> Build a container from a definition file or base image

**exec**
> Execute a command within a container

**run**
> Run the container's default runscript

**shell**
> Start an interactive shell in the container

**pull**
> Download a container image from a registry

**push**
> Upload a container to a registry

**inspect**
> Display container metadata

**instance**
> Manage running container instances

**sign**
> Cryptographically sign a container

**verify**
> Verify a container's cryptographic signature

# CONFIGURATION

**/etc/apptainer/apptainer.conf**
> System-wide configuration controlling security options, bind paths, mount behavior, and resource limits.

**~/.apptainer/**
> Per-user directory for cached images, keys, and remote endpoint configurations.

# CAVEATS

SIF files require significant disk space and are immutable once built. Modifications require rebuilding or using overlay filesystems. Some Docker containers may not work perfectly due to differences in how user namespaces and permissions are handled.

# HISTORY

Apptainer originated as **Singularity**, created in **2015** by Gregory Kurtzer at Lawrence Berkeley National Laboratory. In **2021**, the Linux Foundation adopted the project and rebranded it as Apptainer to ensure vendor-neutral governance. The project has become the de facto standard for container computing in HPC environments.

# SEE ALSO

[docker](/man/docker)(1), [podman](/man/podman)(1), [buildah](/man/buildah)(1)
