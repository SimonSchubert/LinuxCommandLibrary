# TAGLINE

extracts printable GPG key data

# TLDR

**Extract secret from GPG key**

```paperkey --secret-key [secret.gpg] --output [paperkey.txt]```

**Restore from paper backup**

```paperkey --pubring [public.gpg] --secrets [paperkey.txt] --output [restored.gpg]```

**Output in base16**

```paperkey --secret-key [secret.gpg] --output-type base16```

# SYNOPSIS

**paperkey** [_options_]

# PARAMETERS

**--secret-key** _FILE_
> Secret key file.

**--pubring** _FILE_
> Public keyring for restore.

**--secrets** _FILE_
> Paper backup file.

**--output** _FILE_
> Output file.

**--output-type** _TYPE_
> Output format (raw, base16).

# DESCRIPTION

**paperkey** extracts printable GPG key data. Creates paper backups.

The tool enables offline key storage. Requires public key to restore.

# CAVEATS

Requires public key for restore. Print and store securely.

# HISTORY

paperkey was created for **paper-based GPG key** backup and recovery.

# SEE ALSO

[gpg](/man/gpg)(1), [gpg2](/man/gpg2)(1)

