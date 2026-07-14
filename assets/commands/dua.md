# TAGLINE

fast parallel disk usage analyzer

# TLDR

**Analyze current directory**

```dua```

**Analyze specific path**

```dua [/path/to/directory]```

**Interactive mode**

```dua i```

**Interactive with specific path**

```dua i [/path/to/directory]```

**Show apparent size** instead of disk usage

```dua -A [/path/to/directory]```

**Use a specific number of threads**

```dua -t [4] [/path/to/directory]```

**Print sizes in a chosen unit**

```dua -f [MB] [/path/to/directory]```

**Stay on one filesystem**, not crossing mount points

```dua -x [/path/to/directory]```

**Show version**

```dua --version```

# SYNOPSIS

**dua** [_flags_] [_options_] [_subcommand_] [_input_...]

# COMMANDS

**i**, **interactive**
> Launch the terminal user interface.

**a**, **aggregate**
> Aggregate the space consumed by the given paths. This is the default when no subcommand is given.

**config edit** / **config show-default**
> Open the configuration file in `$EDITOR`, or print the defaults.

**completions** _SHELL_
> Generate a shell completion script.

# PARAMETERS

**-A**, **--apparent-size**
> Show apparent size instead of disk usage.

**-t**, **--threads** _COUNT_
> Threads to use. **0** means one per logical processor and is the default on Linux; macOS defaults to 3, since more threads measurably hurt there. Set 1 for a single thread.

**-f**, **--format** _FORMAT_
> Byte format: `metric`, `binary`, `bytes`, `GB`, `GiB`, `MB`, `MiB`. Defaults to binary, except on macOS where it is metric.

**-l**, **--count-hard-links**
> Count hard-linked files each time they are seen, rather than once.

**-x**, **--stay-on-filesystem**
> Do not cross filesystems or traverse mount points.

**-i**, **--ignore-dirs** _PATH_...
> Absolute directories to skip when reached during traversal. On Linux this defaults to `/proc`, `/dev`, `/sys`, and `/run`. A directory passed explicitly as an input path is still scanned.

**--stats**
> Print traversal statistics to stderr (aggregate mode).

**--no-sort** / **--no-total**
> Keep the command-line order rather than sorting by size, or omit the total row for multiple inputs.

**-h**, **--help** / **-V**, **--version**
> Display help, or version information.

# INTERACTIVE KEYS

**j**/**k** or **Down**/**Up**
> Navigate entries.

**Enter** or **l**
> Enter directory.

**u** or **h**
> Go up to parent.

**o**
> Open in file manager.

**d**
> Mark for deletion.

**Space**
> Toggle expansion.

**s**
> Sort by size.

**r**
> Refresh.

**g**
> Go to top.

**G**
> Go to bottom.

**Ctrl+c** or **q**
> Quit.

# DESCRIPTION

**dua** (Disk Usage Analyzer) is a fast disk space analyzer with an optional interactive interface. It scans directories and displays sizes.

Default mode shows aggregate sizes for paths. Interactive mode (**dua i**) provides a navigable tree view for exploring disk usage.

Parallel traversal is what makes dua fast: it saturates an SSD rather than walking the tree one directory at a time, and on a large tree it comfortably outruns `du`. On spinning disks the advantage largely disappears, since the bottleneck is seek time rather than CPU.

Apparent size (**-A**) is the size of the file's contents. Without it, dua reports the space actually occupied on disk, which is what you care about when freeing space: a sparse file or a heavily compressed btrfs/ZFS dataset can occupy far less than its apparent size, and many small files occupy considerably more, because each one rounds up to a block.

In interactive mode, mark entries with **d** and they are deleted when you confirm. Deleting from the TUI is dua's real selling point over `du`, and it is deliberately faster than `rm` on large trees.

# CAVEATS

**Deletion in the TUI is permanent.** Nothing goes to a trash folder and there is no undo, so it is worth pausing before confirming a marked selection.

Note that **-l**/**--count-hard-links** *disables* the default deduplication: by default a hard-linked file is counted once, which is usually what you want, and this flag makes each link count in full.

Numbers from dua and `du` will not always agree, and neither is wrong: they differ on whether hard links are counted once, whether mount points are crossed, and whether apparent or on-disk size is reported. Compare like with like before concluding that one of them is lying.

# HISTORY

dua was created by **Sebastian Thiel** (Byron), who also wrote gitoxide, and first released around **2019**. Written in Rust, it belongs to the generation of tools that revisited the classic Unix utilities on the assumption that the machine has many cores and a fast SSD, neither of which was true when `du` was designed. Its distinguishing feature over `ncdu` and `dust` is that deletion is a first-class operation, not an afterthought.

# SEE ALSO

[du](/man/du)(1), [ncdu](/man/ncdu)(1), [dust](/man/dust)(1), [gdu](/man/gdu)(1), [duf](/man/duf)(1)

# RESOURCES

```[Source code](https://github.com/Byron/dua-cli)```

<!-- verified: 2026-07-14 -->

