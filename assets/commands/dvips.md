# TLDR

**Convert DVI to PostScript**

```dvips [document.dvi] -o [document.ps]```

**Convert specific pages**

```dvips -p [5] -l [10] [document.dvi] -o [output.ps]```

**Output to stdout**

```dvips [document.dvi] -o -```

**Convert for specific paper size**

```dvips -t [letter] [document.dvi] -o [output.ps]```

**Convert in landscape mode**

```dvips -t landscape [document.dvi] -o [output.ps]```

**Generate PDF via ps2pdf**

```dvips [document.dvi] -o - | ps2pdf - [document.pdf]```

# SYNOPSIS

**dvips** [_options_] _file.dvi_

# PARAMETERS

**-o** _file_
> Output file name (- for stdout).

**-p** _num_
> First page to output.

**-l** _num_
> Last page to output.

**-t** _paper_
> Paper type: letter, a4, landscape.

**-D** _dpi_
> Resolution in dots per inch.

**-x** _mag_
> Magnification factor.

**-c** _copies_
> Number of copies.

**-e** _num_
> Maximum drift in pixels.

**-Z**
> Compress bitmap fonts.

**-Ppdf**
> Optimize for PDF conversion.

# DESCRIPTION

**dvips** converts DVI (DeVice Independent) files produced by TeX and LaTeX into PostScript. The output can be printed directly or converted to PDF using tools like ps2pdf.

The program processes DVI instructions, embeds fonts, and generates PostScript code. It supports font substitution, paper size selection, and various optimization options for different output devices.

# CAVEATS

Requires Type 1 or bitmap fonts to be installed. Some modern TeX workflows use pdflatex or xelatex directly, bypassing DVI. PostScript output may be large; use -Z for compression. Font paths must be configured in texmf.cnf.

# HISTORY

dvips was written by **Tomas Rokicki** in the late **1980s** and has been a standard part of TeX distributions since. It remains widely used despite direct PDF generation becoming more common. The program is maintained as part of TeX Live.

# SEE ALSO

[latex](/man/latex)(1), [ps2pdf](/man/ps2pdf)(1), [dvipdf](/man/dvipdf)(1), [xdvi](/man/xdvi)(1)
