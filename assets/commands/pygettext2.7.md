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

**pygettext2.7** extracts translatable strings from Python 2.7. i18n tool.

The tool creates POT files. Internationalization helper.

pygettext2.7 extracts strings.

# CAVEATS

Python 2.7 version. Use pygettext3 for Python 3.

# HISTORY

pygettext2.7 is **Python 2.7's** string extraction tool.

# SEE ALSO

[pygettext](/man/pygettext)(1), [xgettext](/man/xgettext)(1), [gettext](/man/gettext)(1)

