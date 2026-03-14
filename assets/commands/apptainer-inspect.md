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

Show the **startscript** for the image

```apptainer inspect -s [path/to/image.sif]```

Inspect a **specific app** within the container

```apptainer inspect --app [app_name] [path/to/image.sif]```

**List all apps** in the container

```apptainer inspect --list-apps [path/to/image.sif]```

Show **all available data** in JSON format

```apptainer inspect --all [path/to/image.sif]```

# SYNOPSIS

**apptainer inspect** [_inspect options..._] _image_path_

# DESCRIPTION

**apptainer inspect** displays metadata embedded in Apptainer container images. This includes labels, the definition file used to build the container, runscripts, environment settings, and information about bundled apps.

The metadata provides valuable information for understanding container provenance, reproducibility, and intended usage.

# PARAMETERS

**-l, --labels**
> Show the labels for the image (default behavior)

**-d, --deffile**
> Display the definition file used to build the container

**-r, --runscript**
> Display the container's runscript

**-s, --startscript**
> Display the startscript for the image

**-t, --test**
> Display the test script for the image

**-e, --environment**
> Display environment variables set in the container

**-H, --helpfile**
> Display the runscript helpfile, if it exists

**--app** _name_
> Inspect a specific SCIF application within the container

**--list-apps**
> List all SCIF apps installed in the container

**--all**
> Display all available metadata (implies --json)

**-j, --json**
> Output results in JSON format

# SEE ALSO

[apptainer](/man/apptainer)(1), [apptainer-build](/man/apptainer-build)(1), [apptainer-run](/man/apptainer-run)(1), [apptainer-exec](/man/apptainer-exec)(1)
