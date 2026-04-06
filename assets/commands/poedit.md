# TAGLINE

Graphical editor for gettext PO translations

# TLDR

**Open a PO file for editing**

```poedit [file.po]```

**Create a new translation from a POT template**

```poedit --new [template.pot]```

**Open a file and jump to a specific line**

```poedit --line [10] [file.po]```

# SYNOPSIS

**poedit** [_options_] [_files_]

# PARAMETERS

**--new** _file_
> Create new catalog from POT.

**--line** _num_
> Open file at the specified line number.

**--help**
> Display usage information and exit.

**--version**
> Display version information and exit.

# DESCRIPTION

**Poedit** is a graphical editor for gettext PO translation files. It provides an intuitive interface for translators with features like translation memory, glossary, and machine translation integration.

# CAVEATS

Poedit is a GUI application with minimal command-line interface. For command-line translation management, use gettext tools directly (msgfmt, xgettext, msginit, msgmerge).

# HISTORY

Poedit was created by **Václav Slavík** as an open-source tool for translators working with gettext.

# SEE ALSO

[msgfmt](/man/msgfmt)(1), [xgettext](/man/xgettext)(1), [msginit](/man/msginit)(1), [msgmerge](/man/msgmerge)(1), [gettext](/man/gettext)(1)
