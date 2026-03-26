# TAGLINE

Terminal UI for inspecting HDF5 files

# TLDR

**Open an HDF5 file** for inspection

```h5tui [path/to/file.h5]```

# SYNOPSIS

**h5tui** [_options_] _file_

# DESCRIPTION

**hdf5_ui** (invoked as **h5tui**) is a Textual User Interface for inspecting **HDF5** files. It provides a tree-based browser for navigating groups and datasets within HDF5 files, displaying attributes and metadata in an organized layout.

The tool comes with built-in plugins including a **HexViewer** that displays hexadecimal representations of datasets, and an **ImageViewer** that visualizes two- or three-dimensional image data directly in the terminal. When a node is highlighted, its attributes are shown in the bottom-left panel.

# CAVEATS

Requires Python and the h5py library. Install via `pip install h5ui`. Very large datasets may be slow to render in the terminal. The ImageViewer plugin requires data that can be converted to a Pillow image. Custom plugins can be added via entrypoints.

# HISTORY

**hdf5_ui** was created by **Rik Huygen** (rhuygen) and is written in **Python** using the **Textual** TUI framework. It was developed to provide a convenient terminal-based alternative to graphical HDF5 inspection tools like HDFView.

# SEE ALSO
