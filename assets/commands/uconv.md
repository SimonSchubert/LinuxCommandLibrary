# TAGLINE

ICU character encoding converter and transliterator

# TLDR

**Convert file from one encoding to another**

```uconv -f [ISO-8859-1] -t [UTF-8] [input.txt] -o [output.txt]```

**List all available encodings**

```uconv -l```

**Convert and transliterate to ASCII**

```uconv -f [UTF-8] -t [US-ASCII] -x [Any-Latin; Latin-ASCII] [input.txt]```

**List available transliterators**

```uconv -L```

**Show default encoding**

```uconv --default-code```

**Convert with substitute callback for unmappable chars**

```uconv -f [UTF-8] -t [ISO-8859-1] --callback substitute [input.txt]```

# SYNOPSIS

**uconv** [_options_] [-f _from_] [-t _to_] [_file_...]

# PARAMETERS

**-f**, **--from-code** _encoding_
> Source encoding.

**-t**, **--to-code** _encoding_
> Target encoding.

**-o**, **--output** _file_
> Write output to file instead of stdout.

**-x** _transliteration_
> Apply transliteration rules.

**-l**, **--list**
> List all available encodings.

**-L**, **--list-transliterators**
> List available transliterators.

**--default-code**
> Show default system encoding.

**-c**
> Omit invalid characters from output.

**--callback** _name_
> Error handling: substitute, skip, stop, escape-unicode.

**-h**, **--help**
> Display help.

**-V**, **--version**
> Display version.

# DESCRIPTION

**uconv** converts text between character encodings using the ICU (International Components for Unicode) library. It supports over 200 encodings and more than 1000 aliases, making it suitable for complex internationalization tasks.

Beyond simple transcoding, uconv provides transliteration capabilities to convert text between scripts (e.g., Cyrillic to Latin) without translation. Multiple transliterators can be chained with semicolons.

Error callbacks control handling of characters that cannot be mapped to the target encoding. Options include substitution with replacement characters, skipping invalid input, stopping with an error, or escaping as Unicode code points.

# CAVEATS

Part of ICU developer tools, not installed by default on all systems. Transliteration rules use ICU format syntax. Some encoding conversions may lose information. Large files processed in memory.

# HISTORY

**uconv** is part of the ICU (International Components for Unicode) project, originally developed at IBM and now maintained by the Unicode Consortium. ICU provides comprehensive Unicode support for software internationalization, with uconv offering command-line access to its conversion capabilities.

# SEE ALSO

[iconv](/man/iconv)(1), [recode](/man/recode)(1), [file](/man/file)(1), [locale](/man/locale)(1)
