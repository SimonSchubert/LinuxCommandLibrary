# TLDR

**Translate with plural form**

```ngettext "[singular]" "[plural]" [count]```

**Translate with domain**

```ngettext -d [domain] "[singular]" "[plural]" [count]```

**Use specific locale**

```LANG=[de_DE] ngettext "[1 file]" "[%d files]" [5]```

**Specify directory**

```ngettext -d [domain] -e "[singular]" "[plural]" [count]```

# SYNOPSIS

**ngettext** [_options_] _singular_ _plural_ _count_

# PARAMETERS

_SINGULAR_
> Singular form message.

_PLURAL_
> Plural form message.

_COUNT_
> Number for plural selection.

**-d** _DOMAIN_
> Message domain.

**-e**
> Enable escape sequences.

**--help**
> Display help information.

# DESCRIPTION

**ngettext** handles plural forms in translations. It's part of GNU gettext.

The tool selects correct plural form based on count. Language-specific plural rules.

ngettext translates plurals.

# CAVEATS

Part of gettext. Shell utility. Locale-dependent output.

# HISTORY

ngettext is part of **GNU gettext**, providing plural form support for internationalized programs.

# SEE ALSO

[gettext](/man/gettext)(1), [envsubst](/man/envsubst)(1), [msgfmt](/man/msgfmt)(1)

