# TAGLINE

creates English translation PO files

# TLDR

**Create English translation file**

```msgen [input.pot] -o [en.po]```

**Generate from PO file**

```msgen [source.po] -o [output.po]```

**Force output**

```msgen --force-po [input.pot] -o [output.po]```

**Specify language**

```msgen --lang=[en] [input.pot] -o [output.po]```

# SYNOPSIS

**msgen** [_options_] [_inputfile_]

# PARAMETERS

_INPUTFILE_
> POT or PO file input.

**-o** _FILE_
> Output file.

**--force-po**
> Write PO even if empty.

**--lang** _LANG_
> Set language code.

**--help**
> Display help information.

# DESCRIPTION

**msgen** creates English translation PO files. It copies msgid to msgstr for same-language translations.

The tool generates base English files. Part of GNU gettext for i18n workflows.

# CAVEATS

Part of gettext-tools. Only for English target. Use for en_* locales.

# HISTORY

msgen is part of **GNU gettext**, created to simplify English locale file generation.

# SEE ALSO

[msgconv](/man/msgconv)(1), [msgfmt](/man/msgfmt)(1), [msgmerge](/man/msgmerge)(1)

