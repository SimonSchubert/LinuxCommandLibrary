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

```openssl pkcs8 -in [key.p8] -out [key.pem]```

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

# DESCRIPTION

**openssl pkcs8** converts private keys between traditional OpenSSL format and the standardized PKCS#8 format. PKCS#8 is a widely supported container format for private keys that works across different cryptographic libraries and programming languages.

The **-topk8** flag converts from traditional to PKCS#8 format. Keys can be encrypted with various ciphers using **-v2** or left unencrypted with **-nocrypt**. Without **-topk8**, the tool reads PKCS#8 input and outputs in traditional format.

# CAVEATS

Part of OpenSSL. Key format conversion. Encryption optional.

# HISTORY

PKCS#8 support in OpenSSL enables **private key format** conversion.

# SEE ALSO

[openssl](/man/openssl)(1), [openssl-rsa](/man/openssl-rsa)(1)

