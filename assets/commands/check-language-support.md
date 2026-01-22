# TLDR

Display **missing language packages**

```check-language-support```

List packages for a **specific locale**

```check-language-support -l [en]```

Display **installed packages** as well as missing

```check-language-support --show-installed```

# SYNOPSIS

**check-language-support** [_options_]

# DESCRIPTION

**check-language-support** identifies missing language support packages on Ubuntu systems. It analyzes installed software and enabled locales to recommend additional packages for complete language support.

This includes translations, input methods, fonts, and spelling dictionaries.

# PARAMETERS

**-l, --language** _locale_
> Check for specific language/locale

**--show-installed**
> Also show already installed packages

**-a, --all**
> Check for all languages

**--package** _pkg_
> Check language support for specific package

# CAVEATS

Ubuntu-specific tool; may not work on other distributions. Recommendations are based on installed applications and may suggest packages not strictly necessary.

# SEE ALSO

[apt](/man/apt)(8), [locale](/man/locale)(1), [localectl](/man/localectl)(1)
