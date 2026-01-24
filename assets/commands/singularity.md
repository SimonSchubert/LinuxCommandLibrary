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

**singularity** runs containers. It's designed for HPC.

No daemon required. Simple execution model.

Runs as user. No root needed to run.

Host integration. Shares filesystems.

Reproducible science. Portable environments.

# CAVEATS

Different from Docker. HPC focused. Root needed to build.

# HISTORY

**Singularity** was created at **Lawrence Berkeley Lab** for running containers in HPC environments without privileged access.

# SEE ALSO

[docker](/man/docker)(1), [podman](/man/podman)(1), [apptainer](/man/apptainer)(1)
