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

**pygettext3.4** extracts translatable strings from Python 3.4. i18n tool.

The tool creates POT files. Internationalization helper.

pygettext3.4 extracts strings.

# CAVEATS

Python 3.4 specific. Use latest pygettext3.

# HISTORY

pygettext3.4 is **Python 3.4's** string extraction tool.

# SEE ALSO

[pygettext](/man/pygettext)(1), [xgettext](/man/xgettext)(1), [gettext](/man/gettext)(1)

