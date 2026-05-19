# TAGLINE

Unicode-aware uppercase filter

# TLDR

**Uppercase** a string

```echo "[straße]" | uc```

**Uppercase** the contents of a file

```uc < [input.txt] > [output.txt]```

**Round-trip** through lowercase and back

```cat [file.txt] | uc | lc```

**Uppercase ligatures** correctly

```printf "[ﬃ]\n" | uc```

# SYNOPSIS

**uc** [_file_ ...]

# DESCRIPTION

**uc** reads text from standard input (or the named files), applies the full Unicode **toUpper** case mapping, and writes the result to standard output. Unlike a naive **tr 'a-z' 'A-Z'**, it handles case folds that change length (German **ß** → **SS**, the **ﬃ** ligature → **FFI**) and respects language-specific rules for Greek, Cyrillic, Armenian, and other scripts.

It ships as one of roughly thirty small filter scripts in **Tom Christiansen's Unicode::Tussle** Perl distribution, alongside companions such as **lc** (lowercase), **tc** (titlecase), **nfd**/**nfc**/**nfkd**/**nfkc** (normalization), **ucsort**, **uniwc**, and **tcgrep** — together forming a Unicode-correct replacement for many GNU coreutils.

# CAVEATS

The name **uc** is ambiguous and collides with Perl's built-in **uc()** function and a number of unrelated tools on other platforms. The script is not installed by default on most distributions; install the full set with **cpanm Unicode::Tussle**. Because the mapping is locale-independent, language-tailored rules (for example Turkish dotted/dotless **I**) are not applied.

# HISTORY

**Unicode::Tussle** grew out of a collection of one-off scripts by **Tom Christiansen** presented at **OSCON 2011** and is now packaged on **CPAN** by **brian d foy**. The distribution is the standard reference for "Unicode coreutils" in Perl.

# SEE ALSO

[tc](/man/tc)(1), [tr](/man/tr)(1), [iconv](/man/iconv)(1)
