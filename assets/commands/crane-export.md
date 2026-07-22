# TAGLINE

export flattened image filesystem

# TLDR

**Export image filesystem** to tarball

```crane export [image] [output.tar]```

**Export to stdout**

```crane export [image] - | tar -tvf -```

# SYNOPSIS

**crane** **export** [_options_] _image_ _output_

# DESCRIPTION

**crane export** exports the filesystem of a container image to a tarball. This flattens all layers into a single archive representing the final filesystem state.

Use **-** as output to write to stdout.

# INSTALL

```pacman: sudo pacman -S crane```

```apk: sudo apk add crane```

```zypper: sudo zypper install crane```

```brew: brew install crane```

```nix: nix profile install nixpkgs#crane```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[crane](/man/crane)(1), [crane-pull](/man/crane-pull)(1)

# RESOURCES

```[Source code](https://github.com/google/go-containerregistry)```

```[Documentation](https://github.com/google/go-containerregistry/blob/main/cmd/crane/doc/crane_export.md)```

<!-- verified: 2026-06-26 -->
