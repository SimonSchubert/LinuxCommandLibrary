# TAGLINE

Parse and display ASN.1 encoded data

# TLDR

**Parse** ASN.1 data

```openssl asn1parse -in [file.der]```

Parse **PEM** encoded file

```openssl asn1parse -in [file.pem] -inform PEM```

Parse with **offset**

```openssl asn1parse -in [file.der] -offset [100]```

Show **structure** with hex dump

```openssl asn1parse -in [file.der] -dump```

Parse **nested** ASN.1 structure at a given offset

```openssl asn1parse -in [file.pem] -strparse [offset]```

# SYNOPSIS

**openssl asn1parse** [**-help**] [**-inform** _DER|PEM_] [**-in** _filename_] [**-out** _filename_] [**-noout**] [**-offset** _number_] [**-length** _number_] [**-i**] [**-dump**] [**-dlimit** _num_] [**-strparse** _offset_] [**-genstr** _string_] [**-genconf** _file_] [**-strictpem**]

# DESCRIPTION

**asn1parse** is an OpenSSL diagnostic utility that parses ASN.1 (Abstract Syntax Notation One) encoded data. It displays the structure of certificates, keys, and other cryptographic objects in a human-readable format.

The tool is invaluable for debugging certificate issues, understanding data structures, and analyzing encoded data.

# PARAMETERS

**-help**
> Print usage message.

**-in** _filename_
> Input file, default is standard input.

**-inform** _DER|PEM_
> Input format; the default is PEM.

**-out** _filename_
> Output file to place the DER encoded data into.

**-noout**
> Don't output the parsed version of the input file.

**-offset** _number_
> Starting offset to begin parsing, default is start of file.

**-length** _number_
> Number of bytes to parse, default is until end of file.

**-i**
> Indent the output according to the depth of the structures.

**-dump**
> Dump unknown data in hex format.

**-dlimit** _num_
> Like **-dump**, but only the first num bytes are output.

**-strparse** _offset_
> Parse the contents octets of the ASN.1 object starting at offset.

**-genstr** _string_
> Generate encoded data based on string using ASN1_generate_nconf format.

**-genconf** _file_
> Generate encoded data from file using ASN1_generate_nconf format.

**-strictpem**
> Ignore any data prior to the BEGIN marker or after END marker in PEM.

# CAVEATS

Requires understanding of ASN.1 structure. Output can be verbose for complex objects. Mainly for debugging, not routine use.

# HISTORY

**asn1parse** is part of OpenSSL, which has been the standard cryptographic toolkit since the late **1990s**.

# SEE ALSO

[openssl](/man/openssl)(1), [openssl-x509](/man/openssl-x509)(1), [openssl-req](/man/openssl-req)(1)
