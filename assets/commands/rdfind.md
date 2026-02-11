# TAGLINE

Find and handle duplicate files efficiently

# TLDR

**Find duplicates**

```rdfind [directory]```

**Find in multiple directories**

```rdfind [dir1] [dir2]```

**Delete duplicates**

```rdfind -deleteduplicates true [directory]```

**Create hardlinks**

```rdfind -makehardlinks true [directory]```

**Create symlinks**

```rdfind -makesymlinks true [directory]```

**Dry run**

```rdfind -dryrun true [directory]```

**Output results file**

```rdfind -outputname [results.txt] [directory]```

# SYNOPSIS

**rdfind** [_-deleteduplicates true_] [_-makehardlinks true_] [_options_] _directories_

# PARAMETERS

**-deleteduplicates** _BOOL_
> Delete duplicates.

**-makehardlinks** _BOOL_
> Replace with hardlinks.

**-makesymlinks** _BOOL_
> Replace with symlinks.

**-dryrun** _BOOL_
> Simulate only.

**-ignoreempty** _BOOL_
> Ignore empty files.

**-removeidentinode** _BOOL_
> Remove same inode files.

**-outputname** _FILE_
> Results filename.

**-minsize** _BYTES_
> Minimum file size.

# DESCRIPTION

**rdfind** (redundant data find) efficiently locates duplicate files across one or more directory trees using a multi-phase detection algorithm. It first groups files by size, then computes partial checksums on the first bytes of same-sized files, and finally performs full checksums only on files that still match, making it fast even on large file sets.

Once duplicates are identified, rdfind can delete them, replace them with hardlinks (saving disk space while keeping the same path), or replace them with symbolic links. A results file lists all duplicates found for manual review, and the **-dryrun** flag simulates operations without modifying the filesystem. The first file encountered in the argument order is always kept as the original.

# CAVEATS

Hardlinks only on same filesystem. Symlinks may break if original moves. Careful with deletion.

# HISTORY

**rdfind** (really delete find) was created for efficient duplicate detection. Its multi-stage algorithm handles large file sets quickly.

# SEE ALSO

[fdupes](/man/fdupes)(1), [jdupes](/man/jdupes)(1), [duff](/man/duff)(1)
