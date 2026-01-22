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

**pv** monitors data through a pipe. Pipe viewer utility.

The tool shows transfer progress. Progress bar for pipes.

pv visualizes pipelines.

# CAVEATS

Adds small overhead. Insert between commands.

# HISTORY

pv was created for **monitoring data** progress through pipelines.

# SEE ALSO

[dd](/man/dd)(1), [rsync](/man/rsync)(1), [progress](/man/progress)(1)

