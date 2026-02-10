# TAGLINE

parallel implementation of bzip2 compression

# TLDR

**Compress file**

```pbzip2 [file]```

**Decompress file**

```pbzip2 -d [file.bz2]```

**Keep original file**

```pbzip2 -k [file]```

**Set compression level**

```pbzip2 -[9] [file]```

**Use specific number of processors**

```pbzip2 -p[4] [file]```

**Compress from stdin**

```cat [file] | pbzip2 > [file.bz2]```

**Decompress to stdout**

```pbzip2 -dc [file.bz2] > [file]```

**Test compressed file**

```pbzip2 -t [file.bz2]```

# SYNOPSIS

**pbzip2** [_-d_] [_-k_] [_-p n_] [_-1..9_] [_options_] [_files_]

# PARAMETERS

**-d**
> Decompress.

**-z**
> Compress (default).

**-k**
> Keep original files.

**-p** _N_
> Number of processors to use.

**-1** to **-9**
> Compression level (9 = best).

**-c**
> Output to stdout.

**-f**
> Force overwrite.

**-t**
> Test integrity.

**-q**
> Quiet mode.

**-v**
> Verbose mode.

**-m** _N_
> Memory limit per thread (MB).

**-r**
> Read entire file into RAM.

# DESCRIPTION

**pbzip2** is a parallel implementation of bzip2 compression. It uses multiple CPU cores to compress and decompress files faster than single-threaded bzip2.

The tool produces files compatible with standard bzip2. Output can be decompressed by bzip2, bunzip2, or pbzip2 itself.

Parallelism scales with available processors. By default, all cores are used. The -p flag limits processor usage for background compression.

Compression levels work like bzip2: higher numbers produce smaller files but take longer. The parallel implementation helps offset slower compression speeds.

Memory usage scales with thread count. Each thread needs memory for its compression buffer. Limits can prevent memory exhaustion on large jobs.

Pipe mode supports streaming compression. Combined with tar, it enables parallel compressed archives.

# CAVEATS

Memory usage higher than bzip2. Best speedup on multi-core systems. Decompression speedup depends on how file was created.

# HISTORY

**pbzip2** was created by **Jeff Gilchrist** around **2005** to leverage multi-core processors for bzip2 compression. As multi-core CPUs became common, parallel compression tools like pbzip2 became essential for handling large data.

# SEE ALSO

[bzip2](/man/bzip2)(1), [pigz](/man/pigz)(1), [lbzip2](/man/lbzip2)(1), [xz](/man/xz)(1)
