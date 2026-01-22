# TLDR

**Convert groff to DVI**

```groff -Tdvi [file.roff] > output.dvi```

**Direct grodvi usage**

```grodvi [file] > output.dvi```

**Specify font path**

```grodvi -F [fontdir] [file]```

# SYNOPSIS

**grodvi** [_options_] [_file_]

# PARAMETERS

_FILE_
> Groff intermediate output file.

**-d**
> Enable debug mode.

**-F** _DIR_
> Font directory.

**-l**
> Landscape mode.

**-p** _SIZE_
> Paper size.

**--help**
> Display help information.

# DESCRIPTION

**grodvi** is a groff output driver that produces DVI (DeVice Independent) format, compatible with TeX ecosystem tools like dvips and xdvi.

The driver converts groff intermediate output to DVI format, allowing integration with TeX-based workflows. It supports standard groff font features.

grodvi generates DVI output from groff.

# CAVEATS

Part of groff package. DVI format has limitations compared to PDF. Requires TeX fonts for best results.

# HISTORY

grodvi was developed as part of **GNU groff** to provide DVI output capability, bridging groff and TeX ecosystems.

# SEE ALSO

[groff](/man/groff)(1), [grops](/man/grops)(1), [dvips](/man/dvips)(1)
