# TAGLINE

Python 3.4 translatable string extraction

# TLDR

**Extract translatable strings**

```pygettext3.4 [file.py]```

**Output to specific file**

```pygettext3.4 -o [messages.pot] [file.py]```

**Extract from directory**

```pygettext3.4 -d [domain] [*.py]```

# SYNOPSIS

**pygettext3.4** [_options_] [_files_]

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

**pygettext3.4** is the Python 3.4 version of pygettext, which extracts translatable strings from Python source files and generates POT (Portable Object Template) files for internationalization. It scans for strings wrapped in **_()**, **gettext()**, and similar marker functions.

This version-specific binary targets Python 3.4 code. For current development, use the latest **pygettext** or the more feature-rich **xgettext** and **Babel** alternatives.

# CAVEATS

Python 3.4 specific. Use latest pygettext3.

# HISTORY

pygettext3.4 is **Python 3.4's** string extraction tool.

# SEE ALSO

[pygettext](/man/pygettext)(1), [xgettext](/man/xgettext)(1), [gettext](/man/gettext)(1)

