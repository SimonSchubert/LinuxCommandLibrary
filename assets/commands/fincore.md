# TAGLINE

page cache inspector for files

# TLDR

Show how much of a file is **resident in the page cache**

```fincore [path/to/file]```

Check **several files** at once

```fincore [path/to/file1] [path/to/file2]```

Show **every column** available

```fincore --output-all [path/to/file]```

**Choose the columns** yourself

```fincore --output PAGES,SIZE,FILE [path/to/file]```

Print **exact byte counts** rather than human-readable sizes

```fincore --bytes [path/to/file]```

Emit **JSON**

```fincore --json [path/to/file]```

Drop the header, which a **script** does not want

```fincore --noheadings --output RES,FILE [path/to/file]```

Check **everything in a directory**

```fincore [path/to/directory]/*```

# SYNOPSIS

**fincore** [_options_] _files_

# DESCRIPTION

**fincore** displays how much of a file is currently cached in memory by the kernel's page cache. It shows the number of pages and bytes cached.

Useful for understanding memory usage and cache behavior.

# PARAMETERS

**-n**, **--noheadings**
> Do not print a header line.

**-b**, **--bytes**
> Print sizes in bytes (not human-readable units).

**-c**, **--total**
> Print a grand total of results.

**-o**, **--output** _list_
> Specify output columns (use _+list_ to extend defaults).

**--output-all**
> Show all available columns.

**-r**, **--raw**
> Produce output in raw format.

**-J**, **--json**
> Use JSON output format.

**-R**, **--recursive**
> Recurse into directories.

**-h**, **--help**
> Display help.

**-V**, **--version**
> Print version.

# CAVEATS

Part of util-linux. Shows point-in-time snapshot of cache state. Cache contents change dynamically based on system activity.

# INSTALL

```apt: sudo apt install util-linux-extra```

```apk: sudo apk add util-linux-misc```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[fadvise](/man/fadvise)(1), [vmtouch](/man/vmtouch)(1), [free](/man/free)(1)
