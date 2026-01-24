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

**unlink** removes a single file. It calls the unlink syscall.

Single file only. No directories.

Atomic operation. System call.

No options. Simple interface.

Removes hard links. Decrements link count.

# CAVEATS

Single file only. No recursive. Use rm for more features.

# HISTORY

**unlink** is a standard Unix command that directly calls the unlink(2) system call to remove a directory entry.

# SEE ALSO

[rm](/man/rm)(1), [ln](/man/ln)(1), [unlink](/man/unlink)(2)
