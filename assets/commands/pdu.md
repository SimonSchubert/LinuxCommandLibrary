# TAGLINE

Highly parallelized, fast directory tree disk usage analyzer

# TLDR

**Show disk usage of the current directory**

```pdu```

**Show disk usage of a specific directory**

```pdu [path/to/directory]```

**Compare multiple directories**

```pdu [dir1] [dir2]```

**Show apparent sizes instead of block sizes**

```pdu --quantity=apparent-size [path/to/directory]```

**Show all entries regardless of size**

```pdu --min-ratio=0 [path/to/directory]```

**Output as JSON**

```pdu --json-output [path/to/directory]```

**Visualize a previously saved JSON file**

```pdu --json-input < [disk-usage.json]```

**Show disk usage using binary units (1K = 1024 B)**

```pdu --bytes-format=binary [path/to/directory]```

**Deduplicate hardlinks when calculating sizes**

```pdu --deduplicate-hardlinks [path/to/directory]```

# SYNOPSIS

**pdu** [_options_] [_files_...]

# DESCRIPTION

**pdu** (Parallel Disk Usage) is a highly parallelized, fast directory tree analyzer that renders graphical bar charts of disk usage in the terminal. It serves as an alternative to dust and dutree, with support for JSON output and comparison of multiple directories.

By default, **pdu** measures block size, sorts entries by size (largest first), limits display to 10 levels deep, hides entries smaller than 1% of the total, and displays sizes in metric units (1K = 1000 B).

# OPTIONS

**--bytes-format**, **-b** _FORMAT_
> How to display byte values. Possible values: **plain** (raw byte count), **metric** (1K = 1000 B, default), **binary** (1K = 1024 B).

**--quantity**, **-q** _MEASURE_
> What to measure. Possible values: **block-size** (default), **apparent-size**, **block-count**.

**--max-depth**, **-d** _N_
> Maximum depth of the tree to display. Use **inf** for unlimited. Default: **10**.

**--min-ratio**, **-m** _RATIO_
> Minimum size proportion (0–1) required for an entry to appear. Default: **0.01** (1%).

**--total-width**, **-w** _N_
> Width in characters of the entire visualization.

**--top-down**
> Print the tree top-down instead of bottom-up.

**--align-right**
> Set the root of the bars to the right.

**--no-sort**
> Do not sort branches; preserve filesystem order.

**--deduplicate-hardlinks**, **-H**
> Detect hardlinks and subtract their sizes from parent nodes to avoid double-counting.

**--progress**, **-p**
> Report scanning progress. Has a performance cost.

**--silent-errors**, **-s**
> Suppress filesystem error messages on stderr.

**--threads** _N_
> Number of threads to use. Accepts a positive integer, **auto** (default), or **max**.

**--json-output**
> Print disk usage data as JSON instead of rendering a chart.

**--json-input**
> Read previously exported JSON from stdin and render it as a chart.

**-h**, **--help**
> Print help information.

**-V**, **--version**
> Print version information.

# HISTORY

**pdu** was created by **Hoang Van Khai** (KSXGitHub) and is written in **Rust**.

# SEE ALSO

[du](/man/du)(1), [dust](/man/dust)(1), [ncdu](/man/ncdu)(1), [gdu](/man/gdu)(1)
