# TAGLINE

fast disk usage analyzer with ncurses interface

# TLDR

**Analyze disk usage** interactively (current directory)

```gdu```

**Analyze a specific directory**

```gdu [/path/to/directory]```

**Analyze without interactive mode** (print results)

```gdu -n [/path/to/directory]```

**Show apparent size** instead of disk usage

```gdu -a [/path/to/directory]```

**Analyze ignoring specific directories**

```gdu -I "[.git,node_modules]"```

**Export results to JSON**

```gdu -o json [/path] > [output.json]```

**Analyze specific filesystem only** (don't cross mount points)

```gdu -x [/]```

**Show version information**

```gdu -v```

# SYNOPSIS

**gdu** [_options_] [_directory_]

# PARAMETERS

**-n**, **--non-interactive**
> Run in non-interactive mode (just print results).

**-a**, **--apparent-size**
> Show apparent file size instead of disk usage.

**-x**, **--one-file-system**
> Don't cross filesystem boundaries.

**-I**, **--ignore-dirs** _pattern_
> Ignore directories matching glob patterns.

**-X**, **--ignore-dirs-pattern** _regex_
> Ignore directories matching regex patterns.

**-o**, **--output-file** _format_
> Output format: text, json, csv (implies -n).

**-f**, **--input-file** _file_
> Read from exported JSON file instead of scanning.

**-c**, **--no-color**
> Disable color output.

**-d**, **--show-disks**
> Show all mounted disks.

**-p**, **--no-progress**
> Don't show progress during scan.

**-s**, **--summarize**
> Show only a total for each argument.

**-L**, **--follow-links**
> Follow symbolic links.

**--si**
> Use SI units (powers of 1000) instead of binary.

**-v**, **--version**
> Show version information.

# DESCRIPTION

**gdu** (go disk usage) is a fast disk usage analyzer with an interactive ncurses interface. Written in Go, it significantly outperforms traditional tools like **du** and **ncdu** when analyzing large directory structures.

The interactive interface shows directories sorted by size, with usage bars and file counts. Navigation uses arrow keys or vim-style hjkl. Press **d** to delete selected items, **Enter** to navigate into directories, **?** for help.

Color coding indicates directory types: blue for directories, red for large files, special colors for symlinks, sockets, etc. The progress indicator shows scanning status and estimated completion.

Non-interactive mode (-n) outputs results suitable for scripting. JSON export enables integration with other tools or storing analysis results for later comparison. The tool can also read back exported JSON files for viewing without rescanning.

Performance comes from parallel scanning and efficient memory usage. It's particularly effective on SSDs and NVMe drives where I/O isn't the bottleneck.

# CAVEATS

Interactive deletion is permanent (no trash). Some terminals may not render the UI correctly. Permission denied errors for inaccessible directories are shown but don't stop scanning. Memory usage scales with number of files/directories.

# HISTORY

**gdu** was created by Daniel Milde around **2020** as a faster alternative to ncdu. Written in Go for performance and easy cross-platform compilation, it quickly gained popularity among system administrators. The tool is available in package managers for most Linux distributions and Homebrew for macOS.

# SEE ALSO

[du](/man/du)(1), [ncdu](/man/ncdu)(1), [dust](/man/dust)(1), [df](/man/df)(1), [duf](/man/duf)(1)
