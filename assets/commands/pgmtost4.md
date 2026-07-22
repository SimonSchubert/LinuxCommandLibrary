# TAGLINE

Convert PGM images to SBIG ST-4 autoguider format

# TLDR

**Convert PGM to SBIG ST-4 format**

```pgmtost4 [input.pgm] > [output.st4]```

# SYNOPSIS

**pgmtost4** [_file_]

# DESCRIPTION

**pgmtost4** reads a PGM image as input and produces an SBIG ST-4 camera CCD image as output. The ST-4 format is used by Santa Barbara Instrument Group astronomical autoguider cameras. This format is distinct from the SBIG format used with most other SBIG cameras. Part of the Netpbm toolkit.

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

[st4topgm](/man/st4topgm)(1), [pgmtosbig](/man/pgmtosbig)(1)

