# TLDR

**List files** with colors and icons

```colorls```

**List all files** including hidden

```colorls -a```

**List in long format** with details

```colorls -l```

**List with directory tree view**

```colorls --tree```

**Sort by modification time**

```colorls -t```

**List only directories**

```colorls -d```

**List only files**

```colorls -f```

**Show file sizes** in human-readable format

```colorls -lh```

# SYNOPSIS

**colorls** [_-alrtdfsgh_] [_--tree_] [_--report_] [_--gs_] [_--sd_] [_path ..._]

# PARAMETERS

**-a**, **--all**
> Show hidden files (starting with .).

**-l**, **--long**
> Display long format with permissions, owner, size, and date.

**-r**, **--reverse**
> Reverse sort order.

**-t**, **--sort-time**
> Sort by modification time (newest first).

**-d**, **--dirs**
> Show only directories.

**-f**, **--files**
> Show only files.

**-s**, **--sort-size**
> Sort by file size.

**-1**
> One entry per line.

**--tree** [_depth_]
> Show directory tree (optional depth limit).

**--report**, **--r**
> Show brief report of files and directories.

**--gs**, **--git-status**
> Show git status for each file.

**--sd**, **--sort-dirs**
> Sort directories first.

**--sf**, **--sort-files**
> Sort files first.

**-h**, **--human-readable**
> Show file sizes in human-readable format (K, M, G).

**--light**
> Use light color scheme.

**--dark**
> Use dark color scheme (default).

**--help**
> Display help information.

# DESCRIPTION

**colorls** is a Ruby gem that provides an enhanced, colorful alternative to the standard ls command. It displays file listings with icons (using Nerd Fonts), colors based on file type, and additional features like git status integration and tree views.

Each file type is represented by a distinct icon and color: directories, executables, images, documents, archives, and more. This visual differentiation makes it easier to scan directory contents quickly. The icons require a Nerd Font (patched font with icons) to display correctly.

Git integration shows the status of files in repositories: modified, staged, untracked, etc. The tree view provides a hierarchical display of directory structure similar to the **tree** command but with colorls styling.

Configuration can be customized via **~/.config/colorls/dark_colors.yaml** and **~/.config/colorls/light_colors.yaml** for colors, and **~/.config/colorls/file_aliases.yaml** for custom file type associations.

# CAVEATS

Requires Ruby and the colorls gem (gem install colorls). Icons require a Nerd Font to be installed and configured in the terminal. Performance may be slower than standard ls for directories with many files. Some terminal emulators may not render colors or icons correctly.

# HISTORY

**colorls** was created by Athitya Kumar and released as a Ruby gem. It gained popularity in the terminal customization community for its visual appeal and practical features. The project was inspired by the desire for a more visually informative directory listing tool. Similar projects include **exa** (now **eza**) and **lsd** which offer comparable features in different languages.

# SEE ALSO

[ls](/man/ls)(1), [exa](/man/exa)(1), [eza](/man/eza)(1), [lsd](/man/lsd)(1), [tree](/man/tree)(1)
