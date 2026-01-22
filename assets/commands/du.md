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

**du** (disk usage) estimates file and directory space usage. It recursively summarizes disk usage for each file and directory, making it essential for finding what's consuming disk space.

The command is commonly used for storage analysis and cleanup.

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
