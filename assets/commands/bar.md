# TAGLINE

Display progress bars for data transfers.

# TLDR

**Copy a file with a progress bar**

```bar -if [input_file] -of [output_file]```

**Show progress while piping data**

```cat [large_file] | bar > [output_file]```

**Specify expected size for accurate progress**

```bar -s [1000000000] -if [input_file] -of [output_file]```

**Set a custom title on the progress bar**

```bar -ti "[Backup]" -if [input_file] -of [output_file]```

**Throttle transfer to a fixed rate**

```bar -th [1M] -if [input_file] -of [output_file]```

**Update the display every 2 seconds**

```bar -i [2] -if [input_file] -of [output_file]```

# SYNOPSIS

**bar** [_options_] [_file_]

# PARAMETERS

**-if**, **--in-file** _FILE_
> Read input from FILE (default: stdin).

**-of**, **--out-file** _FILE_
> Write output to FILE (default: stdout).

**-s**, **--size** _bytes_
> Expected data size for accurate percentage display.

**-c**, **--completed** _bytes_
> Bytes already copied (for resumed transfers).

**-bs**, **--buffer-size** _size_
> I/O buffer allocation size.

**-th**, **--throttle** _rate_
> Limit throughput to the specified rate.

**-i**, **--interval** _seconds_
> Display update frequency in seconds (default: 1).

**-ti**, **--title** _text_
> Set a custom title for the progress bar.

**-sw**, **--screen-width** _cols_
> Assume a fixed terminal width of _cols_ characters.

**-db**, **-nb**, **--display-bar**, **--no-bar**
> Toggle the progress bar display.

**-dp**, **-np**, **--display-percent**, **--no-percent**
> Toggle the percentage display.

**-dth**, **-nth**, **--display-throughput**, **--no-throughput**
> Toggle the throughput display.

**-dt**, **-nt**, **--display-time**, **--no-time**
> Toggle the elapsed time / ETA display.

**-ds**, **-ns**, **--display-summary**, **--no-summary**
> Toggle the completion summary.

**-h**, **--help**
> Display help information.

**-v**, **--version**
> Display program version.

# DESCRIPTION

**bar** (clpbar) copies a stream of data and prints a display on stderr showing the amount of data passed, the throughput, and the transfer time. It was originally developed to estimate transfer duration for large data movements through SSH/tar pipes.

The tool is useful for monitoring long-running data transfers, such as disk imaging, large file copies, or data streaming operations where visual feedback is desired. When reading from a regular file, it extracts the total size on its own.

For piped input where size is unknown, the **-s** option allows specifying the expected size manually. Without size information, **bar** displays bytes transferred and transfer rate without a percentage. Configuration defaults can be placed in _/etc/clpbarrc_, _~/.barrc_, or _./.barrc_.

# CAVEATS

The **bar** command name conflicts with various system utilities on different distributions. The more widely available **pv** (pipe viewer) provides similar functionality with broader adoption. Progress percentage requires knowing total size in advance. Performance impact is minimal but measurable on very high-speed transfers.

# HISTORY

Various "bar" utilities have existed in Unix ecosystems for displaying transfer progress. The concept predates graphical interfaces, providing feedback for operations that would otherwise run silently. **pv** (pipe viewer) by Andrew Wood became the de facto standard for this purpose, first released in **2002**, though simpler implementations under various names continue to exist.

# SEE ALSO

[pv](/man/pv)(1), [dd](/man/dd)(1), [rsync](/man/rsync)(1), [progress](/man/progress)(1)
