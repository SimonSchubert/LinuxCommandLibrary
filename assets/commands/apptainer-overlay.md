# TLDR

**Add a writable overlay** to an existing SIF image

```apptainer overlay create -s [size] [path/to/image.sif]```

Create a **standalone EXT3** writable overlay image

```apptainer overlay create -s [size] [path/to/overlay.img]```

Create a **sparse overlay** image

```apptainer overlay create -s [size] -S [path/to/overlay.img]```

Create an overlay for use with **fakeroot**

```apptainer overlay create -f -s [size] [path/to/overlay.img]```

Create an overlay with a **specific directory** in the layout

```apptainer overlay create --create-dir [path/to/directory] [path/to/overlay.img]```

# SYNOPSIS

**apptainer overlay create** [_options_] _image_

# DESCRIPTION

**apptainer overlay** manages EXT3 writable overlay filesystems for Apptainer containers. Overlays allow persistent writes on top of immutable SIF container images without modifying the original image.

Overlays can be embedded directly into a SIF file or created as standalone image files that are attached at runtime. This enables persistent storage of modifications, logs, and user data while maintaining container immutability.

# PARAMETERS

**-s, --size** _size_
> Size of the overlay image in MiB

**-S, --sparse**
> Create a sparse file instead of allocating full disk space

**-f, --fakeroot**
> Create overlay for use with fakeroot

**--create-dir** _path_
> Create a specific directory in the overlay layout

# CAVEATS

Overlays require filesystem support for loop devices and EXT3. Sparse overlays save disk space but may cause performance issues with some workloads. Overlay size cannot be easily changed after creation.

# SEE ALSO

[apptainer](/man/apptainer)(1), [apptainer-build](/man/apptainer-build)(1)
