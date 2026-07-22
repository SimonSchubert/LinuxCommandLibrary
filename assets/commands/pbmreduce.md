# TAGLINE

reduces PBM bitmap size by an integer factor

# TLDR

**Reduce bitmap by factor**

```pbmreduce [4] [input.pbm] > [output.pbm]```

**Reduce with Floyd-Steinberg dithering**

```pbmreduce -floyd [4] [input.pbm] > [output.pbm]```

# SYNOPSIS

**pbmreduce** [_options_] _n_ [_file_]

# PARAMETERS

_n_
> Reduction factor.

**-floyd**
> Use Floyd-Steinberg dithering.

**-threshold**
> Use simple threshold (default).

# DESCRIPTION

**pbmreduce** reduces PBM bitmap size by an integer factor. Can use threshold or dithering for the reduction. Part of Netpbm toolkit.

# INSTALL

```apt: sudo apt install netpbm```

```dnf: sudo dnf install netpbm```

```pacman: sudo pacman -S netpbm```

```apk: sudo apk add netpbm```

```zypper: sudo zypper install netpbm```

```brew: brew install netpbm```

```nix: nix profile install nixpkgs#netpbm```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[pbmpscale](/man/pbmpscale)(1), [pamscale](/man/pamscale)(1)

