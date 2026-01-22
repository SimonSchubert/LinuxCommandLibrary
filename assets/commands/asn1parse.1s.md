# TLDR

**Parse** ASN.1 data

```asn1parse -in [file.der]```

Parse **PEM** encoded file

```asn1parse -in [file.pem] -inform PEM```

Parse with **offset**

```asn1parse -in [file.der] -offset [100]```

Show **structure** in detail

```asn1parse -in [file.der] -dump```

# SYNOPSIS

**asn1parse** [_-in file_] [_-inform format_] [_-offset n_] [_-dump_] [_options_]

# DESCRIPTION

**asn1parse** is an OpenSSL diagnostic utility that parses ASN.1 (Abstract Syntax Notation One) encoded data. It displays the structure of certificates, keys, and other cryptographic objects in a human-readable format.

The tool is invaluable for debugging certificate issues, understanding data structures, and analyzing encoded data.

# PARAMETERS

**-in** _file_
> Input file

**-inform** _format_
> Input format: PEM or DER

**-out** _file_
> Output file

**-noout**
> Don't output parsed structure

**-offset** _n_
> Start parsing at offset n

**-length** _n_
> Parse n bytes

**-dump**
> Hex dump of content

**-strparse** _offset_
> Parse nested structure at offset

**-genstr** _string_
> Generate ASN.1 from string

# CAVEATS

Requires understanding of ASN.1 structure. Output can be verbose for complex objects. Mainly for debugging, not routine use.

# HISTORY

**asn1parse** is part of OpenSSL, which has been the standard cryptographic toolkit since the late **1990s**.

# SEE ALSO

[openssl](/man/openssl)(1), [x509](/man/x509)(1), [req](/man/req)(1)
