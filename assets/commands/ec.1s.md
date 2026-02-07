# TAGLINE

Elliptic Curve key operations

# TLDR

**Generate EC key**

```openssl ec -in [key.pem] -text -noout```

**Generate EC private** key

```openssl ecparam -genkey -name [prime256v1] -out [key.pem]```

**Convert EC key** format

```openssl ec -in [key.pem] -outform DER -out [key.der]```

# SYNOPSIS

**openssl ec** [_options_]

# PARAMETERS

**-in** _FILE_
> Input key file.

**-out** _FILE_
> Output key file.

**-text**
> Print key in text form.

**-noout**
> Don't output encoded key.

**-outform** _FORMAT_
> Output format: PEM, DER.

**-param_enc** _TYPE_
> Parameter encoding type.

**--help**
> Display help information.

# DESCRIPTION

**openssl ec** handles Elliptic Curve (EC) key operations including reading, writing, and converting EC private keys. EC cryptography provides strong security with smaller key sizes compared to RSA.

The command reads EC keys in various formats and can output them in PEM or DER encoding. It's used for key management in TLS configurations and digital signatures.

EC keys are generated using ecparam with a named curve, then processed with the ec command for format conversion or examination.

# CAVEATS

Curve selection affects security and compatibility. Some curves have known weaknesses. Not all systems support all curves.

# HISTORY

OpenSSL EC support was added as elliptic curve cryptography became standard for TLS. EC offers equivalent security to RSA with significantly smaller keys.

# SEE ALSO

[openssl](/man/openssl)(1), [openssl-ecparam](/man/openssl-ecparam)(1)
