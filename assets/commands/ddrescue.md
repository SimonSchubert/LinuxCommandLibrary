# TLDR

Take an **image** of a device with log file

```sudo ddrescue [/dev/sdb] [path/to/image.dd] [path/to/log.txt]```

**Clone** disk to disk with log

```sudo ddrescue -f -n [/dev/sdX] [/dev/sdY] [path/to/log.txt]```

# SYNOPSIS

**ddrescue** [_options_] _infile_ _outfile_ [_logfile_]

# DESCRIPTION

**ddrescue** is a data recovery tool that copies data from one block device to another. Unlike dd, it handles read errors gracefully, skipping bad sectors and continuing to copy good data.

The logfile tracks progress and error locations, allowing resumption of interrupted operations and multiple passes for maximum data recovery.

# PARAMETERS

**-f, --force**
> Overwrite output device

**-n, --no-scrape**
> Skip scraping phase (faster first pass)

**-r, --retry-passes** _n_
> Maximum retry passes for bad sectors

**-d, --direct**
> Use direct I/O

**-R, --reverse**
> Read input in reverse

# CAVEATS

Always use a logfile to enable resumption. The -f flag is required when writing to a device. For best results, do a quick first pass with -n, then retry passes for bad sectors.

# HISTORY

**ddrescue** (GNU ddrescue) was created to address dd's inability to continue past read errors. It's essential for recovering data from failing drives.

# SEE ALSO

[dd](/man/dd)(1), [testdisk](/man/testdisk)(8), [photorec](/man/photorec)(1)
