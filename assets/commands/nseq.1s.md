# TAGLINE

create or examine a Netscape certificate sequence

# TLDR

**Extract the certificates from a Netscape certificate sequence**

```openssl nseq -in [nseq.pem] -out [certs.pem]```

**Create a Netscape certificate sequence from a file of certificates**

```openssl nseq -in [certs.pem] -toseq -out [nseq.pem]```

# SYNOPSIS

**openssl nseq** [**-help**] [**-in** _filename_] [**-out** _filename_] [**-toseq**] [**-provider** _name_] [**-provider-path** _path_] [**-propquery** _propq_]

# PARAMETERS

**-in** _filename_
> Input file. Defaults to standard input.

**-out** _filename_
> Output file. Defaults to standard output.

**-toseq**
> Reverse the operation: build a Netscape certificate sequence from a file of PEM certificates instead of extracting them.

**-provider** _name_, **-provider-path** _path_, **-propquery** _propq_
> Load and select OpenSSL 3 providers.

**-help**
> Print a usage message.

# DESCRIPTION

**openssl nseq** reads a file containing a Netscape certificate sequence and prints the certificates it contains in PEM format, or, with **-toseq**, wraps a file of certificates into such a sequence.

A Netscape certificate sequence is an old Netscape-specific format that was sometimes sent to browsers as an alternative to PKCS#7 when delivering several certificates at once (for example during certificate enrollment). It was also used by Netscape Certificate Server.

# CAVEATS

The format is obsolete; use PKCS#7 (**openssl crl2pkcs7**, **openssl pkcs7**) or plain concatenated PEM files for certificate bundles today. This is not a number sequence generator; for that, see **seq**.

# SEE ALSO

[openssl](/man/openssl)(1), [openssl-x509](/man/openssl-x509)(1), [openssl-pkcs12](/man/openssl-pkcs12)(1), [seq](/man/seq)(1)

# RESOURCES

```[Source code](https://github.com/openssl/openssl)```

```[Homepage](https://www.openssl.org/)```

```[Documentation](https://docs.openssl.org/master/man1/openssl-nseq/)```

<!-- verified: 2026-11-07 -->
