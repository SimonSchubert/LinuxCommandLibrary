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
> Number of parallel jobs.

**-f** _FILES_
> Files per partition.

**-v**
> Verbose output.

**-r** _DIR_
> Resume from work directory.

**-w** _DIR_
> Work directory.

**--help**
> Display help information.

# DESCRIPTION

**fpsync** performs parallel rsync synchronization by partitioning source files and running multiple rsync processes. It achieves higher throughput than single rsync for large transfers.

The tool divides the source into chunks and launches parallel rsync jobs. Resume capability allows continuing interrupted transfers. It's part of the fpart project.

fpsync optimizes large file transfers by maximizing bandwidth utilization through parallelism.

# CAVEATS

Requires rsync installed. Parallel transfers may overwhelm network or disk. Small files may not benefit.

# HISTORY

fpsync is part of **fpart**, a file partitioning tool for parallel operations. It addresses rsync's single-threaded limitation for large-scale file synchronization.

# SEE ALSO

[rsync](/man/rsync)(1), [fpart](/man/fpart)(1), [parallel](/man/parallel)(1)
