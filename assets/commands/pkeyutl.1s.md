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

**openssl pkeyutl** performs public key operations. Sign, verify, encrypt, decrypt.

The tool handles raw key operations. Low-level crypto utility.

openssl pkeyutl does key ops.

# CAVEATS

Part of OpenSSL. Low-level operations. Algorithm specific options.

# HISTORY

openssl pkeyutl provides **public key operations** across algorithms.

# SEE ALSO

[openssl](/man/openssl)(1), [openssl-pkey](/man/openssl-pkey)(1)

