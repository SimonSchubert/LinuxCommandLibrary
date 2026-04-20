# TAGLINE

Remove a single file via the unlink(2) system call

# TLDR

**Remove a regular file**

```unlink [file]```

**Remove a symbolic link (removes the link, not the target)**

```unlink [symlink]```

**Display version information**

```unlink --version```

# SYNOPSIS

**unlink** _FILE_

**unlink** _OPTION_

# PARAMETERS

_FILE_
> Exactly one file path to unlink.

**--help**
> Display a brief help message and exit.

**--version**
> Output version information and exit.

# DESCRIPTION

**unlink** calls the **unlink(2)** system call to remove the directory entry for a single file. It accepts exactly one operand and has no options for recursion, interactive prompting, or force behavior.

When the last link to a file is removed and no process still has it open, the underlying inode and data blocks are freed. For files with multiple hard links, only the named link is removed; data remains accessible through the remaining links. Removing a symbolic link deletes the link itself, not the target.

Unlike **rm**, **unlink** cannot operate on directories, cannot accept multiple operands, and does not expand shell globs specially. This minimalism makes it predictable for scripts that need to remove exactly one path with no risk of accidentally matching additional files.

# CAVEATS

Only a single operand is accepted; passing two or more arguments is an error. Directories cannot be removed — use **rmdir(1)** or **rm -r** for that. Many shells ship **unlink** as a utility from GNU coreutils; the built-in shell form (e.g. in ksh) may behave slightly differently.

# HISTORY

**unlink** is a long-standing Unix utility that exposes the **unlink(2)** system call. The GNU coreutils implementation conforms to **POSIX.1-2001**.

# SEE ALSO

[rm](/man/rm)(1), [rmdir](/man/rmdir)(1), [ln](/man/ln)(1)
