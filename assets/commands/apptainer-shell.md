# TAGLINE

Open an interactive shell inside a container

# TLDR

**Start an interactive shell** inside a container

```apptainer shell [container.sif]```

**Open shell with bound directory**

```apptainer shell --bind [/host/path]:[/container/path] [container.sif]```

**Shell into a Docker Hub image**

```apptainer shell docker://[ubuntu:latest]```

**Start shell with NVIDIA GPU support**

```apptainer shell --nv [container.sif]```

**Open shell with clean environment**

```apptainer shell --cleanenv [container.sif]```

**Shell with full containment** (isolated from host)

```apptainer shell --containall [container.sif]```

**Start shell with writable overlay**

```apptainer shell --overlay [overlay.img] [container.sif]```

**Shell with fakeroot privileges**

```apptainer shell --fakeroot [container.sif]```

# SYNOPSIS

**apptainer shell** [_options_] _container_

# PARAMETERS

**--bind**, **-B** _src[:dest[:opts]]_
> Bind mount a host path into the container.

**--overlay**, **-o** _image_
> Use an overlay image for a writable layer.

**--writable**, **-w**
> Make the container filesystem read-write (default is read-only).

**--writable-tmpfs**
> Add a writable tmpfs overlay; changes are discarded on exit.

**--nv**
> Enable NVIDIA GPU support.

**--rocm**
> Enable AMD ROCm GPU support.

**--contain**, **-c**
> Use minimal /dev and empty other directories.

**--containall**, **-C**
> Full containment of filesystems, PID, IPC, and environment.

**--cleanenv**, **-e**
> Clean environment before starting shell.

**--env** _VAR=value_
> Set an environment variable in the container.

**--home**, **-H** _path_
> Set a custom home directory.

**--pwd** _path_
> Initial working directory in the container.

**--fakeroot**, **-f**
> Run with apparent root privileges without host root.

**--net**, **-n**
> Run in a new network namespace.

**--shell**, **-s** _path_
> Specify the shell to use (default: /bin/sh).

**--no-home**
> Do not bind the home directory.

# DESCRIPTION

**apptainer shell** starts an interactive shell session inside an Apptainer container. This provides a command-line environment within the container for exploration, debugging, and interactive work.

By default, the shell inherits your user identity, home directory, and current working directory. The host environment is largely preserved unless containment options are used. This makes the shell feel familiar while providing access to the container's filesystem and installed software.

The container can be specified as a local SIF file, a Docker reference (docker://), a library reference (library://), or an OCI archive. The default shell is **/bin/sh** but can be overridden with the **--shell** option if the container has other shells available.

For development work, combine **--overlay** or **--writable-tmpfs** to allow temporary modifications within the container. Use **--fakeroot** when operations require apparent root privileges without actual host root access.

# CAVEATS

Shell availability depends on what's installed in the container. Some minimal containers may only have /bin/sh. Environment leakage from host to container can cause unexpected behavior; use **--cleanenv** for reproducibility. Changes made during shell session are lost unless using writable overlays or bind mounts.

# HISTORY

The shell command has been a core Singularity/Apptainer feature since the project's creation at Lawrence Berkeley National Laboratory in **2015**. It was designed to give users familiar interactive access to containers, supporting the HPC use case where users need to test and debug within container environments. Apptainer maintained full compatibility with this command when forking from Singularity in **2021**.

# SEE ALSO

[apptainer](/man/apptainer)(1), [apptainer-exec](/man/apptainer-exec)(1), [apptainer-run](/man/apptainer-run)(1), [apptainer-build](/man/apptainer-build)(1)

# RESOURCES

```[Source code](https://github.com/apptainer/apptainer)```

```[Homepage](https://apptainer.org)```

```[Documentation](https://apptainer.org/docs/)```

<!-- verified: 2026-06-11 -->
