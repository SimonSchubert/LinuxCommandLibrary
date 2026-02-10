# TAGLINE

general-purpose key processing tool

# TLDR

**View private key details**

```openssl pkey -in [private.key] -text -noout```

**Extract public key**

```openssl pkey -in [private.key] -pubout -out [public.key]```

**Convert to DER format**

```openssl pkey -in [private.key] -outform DER -out [private.der]```

**Encrypt private key**

```openssl pkey -in [private.key] -aes256 -out [encrypted.key]```

**Remove encryption**

```openssl pkey -in [encrypted.key] -out [decrypted.key]```

**Check key validity**

```openssl pkey -in [private.key] -check```

# SYNOPSIS

**openssl pkey** [_options_] [-in _file_] [-out _file_]

# PARAMETERS

**-in** _file_
> Input file.

**-out** _file_
> Output file.

**-inform** _format_
> Input format (PEM, DER).

**-outform** _format_
> Output format.

**-pubout**
> Output public key.

**-text**
> Print text form.

**-noout**
> Don't output key.

**-check**
> Check key.

**-aes256**
> Encrypt output.

# DESCRIPTION

**openssl pkey** is a general-purpose key processing tool. It can convert between formats, extract public keys, encrypt/decrypt private keys, and display key information.

Works with RSA, EC, ED25519, and other key types.

# KEY FORMATS

```
PEM - Base64 encoded (-----BEGIN...)
DER - Binary format
```

# CAVEATS

-nodes or no encryption outputs unprotected key. Always protect private keys.

# HISTORY

The pkey command provides unified key handling across different algorithms in OpenSSL.

# SEE ALSO

[openssl-genpkey](/man/openssl-genpkey)(1), [openssl-rsa](/man/openssl-rsa)(1), [openssl-ec](/man/openssl-ec)(1)
