# TAGLINE

Verbose dump of information in scamper warts files

# TLDR

**Display verbose warts file contents**

```sc_wartsdump [input.warts]```

**Dump multiple warts files**

```sc_wartsdump [file1.warts] [file2.warts]```

# SYNOPSIS

**sc_wartsdump** [_file_...]

# DESCRIPTION

**sc_wartsdump** provides a verbose dump of the information contained in a sequence of warts files, which are the binary output format of scamper. The output is structured and suitable for initial analysis of results, but the format is not guaranteed to remain stable and is not suitable for automated parsing.

For machine-parsable output, use **sc_warts2json** or **sc_warts2text** instead. Part of the scamper Internet measurement toolkit developed by CAIDA.

# CAVEATS

The output format of sc_wartsdump may change between releases and should not be relied upon for automated processing. Use sc_warts2json for stable structured output.

# SEE ALSO

[sc_warts2text](/man/sc_warts2text)(1), [scamper](/man/scamper)(1)

