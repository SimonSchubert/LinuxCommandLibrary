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

**vmtouch** controls file caching. It manages page cache.

Cache inspection. See what's cached.

Preload files. Warm the cache.

Evict files. Clear from cache.

Lock pages. Prevent swapping.

# CAVEATS

Root for lock. Linux-specific features. Page cache only.

# HISTORY

**vmtouch** was created by **Doug Hoyte** for controlling the file system cache from the command line.

# SEE ALSO

[free](/man/free)(1), [sync](/man/sync)(1), [dd](/man/dd)(1)
