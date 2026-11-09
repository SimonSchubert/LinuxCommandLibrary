# TAGLINE

Parse and display ASN.1 encoded data

# TLDR

**Parse** a PEM file (the default format)

```openssl asn1parse -in [file.pem]```

Parse a **DER** encoded file

```openssl asn1parse -inform DER -in [file.der]```

Parse with **indented** output

```openssl asn1parse -i -in [file.pem]```

Parse with **offset**

```openssl asn1parse -inform DER -in [file.der] -offset [100]```

Show **structure** with hex dump

```openssl asn1parse -inform DER -in [file.der] -dump```

Parse **nested** ASN.1 structure at a given offset

```openssl asn1parse -in [file.pem] -strparse [offset]```

**Generate** and show a simple encoded value

```openssl asn1parse -genstr 'UTF8:[Hello World]'```

# SYNOPSIS

**openssl asn1parse** [**-help**] [**-inform** _DER|PEM|B64_] [**-in** _filename_] [**-out** _filename_] [**-noout**] [**-offset** _number_] [**-length** _number_] [**-i**] [**-oid** _filename_] [**-dump**] [**-dlimit** _num_] [**-strparse** _offset_] [**-genstr** _string_] [**-genconf** _file_] [**-strictpem**] [**-item** _name_]

# DESCRIPTION

**asn1parse** is an OpenSSL diagnostic utility that parses ASN.1 (Abstract Syntax Notation One) encoded data. It displays the structure of certificates, keys, and other cryptographic objects in a human-readable format.

The tool is invaluable for debugging certificate issues, understanding data structures, and analyzing encoded data.

# PARAMETERS

**-help**
> Print usage message.

**-in** _filename_
> Input file, default is standard input.

**-inform** _DER|PEM|B64_
> Input format; the default is PEM.

**-out** _filename_
> Output file to place the DER encoded data into. Most useful with **-strparse**.

**-noout**
> Don't output the parsed version of the input file.

**-offset** _number_
> Starting offset to begin parsing, default is start of file.

**-length** _number_
> Number of bytes to parse, default is until end of file.

**-i**
> Indent the output according to the depth of the structures.

**-oid** _filename_
> File of additional OBJECT IDENTIFIERs: numeric OID, short name and long name on each line.

**-dump**
> Dump unknown data in hex format.

**-dlimit** _num_
> Like **-dump**, but only the first num bytes are output.

**-strparse** _offset_
> Parse the contents octets of the ASN.1 object starting at offset. Can be repeated to drill down into a nested structure.

**-genstr** _string_
> Generate encoded data based on string using ASN1_generate_nconf format.

**-genconf** _file_
> Generate encoded data from file using ASN1_generate_nconf format.

**-strictpem**
> Ignore any data prior to the BEGIN marker or after the END marker in PEM. When used, **-inform** is ignored.

**-item** _name_
> Attempt to decode and print the data as an ASN1_ITEM name.

# CAVEATS

Requires understanding of ASN.1 structure. Output can be verbose for complex objects. Mainly for debugging, not routine use.

# HISTORY

**asn1parse** is part of OpenSSL, which has been the standard cryptographic toolkit since the late **1990s**.

# SEE ALSO

[openssl](/man/openssl)(1), [openssl-x509](/man/openssl-x509)(1), [openssl-req](/man/openssl-req)(1)

# RESOURCES

```[Source code](https://github.com/openssl/openssl)```

```[Homepage](https://openssl-library.org/)```

```[Documentation](https://docs.openssl.org/master/man1/openssl-asn1parse/)```

<!-- verified: 2026-11-09 -->
