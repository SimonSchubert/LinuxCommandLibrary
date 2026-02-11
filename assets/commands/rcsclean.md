# TAGLINE

Remove unchanged RCS working files

# TLDR

**Remove unchanged working files**

```rcsclean```

**Remove unchanged working files** in a directory

```rcsclean [path/to/directory]```

**Remove unchanged working files** and unlock them

```rcsclean -u```

**Preview which files would be removed** (dry run)

```rcsclean -n```

**Remove a specific unchanged file**

```rcsclean [filename]```

# SYNOPSIS

**rcsclean** [_options_] [_file_...]

# PARAMETERS

**-n**
> Dry run; show what would be done without doing it

**-q**
> Quiet mode; suppress diagnostics

**-u** [_rev_]
> Unlock the revision if locked by the caller

**-r** _rev_
> Compare against specified revision instead of default

**-T**
> Preserve modification time of RCS file

**-V**
> Print version number

# DESCRIPTION

**rcsclean** removes working files that have not been modified since checkout. It compares each working file against its corresponding RCS revision and deletes unchanged files, cleaning up the working directory.

This utility is useful for removing files that were checked out for reading but never modified, reducing clutter in the working directory. With **-u**, it also unlocks any locked revisions that the caller owns if the working file is unchanged.

By default, rcsclean operates on all RCS-controlled files in the current directory. Specify filenames to operate on specific files only.

# CAVEATS

Only removes files that are completely unchanged from their checked-out revision. Any modification, including whitespace changes, prevents deletion.

The **-u** option only unlocks revisions locked by the current user. It cannot unlock files locked by other users.

Use **-n** (dry run) first to preview which files will be removed, especially when running on an entire directory.

# SEE ALSO

[rcs](/man/rcs)(1), [ci](/man/ci)(1), [co](/man/co)(1), [rcsdiff](/man/rcsdiff)(1)
