# TAGLINE

Automatically commit changes when files are modified

# TLDR

**Watch directory and auto-commit**

```gitwatch [path]```

**Watch with custom message**

```gitwatch -m "[Auto commit]" [path]```

**Watch and push**

```gitwatch -r [remote] -b [branch] [path]```

**Watch specific branch**

```gitwatch -b [branch] [path]```

# SYNOPSIS

**gitwatch** [_options_] _path_

# PARAMETERS

**-s** _seconds_
> Delay before committing after a change is detected (default: 2).

**-d** _format_
> Timestamp format string used in the default commit message (see `man date`).

**-r** _remote_
> Remote to push to after each commit (default: no push).

**-R**
> Run `git pull --rebase` before pushing.

**-b** _branch_
> Branch to push commits to.

**-g** _path_
> Location of the `.git` directory (auto-detected by default).

**-m** _message_
> Commit message template; `%d` is replaced with the timestamp.

**-c** _command_
> Command whose output is used as the commit message instead of `-m`.

**-C**
> Pipe the list of changed files to the `-c` command via stdin.

**-l** _lines_, **-L** _lines_
> Include changed lines in the commit message, colored (`-l`) or uncolored (`-L`); `0` includes all lines.

**-e** _events_
> inotifywait events to monitor for changes.

**-x** _pattern_
> Exclude paths matching pattern from being watched.

**-f**
> Commit any pending changes immediately on startup.

**-M**
> Skip auto-committing while a git merge is in progress.

**-v**
> Verbose/debug output.

**-h**
> Display help message.

# DESCRIPTION

**gitwatch** watches a directory and automatically commits changes whenever files are modified. It uses inotifywait (on Linux, via inotify-tools) or fswatch (on macOS/BSD) to detect file changes in real time, then waits a short delay before committing so rapid successive edits are batched into a single commit.

The tool is useful for automatic version control of notes, configuration files, or any directory where you want every change tracked without manual commits, and can optionally push each commit to a remote.

# CAVEATS

Requires **inotify-tools** on Linux or **fswatch** on macOS/BSD to be installed. Only tracks changes gitwatch itself observes while running; it does not replay changes made while it was stopped.

# INSTALL

```brew: brew install gitwatch```

```nix: nix profile install nixpkgs#gitwatch```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[inotifywait](/man/inotifywait)(1), [git](/man/git)(1)

# RESOURCES

```[Source code](https://github.com/gitwatch/gitwatch)```

<!-- verified: 2026-07-17 -->
