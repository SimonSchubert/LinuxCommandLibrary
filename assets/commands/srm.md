# TLDR

**Securely delete file**

```srm [file.txt]```

**Delete directory recursively**

```srm -r [directory/]```

**Simple overwrite (faster)**

```srm -s [file.txt]```

**Medium security (7 passes)**

```srm -m [file.txt]```

**Maximum security (38 passes)**

```srm -z [file.txt]```

**Verbose output**

```srm -v [file.txt]```

**Force delete**

```srm -f [file.txt]```

# SYNOPSIS

**srm** [_-r_] [_-s_|_-m_|_-z_] [_-f_] [_-v_] _files_

# PARAMETERS

**-r**, **-R**
> Recursive delete.

**-s**
> Simple overwrite.

**-m**
> Medium (7 passes).

**-z**
> Gutmann (38 passes).

**-f**
> Force, no prompt.

**-v**
> Verbose.

**-l**
> Reduce security for speed.

**-x**
> One filesystem only.

# DESCRIPTION

**srm** (secure rm) overwrites files before deletion. It prevents data recovery.

Simple mode does one overwrite. Fast but less secure.

Default mode uses Gutmann method. Multiple patterns prevent recovery.

Medium mode balances security and speed. Seven overwrite passes.

Recursive mode handles directories. All contents securely deleted.

# CAVEATS

SSD trim may bypass overwrite. Journaling filesystems may retain copies. Slow for large files.

# HISTORY

**srm** was developed for secure file deletion. It implements various overwrite methods to prevent data recovery.

# SEE ALSO

[shred](/man/shred)(1), [rm](/man/rm)(1), [wipe](/man/wipe)(1)
