# TLDR

**Find duplicate files** in a directory

```fdupes [/path/to/directory]```

**Find duplicates recursively**

```fdupes -r [/path/to/directory]```

**Delete duplicates** interactively

```fdupes -d [/path/to/directory]```

**Delete duplicates** keeping first file automatically

```fdupes -dN [/path/to/directory]```

**Show sizes** of duplicate files

```fdupes -S [/path/to/directory]```

**Summarize** duplicate statistics

```fdupes -m [/path/to/directory]```

**Compare multiple directories**

```fdupes [/path/dir1] [/path/dir2]```

**Find duplicates** only comparing specified directories

```fdupes -r [/path/original] [/path/copy]```

# SYNOPSIS

**fdupes** [_options_] _directory_...

# DESCRIPTION

**fdupes** identifies duplicate files in specified directories by comparing file sizes and MD5 signatures, followed by a byte-by-byte comparison for verification. It groups duplicate files together for review or automatic deletion.

The tool first compares file sizes, then calculates partial and full MD5 hashes, and finally performs byte comparison to ensure accuracy. This multi-stage approach balances speed and accuracy.

fdupes can operate across multiple directories, finding duplicates within and between them. It's useful for cleaning up backup copies, photo libraries, and reclaiming disk space.

# PARAMETERS

**-r**, **--recurse**
> Search directories recursively.

**-R**, **--recurse:**
> Recursive for following directories only.

**-d**, **--delete**
> Prompt for files to delete.

**-N**, **--noprompt**
> With -d, delete without prompting.

**-S**, **--size**
> Show size of duplicate files.

**-m**, **--summarize**
> Show summary statistics.

**-1**, **--sameline**
> List sets on single lines.

**-n**, **--noempty**
> Exclude empty files.

**-H**, **--hardlinks**
> Treat hard links as duplicates.

**-f**, **--omitfirst**
> Omit first file in each set.

**-q**, **--quiet**
> Quiet mode (for -d operation).

**-i**, **--reverse**
> Reverse order (delete first file).

**-L**, **--linkhard**
> Replace duplicates with hard links.

# CAVEATS

Byte-by-byte comparison can be slow for large files. Delete operations are irreversible. Hard link mode changes file relationships. Cannot compare across different filesystems for hard linking.

# HISTORY

**fdupes** was created by **Adrian Lopez** in **1999** as a utility for finding duplicate files. It has been maintained and enhanced over the years, becoming a standard tool for duplicate detection on Unix-like systems. The tool influenced many similar utilities and remains actively used for disk cleanup operations.

# SEE ALSO

[rmlint](/man/rmlint)(1), [find](/man/find)(1), [md5sum](/man/md5sum)(1), [diff](/man/diff)(1)
