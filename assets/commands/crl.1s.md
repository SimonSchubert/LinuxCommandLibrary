# TLDR

**Display CRL information** in text format

```openssl crl -in [crl.pem] -text -noout```

**Convert CRL from PEM** to DER format

```openssl crl -in [crl.pem] -outform DER -out [crl.der]```

**Convert CRL from DER** to PEM format

```openssl crl -in [crl.der] -inform DER -out [crl.pem]```

**Verify CRL signature** with CA certificate

```openssl crl -in [crl.pem] -CAfile [ca.pem] -verify```

**Print the issuer** of the CRL

```openssl crl -in [crl.pem] -issuer -noout```

**Print the last and next update** dates

```openssl crl -in [crl.pem] -lastupdate -nextupdate -noout```

# SYNOPSIS

**openssl crl** [_options_] [_-in file_] [_-out file_]

# PARAMETERS

**-in** _FILE_
> Input CRL file to process.

**-out** _FILE_
> Output file for the converted CRL.

**-inform** _FORMAT_
> Input format: PEM or DER.

**-outform** _FORMAT_
> Output format: PEM or DER.

**-text**
> Print CRL in human-readable text format.

**-noout**
> Don't output the encoded CRL.

**-verify**
> Verify the signature on the CRL.

**-CAfile** _FILE_
> CA certificate file for verification.

**-issuer**
> Print the issuer name.

**-lastupdate**
> Print the last update time.

**-nextupdate**
> Print the next update time.

**-hash**
> Print the hash of the CRL issuer name.

# DESCRIPTION

**openssl crl** is the OpenSSL command for processing Certificate Revocation Lists (CRLs). CRLs are lists of digital certificates that have been revoked by the issuing Certificate Authority before their scheduled expiration date.

The command can parse, convert, and verify CRLs. It supports both PEM (Base64-encoded) and DER (binary) formats. CRL verification ensures the list was signed by the claimed CA and hasn't been tampered with.

CRLs are essential for PKI (Public Key Infrastructure) security, allowing systems to check whether a certificate has been revoked. The command provides detailed information about revoked certificates, revocation dates, and CRL validity periods.

# CAVEATS

CRLs can become large and may impact performance. Modern systems often prefer OCSP (Online Certificate Status Protocol) for real-time revocation checking. CRL verification requires the CA certificate that signed the CRL.

# HISTORY

Certificate Revocation Lists were defined in **X.509** standards and implemented in OpenSSL since its early versions. The CRL format was specified in **RFC 5280**. OpenSSL's crl command provides comprehensive tools for working with this critical PKI component.

# SEE ALSO

[x509](/man/x509)(1), [ca](/man/ca)(1), [verify](/man/verify)(1), [openssl](/man/openssl)(1)
