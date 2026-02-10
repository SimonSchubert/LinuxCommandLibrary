# TAGLINE

creates a new PO file from a POT file

# TLDR

**Create PO file from POT**

```msginit -i [messages.pot] -o [de.po] -l [de_DE]```

**Create with specific locale**

```msginit --input=[template.pot] --locale=[fr_FR.UTF-8]```

**Create without translator info**

```msginit -i [messages.pot] -o [es.po] -l [es] --no-translator```

**Specify output directory**

```msginit -i [messages.pot] -l [ja] -o [locale/ja/messages.po]```

# SYNOPSIS

**msginit** [_options_]

# PARAMETERS

**-i**, **--input** _file_
> Input POT file.

**-o**, **--output-file** _file_
> Output PO file.

**-l**, **--locale** _locale_
> Target locale.

**--no-translator**
> Don't prompt for translator info.

**--no-wrap**
> Don't wrap lines.

# DESCRIPTION

**msginit** creates a new PO (Portable Object) file from a POT (PO Template) file. It initializes the PO file with proper headers for the specified locale.

This is typically the first step when starting a new translation.

# WORKFLOW

```
1. xgettext → messages.pot
2. msginit  → de.po (new translation)
3. (translate strings)
4. msgfmt   → messages.mo
```

# EXAMPLE

```bash
# Create German translation
msginit -i messages.pot -o de.po -l de_DE.UTF-8

# Headers set automatically:
# Language: de
# Content-Type: text/plain; charset=UTF-8
```

# CAVEATS

POT file must exist first. Locale must be valid system locale. May prompt for translator email.

# HISTORY

msginit is part of **GNU gettext**, the internationalization framework used by most open-source software for translation management.

# SEE ALSO

[xgettext](/man/xgettext)(1), [msgfmt](/man/msgfmt)(1), [msgmerge](/man/msgmerge)(1), [gettext](/man/gettext)(3)
