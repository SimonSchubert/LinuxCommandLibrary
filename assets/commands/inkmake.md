# TAGLINE

Makefile-style batch exports from SVG using Inkscape

# TLDR

**Run the exports** in ./Inkfile

```inkmake```

Use a **specific Inkfile**

```inkmake [path/to/Inkfile]```

Set the **SVG source** and **output** directories

```inkmake -s [svg/] -o [build/] [Inkfile]```

**Force regeneration** of all files, ignoring timestamps

```inkmake -f```

Use a **custom Inkscape binary**

```inkmake -i [/usr/bin/inkscape]```

Run via **Docker**

```docker run --rm -v "$PWD:$PWD" -w "$PWD" mwader/inkmake```

# SYNOPSIS

**inkmake** [_options_] [_Inkfile_]

# PARAMETERS

**-v**, **--verbose**
> Verbose output.

**-s**, **--svg** _PATH_
> SVG source base path.

**-o**, **--out** _PATH_
> Output base path.

**-f**, **--force**
> Force regeneration (skip modification time check).

**-i**, **--inkscape** _PATH_
> Path to the Inkscape binary.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**inkmake** automates exports from SVG files using Inkscape as the backend. Like **make**, it reads a description file (**Inkfile**) listing the files to generate and only regenerates outputs that are older than their source SVG.

Each Inkfile line has the form **file[variants].ext [options]**. Options select the source SVG, the exported area (**@id**, **drawing**, **@x0:y0:x1:y1**), resolution (**100x100**, **\*2**, **180dpi**), layer visibility (**-\***, **+"Layer name"**, **+#id**), rotation (**left**, **right**, **upsidedown**) and output format (png, pdf, ps, eps). Variants such as **[@2x|-big=1000x1000]** produce several files from one line.

# INKFILE EXAMPLE

```
# duck.png from duck.svg
duck.png

# high-resolution export
hiresduck.png duck.svg *10

# duck.png, duck@2x.png, duck-right.png from area id "duck"
images/duck[@2x|-right=*3,right].png animals.svg @duck

# only layer "Duck head" visible
duckhead.png -* "+Duck head" duck.svg

# output and source directories relative to the Inkfile
out: ../
svg: resources
```

# CAVEATS

Requires Ruby and Inkscape; install with **gem install inkmake**. The Inkscape binary is auto-detected; use **-i** if it is not found. Command-line paths override **out:**/**svg:** in the Inkfile. The project has seen no updates since 2021.

# HISTORY

inkmake was written by **Mattias Wadman** as a Ruby gem to replace repetitive manual "Export Bitmap" steps in Inkscape, notably for generating iOS @2x assets.

# SEE ALSO

[inkscape](/man/inkscape)(1), [make](/man/make)(1), [rsvg-convert](/man/rsvg-convert)(1), [magick](/man/magick)(1)

# RESOURCES

```[Source code](https://github.com/wader/inkmake)```

<!-- verified: 2026-09-29 -->
