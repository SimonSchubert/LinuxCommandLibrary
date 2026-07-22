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

**enca** (Extremely Naive Charset Analyser) detects character encodings of text files using language-based statistical heuristics, and can convert files between encodings by piping through **iconv**. It is particularly strong on legacy 8-bit charsets used for Slavic and Central/Eastern European languages (ISO-8859-2/5, KOI8-R, CP1250/1251, Mazovia, T.61, ...), where simpler tools like **file -i** struggle.

Detection works best with a language hint passed via **-L**; without it, **enca** falls back to a general profile and may return ambiguous matches. The output is one detected encoding per file by default, or extended information with **-d** or **-v**. Conversion is performed in place with **-x** _ENCODING_, which calls **iconv** under the hood; pair it with **--cstocs** for transliteration when the target charset lacks specific characters.

# CAVEATS

Detection is heuristic, not deterministic. Short files may be ambiguous. Works best with specific language hints. Some encodings indistinguishable.

# HISTORY

enca was developed for handling the encoding diversity in Central/Eastern European computing, where many incompatible character sets were historically used for the same languages.

# INSTALL

```apt: sudo apt install enca```

```dnf: sudo dnf install enca```

```pacman: sudo pacman -S enca```

```apk: sudo apk add enca```

```zypper: sudo zypper install enca```

```brew: brew install enca```

```nix: nix profile install nixpkgs#enca```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[file](/man/file)(1), [iconv](/man/iconv)(1), [chardet](/man/chardet)(1)
