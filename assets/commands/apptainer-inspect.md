# TAGLINE

Display metadata from container images.

# TLDR

Show an image's **labels**, which is the default

```apptainer inspect [path/to/image.sif]```

Show the **definition file** it was built from

```apptainer inspect --deffile [path/to/image.sif]```

Show the **runscript** that `apptainer run` executes

```apptainer inspect --runscript [path/to/image.sif]```

Show the **startscript** that instances use

```apptainer inspect --startscript [path/to/image.sif]```

Show the **environment** baked into the image

```apptainer inspect --environment [path/to/image.sif]```

Show the definition's **%test section**

```apptainer inspect --test [path/to/image.sif]```

Show the **help text** the author shipped

```apptainer inspect --helpfile [path/to/image.sif]```

**List the apps** the image provides

```apptainer inspect --list-apps [path/to/image.sif]```

Inspect **one app** rather than the image as a whole

```apptainer inspect --app [app_name] --runscript [path/to/image.sif]```

Dump **everything** the image records

```apptainer inspect --all [path/to/image.sif]```

Emit **JSON** for a script to parse

```apptainer inspect --json --labels [path/to/image.sif]```

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

# INSTALL

```dnf: sudo dnf install apptainer```

```pacman: sudo pacman -S apptainer```

```apk: sudo apk add apptainer```

```zypper: sudo zypper install apptainer```

```brew: brew install apptainer```

```nix: nix profile install nixpkgs#apptainer```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[apptainer](/man/apptainer)(1), [apptainer-build](/man/apptainer-build)(1), [apptainer-run](/man/apptainer-run)(1), [apptainer-exec](/man/apptainer-exec)(1)
