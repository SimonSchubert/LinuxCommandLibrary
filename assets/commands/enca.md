# TAGLINE

character encoding detection and conversion

# TLDR

**Detect encoding** of file

```enca [file.txt]```

**Detect with language** hint

```enca -L [czech] [file.txt]```

**Convert encoding**

```enca -x [UTF-8] [file.txt]```

**Detect and show** confidence

```enca -d [file.txt]```

**Process multiple files**

```enca -L [russian] [*.txt]```

# SYNOPSIS

**enca** [_options_] [_files_...]

# PARAMETERS

_FILES_
> Files to analyze.

**-L** _LANGUAGE_
> Hint language for detection.

**-x** _ENCODING_
> Convert to specified encoding.

**-d**
> Show detailed detection info.

**-g**, **--guess**
> Output best guess only.

**-i**, **--info**
> Show available encodings.

**--help**
> Display help information.

# DESCRIPTION

**enca** (Extremely Naive Charset Analyser) detects character encodings of text files using language-based heuristics. It can identify various encodings including legacy charsets for Central/Eastern European languages.

The tool works best with language hints, as many encodings are ambiguous without context. It can also convert files between encodings.

enca is useful for handling files with unknown or legacy encodings, particularly for Slavic and other non-Western European languages.

# CAVEATS

Detection is heuristic, not deterministic. Short files may be ambiguous. Works best with specific language hints. Some encodings indistinguishable.

# HISTORY

enca was developed for handling the encoding diversity in Central/Eastern European computing, where many incompatible character sets were historically used for the same languages.

# SEE ALSO

[file](/man/file)(1), [iconv](/man/iconv)(1), [chardet](/man/chardet)(1)
