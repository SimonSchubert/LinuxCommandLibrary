# TAGLINE

convert a PNM image to a DEC DDIF document

# TLDR

**Convert PNM to DDIF**

```pnmtoddif [input.pnm] > [output.ddif]```

**Specify the output resolution** in DPI

```pnmtoddif -resolution [300] [input.pnm] > [output.ddif]```

**Read from stdin**

```cat [input.pnm] | pnmtoddif > [output.ddif]```

# SYNOPSIS

**pnmtoddif** [_-resolution dpi_] [_pnmfile_]

# PARAMETERS

_PNMFILE_
> Input PNM (PBM, PGM, or PPM) image. If omitted, **pnmtoddif** reads from standard input.

**-resolution** _N_
> Embed the given resolution (dots per inch) in the DDIF output. Defaults to 75 DPI.

# DESCRIPTION

**pnmtoddif** translates a PNM image (PBM, PGM, or PPM) into a DEC **DDIF** (Digital Document Interchange Format) document on standard output. DDIF is a compound-document format used by DEC's CDA (Compound Document Architecture), most notably in DECwindows applications and document tools that ship with VMS and Ultrix.

The converter preserves the bit depth of the input: a PBM becomes a 1-bit DDIF page, a PGM becomes grayscale, and a PPM becomes 24-bit color. The output resolution recorded in the DDIF header is **-resolution** (default 75 DPI), influencing how downstream viewers scale the image.

# CAVEATS

DDIF is a legacy format; viewers and converters outside of the historical DEC/Compaq toolchain are rare. There is no built-in converter from DDIF back to PNM in current Netpbm releases.

# HISTORY

**pnmtoddif** was contributed to **Netpbm** to support interoperability with **DEC** Compound Document Architecture tooling. It remains in the distribution mostly for archival and legacy purposes.

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

[pnmtops](/man/pnmtops)(1), [pnmtopng](/man/pnmtopng)(1), [pamtopnm](/man/pamtopnm)(1)
