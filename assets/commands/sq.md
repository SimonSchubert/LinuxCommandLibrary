# TAGLINE

Modern Sequoia OpenPGP command-line tool

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

**sq** is the command-line interface for Sequoia PGP, a modern OpenPGP implementation written in Rust. It provides key generation, encryption, decryption, signing, and signature verification following the OpenPGP standard.

The tool supports standard PGP workflows including key pair generation with user IDs, file encryption for recipients using public keys, and detached or inline signatures. The **inspect** subcommand allows examining OpenPGP packet structures for debugging and verification purposes.

Sequoia PGP was developed by former GnuPG contributors as a memory-safe, modular alternative to traditional PGP implementations. sq aims to provide a cleaner command-line interface while maintaining full OpenPGP compatibility.

# CAVEATS

Different from GPG. Sequoia-specific. Some features differ.

# HISTORY

**sq** is the CLI for **Sequoia PGP**, a modern OpenPGP implementation written in Rust by former GnuPG developers.

# SEE ALSO

[gpg](/man/gpg)(1), [age](/man/age)(1), [rage](/man/rage)(1)
