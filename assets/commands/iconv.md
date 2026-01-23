# TLDR

**Convert file** from UTF-8 to ISO-8859-1

```iconv -f UTF-8 -t ISO-8859-1 [input.txt] > [output.txt]```

**Convert file** in place (with temp file)

```iconv -f UTF-8 -t ASCII//TRANSLIT [input.txt] -o [output.txt]```

**List available encodings**

```iconv -l```

**Convert with transliteration** (approximate characters)

```iconv -f UTF-8 -t ASCII//TRANSLIT [input.txt]```

**Convert ignoring errors**

```iconv -f UTF-8 -t ASCII//IGNORE [input.txt]```

**Convert from Windows codepage**

```iconv -f CP1252 -t UTF-8 [windows.txt]```

**Convert from stdin**

```cat [file.txt] | iconv -f UTF-8 -t UTF-16```

# SYNOPSIS

**iconv** [_options_] [**-f** _encoding_] [**-t** _encoding_] [_file_...]

# DESCRIPTION

**iconv** converts text files from one character encoding to another. It reads input in the source encoding and writes output in the target encoding, handling the character mapping between different character sets.

The tool supports hundreds of encodings including UTF-8, ISO-8859 family, Windows code pages, Asian encodings, and legacy formats. Special suffixes //TRANSLIT (approximate conversion) and //IGNORE (skip unconvertible) modify conversion behavior.

iconv is essential for handling files from different systems, migrating legacy data, and ensuring proper text display across platforms with different default encodings.

# PARAMETERS

**-f** _encoding_, **--from-code=** _encoding_
> Source encoding.

**-t** _encoding_, **--to-code=** _encoding_
> Target encoding.

**-l**, **--list**
> List available encodings.

**-o** _file_, **--output=** _file_
> Output file.

**-c**
> Silently discard unconvertible characters.

**-s**, **--silent**
> Suppress warnings.

**--verbose**
> Print progress information.

**//TRANSLIT**
> Transliterate unconvertible characters.

**//IGNORE**
> Skip unconvertible characters.

# CAVEATS

Not all character mappings are reversible. Some characters may be lost or approximated. UTF-8 is the recommended target for modern systems. Encoding detection is not automatic (use chardet first if unknown). Binary files should not be converted.

# HISTORY

**iconv** is part of the **POSIX standard** and has implementations in glibc (GNU libc) and other C libraries. The character conversion functionality has been standardized since **POSIX.2** in **1992**. The GNU implementation supports an extensive list of encodings and is the version found on most Linux systems.

# SEE ALSO

[chardet](/man/chardet)(1), [file](/man/file)(1), [recode](/man/recode)(1), [uconv](/man/uconv)(1)
