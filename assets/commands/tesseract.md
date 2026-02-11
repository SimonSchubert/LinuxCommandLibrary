# TAGLINE

Open-source optical character recognition engine

# TLDR

**Extract text from image**

```tesseract [image.png] [output]```

**Extract to stdout**

```tesseract [image.png] stdout```

**Specify language**

```tesseract -l [deu] [image.png] [output]```

**Multiple languages**

```tesseract -l [eng+fra] [image.png] [output]```

**Output as PDF**

```tesseract [image.png] [output] pdf```

**Output as hOCR** (HTML with coordinates)

```tesseract [image.png] [output] hocr```

**Output as TSV**

```tesseract [image.png] [output] tsv```

**List available languages**

```tesseract --list-langs```

# SYNOPSIS

**tesseract** _imagename_ _outputbase_ [_-l lang_] [_--psm mode_] [_--oem mode_] [_configfiles_]

# PARAMETERS

**-l** _LANG_
> Language(s) for OCR (eng, deu, fra, etc.).

**--psm** _NUM_
> Page segmentation mode (0-13).

**--oem** _NUM_
> OCR Engine mode (0=legacy, 1=LSTM, 2=both).

**--dpi** _NUM_
> Override image DPI.

**-c** _VAR=VALUE_
> Set config variable.

**--tessdata-dir** _PATH_
> Location of language data.

**--user-words** _FILE_
> User word list.

**--user-patterns** _FILE_
> User patterns file.

**--list-langs**
> List available languages.

**--print-parameters**
> Print config parameters.

**pdf**
> Output searchable PDF.

**hocr**
> Output HTML with coordinates.

**tsv**
> Output tab-separated values.

**alto**
> Output ALTO XML.

# DESCRIPTION

**Tesseract** is an open-source OCR (Optical Character Recognition) engine. It extracts text from images, supporting over 100 languages.

The LSTM neural network engine (default) provides better accuracy than the legacy engine for most text. Engine mode selection (--oem) enables switching or combining engines.

Page segmentation modes (--psm) tell Tesseract what to expect: single character, word, line, block, or full page. Correct mode selection improves accuracy significantly.

Output formats include plain text, searchable PDF (text layer over image), hOCR (HTML with bounding boxes), TSV (detailed per-word data), and ALTO (XML archival format).

Image quality greatly affects results. Best results come from: high resolution (300+ DPI), good contrast, straight alignment, minimal noise. Preprocessing with ImageMagick or similar can help.

Language data files (traineddata) must be installed separately. Custom training can create models for specific fonts, historical documents, or specialized text.

# CONFIGURATION

**TESSDATA_PREFIX**
> Environment variable specifying the directory containing language data files (traineddata); defaults to the tessdata directory within the Tesseract installation

**--tessdata-dir** _PATH_
> Command-line override for the language data directory location

# CAVEATS

Accuracy varies with image quality. Complex layouts may not segment correctly. Handwriting recognition is limited. Custom training requires significant effort. Large language data files. Processing speed depends on image size and complexity.

# HISTORY

**Tesseract** was developed at HP Labs from **1985** to **1994**, then released as open source in **2005**. Google took over development, adding LSTM neural network support in **2016** (version 4.0). It remains the most widely used open-source OCR engine, integrated into many applications and workflows.

# SEE ALSO

[ocrmypdf](/man/ocrmypdf)(1), [imagemagick](/man/imagemagick)(1), [pdftoppm](/man/pdftoppm)(1)
