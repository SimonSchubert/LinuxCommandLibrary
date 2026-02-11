# TAGLINE

Unicode TeX engine with system fonts

# TLDR

**Compile document**

```xetex [document.tex]```

**Output to specific name**

```xetex -jobname=[output] [document.tex]```

**Non-stop mode**

```xetex -interaction=nonstopmode [document.tex]```

# SYNOPSIS

**xetex** [_-interaction mode_] [_-jobname name_] [_options_] _file_

# PARAMETERS

**-interaction** _MODE_
> Error handling mode.

**-jobname** _NAME_
> Output name.

**-output-directory** _DIR_
> Output location.

**-halt-on-error**
> Stop on error.

# DESCRIPTION

**XeTeX** is an extended TeX typesetting engine that adds native Unicode and modern font support to the traditional TeX system. Unlike classic TeX engines that are limited to 8-bit encodings, XeTeX handles the full range of Unicode characters natively, making it suitable for multilingual documents and scripts from any writing system.

One of XeTeX's most significant features is its ability to use system-installed fonts directly, including OpenType and TrueType fonts, without requiring TeX-specific font installations. This gives authors access to the full range of fonts available on their system, along with advanced OpenType features such as ligatures, stylistic alternates, and font variations.

XeTeX produces PDF output directly through the xdvipdfmx backend. It is commonly used through the **xelatex** wrapper which provides the familiar LaTeX macro layer on top of the XeTeX engine, combining LaTeX's document structuring capabilities with XeTeX's Unicode and font handling.

# CAVEATS

Different from pdfTeX. Font handling differs. fontspec package useful.

# HISTORY

**XeTeX** was created by **Jonathan Kew** to add native Unicode and modern font support to TeX.

# SEE ALSO

[xelatex](/man/xelatex)(1), [pdflatex](/man/pdflatex)(1), [luatex](/man/luatex)(1)
