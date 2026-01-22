# TLDR

**Display translated string**

```gettext [domain] "[message]"```

**Translate from catalog**

```TEXTDOMAIN=[domain] gettext "[message]"```

**With context**

```gettext -c "[context]" "[message]"```

**Plural forms**

```ngettext "[singular]" "[plural]" [count]```

# SYNOPSIS

**gettext** [_options_] [_domain_] _msgid_

# PARAMETERS

_DOMAIN_
> Message catalog domain.

_MSGID_
> Message to translate.

**-d** _DOMAIN_
> Text domain.

**-e**
> Enable escape interpretation.

**-E**
> Preserve but don't interpret backslashes.

**-c** _CONTEXT_
> Message context.

**--help**
> Display help information.

# DESCRIPTION

**gettext** retrieves translated strings from message catalogs. It's the runtime component of the GNU internationalization system, looking up translations based on the current locale.

The tool searches .mo files for translations, returning the original if none found. It enables shell scripts and programs to produce localized output.

gettext enables internationalization of command-line applications.

# CAVEATS

Requires compiled .mo catalogs. LANG/LC_MESSAGES must be set. Missing translations return original.

# HISTORY

gettext was developed by **GNU** for internationalization. It became the standard Unix localization system, enabling software to support multiple languages.

# SEE ALSO

[xgettext](/man/xgettext)(1), [msgfmt](/man/msgfmt)(1), [envsubst](/man/envsubst)(1)
