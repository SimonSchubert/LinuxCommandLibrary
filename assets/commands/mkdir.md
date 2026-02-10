# TAGLINE

creates directories with the specified names

# TLDR

**Create a directory**

```mkdir [directory]```

**Create multiple directories**

```mkdir [dir1] [dir2] [dir3]```

**Create parent directories** as needed (no error if existing)

```mkdir -p [path/to/nested/directory]```

**Create a directory with specific permissions**

```mkdir -m [755] [directory]```

**Create directories and show a message** for each

```mkdir -v [dir1] [dir2]```

# SYNOPSIS

**mkdir** [_-pv_] [_-m mode_] _directory ..._

# PARAMETERS

**-p**, **--parents**
> Create parent directories as needed; no error if existing

**-m** _mode_, **--mode**=_mode_
> Set file mode (permissions) for the new directory

**-v**, **--verbose**
> Print a message for each created directory

**-Z**, **--context**
> Set SELinux security context of each created directory

**--help**
> Display help information and exit

**--version**
> Output version information and exit

# DESCRIPTION

**mkdir** creates directories with the specified names. By default, it creates the directory in the current working directory or at the specified path.

The **-p** option is particularly useful for creating nested directory structures in a single command, as it creates all necessary parent directories and does not report an error if the target directory already exists. This makes it ideal for scripts where the directory may or may not exist.

Permissions for the new directory are affected by the current **umask** unless explicitly set with **-m**. The default permission is typically 777 minus the umask value.

# CAVEATS

Creating directories requires write permission in the parent directory. On filesystems with limited filename support (like FAT), certain characters in directory names may cause issues. The **-p** flag silently succeeds if the directory exists, which may mask errors in scripts expecting to create new directories.

# HISTORY

The **mkdir** command has been part of Unix since the **First Edition in 1971**, making it one of the original Unix commands. It was created by **Ken Thompson** at Bell Labs. The command has remained remarkably stable over the decades, with the **-p** option added in later versions to simplify directory tree creation. It is defined by the POSIX standard and is available on all Unix-like operating systems.

# SEE ALSO

[rmdir](/man/rmdir)(1), [rm](/man/rm)(1), [ls](/man/ls)(1), [chmod](/man/chmod)(1), [install](/man/install)(1)
