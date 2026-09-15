# TAGLINE

Live Git-style diff feed of file edits as they happen

# TLDR

Watch the **current Git repository** and print each edit as a unified diff

```livediff```

Show only the **filename, time, and changed lines** (no hunk headers or context)

```livediff --compact```

The same compact view with the **short flag**

```livediff -c```

Disable **ANSI colors** when logging or piping

```NO_COLOR=1 livediff```

# SYNOPSIS

**livediff** [**-c** | **--compact**] [**-h** | **--help**]

# PARAMETERS

**-c**, **--compact**
> Print only the path, a timestamp, and the added or removed lines. Omits the `diff --git` header, `---`/`+++` paths, hunk headers, and unchanged context.

**-h**, **--help**
> Print usage and exit.

# KEYS

When stdin is a terminal, **livediff** puts it in raw mode so single keypresses are read immediately.

**q** or **Ctrl-C**
> Stop watching and exit.

**c**
> Clear the terminal (CSI erase display and home cursor).

# ENVIRONMENT

**NO_COLOR**
> When set to any non-empty value, ANSI color codes are omitted. Color is also off when stdout is not a terminal.

# DESCRIPTION

**livediff** watches the Git work tree of the current directory and prints a unified diff for every file that changes after it starts. Edits from a coding agent, an editor, or any other process show up the same way: added lines in green, removed lines in red, with three lines of context in the default view. Each change is shown once, as a streaming feed rather than a full-screen TUI.

At startup it records the contents of every path returned by `git ls-files --cached --others --exclude-standard` (tracked files and untracked files that are not ignored). It then polls that list every 200 milliseconds, comparing size, mtime, and bytes. New files, deletions, and content edits each produce a diff; binary files (NUL in the first 8 KiB) are reported as changed without a text hunk. Only edits that happen after **livediff** is running appear: the initial snapshot is silent.

The current directory must be inside a Git work tree (`git rev-parse --is-inside-work-tree`). Git itself is the only runtime dependency.

# CAVEATS

The command name **livediff** is also used by an unrelated Rust TUI (`cargo install livediff`, Homebrew tap `socket7/tap/livediff`) that takes a path argument and opens a full-screen viewer. This page documents the Go streaming CLI from **stagas**.

**livediff** polls on a 200 ms timer; it does not use inotify or FSEvents. Very large work trees keep file contents in memory. Ignored paths, and files that are neither tracked nor untracked-but-not-ignored, are never shown. Changes made before the process starts are not replayed.

# HISTORY

**livediff** is a small Go program by **stagas**, released under the **MIT License** in **2026**.

# SEE ALSO

[git-diff](/man/git-diff)(1), [git](/man/git)(1), [gitwatch](/man/gitwatch)(1), [watch](/man/watch)(1), [delta](/man/delta)(1), [diff](/man/diff)(1)

# RESOURCES

```[Source code](https://github.com/stagas/livediff)```

<!-- verified: 2026-09-15 -->
