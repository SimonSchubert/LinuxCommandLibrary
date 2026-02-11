# TAGLINE

Remove a single file via system call

# TLDR

**Remove file**

```unlink [file]```

**Remove symlink**

```unlink [symlink]```

# SYNOPSIS

**unlink** _file_

# PARAMETERS

_file_
> File to remove.

**--help**
> Show help.

**--version**
> Show version.

# DESCRIPTION

**unlink** removes a single file by directly calling the unlink(2) system call. It provides a minimal interface for file removal, accepting exactly one filename argument with no options for recursion, prompting, or force overwriting.

The command removes the directory entry for the specified file and decrements its link count. If no other hard links point to the same inode and no processes have the file open, the file's data is freed. For files with multiple hard links, only the specified link is removed while the data remains accessible through other links.

Unlike **rm**, unlink cannot remove directories and does not accept multiple files or glob patterns. This simplicity makes it predictable and safe for scripting where removing exactly one file is intended, with no risk of accidentally matching extra files through pattern expansion.

# CAVEATS

Single file only. No recursive. Use rm for more features.

# HISTORY

**unlink** is a standard Unix command that directly calls the unlink(2) system call to remove a directory entry.

# SEE ALSO

[rm](/man/rm)(1), [ln](/man/ln)(1), [unlink](/man/unlink)(2)
