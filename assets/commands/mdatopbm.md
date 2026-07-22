# TAGLINE

converts MicroDesign Area format to PBM

# TLDR

**Convert** a MicroDesign area to PBM on stdout

```mdatopbm [input.mda] > [output.pbm]```

**Read from stdin** and write PBM on stdout

```cat [input.mda] | mdatopbm > [output.pbm]```

**Double-height** output (for non-square PCW pixels)

```mdatopbm -d [input.mda] > [output.pbm]```

**Invert** black/white in the output

```mdatopbm -i [input.mda] > [output.pbm]```

# SYNOPSIS

**mdatopbm** [**-d**] [**-i**] [_mdafile_]

# PARAMETERS

**-d**, **-double**
> Double the height of the image to compensate for the rectangular pixel aspect ratio of the Amstrad PCW screen.

**-i**, **-invert**
> Swap foreground and background, producing white-on-black output.

_mdafile_
> Input MicroDesign Area (.mda) file. Reads from standard input if omitted.

# DESCRIPTION

**mdatopbm** converts MicroDesign Area files to PBM. MicroDesign was a desktop publishing program for the Amstrad PCW range of computers, and its .mda files store bitmap clip art at the PCW's non-square pixel ratio. The **-d** option doubles the vertical resolution so the image appears at correct proportions on a square-pixel display.

Output is written to standard output. The tool is part of the **Netpbm** toolkit.

# CAVEATS

Only the MicroDesign Area (.mda) variant is supported; documents from MicroDesign Plus may need to be exported to .mda first. The format is monochrome (1 bpp).

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

[pbmtomda](/man/pbmtomda)(1), [pbmtolj](/man/pbmtolj)(1), [pbm](/man/pbm)(5)
