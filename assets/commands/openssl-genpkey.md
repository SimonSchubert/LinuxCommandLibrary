# TLDR

**Generate RSA private key**

```openssl genpkey -algorithm RSA -out [private.key] -pkeyopt rsa_keygen_bits:[4096]```

**Generate EC private key**

```openssl genpkey -algorithm EC -out [private.key] -pkeyopt ec_paramgen_curve:[P-256]```

**Generate Ed25519 key**

```openssl genpkey -algorithm ED25519 -out [private.key]```

**Generate encrypted private key**

```openssl genpkey -algorithm RSA -out [private.key] -aes256```

**Generate with custom parameters**

```openssl genpkey -algorithm RSA -out [key.pem] -pkeyopt rsa_keygen_bits:2048 -pkeyopt rsa_keygen_pubexp:65537```

# SYNOPSIS

**openssl genpkey** [_options_]

# PARAMETERS

**-algorithm** _alg_
> Key algorithm.

**-out** _file_
> Output file.

**-outform** _format_
> Output format (PEM, DER).

**-aes256**, **-aes128**
> Encrypt output.

**-pkeyopt** _opt:val_
> Algorithm options.

**-pass** _arg_
> Output passphrase.

# DESCRIPTION

**openssl genpkey** generates private keys for various algorithms. It's the modern replacement for algorithm-specific commands like genrsa and ecparam.

Supports RSA, EC, ED25519, ED448, X25519, X448, and more.

# ALGORITHM OPTIONS

```
RSA: rsa_keygen_bits, rsa_keygen_pubexp
EC:  ec_paramgen_curve (P-256, P-384, secp256k1)
```

# CAVEATS

Protect generated private keys. Use strong encryption for storage. ED25519 recommended for new applications.

# HISTORY

genpkey was introduced as a unified key generation command, replacing older algorithm-specific commands in OpenSSL.

# SEE ALSO

[openssl-pkey](/man/openssl-pkey)(1), [openssl-req](/man/openssl-req)(1), [openssl-rsa](/man/openssl-rsa)(1)
