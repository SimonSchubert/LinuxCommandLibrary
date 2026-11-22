# TAGLINE

Decompress LZ0 containers and benchmark the decoders

# TLDR

**Decompress** with the fastest engine

```lz0dec input.lz0 restored.bin```

Decompress with the **tiny C decoder**

```lz0dec -e min input.lz0 restored.bin```

**Benchmark** decompression throughput

```lz0dec -b input.lz0```

Show the **version**

```lz0dec -v```

# SYNOPSIS

**lz0dec** [_options_] _input.lz0_ _output_

**lz0dec** **-b** _input.lz0_

# PARAMETERS

_input_ _output_

> Decompress an LZ01 container with the **fast** engine. Same as **--engine fast**.

**-e**, **--engine** _fast_|_compact_|_min_

> Choose the decoder, then give the input and output paths. **fast** is the default high-throughput assembly decoder. **compact** is the smaller assembly decoder. **min** is the C99 decoder, about 200 bytes of code.

**-b**, **--bench** _input_

> Decode the container in memory and print sizes, ratio, and throughput. No output file is written.

**-h**, **--help**

> Print the usage line and the engines built into this binary.

**-v**, **--version**

> Print the decompressor version. The source identifies this CLI as **0.2.0**.

# DESCRIPTION

**lz0dec** only decompresses. It reads the same LZ01 container that **lz0 c** writes: 8-byte header, then the bitstream. Use it when you want a small decompressor, a specific engine, or a timing run. **lz0 d** is the matching subcommand on the compressor binary and has no benchmark mode.

**fast** and **compact** are assembly decoders. The Linux x86_64, arm64, and riscv64 builds include them. The **min** engine is portable C and is what the help lists on platforms without those assembly files. **--help** prints only the engines compiled into the binary you are running.

Build it with **make lz0dec** (or **make lz0**, which builds both). The binary is **bin/lz0dec**. The license is MIT.

# CAVEATS

The file must start with the **LZ01** magic and the decoded length must match the size stored in the header. An empty container (uncompressed size 0) writes an empty output file.

**--bench** does not write the decompressed bytes to disk. **--engine** and **--bench** are separate modes; the benchmark prints one line per engine that this binary contains.

This program cannot compress. Create containers with **lz0 c**.

# SEE ALSO

[lz0](/man/lz0)(1), [lz4](/man/lz4)(1), [zstd](/man/zstd)(1), [xz](/man/xz)(1)

# RESOURCES

```[Source code](https://github.com/seb3773/lz0)```

<!-- verified: 2026-11-22 -->
