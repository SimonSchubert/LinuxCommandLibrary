# TAGLINE

Optical character recognition program

# TLDR

**OCR an image**

```gocr [image.pbm]```

**Set recognition mode**

```gocr -m [mode] [image.pbm]```

**Output to file**

```gocr -o [output.txt] [image.pbm]```

**Set character filter**

```gocr -C "[a-zA-Z0-9]" [image.pbm]```

# SYNOPSIS

**gocr** [_options_] _image_

# PARAMETERS

_IMAGE_
> Image file to process.

**-o** _FILE_
> Output file.

**-m** _MODE_
> Recognition mode.

**-C** _CHARS_
> Expected characters.

**-i** _FORMAT_
> Input format.

**--help**
> Display help information.

# DESCRIPTION

**gocr** is an optical character recognition (OCR) program that reads images and outputs recognized text. It supports various image formats including PBM, PGM, PPM, and can be tuned for specific character sets.

The tool processes scanned documents and images to extract text, integrating into document processing pipelines via standard input and output.

# CAVEATS

Accuracy varies by image quality. Works best with clean scans. Consider tesseract for better accuracy.

# HISTORY

gocr (GOCR/JOCR) is an open-source OCR program developed since the late 1990s.

# SEE ALSO

[tesseract](/man/tesseract)(1), [ocrmypdf](/man/ocrmypdf)(1)
