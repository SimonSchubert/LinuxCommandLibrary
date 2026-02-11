# TAGLINE

Perform low-level public key operations

# TLDR

**Sign data**

```openssl pkeyutl -sign -in [data] -inkey [key.pem] -out [signature]```

**Verify signature**

```openssl pkeyutl -verify -in [data] -sigfile [sig] -inkey [key.pem]```

**Encrypt data**

```openssl pkeyutl -encrypt -in [data] -pubin -inkey [pub.pem] -out [encrypted]```

**Decrypt data**

```openssl pkeyutl -decrypt -in [encrypted] -inkey [key.pem] -out [decrypted]```

# SYNOPSIS

**openssl** **pkeyutl** [_options_]

# PARAMETERS

**-sign**
> Sign operation.

**-verify**
> Verify signature.

**-encrypt**
> Encrypt data.

**-decrypt**
> Decrypt data.

**-in** _FILE_
> Input file.

**-inkey** _FILE_
> Key file.

**-out** _FILE_
> Output file.

# DESCRIPTION

**openssl pkeyutl** performs low-level public key cryptographic operations including signing, verification, encryption, and decryption. Unlike higher-level OpenSSL commands, it operates directly on raw data without hashing or padding abstractions.

This tool works with any key type supported by OpenSSL and is algorithm-agnostic. It is useful for custom cryptographic workflows where fine-grained control over the signing or encryption process is needed, such as working with specific padding schemes or key agreement protocols.

# CAVEATS

Part of OpenSSL. Low-level operations. Algorithm specific options.

# HISTORY

openssl pkeyutl provides **public key operations** across algorithms.

# SEE ALSO

[openssl](/man/openssl)(1), [openssl-pkey](/man/openssl-pkey)(1)

