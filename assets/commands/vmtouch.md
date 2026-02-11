# TAGLINE

Control file system page cache

# TLDR

**Show file cache status**

```vmtouch [file]```

**Load file into cache**

```vmtouch -t [file]```

**Evict from cache**

```vmtouch -e [file]```

**Lock in memory**

```vmtouch -l [file]```

**Verbose output**

```vmtouch -v [file]```

**Check directory**

```vmtouch [directory/]```

# SYNOPSIS

**vmtouch** [_-t_] [_-e_] [_-l_] [_-v_] _files_

# PARAMETERS

**-t**
> Touch (load to cache).

**-e**
> Evict from cache.

**-l**
> Lock in memory.

**-v**
> Verbose.

**-q**
> Quiet mode.

**-m** _SIZE_
> Max memory.

# DESCRIPTION

**vmtouch** is a tool for inspecting and manipulating the file system page cache on Linux. It can report which pages of a file or directory are currently resident in memory, providing visibility into what the operating system has cached for fast access.

Beyond inspection, vmtouch can actively manage the cache by touching files to load them into memory, evicting files to free cached pages, or locking files into RAM to prevent the kernel from swapping them out. This makes it useful for warming caches before high-traffic events, ensuring critical data stays in memory, or clearing cached data for benchmarking purposes.

The tool works on individual files or entire directory trees and displays per-file cache residency statistics in verbose mode. Locking pages into memory requires root privileges and is subject to system memory limits.

# CAVEATS

Root for lock. Linux-specific features. Page cache only.

# HISTORY

**vmtouch** was created by **Doug Hoyte** for controlling the file system cache from the command line.

# SEE ALSO

[free](/man/free)(1), [sync](/man/sync)(1), [dd](/man/dd)(1)
