# TLDR

**View CRL contents**

```openssl crl -in [crl.pem] -text -noout```

**Convert PEM to DER**

```openssl crl -in [crl.pem] -outform DER -out [crl.der]```

**Convert DER to PEM**

```openssl crl -in [crl.der] -inform DER -out [crl.pem]```

**Verify CRL signature**

```openssl crl -in [crl.pem] -CAfile [ca.crt] -verify```

**Get CRL hash**

```openssl crl -in [crl.pem] -hash -noout```

# SYNOPSIS

**openssl crl** [_options_] [-in _file_] [-out _file_]

# PARAMETERS

**-in** _file_
> Input CRL.

**-out** _file_
> Output file.

**-inform** _format_
> Input format (PEM, DER).

**-outform** _format_
> Output format.

**-text**
> Print text form.

**-noout**
> Don't output CRL.

**-verify**
> Verify signature.

**-hash**
> Print hash.

**-CAfile** _file_
> CA certificate.

# DESCRIPTION

**openssl crl** processes Certificate Revocation Lists. CRLs list certificates that have been revoked before their expiration date.

The command can display, convert, and verify CRL files.

# CRL CONTENTS

```
Issuer            - CA that issued CRL
Last Update       - When CRL was issued
Next Update       - When next CRL expected
Revoked Certs     - List of serial numbers
```

# CAVEATS

CRLs can grow large. Consider OCSP for real-time checking. CRL must be current.

# HISTORY

CRLs are defined in X.509 standard as part of PKI infrastructure, implemented in OpenSSL since early versions.

# SEE ALSO

[openssl-ca](/man/openssl-ca)(1), [openssl-verify](/man/openssl-verify)(1), [openssl-ocsp](/man/openssl-ocsp)(1)
