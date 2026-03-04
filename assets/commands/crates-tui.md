# TAGLINE

Terminal UI for exploring crates.io Rust packages

# TLDR

**Launch** the TUI to browse crates.io

```crates-tui```

**Search** for a specific crate

```crates-tui [search_term]```

**Copy** crate information to clipboard from within the TUI

```crates-tui```
> Use `c` to copy the selected crate's information

# SYNOPSIS

**crates-tui** [_search_term_]

# DESCRIPTION

**crates-tui** is a terminal user interface application for browsing and exploring Rust packages from crates.io. It provides an interactive way to search for crates, view package details, and copy information to the clipboard without leaving the terminal.

The interface allows users to navigate through search results, view crate metadata including version, description, and download statistics, and quickly copy relevant information for use in Cargo.toml files or documentation.

# KEYBINDINGS

**↑/↓** or **k/j**
> Navigate up/down through the crate list

**Enter**
> View detailed information about the selected crate

**c**
> Copy the selected crate's information to clipboard

**q**
> Quit the application

**/**
> Enter search mode

# CAVEATS

Requires a stable internet connection to fetch data from crates.io. Clipboard functionality depends on the system's clipboard provider. Some terminal emulators may have limited clipboard support.

# HISTORY

**crates-tui** was developed as a Rust community tool to provide a fast, terminal-based alternative to browsing crates.io through a web browser. It leverages Rust's ecosystem and modern TUI libraries to create an efficient package discovery tool.

# SEE ALSO

[cargo](/man/cargo)(1), [rustc](/man/rustc)(1)
