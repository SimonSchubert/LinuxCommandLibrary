# TAGLINE

TUI and CLI for browsing the On-Line Encyclopedia of Integer Sequences

# TLDR

**Launch the OEIS browser**

```oeis-tui```

**Search for a sequence by keyword**

```oeis-tui search "[keyword]"```

**Fetch a specific sequence**

```oeis-tui get [A000045]```

# SYNOPSIS

**oeis-tui** [_command_] [_options_]

# DESCRIPTION

**oeis-tui** is a TUI and CLI for browsing the On-Line Encyclopedia of Integer Sequences (OEIS) in the terminal. It supports searching by ID, keyword, author, or partial sequences, with paginated browsing and detail tabs for overview, formulas, and more.

The CLI provides UNIX-friendly output with multiple formats, suitable for piping and integration with other tools.

# CAVEATS

Requires an internet connection to query the OEIS database.

# HISTORY

**oeis-tui** was created by **hako** and is written in **Go**.

# SEE ALSO

[bc](/man/bc)(1), [numbat](/man/numbat)(1)
