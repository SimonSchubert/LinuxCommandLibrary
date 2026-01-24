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

**rdfind** finds duplicate files efficiently. It uses checksum comparison for accuracy.

Multi-phase detection is fast. Size comparison first, then partial hash, then full hash.

Hardlink mode saves space by linking duplicates. Files share same disk blocks.

Symlink mode creates symbolic links. Originals preserved, duplicates become links.

Results file lists all duplicates found. Enables manual review before action.

Dry run shows what would happen. Safe testing before deletion.

# CAVEATS

Hardlinks only on same filesystem. Symlinks may break if original moves. Careful with deletion.

# HISTORY

**rdfind** (really delete find) was created for efficient duplicate detection. Its multi-stage algorithm handles large file sets quickly.

# SEE ALSO

[fdupes](/man/fdupes)(1), [jdupes](/man/jdupes)(1), [duff](/man/duff)(1)
