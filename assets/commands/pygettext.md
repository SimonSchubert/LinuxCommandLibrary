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

**-d**, **--domain** _name_
> Text domain name.

**-p**, **--output-dir** _dir_
> Output directory.

**-D**, **--docstrings**
> Extract docstrings.

**-k** _keyword_
> Additional keyword to look for.

**-n**, **--add-location**
> Include file:line comments.

# DESCRIPTION

**pygettext** extracts translatable strings from Python source code. It searches for strings marked with _(), gettext(), and similar functions, creating a POT template file.

Part of Python standard library.

# EXAMPLES

```bash
# Basic extraction
pygettext -o messages.pot *.py

# From directory
pygettext -d myapp -p locale src/*.py

# Include docstrings
pygettext -D -o docs.pot module.py

# Custom keywords
pygettext -k N_ -k ngettext:1,2 app.py
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
