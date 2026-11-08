# TAGLINE

Extract translatable strings from Python code

# TLDR

**Extract translatable strings**

```pygettext [script.py]```

**Specify output file**

```pygettext -o [messages.pot] [script.py]```

**Extract from directory**

```pygettext -d [domain] [src/]```

**Include docstrings**

```pygettext -D [script.py]```

# SYNOPSIS

**pygettext** [_options_] _files_...

# PARAMETERS

**-o**, **--output** _file_
> Output file name.

**-d**, **--default-domain** _name_
> Write to name.pot instead of messages.pot.

**-p**, **--output-dir** _dir_
> Output directory.

**-D**, **--docstrings**
> Extract docstrings.

**-k**, **--keyword** _word_
> Additional keyword to look for. Repeatable.

**-K**, **--no-default-keywords**
> Disable the default keywords.

**-c**_TAG_, **--add-comments**=_TAG_
> Extract translator comments starting with TAG.

**-x**, **--exclude-file** _file_
> File listing strings not to extract.

**-n**, **--add-location**
> Write file:line comments (the default in current versions).

**--no-location**
> Do not write location comments.

# DESCRIPTION

**pygettext** extracts translatable strings from Python source code. It searches for strings marked with _(), gettext(), ngettext(), pgettext() and related functions, creating a POT template file (messages.pot by default). Directory arguments are searched recursively.

Ships with CPython in Tools/i18n rather than as a library module, so some distributions package it separately or omit it.

# EXAMPLES

```bash
# Basic extraction
pygettext -o messages.pot *.py

# From directory
pygettext -d myapp -p locale src/*.py

# Include docstrings
pygettext -D -o docs.pot module.py

# Custom keywords
pygettext -k N_ app.py
```

# MARKING STRINGS

```python
from gettext import gettext as _

message = _("This will be translated")
print(_("Hello, world!"))
```

# OUTPUT FORMAT (POT)

```
#: script.py:10
msgid "Hello, world!"
msgstr ""
```

# CAVEATS

Part of Python. For more features, use xgettext or Babel. Output is template, translators create .po files.

# HISTORY

pygettext is part of **Python** tools for internationalization, implementing gettext extraction for Python.

# SEE ALSO

[xgettext](/man/xgettext)(1), [msgfmt](/man/msgfmt)(1), [gettext](/man/gettext)(1), [babel](/man/babel)(1)

# RESOURCES

```[Source code](https://github.com/python/cpython/blob/main/Tools/i18n/pygettext.py)```

```[Documentation](https://docs.python.org/3/library/gettext.html)```

<!-- verified: 2026-11-08 -->
