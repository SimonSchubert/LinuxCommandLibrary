# TAGLINE

Compress and decompress LZ0 containers

# TLDR

**Compress** a file at the default level

```lz0 c input.bin output.lz0```

Compress at level **9** (slowest, ultra parser)

```lz0 c -9 input.bin output.lz0```

**Decompress** a container

```lz0 d output.lz0 restored.bin```

# SYNOPSIS

**lz0** **c** [_-1_ .. _-9_] _input_ _output.lz0_

**lz0** **d** _input.lz0_ _output_

# PARAMETERS

**c** [_-N_] _input_ _output_

> Compress _input_ into an LZ01 container at _output_. _N_ is a level from **1** to **9**. The default level is **6**. Level **9** selects the ultra parser.

**d** _input_ _output_

> Decompress an LZ01 container. The output size is taken from the container header.

# DESCRIPTION

**lz0** is the reference command-line tool for the LZ0 compressor. LZ0 is a small LZ codec aimed at blobs from a few hundred kilobytes up to a few megabytes, with a decoder that does not allocate. This binary both compresses and decompresses. The separate **lz0dec** program is a decompressor only, with a benchmark mode and a choice of decoder engines.

The on-disk container is an 8-byte header followed by the bitstream. The first four bytes are the ASCII magic **LZ01**. The next four bytes are the uncompressed size, little-endian. An empty input is stored as those eight bytes and nothing else. The compressor rejects an input of 4 GiB or larger.

Build both tools from a checkout with **make lz0**. That writes **bin/lz0** and **bin/lz0dec**. The Linux release tarballs ship those two names. The license is MIT. There is no install prefix in the Makefile; copy the binaries onto **PATH** yourself.

# CAVEATS

**lz0** always takes an explicit input path and output path. It does not read stdin or write stdout, and it does not accept GNU **tar**-style combined flags.

**d** checks the **LZ01** magic and requires the decoded length to match the size in the header. A truncated or foreign file fails instead of writing a partial result.

Level **9** is much slower than the default. Levels outside **1** through **9** are not accepted; a token such as **-0** is treated as a filename and the usage line is printed.

# SEE ALSO

[lz0dec](/man/lz0dec)(1), [lz4](/man/lz4)(1), [zstd](/man/zstd)(1), [xz](/man/xz)(1)

# RESOURCES

```[Source code](https://github.com/seb3773/lz0)```

<!-- verified: 2026-11-22 -->
