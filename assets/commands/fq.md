# TAGLINE

jq for binary formats

# TLDR

**Inspect** a binary file

```fq . [file]```

**Decode** specific format

```fq -d [mp4|flac|jpeg|...] . [file]```

**Query** specific fields

```fq '.tracks[0].duration' [file]```

**Open** interactive REPL

```fq -i [file]```

# SYNOPSIS

**fq** [_options_] [_query_] [_file_]

# PARAMETERS

**-d, --decode** _FORMAT_
> Decode as specific format

**-i, --interactive**
> Start interactive REPL

**-n, --null-input**
> Use null as input value

**-r, --raw-output**
> Output raw strings

**-c, --compact-output**
> Compact output (no pretty print)

**--help**
> Display help and exit

**--version**
> Display version and exit

# DESCRIPTION

**fq** is a tool for inspecting binary files using a jq-like query language. It can decode and query over 100 different binary formats including MP4, FLAC, JPEG, PCAP, ELF, and many more.

The tool provides a REPL with autocomplete, allowing interactive exploration of binary structures. It's useful for debugging, reverse engineering, and understanding file formats.

# USAGE

Basic inspection:

```fq . file.mp4```

Query specific field:

```fq '.meta.moov.tracks[0].mdia.minf.stbl.sample_descriptions[0].width' video.mp4```

Decode as raw bytes:

```fq -d raw '.[0:10]' file```

List supported formats:

```fq -h```

# CAVEATS

Large files may consume significant memory. Some formats have incomplete support. Binary data output may require terminal with proper encoding support. Complex nested queries can be slow.

# HISTORY

**fq** was created to bring the power of jq to binary data, making it easier to inspect and understand binary file formats without specialized tools.

# SEE ALSO

[jq](https://stedolan.github.io/jq/), [xxd](https://linux.die.net/man/1/xxd), [hexdump](https://linux.die.net/man/1/hexdump), [binwalk](https://github.com/ReFirmLabs/binwalk)
