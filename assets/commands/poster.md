# TLDR

**Scale to poster size**

```poster -p [A0] -s [1.0] [input.ps] > [output.ps]```

**Create 2x2 tile poster**

```poster -mA4 -p 2x2A4 [input.ps] > [output.ps]```

**Scale to specific dimensions**

```poster -m[A4] -p[100x80cm] [input.ps] > [output.ps]```

**Cut marks for assembly**

```poster -c -m[letter] -p[2x2letter] [input.ps] > [output.ps]```

# SYNOPSIS

**poster** [_options_] _infile_ > _outfile_

# PARAMETERS

**-p** _size_
> Poster size.

**-m** _size_
> Media (paper) size.

**-s** _scale_
> Scale factor.

**-c**
> Add cut marks.

**-o** _offset_
> Offset pages.

**-w** _width_
> White margin.

# DESCRIPTION

**poster** scales PostScript images to larger sizes, splitting them across multiple pages for printing on regular printers and assembling into posters.

# EXAMPLES

```bash
# Scale to A0 on A4 sheets
poster -mA4 -pA0 image.ps > poster.ps

# 2x2 poster from A4
poster -mA4 -p2x2A4 document.ps > tiled.ps

# With cut marks and overlap
poster -c -mA4 -pA1 -o5mm image.ps > poster.ps

# Custom dimensions
poster -mA4 -p100x70cm diagram.ps > big.ps
```

# SIZE FORMATS

```
Standard: A0, A1, A2, A3, A4, letter, legal
Grid: 2x2A4, 3x3letter
Custom: 100x70cm, 40x30in
```

# CAVEATS

Input must be PostScript. Use tools like pdf2ps for PDF. Output may need assembly instructions.

# HISTORY

poster was written by **Jos van Eijndhoven** for creating large format prints from standard printers.

# SEE ALSO

[psnup](/man/psnup)(1), [pstops](/man/pstops)(1), [ps2pdf](/man/ps2pdf)(1)
