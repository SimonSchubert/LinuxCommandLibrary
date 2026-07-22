# TAGLINE

converts source code to formatted output with syntax highlighting

# TLDR

**Highlight source code**

```highlight [file.py]```

**Output as HTML**

```highlight -O html [file.py] > [file.html]```

**Output as ANSI** (terminal)

```highlight -O ansi [file.py]```

**Specify language**

```highlight --syntax=[python] [file]```

**Use specific theme**

```highlight --style=[molokai] [file.py]```

**List supported languages**

```highlight --list-scripts=langs```

**List available themes**

```highlight --list-scripts=themes```

# SYNOPSIS

**highlight** [_options_] [_files_...]

# DESCRIPTION

**highlight** converts source code to formatted output with syntax highlighting. It supports over 250 programming and markup languages and can output to HTML, XHTML, RTF, ODT, TeX, LaTeX, SVG, Pango, BBCode, and ANSI/terminal escape sequences (including 256-color and truecolor).

The tool is useful for documentation, presentations, and generating printable source listings with proper syntax coloring.

# PARAMETERS

**-O**, **--out-format** _format_
> Output format: html, xhtml, latex, tex, rtf, odt, ansi, xterm256, truecolor, bbcode, pango, svg.

**-S**, **--syntax** _lang_
> Specify source language, needed if it can't be guessed from the file suffix.

**-s**, **--style** _name_
> Color theme (add a "base16/" prefix to use a Base16 theme).

**-l**, **--line-numbers**
> Include line numbers.

**-i**, **--input** _file_
> Input file.

**-o**, **--output** _file_
> Output file.

**--list-scripts** _type_
> List langs, themes, or plugins.

**-f**, **--fragment**
> Omit document headers.

**--inline-css**
> Embed CSS in HTML.

**-a**, **--anchors**
> Attach anchors to line numbers (HTML only).

**-B**, **--batch-recursive** _wildcard_
> Convert all files matching the wildcard, recursively.

**--stdout**
> In batch mode, write output to stdout instead of files.

**-t**, **--replace-tabs** _num_
> Replace tabs with the given number of spaces.

**-u**, **--encoding** _enc_
> Set output encoding to match the input file's encoding.

**--config-file** _file_
> Path to a custom language definition or theme file.

# CAVEATS

Language detection may need hints. Theme appearance varies by output format. Some languages have limited support.

# HISTORY

**highlight** was created by **Andre Simon** as a universal source code highlighter. It has been actively developed since **2002**, continuously adding language support and output formats.

# INSTALL

```apt: sudo apt install highlight```

```dnf: sudo dnf install highlight```

```pacman: sudo pacman -S highlight```

```apk: sudo apk add highlight```

```zypper: sudo zypper install highlight```

```brew: brew install highlight```

```nix: nix profile install nixpkgs#highlight```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[pygmentize](/man/pygmentize)(1), [bat](/man/bat)(1), [source-highlight](/man/source-highlight)(1), [vim](/man/vim)(1)

# RESOURCES

```[Source code](https://gitlab.com/saalen/highlight)```

```[Documentation](http://andre-simon.de/doku/highlight/en/highlight.php)```

<!-- verified: 2026-07-19 -->
