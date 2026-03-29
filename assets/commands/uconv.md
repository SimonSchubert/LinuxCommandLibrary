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

**--from-callback** _name_
> Callback for errors when converting from source encoding to Unicode.

**--to-callback** _name_
> Callback for errors when converting from Unicode to target encoding.

**--callback** _name_
> Set both --from-callback and --to-callback to the same value. Values: substitute, skip, stop, escape-unicode.

**-c**
> Omit invalid characters from output (shorthand for --to-callback skip).

**--add-signature**
> Add a U+FEFF BOM to the output if the target encoding supports it.

**--remove-signature**
> Remove a U+FEFF BOM from the input.

**-s**, **--silent**
> Suppress messages during execution.

**-v**, **--verbose**
> Display extra informative messages during execution.

**-h**, **--help**
> Display help.

**-V**, **--version**
> Display version.

# DESCRIPTION

**uconv** converts text between character encodings using the ICU (International Components for Unicode) library. It supports over 200 encodings and more than 1000 aliases, making it suitable for complex internationalization tasks.

Beyond simple transcoding, uconv provides transliteration capabilities to convert text between scripts (e.g., Cyrillic to Latin) without translation. Multiple transliterators can be chained with semicolons.

Error callbacks control handling of characters that cannot be mapped. Callbacks can be set independently for the from-encoding step (--from-callback) and the to-encoding step (--to-callback), or both at once with --callback. Options include substitute (replacement character), skip, stop (default), and escape-unicode.

# CAVEATS

Part of ICU developer tools, not installed by default on all systems. Transliteration rules use ICU format syntax. Some encoding conversions may lose information. Large files processed in memory.

# HISTORY

**uconv** is part of the ICU (International Components for Unicode) project, originally developed at IBM and now maintained by the Unicode Consortium. ICU provides comprehensive Unicode support for software internationalization, with uconv offering command-line access to its conversion capabilities.

# SEE ALSO

[iconv](/man/iconv)(1), [recode](/man/recode)(1), [file](/man/file)(1), [locale](/man/locale)(1)
