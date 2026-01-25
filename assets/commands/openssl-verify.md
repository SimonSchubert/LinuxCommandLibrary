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

# SYNOPSIS

**openssl verify** [_options_] _cert_...

# PARAMETERS

**-CAfile** _file_
> CA certificate file.

**-CApath** _dir_
> CA certificate directory.

**-untrusted** _file_
> Untrusted intermediates.

**-partial_chain**
> Allow partial chain.

**-verbose**
> Verbose output.

**-x509_strict**
> Strict X.509 checking.

**-attime** _time_
> Verification time.

**-purpose** _purpose_
> Certificate purpose.

# DESCRIPTION

**openssl verify** verifies certificate chains against trusted CAs. It checks signatures, validity periods, and trust chains.

Returns 0 for valid certificates, non-zero for invalid.

# VERIFICATION CHECKS

```
- Signature validity
- Validity period
- Trust chain to CA
- Key usage
- Certificate purpose
```

# EXAMPLE

```bash
# Verify server certificate
openssl verify -CAfile ca-bundle.crt server.crt
# Output: server.crt: OK
```

# CAVEATS

Doesn't check revocation by default. System CA store location varies. Use -verbose for diagnostic info.

# HISTORY

Certificate verification is fundamental to PKI, with openssl verify providing command-line access to OpenSSL's verification functions.

# SEE ALSO

[openssl-x509](/man/openssl-x509)(1), [openssl-s_client](/man/openssl-s_client)(1), [openssl-crl](/man/openssl-crl)(1)
