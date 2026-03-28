# TAGLINE

OpenSSL private key generation utility

# TLDR

**Generate RSA key**

```openssl genpkey -algorithm RSA -out [key.pem]```

**Generate with size**

```openssl genpkey -algorithm RSA -pkeyopt rsa_keygen_bits:[4096] -out [key.pem]```

**Generate EC key**

```openssl genpkey -algorithm EC -pkeyopt ec_paramgen_curve:[P-256] -out [key.pem]```

**Generate Ed25519 key**

```openssl genpkey -algorithm ED25519 -out [key.pem]```

**Generate RSA key encrypted with a passphrase**

```openssl genpkey -algorithm RSA -aes256 -out [key.pem]```

**Generate key with passphrase from stdin**

```openssl genpkey -algorithm RSA -aes256 -pass stdin -out [key.pem]```

# SYNOPSIS

**openssl genpkey** [_options_]

# PARAMETERS

**-algorithm** _ALG_
> Key algorithm: RSA, EC, ED25519, ED448, X25519, X448.

**-out** _FILE_
> Output file (default: stdout).

**-pkeyopt** _OPT:VALUE_
> Algorithm-specific option (e.g., rsa_keygen_bits:4096, ec_paramgen_curve:P-256).

**-aes256**
> Encrypt output key with AES-256-CBC.

**-pass** _ARG_
> Passphrase source for encryption: pass:phrase, stdin, file:path, env:var.

**-outform** _FORMAT_
> Output format: PEM (default), DER.

**-text**
> Print key details in human-readable form in addition to encoded output.

**-help**
> Display help information.

# DESCRIPTION

**genpkey** is the OpenSSL unified command for generating private keys. It supports RSA, EC (NIST curves), Ed25519, Ed448, X25519, and X448 algorithms through a consistent interface.

The tool creates private keys for TLS certificates, code signing, and other cryptographic uses. It supersedes older algorithm-specific commands like **genrsa** and **gendsa** with a single, more flexible interface.

**genpkey** is the recommended way to generate keys since OpenSSL 1.0.0. For RSA, the default key size is 2048 bits; 4096 bits is recommended for higher security.

# CAVEATS

Key security depends on parameters. Protect private keys. Algorithm support varies by OpenSSL version.

# HISTORY

genpkey was added to **OpenSSL** as a unified key generation command, replacing algorithm-specific commands like genrsa and gendsa with a consistent interface.

# SEE ALSO

[openssl](/man/openssl)(1), [openssl-genrsa](/man/openssl-genrsa)(1), [openssl-pkey](/man/openssl-pkey)(1), [openssl-req](/man/openssl-req)(1)
