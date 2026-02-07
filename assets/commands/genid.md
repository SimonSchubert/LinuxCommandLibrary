# TAGLINE

random identifier and UUID generator

# TLDR

**Generate random ID**

```genid```

**Generate UUID**

```genid --uuid```

**Generate specific length**

```genid -l [32]```

**Alphanumeric only**

```genid --alphanumeric```

# SYNOPSIS

**genid** [_options_]

# PARAMETERS

**-l** _LENGTH_
> ID length.

**--uuid**
> Generate UUID format.

**--alphanumeric**
> Use only letters and numbers.

**--hex**
> Hexadecimal output.

**--help**
> Display help information.

# DESCRIPTION

**genid** generates random identifiers suitable for various purposes. It produces unique strings for use as IDs, tokens, or keys.

The tool supports multiple formats including UUID, alphanumeric strings, and custom lengths. Output is cryptographically suitable for non-security-critical uses.

genid provides quick random identifier generation from the command line.

# CAVEATS

Not for cryptographic keys. Uniqueness not guaranteed. May vary between implementations.

# HISTORY

genid is a utility for generating random identifiers, providing convenient access to random string generation for scripting and development purposes.

# SEE ALSO

[uuid](/man/uuid)(1), [uuidgen](/man/uuidgen)(1), [pwgen](/man/pwgen)(1)
