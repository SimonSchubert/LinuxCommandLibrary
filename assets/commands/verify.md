# TAGLINE

Validate X.509 certificate chains

# TLDR

**Verify a certificate** against system CA store

```openssl verify [certificate.pem]```

**Verify with a specific CA file**

```openssl verify -CAfile [ca-bundle.pem] [certificate.pem]```

**Verify with intermediate certificates**

```openssl verify -untrusted [intermediate.pem] [certificate.pem]```

**Verify and show the certificate chain**

```openssl verify -show_chain [certificate.pem]```

**Verify hostname matches certificate**

```openssl verify -verify_hostname [example.com] [certificate.pem]```

**Verify with verbose output**

```openssl verify -verbose [certificate.pem]```

**Verify with CRL checking**

```openssl verify -crl_check -CRLfile [crl.pem] [certificate.pem]```

# SYNOPSIS

**openssl verify** [**-CAfile** _file_] [**-CApath** _dir_] [**-untrusted** _file_] [**-show_chain**] [**-verbose**] [**-verify_hostname** _host_] [_certificate_...]

# PARAMETERS

**-CAfile** _file_
> File containing trusted CA certificates in PEM format.

**-CApath** _dir_
> Directory containing trusted CA certificates (hashed filenames).

**-no-CAfile**, **-no-CApath**, **-no-CAstore**
> Do not load the default file, directory or store of trusted certificates.

**-untrusted** _file_
> File containing untrusted intermediate certificates for chain building.

**-trusted** _file_
> File containing explicitly trusted certificates.

**-show_chain**
> Display the full certificate chain that was built.

**-verbose**
> Print extra information about verification process.

**-verify_hostname** _hostname_
> Verify that the certificate matches the specified hostname.

**-verify_email** _email_
> Verify that the certificate matches the specified email address.

**-verify_ip** _ip_
> Verify that the certificate matches the specified IP address.

**-verify_depth** _num_
> Maximum depth of certificate chain to verify.

**-crl_check**
> Check end-entity certificate against CRL.

**-crl_check_all**
> Check entire chain against CRL.

**-CRLfile** _file_
> File or URI containing CRLs in PEM or DER format. May be repeated.

**-crl_download**
> Attempt to download CRLs using the certificates' CDP entries.

**-x509_strict**
> Apply strict X.509 compliance checks.

**-partial_chain**
> Accept chains anchored by intermediate certificates.

**-purpose** _purpose_
> Intended use: sslclient, sslserver, smimesign, smimeencrypt, etc.

**-no_check_time**
> Do not check certificate validity against current time.

**-attime** _timestamp_
> Verify the chain at the specified UNIX timestamp instead of current time.

**-policy** _oid_
> Require the specified certificate policy OID in the chain.

**-CAstore** _uri_
> URI to a store of trusted CA certificates (e.g., file: or store:).

# DESCRIPTION

**openssl verify** validates X.509 certificate chains by checking signatures, validity periods, and trust anchors. It builds a chain from the target certificate up to a trusted root CA, verifying each link.

The command first constructs the certificate chain by locating issuer certificates, then validates each certificate's signature, expiration dates, and constraints. The chain must terminate at a trusted root CA found in the CA file, CA path, or system trust store.

Verification returns 0 on success. Failures produce error codes indicating the problem: expired certificates, signature failures, missing issuers, or constraint violations. Common errors include "unable to get local issuer certificate" (missing intermediate) and "certificate has expired".

The command is typically invoked as **openssl verify** rather than standalone **verify**.

# CAVEATS

Each target certificate is given in its own file, and with no file a single certificate is read from standard input. Options must come before the first certificate file, since anything after it is treated as a certificate. OpenSSL ships no trust anchors of its own, so the default trust store depends on how the distribution configured it. Hostname verification requires explicit **-verify_hostname** flag. Self-signed certificates need **-partial_chain** or inclusion in trusted store.

# HISTORY

The **verify** command has been part of **OpenSSL** since its early releases in the late **1990s**. It implements certificate path validation as defined in RFC 5280 (X.509 PKI). The command has evolved to support modern requirements like hostname verification, multiple trust anchors, and advanced policy checking. The **-show_chain** option was added in OpenSSL 1.1.0, and **-engine** was removed in OpenSSL 4.0.

# SEE ALSO

[openssl](/man/openssl)(1), [openssl-verify](/man/openssl-verify)(1), [openssl-x509](/man/openssl-x509)(1), [openssl-s_client](/man/openssl-s_client)(1), [openssl-req](/man/openssl-req)(1), [openssl-ca](/man/openssl-ca)(1)

# RESOURCES

```[Source code](https://github.com/openssl/openssl)```

```[Homepage](https://www.openssl.org/)```

```[Documentation](https://docs.openssl.org/master/man1/openssl-verify/)```

<!-- verified: 2026-11-09 -->
