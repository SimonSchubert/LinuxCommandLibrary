# TAGLINE

graphviz layout program for squarified treemaps

# TLDR

**Create treemap visualization**

```patchwork -Tpng [data.gv] -o [treemap.png]```

**Generate SVG treemap**

```patchwork -Tsvg [data.gv] -o [treemap.svg]```

**Generate PDF output**

```patchwork -Tpdf [data.gv] -o [treemap.pdf]```

# SYNOPSIS

**patchwork** [_options_] [_files_...]

# PARAMETERS

**-T** _format_
> Output format (png, svg, pdf, etc.).

**-o** _file_
> Output file.

**-G** _attr=val_
> Set graph attribute.

**-N** _attr=val_
> Set node attribute.

# DESCRIPTION

**patchwork** is a Graphviz layout program for squarified treemaps. Displays hierarchical data as nested rectangles with areas proportional to values. Part of the Graphviz visualization suite.

# INSTALL

```apt: sudo apt install graphviz```

```dnf: sudo dnf install graphviz```

```pacman: sudo pacman -S graphviz```

```apk: sudo apk add graphviz```

```zypper: sudo zypper install graphviz```

```brew: brew install graphviz```

```nix: nix profile install nixpkgs#graphviz```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[dot](/man/dot)(1), [osage](/man/osage)(1), [neato](/man/neato)(1)

