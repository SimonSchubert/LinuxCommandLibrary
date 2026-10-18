# TAGLINE

Convert Graphviz DOT/GV graphs to GXL

# TLDR

**Convert a DOT graph to GXL**

```dot2gxl [input.dot] -o [output.gxl]```

Convert from a **.gv** file (suffix selects GV → GXL)

```dot2gxl [input.gv] > [output.gxl]```

Convert **GXL back to GV** from a .gxl suffix

```dot2gxl [input.gxl] > [output.gv]```

Force GV input and GXL output, **ignoring the file name**

```dot2gxl -g [input.dot] -o [output.gxl]```

Force GXL input and GV output

```dot2gxl -d [input.gxl] -o [output.gv]```

Convert from **stdin** (name `dot2gxl` means GV → GXL)

```cat [input.dot] | dot2gxl > [output.gxl]```

# SYNOPSIS

**dot2gxl** [**-gd?**] [**-o** _outfile_] [_files_]

# PARAMETERS

**-g**
> Treat the input as GV/DOT and write GXL, ignoring the command name and file suffixes.

**-d**
> Treat the input as GXL and write GV, ignoring the command name and file suffixes.

**-o** _outfile_
> Write to _outfile_ instead of standard output.

**-?**
> Print usage and exit.

_files_
> Graph files in GV/DOT or GXL. With no files, read standard input.

# DESCRIPTION

**dot2gxl** converts between graphs in the Graphviz GV/DOT language and GXL (Graph eXchange Language), an XML interchange format. It is a name for the same binary as **gxl2gv**, **gv2gxl**, and **gxl2dot**.

Unless **-g** or **-d** is given, the conversion direction comes from the input suffix: **.gv** or **.dot** means GV → GXL, and **.gxl** means GXL → GV. With no suffix (for example a pipe) and no flags, the executable name decides: names starting with **d** (**dot2gxl**) convert GV → GXL, **gv2gxl** does the same, and **gxl2gv** / **gxl2dot** convert GXL → GV.

GXL can describe a richer graph model than GV. Constructs that have no GV analogue are stored as attributes. Applying **gxl2gv** and then **gv2gxl** is intended to be semantically the identity.

# CAVEATS

Conversion runs in only one direction even when several files have mixed suffixes. A GXL file may contain only one graph. Some GXL constructs cannot be mapped. GXL → GV needs Graphviz built with Expat.

# HISTORY

**dot2gxl** is an installed alias of **gxl2gv**, written by **Krishnam Pericherla** and **Emden R. Gansner** at **AT&T Labs** as part of **Graphviz**.

# INSTALL

```apt: sudo apt install graphviz```

```dnf: sudo dnf install graphviz```

```pacman: sudo pacman -S graphviz```

```apk: sudo apk add graphviz```

```zypper: sudo zypper install graphviz```

```brew: brew install graphviz```

```nix: nix profile install nixpkgs#graphviz```

<!-- packages: 2026-10-18 -->

# SEE ALSO

[gv2gxl](/man/gv2gxl)(1), [gxl2gv](/man/gxl2gv)(1), [dot](/man/dot)(1), [graphml2gv](/man/graphml2gv)(1)

# RESOURCES

```[Source code](https://gitlab.com/graphviz/graphviz)```

```[Homepage](https://graphviz.org)```

```[Documentation](https://graphviz.org/pdf/gxl2gv.1.pdf)```

<!-- verified: 2026-10-18 -->
