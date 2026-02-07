# TAGLINE

Groff HTML output driver

# TLDR

**Convert groff to HTML**

```groff -Thtml [file.roff] > output.html```

**Direct grohtml usage**

```grohtml [file] > output.html```

**Generate with images**

```groff -Thtml -P-i [file.roff] > output.html```

# SYNOPSIS

**grohtml** [_options_] [_file_]

# PARAMETERS

_FILE_
> Groff intermediate output.

**-b**
> Create background color.

**-i**
> Generate inline images.

**-s** _SIZE_
> Font base size.

**-F** _DIR_
> Font directory.

**--help**
> Display help information.

# DESCRIPTION

**grohtml** is a groff output driver that produces HTML. It converts groff documents to web-viewable format with optional image generation for elements that do not translate directly to HTML.

The driver handles text formatting and creates appropriate HTML tags. Complex formatting elements can be rendered as inline images for accurate representation.

# CAVEATS

Part of groff package. Complex formatting may not render perfectly. Image generation requires additional tools.

# HISTORY

grohtml was developed as part of **GNU groff** to enable web publishing of groff documents.

# SEE ALSO

[groff](/man/groff)(1), [grops](/man/grops)(1), [gropdf](/man/gropdf)(1)
