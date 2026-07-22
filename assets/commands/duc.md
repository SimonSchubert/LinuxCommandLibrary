# TAGLINE

indexed disk usage calculator with visualization

# TLDR

**Index a directory**

```duc index [/path/to/directory]```

**List directory sizes**

```duc ls [/path]```

**Interactive console UI**

```duc ui [/path]```

**Graphical sunburst view**

```duc gui [/path]```

**Show database info** and when each path was last indexed

```duc info```

**Generate a sunburst image**

```duc graph -o [usage.png] [/path]```

**Export to JSON**

```duc json [/path]```

# SYNOPSIS

**duc** _command_ [_options_] [_path_]

# SUBCOMMANDS

**index** _path_
> Scan the filesystem and write the results to the database. Everything else reads that database.

**ls** [_path_]
> List directory sizes, with an optional graph. **-R** recurses, **-g** draws a bar, **-d** limits depth.

**ui** [_path_]
> Interactive ncurses interface for browsing the index.

**gui** [_path_]
> X11 window with a clickable sunburst chart.

**graph** [_path_]
> Render a sunburst or treemap to a PNG, SVG, or PDF file.

**xml** / **json**
> Export the index for another tool to consume.

**cgi**
> Serve the index over HTTP as a CGI script.

**info**
> List the indexed paths in the database, with their sizes and the time each was indexed.

# PARAMETERS

**-d**, **--database** _FILE_
> Database to use. Defaults to `~/.duc.db`, overridable with the `DUC_DATABASE` environment variable.

**-x**, **--one-file-system**
> Do not cross filesystem boundaries when indexing.

**-e**, **--exclude** _PATTERN_
> Skip files matching a pattern while indexing.

**--check-hard-links**
> Count a hard-linked file only once.

**-p**, **--progress**
> Show progress during a long index run.

**-o**, **--output** _FILE_
> Output file for **graph**.

**-f**, **--format** _FORMAT_
> Graph output format: `png`, `svg`, `pdf`, or `html`.

# DESCRIPTION

**duc** (Disk Usage Calculator) indexes filesystem usage into a database for fast repeated queries and provides multiple visualization interfaces. Unlike tools that scan filesystems on every invocation, duc performs an initial scan to build an index, then allows instant queries and visualizations from the cached data.

The workflow involves two phases: first, use **duc index** to scan directories and build the database; second, query the database using various interfaces (ls, ui, gui, graph). This approach is particularly effective for large filesystems where repeated full scans would be prohibitively slow.

duc offers four main visualization modes: ls (command-line listing), ui (interactive ncurses interface), gui (graphical X11 window with sunburst charts), and graph (generate static images). The graphical modes provide intuitive visual representations of disk usage, making it easy to identify large directories at a glance.

The database stores complete size information including file counts and sizes at all directory levels. Multiple filesystem scans can live in a single database, and duc records when each was taken.

This design is what makes duc the right tool for **large** filesystems. Indexing a multi-terabyte fileserver takes a long time, but it only has to happen once, typically from a nightly cron job, after which any number of queries and visualisations are instant. `ncdu` and `du`, which rescan on every invocation, become impractical at that scale.

# CAVEATS

**The index is a snapshot, not a live view.** Everything duc reports reflects the filesystem as it was when `duc index` last ran, so a file deleted this morning still occupies space according to duc until the next index. This is the fundamental trade-off of the design, and the usual answer is a cron job.

There is no incremental indexing: a re-index rescans the tree from scratch.

The interfaces have separate dependencies, and distributions often split them across packages, so `duc ui` may be missing without ncurses support compiled in, and `duc gui` needs X11 and cairo. A duc built without them still indexes and lists happily, which makes the absence confusing when you first reach for the sunburst view.

# HISTORY

duc was written by **Ico Doornekamp** as a successor to his earlier `philesight`, and its whole premise is the separation of scanning from viewing. That distinction matters once a filesystem is large enough that walking it is measured in hours rather than seconds, at which point the interactive scanners everyone uses on a laptop stop being an option and an indexed database becomes the only workable approach.

# INSTALL

```apt: sudo apt install duc```

```dnf: sudo dnf install duc```

```zypper: sudo zypper install duc```

```brew: brew install duc```

```nix: nix profile install nixpkgs#duc```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[du](/man/du)(1), [ncdu](/man/ncdu)(1), [dua](/man/dua)(1), [dust](/man/dust)(1), [baobab](/man/baobab)(1)

# RESOURCES

```[Source code](https://github.com/zevv/duc)```

```[Homepage](https://duc.zevv.nl)```

<!-- verified: 2026-07-14 -->

