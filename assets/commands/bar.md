# TLDR

**Copy a file with a progress bar**

```bar [input_file] > [output_file]```

**Show progress while piping data**

```cat [large_file] | bar > [output_file]```

**Specify expected size for accurate progress**

```bar -s [1000000000] [input_file] > [output_file]```

**Set custom block size**

```bar -bs [1M] [input_file] > [output_file]```

**Display ETA and transfer rate**

```bar -eta [input_file] > [output_file]```

# SYNOPSIS

**bar** [_options_] [_file_]

# PARAMETERS

**-s**, **--size** _bytes_
> Expected data size for accurate percentage display.

**-bs**, **--block-size** _size_
> Block size for I/O operations (e.g., 1K, 1M).

**-eta**
> Display estimated time of arrival.

**-th**, **--throughput**
> Display throughput (transfer rate).

**-ti**, **--title** _text_
> Set a custom title for the progress bar.

**-sw**, **--screen-width** _cols_
> Set the width of the progress display.

**-dl**
> Display a dial indicator instead of progress bar.

**-nl**
> Add newline after completion.

# DESCRIPTION

**bar** (or pv alternative) is a simple utility that displays a progress bar while copying data through a pipe. It reads from standard input or a file and writes to standard output, showing transfer progress, speed, and optionally ETA.

The tool is useful for monitoring long-running data transfers, such as disk imaging, large file copies, or data streaming operations where visual feedback is desired. When reading from a file, it can automatically determine the total size for accurate percentage display.

For piped input where size is unknown, the **-s** option allows specifying expected size manually. Without size information, it displays bytes transferred and transfer rate without percentage.

# CAVEATS

The **bar** command name conflicts with various system utilities on different distributions. The more widely available **pv** (pipe viewer) provides similar functionality with broader adoption. Progress percentage requires knowing total size in advance. Performance impact is minimal but measurable on very high-speed transfers.

# HISTORY

Various "bar" utilities have existed in Unix ecosystems for displaying transfer progress. The concept predates graphical interfaces, providing feedback for operations that would otherwise run silently. **pv** (pipe viewer) by Andrew Wood became the de facto standard for this purpose, first released in **2002**, though simpler implementations under various names continue to exist.

# SEE ALSO

[pv](/man/pv)(1), [dd](/man/dd)(1), [rsync](/man/rsync)(1), [progress](/man/progress)(1)
