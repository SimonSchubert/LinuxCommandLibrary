# TAGLINE

Restore SELinux security contexts on files

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

**-R**, **-r**
> Recursively change file labels in directories.

**-v**
> Show changes in file labels.

**-n**
> Don't change any file labels (dry run).

**-p**
> Show progress by printing the number of files in 1k blocks.

**-F**
> Force reset of context to match file_context for customizable files.

**-e** _directory_
> Exclude a directory from recursive operations (repeatable, requires full path).

**-f** _infilename_
> Read a list of files to process from infilename. Use **-** for stdin.

**-T** _nthreads_
> Use up to nthreads threads for parallel processing.

**-i**
> Ignore files that don't exist.

**-x**
> Prevent restorecon from crossing file system boundaries.

**-W**
> Display warnings about entries that had no matching files.

# DESCRIPTION

**restorecon** restores SELinux security contexts on files and directories according to the persistent rules configured in the SELinux file context database. It is typically used after creating new files or when file contexts become incorrect.

The tool looks up the correct context in **/etc/selinux/*/contexts/files/** and applies it to the specified files. This is essential for proper SELinux policy enforcement.

# CAVEATS

Only available on SELinux-enabled systems. Requires appropriate permissions to change file contexts. Large directory trees can take significant time; use **-T** for parallel processing.

# SEE ALSO

[semanage-fcontext](/man/semanage-fcontext)(8), [chcon](/man/chcon)(1), [matchpathcon](/man/matchpathcon)(8), [setfiles](/man/setfiles)(8), [fixfiles](/man/fixfiles)(8), [getenforce](/man/getenforce)(8)
