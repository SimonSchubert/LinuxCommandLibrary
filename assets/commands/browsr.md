# TAGLINE

File explorer TUI with cloud storage support

# TLDR

**Launch** in the current directory

```browsr```

**Browse** a specific directory

```browsr [path/to/directory]```

**Browse** a GitHub repository

```browsr [github://owner/repo]```

**Browse** an S3 bucket

```browsr [s3://bucket-name]```

# SYNOPSIS

**browsr** [_options_] [_path_]

# PARAMETERS

**--theme** _THEME_
> Set the color theme.

**--debug**
> Enable debug mode.

# DESCRIPTION

**browsr** is a terminal-based file explorer built with **Textual** (Python). It provides a rich TUI for browsing files and directories with syntax-highlighted file previews. Beyond local filesystems, it supports browsing remote sources including **GitHub repositories**, **AWS S3** buckets, and other cloud storage backends.

The interface features a directory tree panel and a file preview panel with syntax highlighting for source code files. It supports keyboard and mouse navigation.

# CAVEATS

Cloud storage access requires appropriate credentials and authentication to be configured (e.g., AWS credentials for S3, GitHub token for private repos). Performance depends on network speed for remote sources. Large files may be slow to preview.

# HISTORY

**browsr** was created by **Juftin** as a Textual-based file explorer with cloud storage integration. It was designed to bring rich file browsing with syntax highlighting to the terminal.

# SEE ALSO

[ranger](/man/ranger)(1), [nnn](/man/nnn)(1), [lf](/man/lf)(1), [mc](/man/mc)(1)
