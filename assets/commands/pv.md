# TAGLINE

Monitor data transfer through pipes

# TLDR

**Show transfer progress**

```pv [file] > [output]```

**Pipe with progress**

```cat [file] | pv > [output]```

**Limit transfer rate**

```pv -L [1m] [file] > [output]```

**Show ETA**

```pv -e [file] > [output]```

**Name the transfer**

```pv -N "Copying" [file] > [output]```

# SYNOPSIS

**pv** [_options_] [_files_]

# PARAMETERS

_FILES_
> Input files.

**-L** _RATE_
> Rate limit.

**-N** _NAME_
> Transfer name.

**-e**
> Show ETA.

**-p**
> Show percentage.

**-t**
> Show elapsed time.

**-r**
> Show rate.

**-s** _SIZE_
> Expected size.

# DESCRIPTION

**pv** (Pipe Viewer) monitors the progress of data flowing through a Unix pipeline. It can be inserted between any two commands in a pipe to display a progress bar, transfer rate, elapsed time, estimated time of arrival, and percentage complete.

When given a file as input, pv can calculate the total size and show meaningful progress percentages. For streams of unknown size, use the **-s** flag to specify the expected size. The **-L** option limits transfer rate, which is useful for throttling operations. Multiple **-N** flags can name different pv instances in complex pipelines to track each stage independently. pv is commonly used to add visual feedback to operations like disk imaging with **dd**, database imports, or large file transfers.

# CAVEATS

Adds small overhead. Insert between commands.

# HISTORY

pv was created for **monitoring data** progress through pipelines.

# SEE ALSO

[dd](/man/dd)(1), [rsync](/man/rsync)(1), [progress](/man/progress)(1)

