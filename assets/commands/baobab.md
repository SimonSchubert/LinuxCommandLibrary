# TLDR

**Analyze** disk usage

```baobab```

Analyze **specific directory**

```baobab [/path/to/directory]```

# SYNOPSIS

**baobab** [_directory_]

# DESCRIPTION

**baobab** (also known as GNOME Disk Usage Analyzer) is a graphical tool for visualizing disk space usage. It displays directory sizes in tree view and provides an interactive treemap or ring chart visualization.

The application makes it easy to identify large files and directories consuming disk space.

# FEATURES

- Directory tree view
- Treemap visualization
- Ring chart (sunburst) view
- File and folder sizes
- Interactive navigation
- Remote filesystem support
- Scan history

# INTERFACE

Provides multiple visualization modes:
- **List view** - Traditional directory tree
- **Treemap** - Rectangular area chart
- **Rings chart** - Concentric circles showing hierarchy

# CAVEATS

Scanning large filesystems can be slow. Remote filesystems require network access. Some directories require elevated permissions. May not reflect actual disk usage (sparse files, compression).

# HISTORY

**Baobab** was created by Fabio Marzocca around **2005** and became GNOME's standard disk usage analyzer, named after the baobab tree.

# SEE ALSO

[du](/man/du)(1), [ncdu](/man/ncdu)(1), [filelight](/man/filelight)(1)
