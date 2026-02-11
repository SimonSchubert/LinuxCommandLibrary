# TAGLINE

Remove files and directories

# TLDR

**Remove a file**

```rm [file]```

**Remove multiple files**

```rm [file1] [file2] [file3]```

**Remove a file with confirmation prompt**

```rm -i [file]```

**Remove a directory and its contents recursively**

```rm -r [directory]```

**Force remove without confirmation**

```rm -f [file]```

**Force remove a directory recursively** (dangerous)

```rm -rf [directory]```

**Remove files verbosely** (show what's being deleted)

```rm -v [file]```

**Remove files matching a pattern**

```rm *.tmp```

# SYNOPSIS

**rm** [**-firvd**] _file_...

# PARAMETERS

**-f**, **--force**
> Ignore nonexistent files, never prompt

**-i**
> Prompt before every removal

**-I**
> Prompt once before removing more than 3 files or recursively

**-r**, **-R**, **--recursive**
> Remove directories and their contents recursively

**-d**, **--dir**
> Remove empty directories

**-v**, **--verbose**
> Explain what is being done

**--no-preserve-root**
> Do not treat '/' specially (dangerous)

**--preserve-root**
> Do not remove '/' (default)

**--one-file-system**
> When removing recursively, skip directories on different filesystems

# DESCRIPTION

**rm** removes files and directories. By default, it does not remove directories; use **-r** to remove directories recursively.

Without **-f**, rm prompts for confirmation when removing write-protected files. With **-i**, it prompts for every file. The **-I** option provides a middle ground, prompting once for potentially dangerous operations.

To remove a file starting with a dash, use **--** to end option processing: **rm -- -filename** or use a path: **rm ./-filename**.

The command unlinks files from the filesystem. Data may be recoverable until overwritten. For secure deletion, use **shred**.

# CAVEATS

**rm -rf /** or similar commands can destroy entire systems. Modern systems protect against this, but variations may bypass protections.

Removed files bypass the trash. Use **trash-cli** or desktop trash if recovery might be needed.

Be careful with wildcards. **rm \*** in the wrong directory is destructive. Use **ls** to preview what would be deleted.

Root user should use **rm** with extreme caution. Consider aliases that add **-i** by default.

# SEE ALSO

[rmdir](/man/rmdir)(1), [unlink](/man/unlink)(1), [shred](/man/shred)(1), [trash-cli](/man/trash-cli)(1)
