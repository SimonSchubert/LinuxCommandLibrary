# TLDR

**Convert to UTF-8**

```nkf -w [input.txt] > [output.txt]```

**Convert to Shift-JIS**

```nkf -s [input.txt] > [output.txt]```

**Convert to EUC-JP**

```nkf -e [input.txt] > [output.txt]```

**Auto detect and convert**

```nkf -w --guess [input.txt]```

**Convert in place**

```nkf -w --overwrite [file.txt]```

**Show input encoding**

```nkf --guess [file.txt]```

# SYNOPSIS

**nkf** [_options_] [_files_]

# PARAMETERS

_FILES_
> Files to convert.

**-w**
> Convert to UTF-8.

**-s**
> Convert to Shift-JIS.

**-e**
> Convert to EUC-JP.

**--guess**
> Detect encoding.

**--overwrite**
> Modify file in place.

**--help**
> Display help information.

# DESCRIPTION

**nkf** (Network Kanji Filter) converts Japanese text encodings. Handles UTF-8, Shift-JIS, EUC-JP.

The tool auto-detects encodings. Essential for Japanese text processing.

nkf converts Japanese encodings.

# CAVEATS

Japanese text focused. Auto-detection may fail. Backup before overwrite.

# HISTORY

nkf was created for **Japanese computing**, handling various encodings used in Japan.

# SEE ALSO

[iconv](/man/iconv)(1), [uconv](/man/uconv)(1), [recode](/man/recode)(1)

