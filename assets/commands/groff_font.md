# TAGLINE

Groff font file format description

# TLDR

**List available fonts** for a device

```ls /usr/share/groff/current/font/devps/```

**View font directory**

```ls /usr/share/groff/current/font/```

**Show a device description file**

```cat /usr/share/groff/current/font/devps/DESC```

**Show a font description file**

```cat /usr/share/groff/current/font/devps/TR```

# DESCRIPTION

**groff_font** describes the format of font files used by GNU troff (groff). Font files define character metrics, kerning pairs, and other typographic information needed for text layout.

Font files are stored in device-specific subdirectories under /usr/share/groff/. Each output device (ps, pdf, html) has its own font definitions with the DESC file specifying device parameters.

# FONT FILE FORMAT

```
name F
spacewidth n
slant n
ligatures lig1 ... lign [0]
special
charset
name metrics type index [entity-name] [-- comment]
...
kernpairs
g1 g2 n
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
R   - Roman (terminal devices)
I   - Italic (terminal devices)
B   - Bold (terminal devices)
BI  - Bold Italic (terminal devices)
TR  - Times Roman (PostScript)
CR  - Courier Roman (PostScript)
HR  - Helvetica Roman (PostScript)
```

# CAVEATS

Font availability depends on device. Custom fonts need proper installation. Font description files for PostScript fonts are generated from AFM files with **afmtodit**. A **charset** subsection is mandatory unless the device's DESC file has the **unicode** directive.

# SEE ALSO

[groff](/man/groff)(1), [troff](/man/troff)(1), [afmtodit](/man/afmtodit)(1)

# RESOURCES

```[Source code](https://cgit.git.savannah.gnu.org/cgit/groff.git)```

```[Homepage](https://www.gnu.org/software/groff/)```

```[Documentation](https://www.gnu.org/software/groff/manual/)```

<!-- verified: 2026-11-09 -->
