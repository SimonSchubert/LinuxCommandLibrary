# TAGLINE

creates and parses PKCS#12 files

# TLDR

**Create PKCS12 from cert and key**

```openssl pkcs12 -export -out [certificate.p12] -inkey [private.key] -in [certificate.crt]```

**Include CA chain**

```openssl pkcs12 -export -out [cert.p12] -inkey [key.pem] -in [cert.pem] -certfile [ca-chain.pem]```

**Extract certificate**

```openssl pkcs12 -in [certificate.p12] -clcerts -nokeys -out [certificate.crt]```

**Extract private key**

```openssl pkcs12 -in [certificate.p12] -nocerts -out [private.key]```

**Extract all to PEM**

```openssl pkcs12 -in [certificate.p12] -out [all.pem] -nodes```

# SYNOPSIS

**openssl pkcs12** [_options_]

# PARAMETERS

**-export**
> Create PKCS12 file.

**-in** _file_
> Input file.

**-out** _file_
> Output file.

**-inkey** _file_
> Private key file.

**-certfile** _file_
> Additional certificates.

**-nokeys**
> Don't output keys.

**-nocerts**
> Don't output certs.

**-nodes**
> Don't encrypt output.

**-name** _name_
> Friendly name.

# DESCRIPTION

**openssl pkcs12** creates and parses PKCS#12 files (.p12, .pfx). These files bundle private keys, certificates, and CA chains into a single encrypted file.

Commonly used for importing/exporting certificates in browsers and applications.

# COMMON USES

```
- Export from browser/keychain
- Import to Java keystore
- Certificate backup
- Cross-platform transfer
```

# CAVEATS

PKCS12 passwords can be brute-forced. Use strong passwords. Legacy format uses weak encryption by default.

# HISTORY

PKCS#12 is a standard from RSA Laboratories, widely supported for portable certificate storage.

# SEE ALSO

[openssl-x509](/man/openssl-x509)(1), [openssl-rsa](/man/openssl-rsa)(1), [keytool](/man/keytool)(1)
