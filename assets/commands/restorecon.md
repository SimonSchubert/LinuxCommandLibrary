# TLDR

**Restore** the security context of a file or directory

```restorecon [path/to/file_or_directory]```

**Restore** the security context of a directory recursively with verbose output

```restorecon -R -v [path/to/directory]```

**Restore** the security context recursively using all available threads with progress

```restorecon -R -T [0] -p [path/to/directory]```

**Preview** the label changes without applying them

```restorecon -R -n -v [path/to/directory]```

# SYNOPSIS

**restorecon** [_options_] _pathname_...

# PARAMETERS

**-R, -r, --recursive**
> Recursively change file labels in directories

**-v, --verbose**
> Show changes in file labels

**-n, --nochange**
> Don't change any file labels (dry run)

**-p, --progress**
> Show progress by printing a dot every 1000 files

**-F, --force**
> Force reset of context to match file_context

**-e _directory_**
> Exclude a directory from recursive operations

**-T _threads_**
> Number of threads to use (0 = all available CPUs)

**-i, --ignore**
> Ignore files that don't exist

# DESCRIPTION

**restorecon** restores SELinux security contexts on files and directories according to the persistent rules configured in the SELinux file context database. It is typically used after creating new files or when file contexts become incorrect.

The tool looks up the correct context in **/etc/selinux/*/contexts/files/** and applies it to the specified files. This is essential for proper SELinux policy enforcement.

# CAVEATS

Only available on SELinux-enabled systems. Requires appropriate permissions to change file contexts. Large directory trees can take significant time; use **-T** for parallel processing.

# SEE ALSO

[semanage-fcontext](/man/semanage-fcontext)(8), [chcon](/man/chcon)(1), [matchpathcon](/man/matchpathcon)(8), [selinux](/man/selinux)(8)
