# TAGLINE

Convert scamper warts binary files to human-readable text

# TLDR

**Convert** a warts file to text

```sc_warts2text [input.warts]```

**Convert** multiple warts files

```sc_warts2text [file1.warts] [file2.warts]```

**Convert** a compressed warts file via pipe

```gzcat [input.warts.gz] | sc_warts2text```

**Convert** with IP address descriptions

```sc_warts2text -d [ip2descr.txt] [input.warts]```

# SYNOPSIS

**sc_warts2text** [**-d** _ip2descr-file_] [_file_ ...]

# PARAMETERS

**-d** _ip2descr-file_
> File containing IP-address to description mappings, one mapping per line. The descriptions are substituted for IP addresses in the output.

# DESCRIPTION

**sc_warts2text** converts scamper warts binary measurement files into human-readable plain text. It is part of the scamper toolkit for active Internet measurement.

Warts is scamper's native binary format for storing measurement results such as traceroutes, pings, and path MTU discovery data. sc_warts2text decodes this format and writes a textual representation to stdout, suitable for inspection or further processing with standard text tools.

Multiple input files may be specified; they are processed in order. Input can also be read from stdin via a pipe, which is useful for decompressing files on the fly.

# SEE ALSO

[scamper](/man/scamper)(1), [sc_wartsdump](/man/sc_wartsdump)(1), [sc_warts2json](/man/sc_warts2json)(1)
