# TAGLINE

change file group ownership

# TLDR

**Change the group of a file**

```chgrp [group] [path/to/file]```

**Change the group of a directory recursively**

```chgrp -R [group] [path/to/directory]```

**Change group using a reference file**

```chgrp --reference=[path/to/reference_file] [path/to/file]```

**Change group of a symbolic link itself**

```chgrp -h [group] [path/to/symlink]```

**Change group verbosely showing each file processed**

```chgrp -v [group] [path/to/file]```

**Change group showing only when changes are made**

```chgrp -c [group] [path/to/file]```

# SYNOPSIS

**chgrp** [_OPTION_...] _GROUP_ _FILE_...

**chgrp** [_OPTION_...] **--reference=**_RFILE_ _FILE_...

# DESCRIPTION

**chgrp** changes the group ownership of each specified file to the given group. The group can be specified by name or numeric GID.

All files in Linux belong to both an owner and a group. While **chown** changes user ownership, **chgrp** specifically handles group ownership changes.

# PARAMETERS

**-c, --changes**
> Report only when a change is made (like verbose but quieter)

**-f, --silent, --quiet**
> Suppress most error messages

**-v, --verbose**
> Output a diagnostic for every file processed

**-h, --no-dereference**
> Affect symbolic links instead of referenced files

**-R, --recursive**
> Operate on files and directories recursively

**--reference=**_RFILE_
> Use RFILE's group instead of specifying a GROUP

**Recursive traversal options (with -R):**

**-H** - Traverse symbolic link on command line
**-L** - Traverse all symbolic links to directories
**-P** - Do not traverse symbolic links (default)

# CAVEATS

Only root or the file owner can change group ownership. Regular users can only change to groups they belong to. Use **ls -l** to view current group ownership.

# HISTORY

**chgrp** is a standard Unix command dating back to early Unix systems. The GNU coreutils version was written by David MacKenzie and is the implementation found on most Linux distributions.

# SEE ALSO

[chown](/man/chown)(1), [chmod](/man/chmod)(1), [groups](/man/groups)(1), [ls](/man/ls)(1)
