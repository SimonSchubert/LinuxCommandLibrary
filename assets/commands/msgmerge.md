# TAGLINE

Merge two Uniforum style PO files

# TLDR

**Merge translations with template**

```msgmerge [old.po] [new.pot] -o [merged.po]```

**Update PO file in place**

```msgmerge -U [existing.po] [template.pot]```

**Merge without fuzzy matching**

```msgmerge -N [old.po] [new.pot] -o [merged.po]```

**Merge keeping previous msgids** on fuzzy matches

```msgmerge --previous [old.po] [new.pot] -o [merged.po]```

**Backup before update**

```msgmerge -U --backup=numbered [file.po] [template.pot]```

**Use a compendium** of translations

```msgmerge -C [compendium.po] [old.po] [new.pot] -o [merged.po]```

**Quiet mode**

```msgmerge -q [old.po] [new.pot] -o [merged.po]```

# SYNOPSIS

**msgmerge** [_options_] _def.po_ _ref.pot_

# PARAMETERS

_DEF.PO_
> Existing translations file.

_REF.POT_
> Reference template file.

**-o** _FILE_
> Output file.

**-U**, **--update**
> Update def.po in place.

**-N**, **--no-fuzzy-matching**
> Do not use fuzzy matching. Speeds up operation considerably.

**--previous**
> Keep previous msgids of translated messages when adding fuzzy markers.

**-C** _FILE_, **--compendium**=_FILE_
> Additional library of message translations. May be specified more than once.

**--backup**=_CONTROL_
> Backup control for -U: **none**, **numbered**, **existing**, or **simple**.

**--suffix**=_SUFFIX_
> Override the usual backup suffix.

**-q**, **--quiet**
> Suppress progress indicators.

**-v**, **--verbose**
> Increase verbosity level.

**--no-wrap**
> Do not break long message lines.

**-s**, **--sort-output**
> Generate sorted output.

**-F**, **--sort-by-file**
> Sort output by file location.

# DESCRIPTION

**msgmerge** merges two Uniforum style .po files together. It is part of **GNU gettext**.

The _def.po_ file is an existing PO file with translations that will be taken over to the newly created file as long as they still match. The _ref.pot_ file is the last created PO template file with up-to-date source references. Comments from _def.po_ are preserved. When an exact match is not found, fuzzy matching is used to produce better results (unless **-N** is specified).

# CAVEATS

Part of **gettext-tools** package. Fuzzy matches are marked with a **#, fuzzy** comment and should be reviewed. The **-U** flag modifies the input file in place; use **--backup** to create backups before updating.

# HISTORY

msgmerge is part of **GNU gettext**, essential for maintaining translation files across software updates.

# SEE ALSO

[msginit](/man/msginit)(1), [msgfmt](/man/msgfmt)(1), [msgcat](/man/msgcat)(1), [xgettext](/man/xgettext)(1)

