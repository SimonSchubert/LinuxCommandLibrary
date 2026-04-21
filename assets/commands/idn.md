# TAGLINE

Encode and decode internationalized domain names

# TLDR

**Encode a Unicode domain to ACE/Punycode (default mode)**

```echo "münchen.de" | idn```

**Decode a Punycode domain back to Unicode**

```echo "xn--mnchen-3ya.de" | idn --idna-to-unicode```

**Apply Nameprep stringprep to input**

```echo "[string]" | idn --stringprep```

**Explicitly run IDNA ToASCII on an argument**

```idn --idna-to-ascii [münchen.de]```

**Encode or decode raw Punycode (no IDNA wrapping)**

```echo "[label]" | idn --punycode-encode```

**Quiet mode (suppress informational messages)**

```idn --quiet [domain]```

# SYNOPSIS

**idn** [_options_] [_strings_...]

# PARAMETERS

_strings_
> Domain names or labels to convert. Read from standard input if not provided.

**-a**, **--idna-to-ascii**
> Convert input to ACE according to IDNA. This is the default mode.

**-u**, **--idna-to-unicode**
> Convert input from ACE (Punycode) back to Unicode using IDNA.

**-s**, **--stringprep**
> Prepare the string according to the Nameprep profile.

**-e**, **--punycode-encode**
> Encode raw input with the Punycode algorithm, without IDNA pre/post processing.

**-d**, **--punycode-decode**
> Decode raw Punycode input, without IDNA pre/post processing.

**-n**, **--nfkc**
> Normalize input according to Unicode v3.2 NFKC.

**-p** _profile_, **--profile**=_profile_
> Use the named stringprep profile. Valid values: `Nameprep`, `iSCSI`, `Nodeprep`, `Resourceprep`, `trace`, `SASLprep`.

**--allow-unassigned**
> Toggle the IDNA `AllowUnassigned` flag (default off).

**--usestd3asciirules**
> Toggle the IDNA `UseSTD3ASCIIRules` flag (default off); forbids non-LDH characters.

**--no-tld**
> Skip TLD-specific validity checks (only affects `--idna-to-ascii` / `--idna-to-unicode`).

**--quiet**
> Silent operation.

**--debug**
> Print debugging information, including the detected character set.

**-h**, **--help**
> Print help and exit.

**-V**, **--version**
> Print version and exit.

# DESCRIPTION

**idn** converts internationalized domain names between Unicode and ASCII-Compatible Encoding (ACE / Punycode). It implements the IDNA (Internationalized Domain Names in Applications) standard, allowing domain names with non-ASCII characters to be represented in the DNS.

The encoding pipeline applies Nameprep stringprep (case folding, NFKC normalization, prohibited-character checks) before Punycode encoding. ACE-encoded labels use the **xn--** prefix. The tool reads strings from command-line arguments, or from standard input if none are supplied.

Input is expected in the locale's preferred charset; override this by setting the **CHARSET** environment variable. To process a string starting with `-`, use `--` to mark the end of options (e.g. `idn --quiet -a -- -foo`).

# CAVEATS

This tool implements **IDNA 2003** (RFC 3490). For the newer **IDNA 2008** standard (RFC 5891), use **idn2** from the libidn2 package. The two standards differ in handling of several characters (e.g. German eszett `ß`, Greek final sigma `ς`). Part of **GNU Libidn**.

# HISTORY

**idn** is part of **GNU Libidn**, written by **Simon Josefsson**. The IDNA standard was published as RFC 3490 in **2003** to enable internationalized domain names in the DNS.

# SEE ALSO

[host](/man/host)(1), [dig](/man/dig)(1)
