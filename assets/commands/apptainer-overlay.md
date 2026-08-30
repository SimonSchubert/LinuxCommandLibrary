# TAGLINE

Create and manage writable overlay filesystems for containers.

# TLDR

Attach a **writable layer inside an existing SIF**, so the image can be changed

```apptainer overlay create --size [500] [path/to/image.sif]```

Build a **standalone overlay file** that several images can share

```apptainer overlay create --size [1024] [path/to/overlay.img]```

Allocate it **sparsely**, taking disk space only as it fills

```apptainer overlay create --size [1024] --sparse [path/to/overlay.img]```

Lay it out for **unprivileged fakeroot** use

```apptainer overlay create --fakeroot --size [1024] [path/to/overlay.img]```

**Pre-create a directory** inside the overlay

```apptainer overlay create --create-dir [/data] --size [1024] [path/to/overlay.img]```

**Run a container against** an overlay file

```apptainer run --overlay [path/to/overlay.img] [path/to/image.sif]```

# SYNOPSIS

**apptainer overlay create** [_options_] _image_

# DESCRIPTION

**apptainer overlay** manages EXT3 writable overlay filesystems for Apptainer containers. Overlays allow persistent writes on top of immutable SIF container images without modifying the original image.

Overlays can be embedded directly into a SIF file or created as standalone image files that are attached at runtime. This enables persistent storage of modifications, logs, and user data while maintaining container immutability.

# PARAMETERS

**-s, --size** _size_
> Size of the EXT3 writable overlay in MiB (default: 64).

**-S, --sparse**
> Create a sparse file instead of allocating full disk space.

**-f, --fakeroot**
> Make the overlay layout usable by actions run with --fakeroot.

**--create-dir** _path_
> Directory to create as part of the overlay layout (can be repeated).

# CAVEATS

Overlays require filesystem support for loop devices and EXT3. Sparse overlays save disk space but may cause performance issues with some workloads. Overlay size cannot be easily changed after creation.

# INSTALL

```dnf: sudo dnf install apptainer```

```pacman: sudo pacman -S apptainer```

```apk: sudo apk add apptainer```

```zypper: sudo zypper install apptainer```

```brew: brew install apptainer```

```nix: nix profile install nixpkgs#apptainer```

<!-- packages: 2026-07-22 -->
# SEE ALSO

[apptainer](/man/apptainer)(1), [apptainer-build](/man/apptainer-build)(1), [apptainer-run](/man/apptainer-run)(1), [apptainer-shell](/man/apptainer-shell)(1), [apptainer-exec](/man/apptainer-exec)(1)

# RESOURCES

```[Source code](https://github.com/apptainer/apptainer)```

```[Homepage](https://apptainer.org)```

```[Documentation](https://apptainer.org/docs/)```

<!-- verified: 2026-06-11 -->
