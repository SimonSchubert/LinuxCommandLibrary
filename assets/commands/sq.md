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

# SUBCOMMANDS

**key**
> Generate, modify, and inspect OpenPGP keys.

**encrypt**
> Encrypt data for one or more recipients.

**decrypt**
> Decrypt data using a secret key.

**sign**
> Create an OpenPGP signature (inline, detached, or cleartext).

**verify**
> Verify an OpenPGP signature.

**inspect**
> Examine the structure of OpenPGP packets without decrypting.

**cert**
> Manage TPKs (transferable public keys / certificates).

**pki**
> Authenticate and certify keys via a Web of Trust.

# COMMON OPTIONS

**--recipient-file** _FILE_
> Encrypt for the certificate(s) in _FILE_.

**--signer-file** _FILE_
> Use the secret key in _FILE_ to sign or verify with.

**--output** _FILE_, **-o** _FILE_
> Write output to _FILE_ instead of stdout.

**--binary**
> Emit binary OpenPGP data instead of ASCII-armored output.

**--force**
> Overwrite existing output files.

# DESCRIPTION

**sq** is the command-line interface for Sequoia PGP, a modern OpenPGP implementation written in Rust. It provides key generation, encryption, decryption, signing, and signature verification following the OpenPGP standard.

The tool supports standard PGP workflows including key pair generation with user IDs, file encryption for recipients using public keys, and detached or inline signatures. The **inspect** subcommand allows examining OpenPGP packet structures for debugging and verification purposes.

Sequoia PGP was developed by former GnuPG contributors as a memory-safe, modular alternative to traditional PGP implementations. sq aims to provide a cleaner command-line interface while maintaining full OpenPGP compatibility.

# CAVEATS

Different from GPG. Sequoia-specific. Some features differ.

# HISTORY

**sq** is the CLI for **Sequoia PGP**, a modern OpenPGP implementation written in Rust by former GnuPG developers.

# INSTALL

```apt: sudo apt install sq```

```dnf: sudo dnf install sequoia-sq```

```pacman: sudo pacman -S sequoia-sq```

```apk: sudo apk add sequoia-sq```

```zypper: sudo zypper install sequoia-sq```

```brew: brew install sq```

```nix: nix profile install nixpkgs#sq```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[gpg](/man/gpg)(1), [age](/man/age)(1), [rage](/man/rage)(1)
