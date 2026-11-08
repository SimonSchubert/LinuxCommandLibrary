# TAGLINE

Convert scamper warts files to CSV format

# TLDR

**Convert warts traceroutes to CSV**

```sc_warts2csv [input.warts] > [output.csv]```

**Convert a compressed warts file** from stdin

```bzcat [file.warts.bz2] | sc_warts2csv```

# SYNOPSIS

**sc_warts2csv** [_file_ ...]

# DESCRIPTION

**sc_warts2csv** dumps traceroute records from scamper warts binary files as CSV for analysis in spreadsheets or data tools. It reads standard input when no file is given. Part of scamper toolkit.

# CAVEATS

Only traceroute records are supported; other warts record types produce no output.

# SEE ALSO

[sc_warts2json](/man/sc_warts2json)(1), [sc_wartsdump](/man/sc_wartsdump)(1), [scamper](/man/scamper)(1)

# RESOURCES

```[Homepage](https://www.caida.org/catalog/software/scamper/)```

```[Documentation](https://man.freebsd.org/cgi/man.cgi?query=sc_warts2csv)```

<!-- verified: 2026-11-08 -->
