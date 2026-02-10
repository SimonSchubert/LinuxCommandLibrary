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

**--help**
> Display help information.

# DESCRIPTION

**openssl ocsp** queries OCSP responders. Checks certificate revocation status.

The tool validates certificates online. Part of OpenSSL suite.

# CAVEATS

Requires network access. Part of OpenSSL. OCSP responder must be available.

# HISTORY

OCSP support was added to OpenSSL for **online certificate revocation** checking.

# SEE ALSO

[openssl](/man/openssl)(1), [openssl-verify](/man/openssl-verify)(1), [openssl-crl](/man/openssl-crl)(1)

