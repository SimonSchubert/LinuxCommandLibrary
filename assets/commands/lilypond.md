# TLDR

**Compile music score**

```lilypond [score.ly]```

**Output PDF**

```lilypond --pdf [score.ly]```

**Output PNG image**

```lilypond --png [score.ly]```

**Specify output directory**

```lilypond -o [output/] [score.ly]```

**Output SVG**

```lilypond -dbackend=svg [score.ly]```

**Include directory**

```lilypond -I [/path/to/includes] [score.ly]```

# SYNOPSIS

**lilypond** [_options_] _file_

# PARAMETERS

_FILE_
> LilyPond source file (.ly).

**--pdf**
> Generate PDF output.

**--png**
> Generate PNG images.

**-o** _DIR_
> Output directory or file prefix.

**-I** _DIR_
> Add include path.

**-dbackend=**_FORMAT_
> Output backend (ps, svg, etc.).

**--help**
> Display help information.

# DESCRIPTION

**lilypond** is a music engraving program. It compiles text-based music notation into beautiful sheet music.

The tool produces publication-quality scores from a markup language. Output formats include PDF, PNG, PS, and SVG.

lilypond engraves music notation.

# CAVEATS

Learning curve for notation syntax. Large installation. Processing can be slow for complex scores.

# HISTORY

LilyPond was started by **Han-Wen Nienhuys** and **Jan Nieuwenhuizen** in 1996, inspired by TeX's typesetting quality.

# SEE ALSO

[abc2ly](/man/abc2ly)(1), [midi2ly](/man/midi2ly)(1), [musescore](/man/musescore)(1)

