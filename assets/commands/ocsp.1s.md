# TAGLINE

queries OCSP responders

# TLDR

**Check certificate status**

```openssl ocsp -issuer [issuer.pem] -cert [cert.pem] -url [ocsp_url]```

**Query OCSP responder**

```openssl ocsp -issuer [issuer.pem] -serial [serial_number] -url [ocsp_url]```

**Verify response**

```openssl ocsp -respin [response.der] -verify_other [ca.pem]```

**Create OCSP request**

```openssl ocsp -issuer [issuer.pem] -cert [cert.pem] -reqout [request.der]```

# SYNOPSIS

**openssl** **ocsp** [_options_]

# PARAMETERS

**-issuer** _FILE_
> Issuer certificate.

**-cert** _FILE_
> Certificate to check.

**-serial** _NUMBER_
> Certificate serial number.

**-url** _URL_
> OCSP responder URL.

**-respin** _FILE_
> Read OCSP response.

**-reqout** _FILE_
> Write OCSP request.

**-CAfile** _FILE_
> Trusted CA certificates used to verify the responder's signature.

**-text**
> Print request and response in human-readable text form.

**-header** _name=value_
> Add a custom HTTP header to the OCSP request (e.g. Host).

# DESCRIPTION

**openssl ocsp** is the OpenSSL command for the Online Certificate Status Protocol (RFC 6960). It can act as a client, sending a status query for one or more certificates to an OCSP responder and verifying the signed response, and it also provides a minimal test responder.

As a client it reports whether a certificate is good, revoked, or unknown. A certificate is identified either by file (**-cert**) together with its issuer (**-issuer**), or by issuer plus serial number (**-serial**).

# CAVEATS

Requires network access to reach the responder when using **-url**. The responder's signing certificate must chain to a trust anchor supplied via **-CAfile** for verification to succeed. Part of OpenSSL.

# HISTORY

OCSP support was added to OpenSSL for **online certificate revocation** checking.

# SEE ALSO

[openssl](/man/openssl)(1), [openssl-verify](/man/openssl-verify)(1), [openssl-crl](/man/openssl-crl)(1)

# RESOURCES

```[Source code](https://github.com/openssl/openssl)```

```[Documentation](https://docs.openssl.org/master/man1/openssl-ocsp/)```

<!-- verified: 2026-11-07 -->

