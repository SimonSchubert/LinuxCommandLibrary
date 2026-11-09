# TAGLINE

Not an existing Netpbm program, use asciitopgm and pgmtoppm

# TLDR

Convert ASCII art to a **PPM** image with the real Netpbm tools

```asciitopgm [height] [width] < [ascii.txt] | pgmtoppm [white] > [output.ppm]```

Render the result in a **color**

```asciitopgm [height] [width] < [ascii.txt] | pgmtoppm [red] > [output.ppm]```

# SYNOPSIS

**asciitopgm** _height_ _width_ [_asciifile_] | **pgmtoppm** _colorspec_

# DESCRIPTION

Netpbm does not contain a program called **asciitoppm**, and no other upstream project providing it could be found. The closest real program is **asciitopgm**, which converts ASCII art to a PGM grayscale image. Its output can be piped into **pgmtoppm** to obtain a PPM image.

# SEE ALSO

[asciitopgm](/man/asciitopgm)(1), [pgmtoppm](/man/pgmtoppm)(1), [ppmtoascii](/man/ppmtoascii)(1), [pbmtoascii](/man/pbmtoascii)(1)
