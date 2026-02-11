# TAGLINE

Secure file deletion with overwriting

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

**srm** (secure rm) deletes files by overwriting their contents before unlinking, making data recovery significantly more difficult than with standard **rm**. It offers multiple security levels: simple mode (**-s**) performs a single overwrite pass for speed, medium mode (**-m**) uses 7 passes based on the DoD 5220.22-M standard, and the default Gutmann mode (**-z**) performs 38 passes with various patterns designed to defeat magnetic force microscopy.

The tool handles recursive directory deletion with **-r** and supports force mode (**-f**) to skip confirmation prompts. File names are also overwritten before deletion to prevent recovery of filenames from directory entries.

# CAVEATS

SSD trim may bypass overwrite. Journaling filesystems may retain copies. Slow for large files.

# HISTORY

**srm** was developed for secure file deletion. It implements various overwrite methods to prevent data recovery.

# SEE ALSO

[shred](/man/shred)(1), [rm](/man/rm)(1), [wipe](/man/wipe)(1)
