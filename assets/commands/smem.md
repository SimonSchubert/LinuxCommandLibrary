# TAGLINE

Report memory usage with proportional metrics

# TLDR

**Show** memory usage for current user's processes

```smem```

**Show** memory usage per user

```smem --users```

**Filter** by username

```smem --userfilter [username]```

**Show** system-wide memory information

```smem --system```

**Sort** by PSS (proportional set size)

```smem --sort pss```

Show as **percentages**

```smem --percent```

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
