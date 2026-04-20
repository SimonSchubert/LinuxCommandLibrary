# TAGLINE

Process and convert public and private keys with OpenSSL

# TLDR

**Extract the public key from a private key**

```openssl pkey -in [key.pem] -pubout -out [pub.pem]```

**Convert a PEM-encoded key to DER**

```openssl pkey -in [key.pem] -out [key.der] -outform DER```

**Print key parameters without re-encoding the key**

```openssl pkey -in [key.pem] -text -noout```

**Remove the passphrase from an encrypted key**

```openssl pkey -in [encrypted.pem] -out [decrypted.pem]```

**Encrypt a private key using AES-256**

```openssl pkey -in [key.pem] -out [enc.pem] -aes-256-cbc```

**Read a public key and convert its format**

```openssl pkey -pubin -in [pub.pem] -outform DER -out [pub.der]```

# SYNOPSIS

**openssl** **pkey** [_options_]

# PARAMETERS

**-in** _FILE_
> Input key file (stdin if omitted).

**-out** _FILE_
> Output file (stdout if omitted).

**-inform** _FORMAT_
> Input format: **PEM**, **DER**, or **ENGINE**.

**-outform** _FORMAT_
> Output format: **PEM** or **DER**.

**-passin** _arg_
> Input passphrase source (e.g. **pass:**, **env:**, **file:**).

**-passout** _arg_
> Output passphrase source for encryption.

**-pubin**
> Input file is a public key.

**-pubout**
> Output a public key only.

**-text**
> Print key details in human-readable form.

**-text_pub**
> Print only the public portion in text form.

**-noout**
> Do not output the encoded key (useful with **-text**).

**-traditional**
> Write the private key using the legacy "traditional" format (e.g. PKCS#1 for RSA).

**-_cipher_**
> Any OpenSSL cipher (e.g. **-aes-256-cbc**, **-des-ede3**) encrypts the output key.

# DESCRIPTION

**openssl pkey** is a unified key-processing utility that works with public and private keys of any supported algorithm (RSA, DSA, EC, Ed25519, Ed448, X25519, X448). It replaces the older algorithm-specific commands **openssl rsa**, **openssl dsa**, and **openssl ec**.

The tool can extract public keys with **-pubout**, convert between PEM and DER encodings, display parameters with **-text**, and add or remove passphrase encryption. When a cipher option is provided, the resulting private key is written in encrypted PKCS#8 form.

# CAVEATS

Writing to an unencrypted private-key file removes the existing passphrase. Ensure filesystem permissions are restrictive (e.g. **chmod 600**). The **-traditional** flag is required by some tools that cannot read modern PKCS#8 encoded keys.

# HISTORY

**openssl pkey** was introduced alongside the generic **EVP_PKEY** interface to provide a single tool for all key algorithms, superseding the algorithm-specific **rsa**, **dsa**, and **ec** subcommands.

# SEE ALSO

[openssl](/man/openssl)(1), [openssl-genpkey](/man/openssl-genpkey)(1), [openssl-pkcs8](/man/openssl-pkcs8)(1), [openssl-rsa](/man/openssl-rsa)(1)
