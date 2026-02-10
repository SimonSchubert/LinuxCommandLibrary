# TAGLINE

fast duplicate file finder and remover

# TLDR

**Find duplicate files** in a directory

```jdupes [path/to/directory]```

**Find duplicates recursively**

```jdupes -r [path/to/directory]```

**Delete duplicates interactively**

```jdupes -r -d [path/to/directory]```

**Delete duplicates automatically** (keep first)

```jdupes -r -dN [path/to/directory]```

**Show duplicate sizes**

```jdupes -r -S [path/to/directory]```

**Use hard links** instead of deleting

```jdupes -r -L [path/to/directory]```

**Summarize duplicate statistics**

```jdupes -r -m [path/to/directory]```

**Compare across multiple directories**

```jdupes -r [dir1] [dir2] [dir3]```

# SYNOPSIS

**jdupes** [_options_] _directory_ [_directory ..._]

# PARAMETERS

**-r**, **--recurse**
> Recurse into subdirectories.

**-d**, **--delete**
> Prompt for which duplicates to delete.

**-N**, **--noprompt**
> With -d, delete without prompting (keep first).

**-D**, **--debug**
> Show debug/diagnostic output.

**-S**, **--size**
> Show size of duplicate files.

**-m**, **--summarize**
> Print summary of duplicate statistics.

**-L**, **--linkhard**
> Replace duplicates with hard links.

**-s**, **--symlinks**
> Follow symbolic links.

**-H**, **--hardlinks**
> Treat hard links as duplicates.

**-n**, **--noempty**
> Exclude zero-length files.

**-A**, **--nohidden**
> Exclude hidden files.

**-f**, **--omitfirst**
> Omit the first file in each duplicate set.

**-1**, **--sameline**
> List each duplicate set on a single line.

**-0**, **--printnull**
> Use null character as line terminator.

**-q**, **--quiet**
> Hide progress indicator.

**-Q**, **--quick**
> Skip byte-by-byte verification.

**-X**, **--xsize** _[+-=]SIZE_
> Exclude files by size criteria.

**-o**, **--order** _by_
> Order files by: name, time, none.

# DESCRIPTION

**jdupes** is a fast duplicate file finder and remover. It identifies files with identical content by comparing file sizes, then partial hashes, then full hashes, and optionally byte-by-byte comparison for certainty.

The tool is a fork and enhancement of the older **fdupes** program, offering better performance (often 7x faster) and additional features. It uses optimized comparison algorithms and can handle millions of files efficiently.

Duplicates can be handled in several ways: interactive deletion (-d) presents choices for each set, automatic deletion (-dN) keeps the first file, and hard linking (-L) replaces duplicates with links to save space while preserving all filenames.

When scanning multiple directories, jdupes compares files across all of them, useful for finding duplicates between a backup and primary storage. The summary mode (-m) gives a quick overview of potential space savings.

The ordering option (-o) controls which file is considered "first" for automatic operations, allowing preference for keeping newer or alphabetically-first files.

# CAVEATS

Hard linking only works on the same filesystem. Automatic deletion (-dN) with multiple directories may not preserve the expected file. Very large file counts may require significant memory. Quick mode (-Q) skips verification and could theoretically produce false positives.

# HISTORY

**jdupes** was created by Jody Bruchon starting around **2015** as an enhanced fork of fdupes. The primary goals were improved performance and additional features while maintaining compatibility. The name combines "Jody's" with "dupes." It has become a popular choice for duplicate management, available in most Linux distribution repositories.

# SEE ALSO

[fdupes](/man/fdupes)(1), [rdfind](/man/rdfind)(1), [duperemove](/man/duperemove)(8), [rmlint](/man/rmlint)(1)
