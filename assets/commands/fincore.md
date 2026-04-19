# TAGLINE

page cache inspector for files

# TLDR

Display **cache details** for a file

```fincore [path/to/file]```

Display **all** possible data columns

```fincore --output-all [path/to/file]```

Display **help**

```fincore [-h|--help]```

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

# SEE ALSO

[fadvise](/man/fadvise)(1), [vmtouch](/man/vmtouch)(1), [free](/man/free)(1)
