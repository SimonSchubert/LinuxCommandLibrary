# TAGLINE

data recovery tool for failing drives

# TLDR

Take an **image** of a device with log file

```sudo ddrescue [/dev/sdb] [path/to/image.dd] [path/to/log.txt]```

**Clone** disk to disk with log

```sudo ddrescue -f -n [/dev/sdX] [/dev/sdY] [path/to/log.txt]```

# SYNOPSIS

**ddrescue** [_options_] _infile_ _outfile_ [_logfile_]

# DESCRIPTION

**ddrescue** is a data recovery tool that copies data from one block device to another while handling read errors intelligently. Unlike dd, which stops on the first read error, ddrescue skips bad sectors and continues copying good data, then returns to problematic areas for repeated retry attempts.

The logfile tracks which blocks have been successfully copied, which failed, and which remain untried. This allows operations to be interrupted and resumed without starting over, making it practical to run multiple passes over days or weeks. The first pass typically uses -n to quickly copy all readable data, skipping errors. Subsequent passes focus on bad sectors with different strategies.

ddrescue employs sophisticated algorithms to maximize data recovery from failing drives. It can read in reverse, try different block sizes, and make multiple attempts with delays between retries, as sometimes failing drives become temporarily more cooperative. The tool is essential for recovering data from physically damaged media, handling situations where traditional copying tools would fail completely. Always work with a spare drive for recovered data rather than attempting in-place recovery.

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
