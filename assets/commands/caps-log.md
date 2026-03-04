# TAGLINE

Terminal journaling tool with Markdown storage

# TLDR

**Launch** the journal TUI

```caps-log```

**Open** with a specific data directory

```caps-log --dir [path/to/journal]```

# SYNOPSIS

**caps-log** [_options_]

# PARAMETERS

**--dir** _PATH_
> Path to the journal data directory.

# DESCRIPTION

**caps-log** is a terminal-based journaling application that stores entries as **Markdown** files organized by date. It provides a TUI for writing, browsing, and searching journal entries with a calendar view for navigation.

Entries are stored as plain Markdown files in a date-based directory structure, making them easy to read, back up, and version-control outside of the application. The interface features a calendar sidebar, entry editor, and search functionality.

# CONFIGURATION

Journal entries are stored as Markdown files in a configurable directory, organized by year and month subdirectories.

# CAVEATS

Uses an integrated text editor within the TUI — users accustomed to their preferred terminal editor may find it limiting. The Markdown files are plain text and can be edited externally.

# SEE ALSO

[jrnl](/man/jrnl)(1), [nb](/man/nb)(1)
