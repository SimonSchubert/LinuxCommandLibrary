# TLDR

**Print** memory usage for current processes

```smem```

**Print** memory usage for every user on the system

```smem --users```

**Print** memory usage for a specified user

```smem --userfilter [username]```

**Print** system memory information

```smem --system```

# SYNOPSIS

**smem** [_options_]

# PARAMETERS

**--users**
> Show memory usage per user

**--userfilter _user_**
> Filter by username

**--system**
> Show system-wide memory information

**-c, --columns _columns_**
> Specify output columns

**-s, --sort _column_**
> Sort by specified column

**-r, --reverse**
> Reverse sort order

**-k, --kilounits**
> Show sizes in kilobytes

**-m, --megaunits**
> Show sizes in megabytes

**-p, --percent**
> Show percentages

**-t, --totals**
> Show totals

# DESCRIPTION

**smem** reports memory usage with an emphasis on proportional set size (PSS), which is a more meaningful metric than RSS for systems with shared memory. PSS distributes shared memory proportionally among processes sharing it.

The tool provides accurate memory usage analysis by accounting for shared libraries and memory-mapped files. This makes it particularly useful for understanding actual per-process memory consumption.

# CAVEATS

Requires read access to **/proc/[pid]/smaps** (typically root for all processes). PSS calculation can be slow on systems with many processes. Kernel must have CONFIG_PROC_PAGE_MONITOR enabled.

# SEE ALSO

[ps](/man/ps)(1), [top](/man/top)(1), [free](/man/free)(1), [pmap](/man/pmap)(1)
