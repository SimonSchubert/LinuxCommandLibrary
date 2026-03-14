# TAGLINE

Generate encryption key pairs for age

# TLDR

**Generate** a new key pair (printed to stdout)

```age-keygen```

**Save** key to a file

```age-keygen -o [key.txt]```

**Extract public key** from an existing identity file

```age-keygen -y [key.txt]```

**Extract public key** from an SSH ed25519 key

```age-keygen -y [~/.ssh/id_ed25519]```

**Generate** a hybrid post-quantum key pair (age v1.3.0+)

```age-keygen -pq -o [key.txt]```

# SYNOPSIS

**age-keygen** [_options_] [**-o** _file_]

**age-keygen** **-y** [_identity-file_]

# PARAMETERS

**-o** _file_
> Write key to file instead of stdout. Will not overwrite if file exists.

**-y** [_file_]
> Read an identity file (or stdin) and output the corresponding public key (recipient). Works with age private keys and ed25519 SSH keys.

**-pq**
> Generate hybrid post-quantum keys using ML-KEM-768 + X25519 (age v1.3.0+).

**--version**
> Print version and exit.

# OUTPUT FORMAT

```
# created: 2024-01-15T10:30:00Z
# public key: age1...
AGE-SECRET-KEY-1...
```

Post-quantum keys use prefixes **age1pq1...** (public) and **AGE-SECRET-KEY-PQ-1...** (private).

# DESCRIPTION

**age-keygen** generates X25519 key pairs for use with the age encryption tool. The private key (identity) is printed to stdout or written to a file, while the public key is included as a comment in the output.

The generated keys are simple text strings: public keys start with "age1" and private keys start with "AGE-SECRET-KEY-1". The **-y** flag extracts the public key from an existing identity, useful for sharing your recipient without exposing the private key.

# CAVEATS

Keep the private key secret; anyone with it can decrypt files meant for you. There is no key revocation mechanism. Back up your keys securely. The **-o** flag will not overwrite existing files. Post-quantum recipients are approximately 2000 characters long.

# HISTORY

**age-keygen** was released alongside age in **2019** by **Filippo Valsorda**. It provides a minimal key generation tool that follows the same design philosophy as age itself: simple, secure, and with no unnecessary options. Version **1.3.0** added hybrid post-quantum key generation with the **-pq** flag.

# SEE ALSO

[age](/man/age)(1), [ssh-keygen](/man/ssh-keygen)(1), [gpg](/man/gpg)(1)
