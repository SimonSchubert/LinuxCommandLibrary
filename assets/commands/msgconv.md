# TLDR

**Convert PO file encoding**

```msgconv -t [UTF-8] [input.po] -o [output.po]```

**Convert to specific encoding**

```msgconv --to-code=[ISO-8859-1] [file.po]```

**Convert and output to stdout**

```msgconv -t [UTF-8] [input.po]```

**Force conversion**

```msgconv --force [input.po] -o [output.po]```

# SYNOPSIS

**msgconv** [_options_] [_inputfile_]

# PARAMETERS

_INPUTFILE_
> PO file to convert.

**-t** _ENCODING_
> Target encoding.

**--to-code** _ENCODING_
> Target character encoding.

**-o** _FILE_
> Output file.

**--force**
> Force conversion.

**--help**
> Display help information.

# DESCRIPTION

**msgconv** converts PO files between character encodings. It's part of GNU gettext.

The tool handles translation file encoding. Preserves message structure during conversion.

msgconv converts PO file encoding.

# CAVEATS

Part of gettext-tools. May lose data in incompatible conversions. UTF-8 recommended.

# HISTORY

msgconv is part of **GNU gettext**, providing internationalization tools since 1995.

# SEE ALSO

[msgen](/man/msgen)(1), [msgfmt](/man/msgfmt)(1), [msgmerge](/man/msgmerge)(1)

