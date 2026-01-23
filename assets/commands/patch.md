# TLDR

**Apply a patch**

```patch < [patchfile.patch]```

**Apply patch with strip level**

```patch -p1 < [patchfile.patch]```

**Apply patch to specific file**

```patch [file] < [patchfile.patch]```

**Apply patch in dry-run** mode

```patch --dry-run < [patchfile.patch]```

**Reverse a patch**

```patch -R < [patchfile.patch]```

**Create backup** of original files

```patch -b < [patchfile.patch]```

**Apply patch** with different prefix

```patch -d [/path/to/directory] -p1 < [patchfile.patch]```

**Force apply** ignoring errors

```patch -f < [patchfile.patch]```

# SYNOPSIS

**patch** [_options_] [_original_] [_patchfile_]

# DESCRIPTION

**patch** applies changes described in a patch file to original files. Patch files are typically created by diff and contain instructions for adding, modifying, or removing lines.

The tool reads the patch file and attempts to apply each hunk (section of changes) to the target file. If a hunk doesn't match exactly, patch tries to find a location where it can apply with fuzz (allowing some context lines to differ).

patch is essential for software development, applying updates to source code, and managing code changes distributed as patches.

# PARAMETERS

**-p** _num_
> Strip num leading path components.

**-R**, **--reverse**
> Reverse the patch.

**-N**, **--forward**
> Ignore already applied patches.

**-b**, **--backup**
> Create backup files.

**-d** _dir_, **--directory=** _dir_
> Change to directory first.

**--dry-run**
> Don't modify files, show what would happen.

**-f**, **--force**
> Assume user knows best, don't ask.

**-i** _file_, **--input=** _file_
> Read patch from file.

**-o** _file_, **--output=** _file_
> Output to file.

**-F** _num_, **--fuzz=** _num_
> Set max fuzz factor.

**-l**, **--ignore-whitespace**
> Ignore whitespace changes.

**--verbose**
> Output debugging information.

**-E**, **--remove-empty-files**
> Remove empty files after patching.

# CAVEATS

Patches may fail if files have changed since the diff was created. Fuzz can cause patches to apply in wrong locations. Always use --dry-run first for unfamiliar patches. Reverse patches should be applied in reverse order.

# HISTORY

**patch** was written by **Larry Wall** in **1985** as part of his contributions to Unix tools. It became essential for distributing software changes before version control systems were widespread. The tool remains important for kernel development, where patches are the standard method for submitting changes.

# SEE ALSO

[diff](/man/diff)(1), [git-apply](/man/git-apply)(1), [quilt](/man/quilt)(1)
