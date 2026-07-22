# TAGLINE

Wrapper around groff that resolves cross references in mm documents

# TLDR

**Process an mm document** (default output: PostScript on stdout)

```mmroff [document.mm]```

**Render to PostScript** (passes -Tps through to groff)

```mmroff -Tps [document.mm] > [document.ps]```

**Render to PDF**

```mmroff -Tpdf [document.mm] > [document.pdf]```

**Render to HTML for preview**

```mmroff -Thtml [document.mm] > [document.html]```

**Build only the cross-reference file** and exit

```mmroff -x [document.mm]```

# SYNOPSIS

**mmroff** [**-x**] _groff_argument_...

**mmroff** **--help**

**mmroff** **--version**

# PARAMETERS

_GROFF_ARGUMENT_
> Any option or input file accepted by **groff** (e.g. **-Tps**, **-Tpdf**, **-Thtml**, the input filename). The **-mm** macro package is added automatically.

**-x**
> Build or update the cross-reference / index file and exit without producing output.

**--help**
> Show usage and exit.

**--version**
> Show version and exit.

# DESCRIPTION

**mmroff** is a tiny shell wrapper around **groff** that handles mm cross references and indexes. It calls **groff -mm** twice: first with **-z -rRef=1** to populate the cross-reference and index files, then again normally to typeset the document. The wrapper also expands PSPIC image inclusions.

For mm documents that do not use cross references, indexes, or embedded PostScript pictures, calling **groff -mm** directly is equivalent and slightly faster.

# CAVEATS

Part of GNU **groff**. Output format is selected with **-T**_device_ exactly as for groff itself; the wrapper does not invent its own format flags. PDF support requires the **-Tpdf** device introduced in groff 1.23. Documents authored with the older AT&T mm macros are not 100% bug-compatible with GNU mm.

# HISTORY

**mmroff** was written by **Jörgen Hägg** of Lund, Sweden, as part of the GNU **mm** macro package contributed to **groff**.

# INSTALL

```apt: sudo apt install groff```

```dnf: sudo dnf install groff```

```pacman: sudo pacman -S groff```

```apk: sudo apk add groff```

```zypper: sudo zypper install groff```

```brew: brew install groff```

```nix: nix profile install nixpkgs#groff```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[groff](/man/groff)(1), [nroff](/man/nroff)(1), [troff](/man/troff)(1)

