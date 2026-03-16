# TAGLINE

processes Certificate Revocation Lists

# TLDR

**View CRL contents**

```openssl crl -in [crl.pem] -text -noout```

**Convert PEM to DER**

```openssl crl -in [crl.pem] -outform DER -out [crl.der]```

**Convert DER to PEM**

```openssl crl -in [crl.der] -inform DER -out [crl.pem]```

**Verify** CRL signature against a CA certificate

```openssl crl -in [crl.pem] -CAfile [ca.crt] -verify```

**Get CRL issuer name hash**

```openssl crl -in [crl.pem] -hash -noout```

Display CRL **fingerprint**

```openssl crl -in [crl.pem] -fingerprint -noout```

Show CRL **issuer** and update dates

```openssl crl -in [crl.pem] -issuer -lastupdate -nextupdate -noout```

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
> Print CRL in human-readable text form.

**-noout**
> Do not output the encoded version of the CRL.

**-verify**
> Verify the CRL signature. Implicitly enabled if -CApath, -CAfile, or -CAstore is specified.

**-hash**
> Output a hash of the issuer name, used to look up CRLs in a directory by issuer name.

**-fingerprint**
> Output the fingerprint of the CRL.

**-issuer**
> Output the issuer name.

**-lastupdate**
> Output the lastUpdate field.

**-nextupdate**
> Output the nextUpdate field.

**-crlnumber**
> Output the CRL number.

**-nameopt** _option_
> Specify how subject or issuer names are displayed.

**-CAfile** _file_
> CA certificate file for verification.

**-CApath** _dir_
> Directory of CA certificates for verification.

**-gendelta** _file_
> Output a comparison of the main CRL and the one specified.

**-badsig**
> Corrupt the signature before writing; useful for testing.

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
