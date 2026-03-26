# TAGLINE

disk usage analyzer

# TLDR

**Show total size of a directory**

```du -sh [directory]```

**Show sizes in human-readable format**

```du -h [directory]```

**Show sizes of subdirectories** (one level deep)

```du -h --max-depth=1 [directory]```

**Show largest subdirectories first**

```du -h --max-depth=1 [directory] | sort -hr```

**Show size of all files and directories**

```du -ah [directory]```

**Stay on one filesystem** (don't cross mount points)

```du -shx [directory]```

# SYNOPSIS

**du** [_options_] [_file_...]

# DESCRIPTION

**du** (disk usage) estimates and reports file and directory space usage by recursively examining directory trees. Unlike df which shows filesystem-level free space, du focuses on individual files and directories, making it essential for identifying what's consuming disk space and where cleanup efforts should focus.

The tool walks directory hierarchies and sums the disk space used by each file, reporting sizes at each directory level. By default, it shows sizes for all directories in the tree, but options like --max-depth allow limiting output to higher-level summaries. The -h flag converts raw block counts to human-readable formats (KB, MB, GB).

du is commonly combined with sort to identify the largest space consumers. Patterns like "du -h | sort -hr | head" reveal the top disk space users, essential for troubleshooting full filesystems or planning cleanup operations.

The command reports disk usage (actual blocks consumed) rather than apparent file size, which matters for sparse files and filesystems with compression. Hard links to the same inode are counted only once by default (use -l to count each link separately). The -x option prevents crossing filesystem boundaries, useful for analyzing specific filesystems without including mounted subdirectories.

# PARAMETERS

**-h**, **--human-readable**
> Human-readable sizes (K, M, G)

**-s**, **--summarize**
> Display total only

**-c**, **--total**
> Produce grand total

**-a**, **--all**
> Include files, not just directories

**-d** _N_, **--max-depth=**_N_
> Maximum directory depth

**-b**, **--bytes**
> Print sizes in bytes

**-k**, **--kilobytes**
> Print sizes in kilobytes

**-m**, **--megabytes**
> Print sizes in megabytes

**-x**, **--one-file-system**
> Skip different filesystems

**-l**, **--count-links**
> Count hard links multiple times

**--apparent-size**
> Print apparent sizes rather than disk usage

**--si**
> Like -h but use powers of 1000 (not 1024)

**-L**, **--dereference**
> Follow symbolic links

**--exclude=**_pattern_
> Exclude files matching pattern

**--time**
> Show last modification time

# CAVEATS

Can be slow on large directory trees. Reports actual disk usage (blocks allocated), not apparent file size — use **--apparent-size** for file sizes. Crosses filesystem boundaries by default; use **-x** to stay on one filesystem. Hard links are counted only once by default. May require root for restricted directories.

# HISTORY

**du** has been part of Unix since the early **1970s**, one of the original Unix utilities for disk management.

# SEE ALSO

[df](/man/df)(1), [ncdu](/man/ncdu)(1), [ls](/man/ls)(1), [find](/man/find)(1)
