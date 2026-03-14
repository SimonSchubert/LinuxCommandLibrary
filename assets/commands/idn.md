# TAGLINE

Encode and decode internationalized domain names

# TLDR

**Encode a Unicode domain to Punycode (ACE)**

```echo "münchen.de" | idn```

**Decode a Punycode domain back to Unicode**

```echo "xn--mnchen-3ya.de" | idn --idna-to-unicode```

**Encode a domain with stringprep processing**

```idn --stringprep [domain]```

**Encode using IDNA ToASCII operation**

```idn --idna-to-ascii [example.日本]```

**Quiet mode** (suppress informational messages)

```idn -q [domain]```

# SYNOPSIS

**idn** [_options_] [_strings_...]

# PARAMETERS

_strings_
> Domain names to convert. Read from stdin if not provided.

**--idna-to-ascii**
> Convert domain from Unicode to ASCII-Compatible Encoding (ACE). This is the default operation.

**--idna-to-unicode**
> Convert domain from ACE (Punycode) back to Unicode.

**--stringprep**
> Perform Nameprep stringprep processing on input.

**--punycode-encode**
> Encode raw input using Punycode algorithm (without IDNA processing).

**--punycode-decode**
> Decode raw Punycode input (without IDNA processing).

**-n**, **--nfkc**
> Apply Unicode NFKC normalization.

**-p** _profile_, **--profile**=_profile_
> Use specified stringprep profile (e.g., Nameprep, iSCSI, SASL).

**--no-tld**
> Skip TLD-specific validity checks.

**--usestd3asciirules**
> Apply STD3 ASCII rules (forbid non-LDH characters).

**-q**, **--quiet**
> Suppress informational messages.

**--debug**
> Show debug information during processing.

**--help**
> Display help information.

**--version**
> Display version information.

# DESCRIPTION

**idn** converts internationalized domain names (IDN) between Unicode and ASCII-Compatible Encoding (ACE/Punycode). It implements the IDNA (Internationalized Domain Names in Applications) standard, allowing domain names with non-ASCII characters to be represented in the DNS system.

The encoding process applies Nameprep string preparation (case folding, normalization, prohibited character checks) before Punycode encoding. ACE-encoded labels use the **xn--** prefix. The tool reads from command-line arguments or standard input when no strings are provided.

# CAVEATS

This tool implements **IDNA 2003** (RFC 3490). For the newer **IDNA 2008** standard (RFC 5891), use **idn2** from the libidn2 package. The two standards differ in handling of some characters (e.g., German eszett, Greek final sigma). Part of **GNU Libidn**.

# HISTORY

**idn** is part of **GNU Libidn**, written by **Simon Josefsson**. The IDNA standard was published as RFC 3490 in **2003** to enable internationalized domain names in the DNS.

# SEE ALSO

[host](/man/host)(1), [dig](/man/dig)(1)
