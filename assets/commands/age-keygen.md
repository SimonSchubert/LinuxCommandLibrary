# TAGLINE

Generate encryption key pairs for age

# TLDR

**Generate** a new key pair

```age-keygen```

Save key to **file**

```age-keygen -o [key.txt]```

**Convert** SSH key to age identity

```age-keygen -y [~/.ssh/id_ed25519]```

# SYNOPSIS

**age-keygen** [_-o file_] [_-y_]

# DESCRIPTION

**age-keygen** generates X25519 key pairs for use with the age encryption tool. The private key (identity) is printed to stdout or written to a file, while the public key is included as a comment in the output.

The generated keys are simple text strings: public keys start with "age1" and private keys start with "AGE-SECRET-KEY-1".

# PARAMETERS

**-o** _file_
> Write key to file instead of stdout

**-y** _file_
> Convert existing key to age format (print public key)

# OUTPUT FORMAT

```
# created: 2024-01-15T10:30:00Z
# public key: age1...
AGE-SECRET-KEY-1...
```

# CAVEATS

Keep the private key secret; anyone with it can decrypt files meant for you. There's no key revocation mechanism. Back up your keys securely. The -y flag requires an ed25519 SSH key or age private key.

# HISTORY

**age-keygen** was released alongside age in **2019** by Filippo Valsorda. It provides a minimal key generation tool that follows the same design philosophy as age itself: simple, secure, and with no unnecessary options.

# SEE ALSO

[age](/man/age)(1), [ssh-keygen](/man/ssh-keygen)(1), [gpg](/man/gpg)(1)
