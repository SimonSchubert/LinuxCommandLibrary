# TAGLINE

Convert private keys to PKCS#8 format

# TLDR

**Convert to PKCS#8**

```openssl pkcs8 -topk8 -in [key.pem] -out [key-pkcs8.pem]```

**Convert with encryption**

```openssl pkcs8 -topk8 -in [key.pem] -out [key.p8] -v2 aes256```

**Convert to unencrypted**

```openssl pkcs8 -topk8 -in [key.pem] -out [key.p8] -nocrypt```

**Convert from PKCS#8**

```openssl pkcs8 -in [key.p8] -out [key.pem] -traditional```

# SYNOPSIS

**openssl** **pkcs8** [_options_]

# PARAMETERS

**-topk8**
> Convert to PKCS#8.

**-in** _FILE_
> Input key file.

**-out** _FILE_
> Output file.

**-nocrypt**
> No encryption.

**-v2** _CIPHER_
> Encryption cipher.

**-inform** _FORMAT_
> Input format.

**-outform** _FORMAT_
> Output format.

**-traditional**
> Write a traditional format private key when **-topk8** is not used.

**-scrypt**
> Use scrypt for private key encryption.

**-passin** _ARG_
> Input password source.

**-passout** _ARG_
> Output password source.

# DESCRIPTION

**openssl pkcs8** converts private keys between traditional OpenSSL format and the standardized PKCS#8 format. PKCS#8 is a widely supported container format for private keys that works across different cryptographic libraries and programming languages.

The **-topk8** flag converts from traditional to PKCS#8 format. Keys can be encrypted with various ciphers using **-v2** or left unencrypted with **-nocrypt**. Without **-topk8**, the tool reads PKCS#8 input and writes an unencrypted PKCS#8 PEM key, unless **-traditional** is given.

# CAVEATS

With **-topk8** the output is encrypted unless **-nocrypt** is given, using AES-256 with HMAC-SHA256 by default. Some older implementations do not support PKCS#5 v2.0.

# HISTORY

PKCS#8 support in OpenSSL enables **private key format** conversion.

# SEE ALSO

[openssl](/man/openssl)(1), [openssl-rsa](/man/openssl-rsa)(1)

# RESOURCES

```[Source code](https://github.com/openssl/openssl)```

```[Documentation](https://docs.openssl.org/master/man1/openssl-pkcs8/)```

<!-- verified: 2026-11-08 -->
