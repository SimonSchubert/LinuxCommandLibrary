# TAGLINE

RTF to other formats converter

# TLDR

Convert an RTF file to **HTML**

```unrtf --html [document.rtf] > [document.html]```

Convert an RTF file to **plain text**

```unrtf --text [document.rtf] > [document.txt]```

Convert an RTF file to **LaTeX**

```unrtf --latex [document.rtf] > [document.tex]```

Convert without extracting **embedded pictures**

```unrtf --nopict --html [document.rtf] > [document.html]```

Convert with **verbose** output

```unrtf --verbose --html [document.rtf]```

Convert from **stdin**

```cat [document.rtf] | unrtf --text```

# SYNOPSIS

**unrtf** [_options_] [_file..._]

# PARAMETERS

**--html**
> Select HTML output (default)

**--text**
> Select plain ASCII text output

**--vt**
> Select text output with VT100 terminal escape codes

**--latex**
> Select LaTeX document output

**--rtf**
> Select RTF output (typically more compact than input)

**--nopict**
> Disable extraction of embedded pictures to the current directory

**--noremap**
> Disable charset conversion (only works for 8-bit character sets)

**--verbose**
> Print additional processing information

**--quiet**
> Suppress leading comments in the output

**-t** _tags_file_
> Specify an output configuration file to use

**-P** _config_search_path_
> Specify directories (colon-separated) to search for configuration files. Defaults to /usr/share/unrtf/

**--version**
> Print program version

**--help**
> Display help information

# DESCRIPTION

**unrtf** is a GNU command-line converter that transforms documents in **Rich Text Format (RTF)** into other formats including HTML, plain text, LaTeX, and VT100-escaped text. It supports tables, fonts, hyperlinks, paragraph alignment, foreground and background colors. Embedded images are extracted as separate files unless disabled with **--nopict**. If no file is specified, unrtf reads from standard input. Output is written to standard output.

Since version 0.21.0, all codepage conversion is done through the **iconv** library and output control is managed through runtime configuration files, making it highly customizable.

# CONFIGURATION

Output is controlled via runtime configuration files located in **/usr/share/unrtf/**. Custom tag files can be specified with **-t** and alternate search paths with **-P**. The SYMBOL font mapping is stored in **/usr/share/unrtf/SYMBOL.charmap**.

# CAVEATS

Multiple security vulnerabilities (CVEs) have been found in older versions, including out-of-bounds memory access when processing maliciously crafted RTF files. Always use an up-to-date version. The **--noremap** option only works for 8-bit character sets. PostScript output was removed in version 0.19.5 due to defects. Not all RTF features are fully supported; complex documents with advanced formatting or unusual encodings may not convert perfectly.

# HISTORY

Originally written by **Zachary T. Smith** around **2000** as a program called **rtf2htm**, it was later renamed to **UnRTF** and adopted as an official **GNU project** under the Free Software Foundation. Other contributors include David F. Davey and Jean-Francois Dockes. The latest release version is **0.21.11**. Licensed under the **GNU General Public License**.

# SEE ALSO

[pandoc](/man/pandoc)(1), [iconv](/man/iconv)(1), [enscript](/man/enscript)(1)
