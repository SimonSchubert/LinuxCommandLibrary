# TLDR

**View RSA key details**

```openssl rsa -in [private.key] -text -noout```

**Extract public key**

```openssl rsa -in [private.key] -pubout -out [public.key]```

**Remove passphrase**

```openssl rsa -in [encrypted.key] -out [decrypted.key]```

**Add passphrase**

```openssl rsa -in [private.key] -aes256 -out [encrypted.key]```

**Convert PEM to DER**

```openssl rsa -in [private.key] -outform DER -out [private.der]```

**Check key validity**

```openssl rsa -in [private.key] -check```

# SYNOPSIS

**openssl rsa** [_options_] [-in _file_] [-out _file_]

# PARAMETERS

**-in** _file_
> Input file.

**-out** _file_
> Output file.

**-pubout**
> Output public key.

**-pubin**
> Input is public key.

**-text**
> Print components.

**-noout**
> Don't output key.

**-check**
> Check consistency.

**-aes256**, **-aes128**
> Encrypt output.

**-inform**, **-outform**
> Input/output format.

# DESCRIPTION

**openssl rsa** processes RSA keys. It can convert formats, extract public keys, add/remove encryption, and verify key integrity.

For general key operations, consider using openssl pkey instead.

# KEY COMPONENTS

```
n - Modulus
e - Public exponent
d - Private exponent
p, q - Prime factors
```

# CAVEATS

RSA-specific; use pkey for other algorithms. Protect private keys. Consider Ed25519 for new applications.

# HISTORY

RSA key handling has been core OpenSSL functionality since the library's creation, though genpkey/pkey are now preferred.

# SEE ALSO

[openssl-pkey](/man/openssl-pkey)(1), [openssl-genpkey](/man/openssl-genpkey)(1), [openssl-genrsa](/man/openssl-genrsa)(1)
