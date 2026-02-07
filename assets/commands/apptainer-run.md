# TAGLINE

Execute the default runscript of a container.

# TLDR

**Run the default action** of a container

```apptainer run [container.sif]```

**Run a container** with arguments passed to the runscript

```apptainer run [container.sif] [arg1] [arg2]```

**Run from Docker Hub** with bound directories

```apptainer run --bind [/data]:[/mnt/data] docker://[python:3.11] [script.py]```

**Run with NVIDIA GPU support**

```apptainer run --nv [container.sif]```

**Run with isolated environment**

```apptainer run --containall [container.sif]```

**Run with writable overlay**

```apptainer run --overlay [overlay.img] [container.sif]```

**Run as fakeroot** for root-like operations

```apptainer run --fakeroot [container.sif]```

**Run with custom environment variables**

```apptainer run --env [KEY=value] [container.sif]```

# SYNOPSIS

**apptainer run** [_options_] _container_ [_args_]

# PARAMETERS

**--bind**, **-B** _src[:dest[:opts]]_
> Bind mount a host path into the container.

**--overlay** _image_
> Use an overlay image for a writable layer.

**--nv**
> Enable NVIDIA GPU support.

**--rocm**
> Enable AMD ROCm GPU support.

**--contain**, **-c**
> Use minimal /dev and empty home/tmp directories.

**--containall**, **-C**
> Full containment with clean environment.

**--cleanenv**, **-e**
> Clean environment before running.

**--env** _VAR=value_
> Set environment variable.

**--home** _path_
> Specify custom home directory.

**--pwd** _path_
> Set working directory inside container.

**--fakeroot**
> Run with fake root privileges.

**--net**
> Enable network namespace.

**--writable-tmpfs**
> Add writable tmpfs overlay.

**--app** _name_
> Run a specific SCIF app within the container.

**--no-home**
> Do not bind the home directory.

# DESCRIPTION

**apptainer run** executes the default runscript of an Apptainer container. The runscript is defined in the container's **%runscript** section during build and typically contains the container's primary function or entrypoint.

This differs from **apptainer exec** which runs an arbitrary command. When you run a container, Apptainer invokes the runscript as if it were a regular executable, passing any additional command-line arguments to it.

Containers can be specified as local SIF files, Docker references (docker://), library references (library://), or OCI archives. If the container has no runscript defined, the command will execute a shell.

The run command supports SCIF (Scientific Filesystem) apps via the **--app** flag, allowing containers to bundle multiple applications with separate entry points. Standard bind mounts, environment variables, and GPU support work identically to other Apptainer commands.

# CONFIGURATION

**/etc/apptainer/apptainer.conf**
> Main configuration file controlling default bind paths, security options, GPU support, and namespace settings.

# CAVEATS

The container must have a runscript defined for predictable behavior. Arguments after the container path are passed to the runscript, not Apptainer. Use **--** to separate Apptainer options from runscript arguments if needed. GPU support requires appropriate drivers and container configuration.

# HISTORY

The run command has been central to Singularity/Apptainer since the project began at Lawrence Berkeley National Laboratory in **2015**. It was designed to make containers behave like executables, simplifying integration into HPC workflows. Apptainer inherited this functionality when the project transitioned from Singularity under the Linux Foundation in **2021**.

# SEE ALSO

[apptainer](/man/apptainer)(1), [apptainer-exec](/man/apptainer-exec)(1), [apptainer-shell](/man/apptainer-shell)(1), [apptainer-run-help](/man/apptainer-run-help)(1), [apptainer-build](/man/apptainer-build)(1)
