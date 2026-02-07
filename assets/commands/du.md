# TAGLINE

disk usage analyzer

# TLDR

**Show** disk usage

```du [directory]```

**Human-readable** sizes

```du -h [directory]```

**Total** size only

```du -sh [directory]```

**Sort** by size

```du -h [directory] | sort -h```

**Max** depth

```du -h --max-depth=1 [directory]```

# SYNOPSIS

**du** [_options_] [_file_...]

# DESCRIPTION

**du** (disk usage) estimates and reports file and directory space usage by recursively examining directory trees. Unlike df which shows filesystem-level free space, du focuses on individual files and directories, making it essential for identifying what's consuming disk space and where cleanup efforts should focus.

The tool walks directory hierarchies and sums the disk space used by each file, reporting sizes at each directory level. By default, it shows sizes for all directories in the tree, but options like --max-depth allow limiting output to higher-level summaries. The -h flag converts raw block counts to human-readable formats (KB, MB, GB).

du is commonly combined with sort to identify the largest space consumers. Patterns like "du -h | sort -hr | head" reveal the top disk space users, essential for troubleshooting full filesystems or planning cleanup operations.

The command reports disk usage (actual blocks consumed) rather than apparent file size, which matters for sparse files and filesystems with compression. Hard links are counted multiple times (once per link), potentially overstating actual disk usage. The -x option prevents crossing filesystem boundaries, useful for analyzing specific filesystems without including mounted subdirectories.

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

**--exclude=**_pattern_
> Exclude files matching pattern

**--time**
> Show last modification time

# WORKFLOW

```bash
# Current directory size
du -sh .

# Subdirectory sizes
du -h --max-depth=1

# Sort by size
du -h | sort -h
du -h | sort -hr  # Reverse (largest first)

# Find largest directories
du -h --max-depth=1 | sort -hr | head -10

# Specific directory
du -sh /var/log

# All files and directories
du -ah

# Exclude pattern
du -h --exclude="*.log"

# Total with subtotals
du -ch directory/
```

# FINDING LARGE FILES

```bash
# Top 10 largest directories
du -h /home | sort -hr | head -10

# Files larger than 100MB
du -ah / | awk '$1 ~ /[0-9]+G/ || $1 ~ /[5-9][0-9][0-9]M/'

# With depth limit
du -h --max-depth=2 /var | sort -hr | head -20
```

# DISK SPACE ANALYSIS

```bash
# Check each user's home directory
sudo du -sh /home/*

# System directories
sudo du -sh /* 2>/dev/null | sort -hr

# Find what changed
du -sh directory/ > before.txt
# ... time passes ...
du -sh directory/ > after.txt
diff before.txt after.txt
```

# CAVEATS

Slow on large directories. Doesn't show actual disk usage (sparse files, compression). Crosses filesystem boundaries by default (use -x). Counts hard links multiple times. May require root for some directories. Output ordering not guaranteed without sort.

# HISTORY

**du** has been part of Unix since the early **1970s**, one of the original Unix utilities for disk management.

# SEE ALSO

[df](/man/df)(1), [ncdu](/man/ncdu)(1), [ls](/man/ls)(1), [find](/man/find)(1)
