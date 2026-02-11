# TAGLINE

Python 2.7 translatable string extraction

# TLDR

**Extract translatable strings**

```pygettext2.7 [file.py]```

**Output to specific file**

```pygettext2.7 -o [messages.pot] [file.py]```

**Extract from directory**

```pygettext2.7 -d [domain] [*.py]```

# SYNOPSIS

**pygettext2.7** [_options_] [_files_]

# PARAMETERS

_FILES_
> Python files to extract from.

**-o** _FILE_
> Output file.

**-d** _DOMAIN_
> Text domain.

**-k** _KEYWORD_
> Additional keyword.

# DESCRIPTION

**pygettext2.7** is the Python 2.7 version of pygettext, which extracts translatable strings from Python source files and generates POT (Portable Object Template) files for internationalization. It scans for strings wrapped in **_()**, **gettext()**, and similar marker functions.

This version-specific binary targets Python 2.7 code. For Python 3 projects, use the corresponding **pygettext3** or the more feature-rich **xgettext** and **Babel** alternatives.

# CAVEATS

Python 2.7 version. Use pygettext3 for Python 3.

# HISTORY

pygettext2.7 is **Python 2.7's** string extraction tool.

# SEE ALSO

[pygettext](/man/pygettext)(1), [xgettext](/man/xgettext)(1), [gettext](/man/gettext)(1)

