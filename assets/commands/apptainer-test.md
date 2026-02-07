# TAGLINE

Run validation tests defined in a container

# TLDR

**Run the test script** of a container

```apptainer test [container.sif]```

**Test a Docker Hub image**

```apptainer test docker://[image:tag]```

**Test a specific app** within the container

```apptainer test --app [appname] [container.sif]```

**Test with bound directory**

```apptainer test --bind [/data]:[/mnt] [container.sif]```

**Test with NVIDIA GPU support**

```apptainer test --nv [container.sif]```

# SYNOPSIS

**apptainer test** [_options_] _container_

# PARAMETERS

**--app** _name_
> Run the test section of a specific SCIF app.

**--bind**, **-B** _src[:dest[:opts]]_
> Bind mount a host path into the container.

**--nv**
> Enable NVIDIA GPU support.

**--rocm**
> Enable AMD ROCm GPU support.

**--contain**, **-c**
> Use minimal /dev and empty other directories.

**--containall**, **-C**
> Full containment mode.

**--cleanenv**, **-e**
> Clean environment before testing.

**--fakeroot**
> Run test with fake root privileges.

**--pwd** _path_
> Set working directory inside container.

**--help**, **-h**
> Display help for the test command.

# DESCRIPTION

**apptainer test** executes the test script defined in a container's **%test** section. This provides a standardized way for container authors to include validation checks that verify the container is functioning correctly.

Test scripts typically check that required software is installed, libraries are accessible, and the container can perform its intended function. The exit code of the test script determines pass (0) or fail (non-zero) status.

For containers using the Scientific Filesystem (SCIF), the **--app** flag runs the test section of a specific application within the container. This allows multi-app containers to have independent test suites.

Container authors define tests during build time. If no %test section exists, the command completes successfully without executing anything. This command is useful in CI/CD pipelines to validate container builds before deployment.

# CAVEATS

Only runs tests if a %test section was defined during container build. Returns success even if no test exists (silent pass). Test scripts have the same environment constraints as the container runtime. Complex tests may require bind mounts or GPU flags to function properly.

# HISTORY

The test subcommand has been part of Singularity/Apptainer since early versions, providing container authors a standardized way to validate their builds. It supports the reproducibility goals of scientific computing by ensuring containers meet expected functionality. Apptainer preserved this feature when the project forked from Singularity in **2021**.

# SEE ALSO

[apptainer](/man/apptainer)(1), [apptainer-build](/man/apptainer-build)(1), [apptainer-run](/man/apptainer-run)(1), [apptainer-inspect](/man/apptainer-inspect)(1)
