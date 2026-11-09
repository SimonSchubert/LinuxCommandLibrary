# TAGLINE

Inspect the Peer Index Table of MRT BGP routing dumps

# TLDR

**List all peers** in an MRT RIB dump

```peerindex [path/to/rib.bz2]```

**List only peers referenced** by at least one RIB entry

```peerindex -r [path/to/rib.bz2]```

**Write the peer list to a file**

```peerindex -o [peers.txt] [path/to/rib.gz]```

**Process several dumps** at once

```peerindex -r [path/to/rib.*.gz]```

**Read uncompressed MRT data** from standard input

```cat [path/to/rib.mrt] | peerindex```

# SYNOPSIS

**peerindex** [_options_] [_files_...]

# PARAMETERS

_FILES_
> MRT RIB dumps, plain or compressed with gzip, bzip2 or xz. With no files, or with **-**, uncompressed MRT data is read from standard input.

**-o** _FILE_
> Write output to _FILE_ instead of standard output. If given multiple times, the last one is used.

**-r**, **--only-refs**
> Only print peers referenced by RIB entries.

**-h**, **-?**, **--help**
> Print a short help message.

# DESCRIPTION

**peerindex** reads Multi-Threaded Routing Toolkit (MRT) Routing Information Base dumps, as published by route collecting projects, and prints the PEER INDEX TABLE records of the TABLE_DUMPV2 format. It is part of **µbgpsuite**.

Each peer is printed on one line as `peer-address peer-asn|ASN32BIT`. The ASN32BIT field is 1 if the peer AS number was encoded in 32 bits and 0 otherwise. A value of 0 only describes how the entry was encoded, not whether the peer supports 32-bit AS numbers.

The compression format is chosen from the file extension, case-insensitively. Files with an unknown or missing extension are treated as uncompressed.

# CAVEATS

Multiple PEER INDEX TABLES are concatenated in the output, so the same peer may appear more than once when several dumps are processed.

Corruption is tolerated where possible. If it cannot be tolerated, the whole dump is dropped with a diagnostic on standard error and processing moves to the next file. The exit status is greater than 0 if any errors were detected.

# HISTORY

**peerindex** was written by **Lorenzo Cogotti** as part of µbgpsuite. It conforms to RFC 6396 and RFC 8050.

# SEE ALSO

[bgpgrep](/man/bgpgrep)(1), [awk](/man/awk)(1), [grep](/man/grep)(1)

# RESOURCES

```[Source code](https://codeberg.org/1414codeforge/ubgpsuite)```

<!-- verified: 2026-11-09 -->
