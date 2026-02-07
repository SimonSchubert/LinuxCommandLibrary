# TAGLINE

symmetric encryption and decryption utility

# TLDR

**Encrypt file with** cipher

```openssl enc -aes-256-cbc -in [plaintext] -out [encrypted]```

**Decrypt file**

```openssl enc -d -aes-256-cbc -in [encrypted] -out [plaintext]```

**Encrypt with base64** output

```openssl enc -aes-256-cbc -a -in [plaintext] -out [encrypted.b64]```

**Use specific password**

```openssl enc -aes-256-cbc -k "[password]" -in [file] -out [encrypted]```

# SYNOPSIS

**openssl enc** [_options_]

# PARAMETERS

**-aes-256-cbc**
> Cipher algorithm (many available).

**-d**
> Decrypt mode.

**-in** _FILE_
> Input file.

**-out** _FILE_
> Output file.

**-k** _PASSWORD_
> Password for encryption.

**-a**, **-base64**
> Base64 encode/decode.

**-salt**
> Use salt (default).

**--help**
> Display help information.

# DESCRIPTION

**openssl enc** performs symmetric encryption and decryption using various cipher algorithms. It's the general-purpose encryption command in OpenSSL.

The command supports numerous ciphers including AES, DES, Blowfish, and others. Key derivation uses PBKDF2 with a salt by default. Output can be binary or base64-encoded.

Common use cases include file encryption, creating encrypted backups, and data protection workflows.

# CAVEATS

Password-based encryption may be weaker than key-based. Old OpenSSL versions use weak KDF. Ciphers have varying security levels. Lost passwords mean lost data.

# HISTORY

openssl enc is part of **OpenSSL**, the open-source cryptography toolkit. It provides command-line access to symmetric encryption algorithms for data protection.

# SEE ALSO

[openssl](/man/openssl)(1), [gpg](/man/gpg)(1), [age](/man/age)(1)
