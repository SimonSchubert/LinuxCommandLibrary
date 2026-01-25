# TLDR

**List available fonts**

```groff -Tps -Z -f[fontname] < /dev/null```

**View font directory**

```ls /usr/share/groff/current/font/```

**Check font files**

```cat /usr/share/groff/current/font/devps/DESC```

# DESCRIPTION

**groff_font** describes the format of font files used by GNU troff (groff). Font files define character metrics, kerning pairs, and other typographic information.

Font files are stored in device-specific subdirectories under /usr/share/groff/. Each output device (ps, pdf, html) has its own font definitions.

# FONT FILE FORMAT

```
name fontname
spacewidth n
slant n
ligatures ...
charset
char width type code
...
```

# FONT DIRECTORIES

```
/usr/share/groff/current/font/devps/   PostScript fonts
/usr/share/groff/current/font/devpdf/  PDF fonts
/usr/share/groff/current/font/devutf8/ UTF-8 terminal
/usr/share/groff/current/font/devhtml/ HTML output
```

# STANDARD FONTS

```
R   - Roman (Times)
I   - Italic
B   - Bold
BI  - Bold Italic
CR  - Courier Roman
H   - Helvetica
```

# CAVEATS

Font availability depends on device. Custom fonts need proper installation. PostScript fonts require AFM files. Modern use may prefer pdfgroff.

# SEE ALSO

[groff](/man/groff)(1), [troff](/man/troff)(1), [afmtodit](/man/afmtodit)(1), [groff_out](/man/groff_out)(5)
