# TLDR

**Convert ASCII art to PNG image**

```ditaa [input.txt] [output.png]```

**Convert with antialiasing disabled**

```ditaa -A [input.txt] [output.png]```

**Convert without shadows**

```ditaa -S [input.txt] [output.png]```

**Convert with rounded corners**

```ditaa -r [input.txt] [output.png]```

**Scale output image**

```ditaa -s [2.0] [input.txt] [output.png]```

**Output as SVG**

```ditaa --svg [input.txt] [output.svg]```

**Convert with transparent background**

```ditaa -T [input.txt] [output.png]```

# SYNOPSIS

**ditaa** [_options_] _input_ [_output_]

# PARAMETERS

**-A**, **--no-antialias**
> Disable antialiasing.

**-S**, **--no-shadows**
> Disable drop shadows.

**-r**, **--round-corners**
> Use rounded corners for boxes.

**-s**, **--scale** _factor_
> Scale output by factor.

**-T**, **--transparent**
> Use transparent background.

**-E**, **--no-separation**
> Disable shape edge separation.

**-e**, **--encoding** _enc_
> Input file encoding.

**--svg**
> Output as SVG instead of PNG.

**-t**, **--tabs** _n_
> Tab size for input.

**-v**, **--verbose**
> Verbose output.

# DESCRIPTION

**ditaa** (DIagrams Through ASCII Art) converts ASCII art diagrams into proper graphics. It recognizes boxes, lines, and basic shapes drawn with ASCII characters and renders them as bitmap or vector images.

Input uses standard ASCII characters: **+**, **-**, **|** for box corners and edges, **/** and **\\** for diagonals, **=** for dashed lines, and text inside boxes for labels. Color tags like **{c:red}** customize appearance.

The tool is useful for documentation, where diagrams can be kept as ASCII in source files (version-controllable, editable) and rendered to images for publication.

# ASCII ART EXAMPLE

```
+--------+   +-------+
|        +-->| ditaa |
| Source |   +-------+
|  File  |   |       |
|        |   | Image |
+--------+   +-------+
```

# CAVEATS

Requires Java Runtime Environment. Complex diagrams may not render as expected. Limited to shapes that can be represented in ASCII. Some Unicode box-drawing characters are not recognized by default.

# HISTORY

ditaa was created by **Stathis Sideris** in **2004** as an open-source Java application. The concept was inspired by the desire to keep diagrams as plain text in source code repositories while having nice rendered versions for documentation. The tool has been integrated into various documentation systems including Asciidoctor and Org-mode.

# SEE ALSO

[graphviz](/man/graphviz)(1), [plantuml](/man/plantuml)(1), [asciiflow](/man/asciiflow)(1), [mermaid](/man/mermaid)(1)
