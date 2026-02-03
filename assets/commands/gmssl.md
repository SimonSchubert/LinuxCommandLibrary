# TLDR

**Generate SM2 key pair**

```gmssl sm2keygen -pass [password] -out [key.pem]```

**Compute SM3 hash of a file**

```gmssl sm3 < [file]```

**Encrypt with SM4**

```gmssl sm4 -encrypt -in [plaintext.txt] -out [ciphertext.bin]```

**Decrypt with SM4**

```gmssl sm4 -decrypt -in [ciphertext.bin] -out [plaintext.txt]```

**Generate random bytes**

```gmssl rand -hex [32]```

**Sign with SM2**

```gmssl sm2sign -key [key.pem] -pass [password] -in [file] -out [sig]```

# SYNOPSIS

**gmssl** _command_ [_options_]

# SUBCOMMANDS

**sm2keygen**
> Generate SM2 key pair.

**sm2sign**
> Sign with SM2.

**sm2verify**
> Verify SM2 signature.

**sm3**
> Compute SM3 hash.

**sm4**
> SM4 encryption/decryption.

**rand**
> Generate random data.

**version**
> Display version.

# PARAMETERS

**-in** _file_
> Input file.

**-out** _file_
> Output file.

**-pass** _password_
> Key password.

**-encrypt**
> Encrypt mode.

**-decrypt**
> Decrypt mode.

**-hex**
> Output in hexadecimal.

# DESCRIPTION

**GmSSL** is an open-source cryptographic toolkit supporting Chinese national cryptographic algorithms (GuoMi/GM). It provides implementations of SM2 (elliptic curve cryptography), SM3 (hash function), SM4 (block cipher), SM9 (identity-based cryptography), and ZUC (stream cipher). The command-line interface is similar to OpenSSL.

# HISTORY

GmSSL was developed to support China's cryptographic standards, which are mandated for use in Chinese government and financial systems. The project is maintained by Peking University and the open-source community.

# SEE ALSO

[openssl](/man/openssl)(1), [gpg](/man/gpg)(1)

