# TAGLINE

Fast-decompress LZ codec CLI for write-once, read-many data

# TLDR

**Compress** a file (writes `FILE.misa77`)

```misa compress [file]```

**Decompress** a `.misa77` archive

```misa decompress [file.misa77]```

**Compress** at the **fastest-decode** level

```misa compress -l 0 [file]```

**Compress** with the default **better-ratio** level

```misa compress -l 1 [file]```

**Suggest** tuned parameters for a file (writes `FILE.misap`)

```misa suggest [file]```

**Compress** using a previously suggested **params** file

```misa compress --params [file.misap] [file]```

**Force overwrite** and set output path

```misa compress -f -o [out.misa77] [file]```

# SYNOPSIS

**misa** **compress** | **decompress** | **suggest** [_options_] _FILE_

# DESCRIPTION

**misa** is the command-line front end for **misa77**, an LZ-based lossless compression codec aimed at write-once, read-many workloads. It prioritizes very high single-threaded decompression throughput and modest ratios (comparable to high-effort LZ4), at the cost of slower compression. Memory use is bounded: at most about 5 MB across compression modes, and effectively none for decompression.

The CLI works on **single files only** (no directory recursion or pipe/streaming support). Archive archives as `.misa77`; parameter vectors from `suggest` use `.misap`. Compression level **0** favors decode speed; level **1** (default) favors ratio with similar encode throughput. Experimental flags such as **--adaptive**, **--params**, and **--yolo** offer decode-optimized or autotuned modes and must not be combined with each other or with **--level**.

misa77 requires a little-endian 64-bit system and a C++20 toolchain to build. The stream format may change while the project is pre-1.0; invalid input is treated as undefined behavior and the tool is experimental.

# PARAMETERS

**compress** _FILE_
> Compress _FILE_ to _FILE_.misa77 (or **-o** path).

**decompress** _FILE.misa77_
> Decompress a misa77 archive back to the original name (or **-o** path).

**suggest** _FILE_
> Sample the input and write a tuned params file (_FILE_.misap) for later **--params** use.

**-l** _N_, **--level** _N_
> Compression level for **compress** (0 = fastest decode, 1 = default better ratio).

**-o** _PATH_
> Output path.

**-f**
> Overwrite existing output without prompting.

**--adaptive**
> Autotune compression for decode speed (best on homogeneous data); experimental; not combinable with **--level**.

**--params** _FILE.misap_
> Compress with parameters from **misa suggest**; experimental; not combinable with **--level**.

**--yolo**
> High-effort, decode-optimized experimental mode; not combinable with **--level**.

**--tune** **loose**|**tight**
> Tradeoff for **--adaptive** / **suggest** (similar to levels 0/1; default loose).

**--sample** _MB_
> How much input to sample when picking params (default 2 MB).

# CAVEATS

File-based only: use **tar** (or similar) first for directories or multi-file bundles. Format may change in 0.x releases. The decoder assumes valid misa77 input; corrupted streams are not hardened. Prefer **misa** for cold storage and read-heavy archives where decompression speed matters more than encode time or maximum ratio.

# SEE ALSO

[lz4](/man/lz4)(1), [zstd](/man/zstd)(1), [gzip](/man/gzip)(1), [tar](/man/tar)(1)

# RESOURCES

```[Source code](https://github.com/welcome-to-the-sunny-side/misa77)```

<!-- verified: 2026-07-15 -->
