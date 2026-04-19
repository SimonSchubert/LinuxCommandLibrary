# TAGLINE

parallel rsync synchronization tool

# TLDR

**Sync directories**

```fpsync [source/] [destination/]```

**Set number of** jobs

```fpsync -n [4] [source/] [destination/]```

**Set partition size**

```fpsync -f [1000] [source/] [destination/]```

**Verbose output**

```fpsync -v [source/] [destination/]```

**Resume sync**

```fpsync -r [work_dir] [source/] [destination/]```

# SYNOPSIS

**fpsync** [_options_] _source_ _destination_

# PARAMETERS

_SOURCE_
> Source directory.

_DESTINATION_
> Destination directory.

**-n** _JOBS_
> Number of concurrent sync jobs (default 2).

**-f** _FILES_
> Maximum number of files per partition (default 2000).

**-s** _SIZE_
> Maximum partition size in bytes (default 4096×1024).

**-v**
> Verbose output (repeat for more verbosity).

**-r** _DIR_
> Resume a previous run from the given work directory.

**-w** _DIR_
> Work directory to store partition and log files.

**-t** _DIR_
> Temporary directory.

**-o** _OPTS_
> Extra options passed to the underlying sync tool (e.g. rsync).

**-O** _OPTS_
> Extra options passed to **fpart**.

**-m** _TOOL_
> Sync tool to use: rsync, cpio, or tar.

**-d** _DIR_
> Shared work directory for distributed mode (sudo/ssh).

**-q**
> Queue mode: produce partitions without syncing.

**-l**
> Use **lstat** instead of **stat** while partitioning.

**-h**
> Display help information.

**-V**
> Display version information.

# DESCRIPTION

**fpsync** performs parallel rsync synchronization by partitioning source files and running multiple rsync processes. It achieves higher throughput than single rsync for large transfers.

The tool divides the source into chunks and launches parallel rsync jobs. Resume capability allows continuing interrupted transfers. It's part of the fpart project.

fpsync optimizes large file transfers by maximizing bandwidth utilization through parallelism.

# CAVEATS

Requires rsync installed. Parallel transfers may overwhelm network or disk. Small files may not benefit.

# HISTORY

fpsync is part of **fpart**, a file partitioning tool for parallel operations. It addresses rsync's single-threaded limitation for large-scale file synchronization.

# SEE ALSO

[rsync](/man/rsync)(1), [parallel](/man/parallel)(1), [cpio](/man/cpio)(1), [tar](/man/tar)(1)
