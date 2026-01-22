# TLDR

**Convert a file from Latin-1 to UTF-8**

```recode latin1..utf8 [file]```

**Convert from UTF-8 to Latin-1**

```recode utf8..latin1 [file]```

**Convert HTML entities to UTF-8**

```recode html..utf8 [file]```

**Convert UTF-8 to HTML entities**

```recode utf8..html [file]```

**Convert file and save to new file** (preserving original)

```recode latin1..utf8 < [input] > [output]```

**List all available charsets**

```recode -l```

**Convert with verbose output**

```recode -v latin1..utf8 [file]```

# SYNOPSIS

**recode** [_options_] _request_ [_file_...]

# PARAMETERS

_request_
> Conversion specification in format: source..destination

**-l**, **--list**
> List all known charsets and surfaces

**-f**, **--force**
> Force conversion even if information loss may occur

**-s**, **--strict**
> Strict mode; abort on untranslatable characters

**-d**, **--diacritics-only**
> Convert only diacritics, leave other characters

**-c**, **--colstrings**
> Enable column-oriented strings mode

**-g**, **--graphics**
> Show graphical conversion summary

**-v**, **--verbose**
> Verbose output showing conversion details

**-q**, **--quiet**
> Suppress warnings and progress messages

**-h**, **--help**
> Display help message

# DESCRIPTION

**recode** converts text files between different character encodings and can also translate escape sequences. It supports over 300 charsets including ASCII, Latin series, UTF-8, UTF-16, and various national encodings.

The conversion request uses the format **source..destination** where both parts specify charsets. Characters that cannot be represented in the destination charset are handled according to the mode (strict, force, or default lossy conversion).

Beyond charset conversion, recode handles surface transformations like CRLF line endings, Base64, quoted-printable, HTML/XML entities, and various escape sequences.

Multiple files can be processed, with each file converted in-place. Use shell redirection to preserve originals.

# COMMON CHARSETS

**utf8**, **utf-8**: Unicode UTF-8
**latin1**, **iso-8859-1**: Western European
**ascii**, **us-ascii**: 7-bit ASCII
**html**: HTML numeric entities
**utf16**: Unicode UTF-16
**cp1252**: Windows Western European

# CAVEATS

In-place conversion modifies files directly. Always backup files or use redirection to preserve originals when uncertain about the conversion.

Conversions between incompatible charsets may lose information. Use **-s** (strict) to detect and abort on problematic characters, or **-f** (force) to proceed anyway.

HTML entity conversion (**html** charset) handles numeric entities. Named entities like **&amp;** require additional processing.

# HISTORY

Recode was originally written by **Fran├ºois Pinard** starting in **1990** and was one of the first comprehensive charset conversion tools for Unix. It became a GNU project and remains useful for batch processing text encoding conversions.

# SEE ALSO

[iconv](/man/iconv)(1), [uconv](/man/uconv)(1), [convmv](/man/convmv)(1), [file](/man/file)(1)
