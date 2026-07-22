# TAGLINE

Load container images from tar archives

# TLDR

**Load image from archive**

```podman image load -i [image.tar]```

**Load from stdin**

```cat [image.tar] | podman image load```

**Load with quiet output**

```podman image load -q -i [image.tar]```

# SYNOPSIS

**podman** **image** **load** [_options_]

# PARAMETERS

**-i**, **--input** _file_
> Read from archive file.

**-q**, **--quiet**
> Suppress output.

# DESCRIPTION

**podman image load** loads images from tar archives created by podman save or docker save. Restores images including all layers and metadata. Useful for transferring images between systems.

# INSTALL

```apt: sudo apt install podman```

```dnf: sudo dnf install podman```

```pacman: sudo pacman -S podman```

```apk: sudo apk add podman```

```zypper: sudo zypper install podman```

```brew: brew install podman```

```nix: nix profile install nixpkgs#podman```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[podman](/man/podman)(1), [podman-save](/man/podman-save)(1)

