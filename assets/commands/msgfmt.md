# TAGLINE

compiles message catalog files from human-readable PO format to binary MO

# TLDR

**Compile PO file to MO**

```msgfmt -o [messages.mo] [messages.po]```

**Check PO file for errors**

```msgfmt --check [messages.po]```

**Verbose output**

```msgfmt -v -o [messages.mo] [messages.po]```

**Generate statistics**

```msgfmt --statistics [messages.po]```

**Compile all PO files**

```for f in *.po; do msgfmt -o "${f%.po}.mo" "$f"; done```

# SYNOPSIS

**msgfmt** [_options_] _file_.po ...

# PARAMETERS

**-o** _file_
> Output file.

**-c**, **--check**
> Check for errors.

**-v**, **--verbose**
> Verbose output.

**--statistics**
> Show translation statistics.

**-f**, **--use-fuzzy**
> Include fuzzy translations.

**--strict**
> Strict mode.

# DESCRIPTION

**msgfmt** compiles message catalog files from human-readable PO (Portable Object) format to binary MO (Machine Object) format used by gettext at runtime.

This is a key step in localizing applications using GNU gettext.

# WORKFLOW

```
xgettext → POT file (template)
msginit  → PO file (translations)
msgfmt   → MO file (binary)
```

# EXAMPLE

```bash
# Compile with checking
msgfmt --check --statistics -o locale/de/LC_MESSAGES/app.mo de.po

# Result: 150 translated, 3 fuzzy, 2 untranslated
```

# CAVEATS

Syntax errors in PO prevent compilation. Fuzzy translations excluded by default. Output encoding must match system.

# HISTORY

msgfmt is part of **GNU gettext**, the standard internationalization system for Unix, developed as part of the GNU Project.

# SEE ALSO

[xgettext](/man/xgettext)(1), [msginit](/man/msginit)(1), [msgmerge](/man/msgmerge)(1), [gettext](/man/gettext)(1)
