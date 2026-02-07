# TAGLINE

ABC music notation to LilyPond converter

# TLDR

**Convert an ABC file** to LilyPond format

```abc2ly [input.abc]```

**Specify an output file**

```abc2ly -o [output.ly] [input.abc]```

**Preserve ABC beaming** conventions during conversion

```abc2ly -b [input.abc]```

**Convert quietly** without progress messages

```abc2ly -q -o [output.ly] [input.abc]```

# SYNOPSIS

**abc2ly** [_OPTION_]... _FILE_

# PARAMETERS

**-o**, **--output=**_FILE_
> Write output to specified FILE instead of stdout.

**-b**, **--beams**
> Preserve ABC's notion of beams in the output.

**-s**, **--strict**
> Be strict about conversion success.

**-q**, **--quiet**
> Suppress progress messages during conversion.

**-h**, **--help**
> Show help message and exit.

**--version**
> Show version number and exit.

# DESCRIPTION

**abc2ly** is a converter script bundled with LilyPond that transforms ABC music notation files into LilyPond input format. ABC notation is a simple text-based music notation system popular for folk and traditional music, while LilyPond is a powerful music engraving program that produces high-quality sheet music.

The tool reads ABC files conforming to the ABC standard and outputs equivalent LilyPond markup that can then be processed by LilyPond to generate publication-quality PDF or other output formats. This allows musicians and archivists with existing ABC tune collections to leverage LilyPond's superior typesetting capabilities.

# CAVEATS

Not all ABC features may translate perfectly to LilyPond. Complex ABC constructs or non-standard extensions might require manual adjustment in the resulting LilyPond file. The conversion preserves musical content but formatting preferences may need fine-tuning.

# HISTORY

**abc2ly** was developed as part of the LilyPond project by Han-Wen Nienhuys, Laura Conrad, and Roy Rankin. It has been included with LilyPond distributions since the early days of the project, providing a bridge between the simpler ABC notation popular in folk music communities and LilyPond's professional engraving system.

# SEE ALSO

[lilypond](/man/lilypond)(1), [midi2ly](/man/midi2ly)(1), [musicxml2ly](/man/musicxml2ly)(1)
