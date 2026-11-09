# TAGLINE

Terminal UI for inspecting HDF5 files

# TLDR

**Open an HDF5 file** for inspection

```h5tui [path/to/file.h5]```

**Start without a file**, then press o to open one

```h5tui```

# SYNOPSIS

**h5tui** [_file_]

# DESCRIPTION

**hdf5_ui** (invoked as **h5tui**) is a Textual User Interface for inspecting **HDF5** files. It provides a tree-based browser for navigating groups and datasets within HDF5 files, displaying attributes and metadata in an organized layout.

The tool comes with built-in plugins including a **HexViewer** that displays hexadecimal representations of datasets, and an **ImageViewer** that visualizes two- or three-dimensional image data directly in the terminal. When a node is highlighted, its attributes are shown in the bottom-left panel.

# KEYS

**o**
> Open a file.

**n**, **p**
> Load the next or previous HDF5 file in the same location.

**q**
> Quit.

# CAVEATS

Requires Python and the h5py library. Install via `pip install h5ui`. Very large datasets may be slow to render in the terminal. The ImageViewer plugin requires data that can be converted to a Pillow image. Custom plugins can be added via entrypoints.

# HISTORY

**hdf5_ui** was created by **Rik Huygen** (rhuygen) and is written in **Python** using the **Textual** TUI framework. It was developed to provide a convenient terminal-based alternative to graphical HDF5 inspection tools like HDFView.

# SEE ALSO

[pip](/man/pip)(1), [visidata](/man/visidata)(1)

# RESOURCES

```[Source code](https://github.com/rhuygen/hdf5_ui)```

<!-- verified: 2026-11-09 -->
