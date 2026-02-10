# TAGLINE

removes duplicate translations from PO files

# TLDR

**Remove duplicate messages**

```msguniq [input.po] -o [output.po]```

**Use first occurrence**

```msguniq -u [input.po] -o [output.po]```

**Report duplicates**

```msguniq -d [input.po]```

**Sort output**

```msguniq -s [input.po] -o [output.po]```

**Unique by msgid and msgctxt**

```msguniq --use-first [input.po] -o [output.po]```

# SYNOPSIS

**msguniq** [_options_] [_inputfile_]

# PARAMETERS

_INPUTFILE_
> PO file to process.

**-o** _FILE_
> Output file.

**-u**
> Keep only unique messages.

**-d**
> Report duplicate messages.

**-s**
> Sort output.

**--use-first**
> Use first of duplicates.

**--help**
> Display help information.

# DESCRIPTION

**msguniq** removes duplicate translations from PO files. It's part of GNU gettext.

The tool unifies message entries. Handles duplicates by combining or selecting.

# CAVEATS

Part of gettext-tools. Different duplicates merged. May need manual review.

# HISTORY

msguniq is part of **GNU gettext**, helping maintain clean translation files.

# SEE ALSO

[msgcat](/man/msgcat)(1), [msgmerge](/man/msgmerge)(1), [msgfilter](/man/msgfilter)(1)

