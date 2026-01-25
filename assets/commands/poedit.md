# TLDR

**Open translation file**

```poedit [file.po]```

**Create new translation**

```poedit --new [template.pot]```

**Validate PO file**

```msgfmt --check [file.po]```

# SYNOPSIS

**poedit** [_options_] [_files_]

# PARAMETERS

**--new** _file_
> Create new catalog from POT.

**--line** _num_
> Jump to line number.

**--help**
> Show help.

**--version**
> Show version.

# DESCRIPTION

**Poedit** is a graphical editor for gettext PO translation files. It provides an intuitive interface for translators with features like translation memory, glossary, and machine translation integration.

# EXAMPLES

```bash
# Open PO file
poedit messages.po

# Create from template
poedit --new template.pot

# Open multiple files
poedit *.po
```

# FEATURES

- Syntax highlighting
- Translation memory
- Machine translation suggestions
- Validation and spell checking
- Fuzzy match detection
- Statistics and progress tracking

# PO FILE FORMAT

```
msgid "Hello"
msgstr "Hola"

msgid "File"
msgstr "Archivo"
```

# CAVEATS

GUI application. For command-line translation management, use gettext tools directly.

# HISTORY

Poedit was created by **Václav Slavík** as an open-source tool for translators working with gettext.

# SEE ALSO

[msgfmt](/man/msgfmt)(1), [xgettext](/man/xgettext)(1), [msginit](/man/msginit)(1), [gettext](/man/gettext)(1)
