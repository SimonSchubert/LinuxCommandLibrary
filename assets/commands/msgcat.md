# TAGLINE

concatenates and merges gettext PO files

# TLDR

**Concatenate PO files**

```msgcat [file1.po] [file2.po] -o [combined.po]```

**Merge with unique messages**

```msgcat --use-first [file1.po] [file2.po] -o [output.po]```

**Sort messages**

```msgcat --sort-output [input.po] -o [sorted.po]```

**Remove duplicates**

```msgcat --unique [input.po] -o [output.po]```

# SYNOPSIS

**msgcat** [_options_] _inputfile_...

# PARAMETERS

**-o** _file_
> Output file.

**--use-first**
> Use first translation for duplicates.

**--sort-output**
> Sort messages alphabetically.

**--unique**
> Remove duplicate messages.

**-t** _encoding_
> Output encoding.

# DESCRIPTION

**msgcat** concatenates and merges gettext PO files. Combines multiple translation files, handles duplicates, and normalizes output. Part of GNU gettext for managing internationalization catalogs.

# SEE ALSO

[msgattrib](/man/msgattrib)(1), [msgfmt](/man/msgfmt)(1), [msgunfmt](/man/msgunfmt)(1)

