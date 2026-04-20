# TAGLINE

remove files from version control

# TLDR

**Delete a file**

```fossil delete [file]```

**Delete with dry run**

```fossil delete --dry-run [file]```

**Delete with force**

```fossil delete -f [file]```

# SYNOPSIS

**fossil** **delete** [_options_] _file_...

# PARAMETERS

**-n**, **--dry-run**
> Show what would happen without modifying anything.

**--hard**
> Also delete the files from the working check-out, not only from version control.

**--soft**
> Keep files in the working check-out (this is the default). Overrides **--hard** if both are given.

**--case-sensitive** _BOOL_
> Override the repository case-sensitivity setting for the file name match.

**--reset**
> Undo a prior, uncommitted deletion — the files return to normal tracking status. Cannot be combined with flags other than **--verbose** and **--dry-run**.

**-v**, **--verbose**
> Used with **--reset** to print each restored file.

# DESCRIPTION

**fossil delete** is an alias for **fossil rm**. It schedules files for removal from version control on the next commit.

This command is provided for convenience and compatibility. All options and behaviors are identical to **fossil rm**. By default, files remain on disk and are only removed from version control.

# SEE ALSO

[fossil-rm](/man/fossil-rm)(1), [fossil-add](/man/fossil-add)(1), [fossil-forget](/man/fossil-forget)(1), [fossil-commit](/man/fossil-commit)(1)

