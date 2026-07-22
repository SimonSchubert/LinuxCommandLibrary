# TAGLINE

converts PBM bitmaps to Epson ESC/P2 printer format

# TLDR

**Convert PBM to Epson ESC/P2 format**

```pbmtoescp2 [input.pbm] > [output.escp2]```

**Specify resolution**

```pbmtoescp2 -resolution [360] [input.pbm] > [output.escp2]```

# SYNOPSIS

**pbmtoescp2** [_options_] [_file_]

# PARAMETERS

**-resolution** _n_
> Print resolution (180, 360, 720).

**-compress**
> Enable compression.

# DESCRIPTION

**pbmtoescp2** converts PBM bitmaps to Epson ESC/P2 printer format. ESC/P2 is used by modern inkjet printers. Part of Netpbm toolkit.

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

[pbmtoepson](/man/pbmtoepson)(1), [pbmtolj](/man/pbmtolj)(1)

