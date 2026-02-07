# TAGLINE

Display metadata from container images.

# TLDR

Show the **labels** of an image (default)

```apptainer inspect [path/to/image.sif]```

Show the **definition file** used to build the image

```apptainer inspect -d [path/to/image.sif]```

Show the **runscript** for the image

```apptainer inspect -r [path/to/image.sif]```

Show the **environment variables** of the image

```apptainer inspect -e [path/to/image.sif]```

**List all apps** in the container

```apptainer inspect --list-apps [path/to/image.sif]```

Show **all available data** in JSON format

```apptainer inspect --all [path/to/image.sif]```

# SYNOPSIS

**apptainer inspect** [_options_] _image.sif_

# DESCRIPTION

**apptainer inspect** displays metadata embedded in Apptainer container images. This includes labels, the definition file used to build the container, runscripts, environment settings, and information about bundled apps.

The metadata provides valuable information for understanding container provenance, reproducibility, and intended usage.

# PARAMETERS

**-d, --deffile**
> Display the definition file used to build the container

**-r, --runscript**
> Display the container's runscript

**-e, --environment**
> Display environment variables set in the container

**--list-apps**
> List all SCIF apps installed in the container

**--all**
> Display all available metadata

**-j, --json**
> Output results in JSON format

# SEE ALSO

[apptainer](/man/apptainer)(1), [apptainer-build](/man/apptainer-build)(1)
