# TAGLINE

Build, run, and manage application containers for HPC

# TLDR

Fetch an image from a registry

```apptainer pull docker://[ubuntu]:[22.04]```

Run the image's **default action**

```apptainer run [path/to/image.sif]```

Run **one command** inside the image

```apptainer exec [path/to/image.sif] [python3] [script.py]```

Get an **interactive shell** in the image

```apptainer shell [path/to/image.sif]```

**Mount a host directory** so the job can reach your data

```apptainer exec --bind [/data]:[/mnt] [path/to/image.sif] [command]```

Expose the host's **GPUs** to the container

```apptainer exec --nv [path/to/image.sif] [command]```

**Isolate** the container from the host environment and filesystem

```apptainer exec --cleanenv --containall [path/to/image.sif] [command]```

**Build** an image from a definition file

```apptainer build [path/to/image.sif] [path/to/definition.def]```

Show an image's **labels and metadata**

```apptainer inspect [path/to/image.sif]```

Run an image as a **background service**

```apptainer instance start [path/to/image.sif] [name]```

List the **running instances**

```apptainer instance list```

**Stop** a running instance

```apptainer instance stop [name]```

**Verify** an image's signature

```apptainer verify [path/to/image.sif]```

Reclaim the space used by the **download cache**

```apptainer cache clean```

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
> Manage containers running as background services

**cache**
> Manage the local image cache

**overlay**
> Manage an EXT3 writable overlay image

**key**
> Manage OpenPGP keys used for signing and verification

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

# INSTALL

```dnf: sudo dnf install apptainer```

```pacman: sudo pacman -S apptainer```

```apk: sudo apk add apptainer```

```zypper: sudo zypper install apptainer```

```brew: brew install apptainer```

```nix: nix profile install nixpkgs#apptainer```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[singularity](/man/singularity)(1), [docker](/man/docker)(1), [podman](/man/podman)(1), [buildah](/man/buildah)(1)

# RESOURCES

```[Source code](https://github.com/apptainer/apptainer)```

```[Homepage](https://apptainer.org)```

```[Documentation](https://apptainer.org/docs/)```

<!-- verified: 2026-06-11 -->
