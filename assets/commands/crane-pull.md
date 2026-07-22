# TAGLINE

download container image as tarball

# TLDR

**Pull image** to tarball

```crane pull [image:tag] [output.tar]```

**Pull specific platform**

```crane pull --platform [linux/amd64] [image:tag] [output.tar]```

# SYNOPSIS

**crane** **pull** [_options_] _image_ _output_

# PARAMETERS

**--platform** _platform_
> Pull specific platform.

**--format** _format_
> Output format (tarball or legacy).

# DESCRIPTION

**crane pull** downloads a container image and saves it as a tarball. The tarball can be loaded into Docker with **docker load**.

# INSTALL

```pacman: sudo pacman -S crane```

```apk: sudo apk add crane```

```zypper: sudo zypper install crane```

```brew: brew install crane```

```nix: nix profile install nixpkgs#crane```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[crane](/man/crane)(1), [crane-push](/man/crane-push)(1), [crane-export](/man/crane-export)(1)

# RESOURCES

```[Source code](https://github.com/google/go-containerregistry)```

```[Documentation](https://github.com/google/go-containerregistry/blob/main/cmd/crane/doc/crane_pull.md)```

<!-- verified: 2026-06-26 -->
