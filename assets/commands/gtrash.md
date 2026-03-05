# TAGLINE

Featureful trash CLI manager and safe rm alternative

# TLDR

**Move files to trash** instead of deleting

```gtrash put [path/to/file1] [path/to/file2]```

**List files in the trash**

```gtrash find```

**Restore files interactively** with a TUI

```gtrash restore```

**Permanently delete files** matching a pattern from trash

```gtrash find --rm "[pattern]"```

**Show trash summary** with sizes

```gtrash summary```

**Clean up old files** from trash

```gtrash prune --day [30]```

# SYNOPSIS

**gtrash** _command_ [_options_] [_arguments_]

# DESCRIPTION

**gtrash** is a featureful trash CLI manager that serves as a safer alternative to **rm**. Instead of permanently deleting files with the unlink syscall, it moves them to the system trash using the rename syscall, enabling easy restoration. It follows the **FreeDesktop.org Trash specification**, making it compatible with desktop trash implementations and other tools like **gio trash** and **trash-cli**.

Key features include directory size caching for fast browsing, restoration of co-deleted files, an interactive TUI for selecting files to restore, and support for external drives with per-volume trash directories.

# PARAMETERS

**put**
> Move files to trash

**find**
> List files in trash (supports --rm to permanently delete matches)

**restore**
> Interactively restore files from trash using TUI

**summary**
> Show trash size summary

**prune**
> Remove old files from trash

**--day** _N_
> Used with prune to specify age threshold in days

**--rm**
> Used with find to permanently delete matching files

# CAVEATS

Files moved to trash still consume disk space until pruned or permanently deleted. The rename syscall used for trashing only works within the same filesystem; cross-filesystem moves require copying. Permanently deleting with **--rm** is irreversible, similar to rm.

# HISTORY

**gtrash** was created by **umlx5h** as a modern, feature-rich alternative to both **rm** and existing trash managers. It is written in **Go** and distributed as a single static binary.

# SEE ALSO

[rm](/man/rm)(1), [trash-cli](/man/trash-cli)(1)
