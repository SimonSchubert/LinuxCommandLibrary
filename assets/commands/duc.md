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

**duc** (Disk Usage Calculator) indexes and visualizes disk usage. Creates a database of file sizes for fast querying and provides multiple visualization modes.

# SEE ALSO

[du](/man/du)(1), [ncdu](/man/ncdu)(1)

