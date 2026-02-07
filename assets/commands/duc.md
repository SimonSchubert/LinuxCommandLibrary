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

**Show database info**

```duc info```

**Export to JSON**

```duc json [/path]```

# SYNOPSIS

**duc** _command_ [_options_] [_path_]

# SUBCOMMANDS

**index**
> Index filesystem.

**ls**
> List directory sizes.

**ui**
> NCurses console interface.

**gui**
> Graphical interface.

**graph**
> Generate graph image.

**cgi**
> CGI web interface.

**info**
> Show database info.

**json**
> Export to JSON.

# DESCRIPTION

**duc** (Disk Usage Calculator) indexes filesystem usage into a database for fast repeated queries and provides multiple visualization interfaces. Unlike tools that scan filesystems on every invocation, duc performs an initial scan to build an index, then allows instant queries and visualizations from the cached data.

The workflow involves two phases: first, use **duc index** to scan directories and build the database; second, query the database using various interfaces (ls, ui, gui, graph). This approach is particularly effective for large filesystems where repeated full scans would be prohibitively slow.

duc offers four main visualization modes: ls (command-line listing), ui (interactive ncurses interface), gui (graphical X11 window with sunburst charts), and graph (generate static images). The graphical modes provide intuitive visual representations of disk usage, making it easy to identify large directories at a glance.

The database stores complete size information including file counts and sizes at all directory levels. Multiple filesystem scans can be stored in a single database, and duc tracks timestamps to show when data was last updated. The tool supports incremental updates but requires manual reindexing when filesystem contents change significantly.

# SEE ALSO

[du](/man/du)(1), [ncdu](/man/ncdu)(1)

