# TLDR

**Generate key**

```sq key generate --userid "[Name <email>]"```

**Encrypt file**

```sq encrypt --recipient-file [key.pgp] [file]```

**Decrypt file**

```sq decrypt [file.pgp]```

**Sign file**

```sq sign [file]```

**Verify signature**

```sq verify --signer-file [key.pgp] [file.sig]```

**Inspect packet**

```sq inspect [file.pgp]```

# SYNOPSIS

**sq** _command_ [_options_] [_args_]

# PARAMETERS

**key**
> Key management.

**encrypt**
> Encrypt data.

**decrypt**
> Decrypt data.

**sign**
> Create signature.

**verify**
> Verify signature.

**inspect**
> Examine packets.

**--recipient-file** _FILE_
> Recipient key.

# DESCRIPTION

**sq** is Sequoia PGP CLI. It manages OpenPGP operations.

Modern PGP implementation. Written in Rust.

Key generation and management. Standard operations.

Encryption and signing. OpenPGP compatible.

Packet inspection. Debug PGP data.

# CAVEATS

Different from GPG. Sequoia-specific. Some features differ.

# HISTORY

**sq** is the CLI for **Sequoia PGP**, a modern OpenPGP implementation written in Rust by former GnuPG developers.

# SEE ALSO

[gpg](/man/gpg)(1), [age](/man/age)(1), [rage](/man/rage)(1)
