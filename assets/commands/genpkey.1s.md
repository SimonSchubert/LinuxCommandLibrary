# TAGLINE

OpenSSL private key generation utility

# TLDR

**Generate RSA key**

```openssl genpkey -algorithm RSA -out [key.pem]```

**Generate with size**

```openssl genpkey -algorithm RSA -pkeyopt rsa_keygen_bits:[4096] -out [key.pem]```

**Generate EC key**

```openssl genpkey -algorithm EC -pkeyopt ec_paramgen_curve:[P-256] -out [key.pem]```

**Generate with password**

```openssl genpkey -algorithm RSA -aes256 -out [key.pem]```

# SYNOPSIS

**openssl genpkey** [_options_]

# PARAMETERS

**-algorithm** _ALG_
> Key algorithm: RSA, EC, ED25519.

**-out** _FILE_
> Output file.

**-pkeyopt** _OPT:VALUE_
> Algorithm-specific option.

**-aes256**
> Encrypt with AES-256.

**-outform** _FORMAT_
> Output format: PEM, DER.

**--help**
> Display help information.

# DESCRIPTION

**genpkey** is an OpenSSL command for generating private keys. It supports modern algorithms including RSA, EC, and Ed25519 with unified syntax.

The tool creates private keys for TLS certificates, SSH, and other cryptographic uses. It provides more options than older commands like genrsa.

genpkey is the recommended way to generate keys in OpenSSL 1.0+.

# CAVEATS

Key security depends on parameters. Protect private keys. Algorithm support varies by OpenSSL version.

# HISTORY

genpkey was added to **OpenSSL** as a unified key generation command, replacing algorithm-specific commands like genrsa and gendsa with a consistent interface.

# SEE ALSO

[openssl](/man/openssl)(1), [openssl-req](/man/openssl-req)(1)
