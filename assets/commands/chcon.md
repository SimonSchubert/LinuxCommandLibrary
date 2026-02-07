# TAGLINE

change SELinux security context of files

# TLDR

View **security context** of a file

```ls -lZ path/to/file```

Set context using **reference file**

```chcon --reference reference_file target_file```

Set **full context**

```chcon user:role:type:level filename```

Change only **user** component

```chcon -u user filename```

Change only **role** component

```chcon -r role filename```

Change only **type** component

```chcon -t type filename```

Change context **recursively**

```chcon -R -t type path/to/directory```

# SYNOPSIS

**chcon** [_OPTION_]... _CONTEXT_ _FILE_...

**chcon** [_OPTION_]... [**-u** _USER_] [**-r** _ROLE_] [**-t** _TYPE_] [**-l** _RANGE_] _FILE_...

**chcon** [_OPTION_]... **--reference**=_RFILE_ _FILE_...

# DESCRIPTION

**chcon** changes the SELinux security context of files. An SELinux context consists of four components: user, role, type, and range (level). The context can be specified as a complete string, by individual components, or by copying from a reference file.

Context changes made with chcon are temporary and will be overwritten during a system relabel or by running restorecon. For persistent context changes, use **semanage fcontext** to define rules and **restorecon** to apply them. The chcon command is primarily useful for testing and debugging SELinux policies before making permanent changes.

# PARAMETERS

**-u, --user=USER**
> Set the user component of the security context

**-r, --role=ROLE**
> Set the role component of the security context

**-t, --type=TYPE**
> Set the type component of the security context

**-l, --range=RANGE**
> Set the range/level component of the security context

**--reference=RFILE**
> Use security context from RFILE

**-R, --recursive**
> Operate on files and directories recursively

**-h, --no-dereference**
> Affect symbolic links instead of referenced files

**--dereference**
> Affect the referenced file (default for non-links)

**-v, --verbose**
> Output a diagnostic for every file processed

**--preserve-root**
> Fail to operate recursively on /

**-H**
> If -R, follow symbolic links on command line only

**-L**
> If -R, follow all symbolic links

**-P**
> If -R, never follow symbolic links (default)

# CAVEATS

Changes made with chcon are temporary and may be reset by restorecon or system relabeling. For permanent changes, use semanage fcontext and restorecon. SELinux must be enabled for this command to function.

# HISTORY

**chcon** is part of GNU **coreutils**, providing SELinux security context management for files on systems with SELinux enabled.

# SEE ALSO

[restorecon](/man/restorecon)(8), [semanage](/man/semanage)(8), [ls](/man/ls)(1), [secon](/man/secon)(1)
