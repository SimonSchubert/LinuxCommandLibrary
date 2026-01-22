# TLDR

**Merge translations with template**

```msgmerge [old.po] [new.pot] -o [merged.po]```

**Update PO file in place**

```msgmerge -U [existing.po] [template.pot]```

**Merge with fuzzy matching**

```msgmerge --fuzzy-match [old.po] [new.pot] -o [merged.po]```

**Backup before update**

```msgmerge -U --backup=numbered [file.po] [template.pot]```

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

**-U**
> Update def.po in place.

**--fuzzy-match**
> Use fuzzy matching.

**--backup** _TYPE_
> Backup control.

**--help**
> Display help information.

# DESCRIPTION

**msgmerge** merges two PO files. It's part of GNU gettext.

The tool updates translations with new template. Preserves existing translations while adding new strings.

msgmerge merges PO files.

# CAVEATS

Part of gettext-tools. Fuzzy matches marked. Review merged output.

# HISTORY

msgmerge is part of **GNU gettext**, essential for maintaining translation files across software updates.

# SEE ALSO

[msginit](/man/msginit)(1), [msgfmt](/man/msgfmt)(1), [xgettext](/man/xgettext)(1)

