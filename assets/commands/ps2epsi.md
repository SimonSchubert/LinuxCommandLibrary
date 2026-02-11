# TAGLINE

Convert PostScript to Encapsulated PostScript

# TLDR

**Convert PS to EPSI**

```ps2epsi [input.ps] [output.epsi]```

**Convert with preview**

```ps2epsi [input.ps]```

# SYNOPSIS

**ps2epsi** _input_ [_output_]

# PARAMETERS

_INPUT_
> Input PostScript file.

_OUTPUT_
> Output EPSI file.

# DESCRIPTION

**ps2epsi** converts PostScript files to Encapsulated PostScript Interchange (EPSI) format by adding an ASCII preview image header. The EPSI format embeds a low-resolution bitmap preview that applications can display without a PostScript interpreter, making it useful for document layout programs that need to show a visual placeholder.

The tool is part of the Ghostscript suite and uses Ghostscript internally to render the preview image. If no output filename is given, the output file is named after the input with an **.epsi** extension.

# CAVEATS

Part of Ghostscript. Creates bitmap preview.

# HISTORY

ps2epsi is part of **Ghostscript** for EPSI conversion.

# SEE ALSO

[gs](/man/gs)(1), [ps2pdf](/man/ps2pdf)(1), [ps2ps](/man/ps2ps)(1)

