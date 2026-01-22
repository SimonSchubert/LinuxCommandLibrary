# TLDR

Show current **locale settings**

```locale```

List **all available** locales

```locale --all-locales```

List locales with **metadata**

```locale --all-locales --verbose```

Show **date format**

```locale date_fmt```

# SYNOPSIS

**locale** [_options_] [_name_...]

# DESCRIPTION

**locale** displays information about the current locale settings or lists available locales. It shows environment variables that control language, character encoding, date/time formats, and other regional settings.

# PARAMETERS

**-a, --all-locales**
> List all available locales

**-v, --verbose**
> Show verbose locale information

**-c, --category-name**
> Print category names

**-k, --keyword-name**
> Print keyword names

**-m, --charmaps**
> List available character maps

# LOCALE CATEGORIES

**LC_CTYPE**
> Character classification and case conversion

**LC_COLLATE**
> String collation order

**LC_MESSAGES**
> Message translations

**LC_MONETARY**
> Currency formatting

**LC_NUMERIC**
> Number formatting

**LC_TIME**
> Date and time formatting

# SEE ALSO

[localectl](/man/localectl)(1), [locale-gen](/man/locale-gen)(8), [localedef](/man/localedef)(1)
