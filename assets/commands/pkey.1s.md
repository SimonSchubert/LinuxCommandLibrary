# TAGLINE

Process and convert public and private keys

# TLDR

**View public key**

```openssl pkey -in [key.pem] -pubout```

**Convert key format**

```openssl pkey -in [key.pem] -out [key.der] -outform DER```

**View key details**

```openssl pkey -in [key.pem] -text -noout```

**Remove passphrase**

```openssl pkey -in [encrypted.pem] -out [decrypted.pem]```

# SYNOPSIS

**openssl** **pkey** [_options_]

# PARAMETERS

**-in** _FILE_
> Input key file.

**-out** _FILE_
> Output file.

**-pubout**
> Output public key.

**-text**
> Print key details.

**-noout**
> No key output.

**-outform** _FORMAT_
> Output format (PEM, DER).

# DESCRIPTION

**openssl pkey** is a unified key processing utility that handles public and private keys regardless of algorithm type (RSA, EC, DSA, Ed25519, etc.). It replaces the older algorithm-specific commands like **openssl rsa** and **openssl ec**.

The tool can extract public keys from private keys with **-pubout**, convert between PEM and DER formats, display key parameters with **-text**, and remove or add passphrase encryption. It works with any key type that OpenSSL supports.

# CAVEATS

Part of OpenSSL. Algorithm agnostic. Replaces rsa/dsa/ec commands.

# HISTORY

openssl pkey provides **unified key handling** across algorithms.

# SEE ALSO

[openssl](/man/openssl)(1), [openssl-genpkey](/man/openssl-genpkey)(1)

