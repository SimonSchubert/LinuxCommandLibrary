# TAGLINE

Execute a command within an Apptainer container.

# TLDR

**Execute a command** inside a container

```apptainer exec [container.sif] [command]```

**Run with bound directory** from host to container

```apptainer exec --bind [/host/path]:[/container/path] [container.sif] [command]```

**Execute with writable overlay**

```apptainer exec --overlay [overlay.img] [container.sif] [command]```

**Run with GPU support** (NVIDIA)

```apptainer exec --nv [container.sif] [command]```

**Execute from Docker Hub** image

```apptainer exec docker://[image:tag] [command]```

**Run with isolated network**

```apptainer exec --net --network none [container.sif] [command]```

**Execute with custom environment variable**

```apptainer exec --env [VAR=value] [container.sif] [command]```

**Run in a writable sandbox directory**

```apptainer exec --writable [sandbox/] [command]```

# SYNOPSIS

**apptainer exec** [_options_] _container_ _command_ [_args_]

# PARAMETERS

**--bind**, **-B** _src[:dest[:opts]]_
> Bind mount a path from the host into the container.

**--overlay** _image_
> Use an overlay filesystem for writable layer.

**--nv**
> Enable NVIDIA GPU support inside the container.

**--rocm**
> Enable AMD ROCm GPU support.

**--contain**, **-c**
> Use minimal /dev and empty other directories.

**--containall**, **-C**
> Full isolation: contain filesystems plus new PID and IPC namespaces and clean environment.

**--cleanenv**, **-e**
> Clean environment before running container.

**--env** _VAR=value_
> Set environment variable in container.

**--env-file** _file_
> Load environment variables from file.

**--home** _path_
> Set custom home directory.

**--cwd** _path_
> Set initial working directory in container. (**--pwd** is a deprecated synonym.)

**--net**
> Enable network namespace.

**--network** _type_
> Specify network type (none, bridge, etc.).

**--fakeroot**
> Run container with fake root privileges.

**--writable-tmpfs**
> Add writable tmpfs overlay.

**--no-mount** _type_
> Disable a specific mount point. Valid values: proc, sys, dev, devpts, home, tmp, hostfs, cwd.

**--no-home**
> Do not mount the user's home directory into the container.

**--writable**, **-w**
> Make the container filesystem read-write (requires a writable image or sandbox directory).

**--scratch**, **-S** _dir_
> Include a scratch directory within the container that is linked to a temporary directory on the host.

**--workdir**, **-W** _path_
> Working directory used for /tmp, /var/tmp, and $HOME overrides when using **--contain** or **--scratch**.

**--ipc**, **-i**
> Run container in a new IPC namespace.

**--pid**, **-p**
> Run container in a new PID namespace.

**--userns**, **-u**
> Run container in a new user namespace.

**--uts**
> Run container in a new UTS namespace.

**--no-eval**
> Do not shell-evaluate environment variables or OCI CMD/ENTRYPOINT.

**--fusemount** _spec_
> Mount a FUSE filesystem inside the container using the format: _type:fuse_command container_path_.

# DESCRIPTION

**apptainer exec** runs a specified command inside an Apptainer container. Unlike **apptainer shell** which provides an interactive session, exec runs a single command and returns its exit status, making it ideal for batch processing and scripts.

The container can be specified as a local SIF file, a library URI (library://), a Docker URI (docker://), or an OCI archive. The command and any arguments are executed within the container environment with the current user's identity preserved.

By default, Apptainer mounts the current directory, home directory, and standard system paths into the container. Additional paths can be bound using **--bind**. For HPC workloads, the **--nv** or **--rocm** flags enable GPU passthrough.

The command inherits the host's environment by default. Use **--cleanenv** for reproducibility or **--contain** for isolation. Exit status reflects the executed command's return code.

# CONFIGURATION

**/etc/apptainer/apptainer.conf**
> Main configuration file controlling default bind paths, security options, GPU support, and namespace settings.

# CAVEATS

User namespaces must be enabled in the kernel for rootless operation. Some containers may require **--writable-tmpfs** or **--overlay** to function properly. NVIDIA GPU support requires the nvidia-container-cli and compatible drivers. Network namespace requires root or appropriate privileges unless user namespaces are configured.

# HISTORY

Apptainer is the continuation of the **Singularity** project after it joined the Linux Foundation in **2021**. The exec subcommand has been a core feature since Singularity's inception at Lawrence Berkeley National Laboratory in **2015**. Apptainer 1.0 was released in **2022**, maintaining full compatibility with Singularity container formats while adding new features.

# SEE ALSO

[apptainer](/man/apptainer)(1), [apptainer-shell](/man/apptainer-shell)(1), [apptainer-run](/man/apptainer-run)(1), [apptainer-build](/man/apptainer-build)(1), [apptainer-pull](/man/apptainer-pull)(1), [apptainer-overlay](/man/apptainer-overlay)(1), [docker](/man/docker)(1)
