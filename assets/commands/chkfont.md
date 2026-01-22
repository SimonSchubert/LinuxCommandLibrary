# TLDR

**Check a FIGlet font file for errors**

```chkfont [path/to/font.flf]```

**Check multiple font files**

```chkfont [font1.flf] [font2.flf]```

**Check a font from the standard FIGlet directory**

```chkfont /usr/share/figlet/[big.flf]```

# SYNOPSIS

**chkfont** _fontfile..._

# DESCRIPTION

**chkfont** validates FIGlet 2.0 and later font files (**.flf**) for format errors. It examines font file structure and reports common problems without modifying the files.

The utility is primarily used by font designers and editors to verify font files before distribution or to diagnose issues with custom FIGlet fonts.

# PARAMETERS

**fontfile**
> One or more FIGlet font files to check. Files should have the **.flf** extension

# CAVEATS

Does not work on compressed font files (**.flf.gz**). Decompress fonts before checking with **gunzip**.

Only validates FIGlet font format, not FIGlet control files or other font formats.

# HISTORY

**chkfont** is part of the FIGlet project, which was originally written by Glenn Chappell and Ian Chai in 1991. FIGlet creates large text banners from ordinary text using special fonts. The current version is maintained by Claudio Matsuoka.

# SEE ALSO

[figlet](/man/figlet)(6), [figlist](/man/figlist)(6), [showfigfonts](/man/showfigfonts)(6), [toilet](/man/toilet)(1)
