# TLDR

**Delete a file** with protection against blacklisted paths

```safe-rm [path/to/file]```

**Recursively delete a directory** with protection checks

```safe-rm -r [path/to/directory]```

**Force delete files** while respecting protected paths

```safe-rm -rf [path/to/directory]```

**Delete multiple files** with verbose output

```safe-rm -v [file1] [file2] [file3]```

# SYNOPSIS

**safe-rm** [_rm options_] [_files_]

# PARAMETERS

safe-rm accepts all standard **rm** options and passes them through to the real rm command after verifying paths are not protected.

**-r**, **-R**, **--recursive**
> Remove directories and their contents recursively

**-f**, **--force**
> Ignore nonexistent files and arguments, never prompt

**-i**
> Prompt before every removal

**-v**, **--verbose**
> Explain what is being done

# DESCRIPTION

**safe-rm** is a wrapper around the rm command that prevents accidental deletion of important system files and directories. It checks arguments against a configurable blacklist before passing them to the real rm.

When a user attempts to delete a protected path, safe-rm refuses the operation and displays a warning instead. This provides a safety net against catastrophic mistakes like **rm -rf /**.

Protected paths are configured in **/etc/safe-rm.conf** for system-wide protection and **~/.safe-rm** for per-user settings. Each file contains one path per line. If both are empty, a default list of critical system paths is used.

To use safe-rm as the default rm, create a symlink in a directory that precedes /bin in your PATH:
```ln -s /usr/bin/safe-rm /usr/local/bin/rm```

# CAVEATS

safe-rm cannot protect against all deletion patterns. While **rm -rf /usr/lib** is blocked if /usr/lib is protected, running **cd /usr/lib && rm -rf *** bypasses protection since the protected path itself is not an argument.

# HISTORY

safe-rm was created to prevent accidental deletion of critical system files. Version 1.0.0 released in **November 2020** was a complete rewrite in **Rust**, replacing the original implementation. The project is licensed under GPLv3.

# SEE ALSO

[rm](/man/rm)(1), [trash-cli](/man/trash-cli)(1), [shred](/man/shred)(1)
