# TLDR

**Encode to Punycode**

```echo "münchen" | idn```

**Decode from Punycode**

```echo "xn--mnchen-3ya" | idn -d```

**Convert domain**

```idn [example.日本]```

**Use IDNA 2008**

```idn --idna2008 [domain]```

**Quiet mode**

```idn -q [domain]```

# SYNOPSIS

**idn** [_options_] [_strings_]

# PARAMETERS

_STRINGS_
> Strings to convert.

**-d**, **--decode**
> Decode from Punycode.

**-a**, **--ascii**
> Output ASCII only.

**--idna2008**
> Use IDNA 2008 standard.

**-q**, **--quiet**
> Quiet mode.

**--help**
> Display help information.

# DESCRIPTION

**idn** converts internationalized domain names. It encodes Unicode domains to ASCII-compatible Punycode and decodes back.

The tool implements IDNA standards for domain name internationalization. It handles non-ASCII characters in domain names.

idn converts internationalized domains.

# CAVEATS

Part of libidn. IDNA2003 vs IDNA2008 differences. Punycode prefix is xn--.

# HISTORY

idn is part of **GNU Libidn** for internationalized domain name handling.

# SEE ALSO

[host](/man/host)(1), [dig](/man/dig)(1), [idn2](/man/idn2)(1)
