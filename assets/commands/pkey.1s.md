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

**openssl pkey** processes public/private keys. Generic key utility.

The tool handles various key types. RSA, EC, DSA support.

openssl pkey manages keys.

# CAVEATS

Part of OpenSSL. Algorithm agnostic. Replaces rsa/dsa/ec commands.

# HISTORY

openssl pkey provides **unified key handling** across algorithms.

# SEE ALSO

[openssl](/man/openssl)(1), [openssl-genpkey](/man/openssl-genpkey)(1)

