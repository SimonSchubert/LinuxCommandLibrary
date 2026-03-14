# TAGLINE

verifies certificate chains against trusted CAs

# TLDR

**Verify certificate**

```openssl verify [certificate.crt]```

**Verify with CA file**

```openssl verify -CAfile [ca.crt] [certificate.crt]```

**Verify with CA directory**

```openssl verify -CApath [/etc/ssl/certs/] [certificate.crt]```

**Verify certificate chain**

```openssl verify -CAfile [ca.crt] -untrusted [intermediate.crt] [leaf.crt]```

**Show verification details**

```openssl verify -verbose [certificate.crt]```

**Show the built certificate chain**

```openssl verify -show_chain -CAfile [ca.crt] [certificate.crt]```

**Verify with CRL checking**

```openssl verify -crl_download -crl_check -CAfile [ca.crt] [certificate.crt]```

# SYNOPSIS

**openssl verify** [_options_] _cert_...

# PARAMETERS

**-CAfile** _file_
> CA certificate file for trusted root certificates.

**-CApath** _dir_
> Directory of CA certificates (hashed filenames).

**-CAstore** _uri_
> URI for trusted CA certificate store.

**-untrusted** _file_
> File containing untrusted intermediate certificates.

**-partial_chain**
> Allow verification to succeed with incomplete chain if any certificate in the chain is trusted.

**-verbose**
> Print extra information about verification operations.

**-show_chain**
> Display information about the certificate chain built during verification.

**-x509_strict**
> Strict X.509 compliance checking (disables non-compliant workarounds).

**-attime** _timestamp_
> Verify at specified time (seconds since epoch) instead of current time.

**-no_check_time**
> Suppress checking validity period of certificates and CRLs.

**-purpose** _purpose_
> Certificate purpose (sslclient, sslserver, smimesign, smimeencrypt, etc.).

**-CRLfile** _file_
> File containing CRLs in PEM format for revocation checking.

**-crl_download**
> Attempt to download CRL information for certificates.

**-crl_check**
> Check end entity certificate against CRL.

**-crl_check_all**
> Check all certificates in chain against CRL.

**-check_ss_sig**
> Verify the signature on the self-signed root CA (disabled by default).

# DESCRIPTION

**openssl verify** verifies certificate chains against trusted CAs. It checks signatures, validity periods, and trust chains. Returns exit status 0 on successful verification.

# CAVEATS

Does not check revocation by default; use -crl_check or -crl_download. System CA store location varies by distribution. Use -verbose for diagnostic info on verification failures.

# HISTORY

Certificate verification is fundamental to PKI, with openssl verify providing command-line access to OpenSSL's verification functions. The -show_chain option was added in OpenSSL 1.1.0.

# SEE ALSO

[openssl-x509](/man/openssl-x509)(1), [openssl-s_client](/man/openssl-s_client)(1), [openssl-crl](/man/openssl-crl)(1)
