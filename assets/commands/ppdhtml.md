# TAGLINE

Generate HTML from PPD printer files

# TLDR

**Convert PPD to HTML**

```ppdhtml [file.ppd] > [output.html]```

**Convert multiple files**

```ppdhtml [file1.ppd] [file2.ppd]```

# SYNOPSIS

**ppdhtml** [_options_] _file_

# PARAMETERS

_FILE_
> Input PPD file.

# DESCRIPTION

**ppdhtml** converts CUPS PPD (PostScript Printer Description) files into human-readable HTML documentation. The generated HTML pages describe the printer's supported options, paper sizes, resolutions, and other capabilities defined in the PPD file.

This is useful for creating reference documentation for printer drivers or for reviewing the options available for a particular printer model without manually parsing the PPD file format. Output is written to stdout and can be redirected to an HTML file.

# CAVEATS

CUPS specific. Output to stdout.

# HISTORY

ppdhtml is part of **CUPS** for PPD documentation generation.

# SEE ALSO

[ppdc](/man/ppdc)(1), [ppdi](/man/ppdi)(1), [cups](/man/cups)(1)

