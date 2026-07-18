# TAGLINE

Modern file encryption and signing tool

# TLDR

**Encrypt** files with a passphrase

```kryptor -e [file]```

**Decrypt** files

```kryptor -d [file.kryptor]```

**Generate** a key pair

```kryptor -g```

**Sign** a file

```kryptor -s [file]```

**Verify** a signature

```kryptor -v [file]```

# SYNOPSIS

**kryptor** [*options*] [*files*...]

# DESCRIPTION

**kryptor** encrypts and signs files using modern cryptographic primitives with few knobs—positioned as a friendlier alternative to **age** + **minisign**. Supports passphrases, symmetric keys, and asymmetric multi-recipient encryption; private keys are encrypted at rest. Cross-platform CLI for Windows, Linux, and macOS.

# PARAMETERS

**-e**, **--encrypt**

> Encrypt files/directories.

**-d**, **--decrypt**

> Decrypt.

**-g**, **--generate**

> Create key pairs.

**-s**, **--sign** / **-v**, **--verify**

> Detached signatures with optional comments.

Exact long options and recipient flags: **kryptor --help** or https://www.kryptor.co.uk/

# CAVEATS

Keep passphrases and private keys safe; lost keys mean lost data. Verify you are using the official binary. Encryption does not replace backups.

# SEE ALSO

[age](/man/age)(1), [minisign](/man/minisign)(1), [gpg](/man/gpg)(1)

# RESOURCES

```[Source code](https://github.com/samuel-lucas6/Kryptor)```

```[Homepage](https://www.kryptor.co.uk/)```

<!-- verified: 2026-07-19 -->
