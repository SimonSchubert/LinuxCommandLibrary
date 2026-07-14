# TAGLINE

duplicate file finder

# TLDR

**Find duplicate files** in a directory

```duff [directory]```

**Find duplicates recursively**

```duff -r [directory]```

**Compare files from multiple directories**

```duff -r [dir1] [dir2] [dir3]```

**Byte-for-byte comparison**, not just digests

```duff -rt [directory]```

**Exclude empty files** (which are all identical to each other)

```duff -rz [directory]```

**Include hidden files** in a recursive search

```duff -ra [directory]```

**Print the excess copies only**, ready to pipe into removal

```duff -re [directory]```

**Use a stronger digest**

```duff -r -d [sha256] [directory]```

# SYNOPSIS

**duff** [_options_] [_file_...]

# PARAMETERS

**-r**
> Search the given directories recursively. Without it, duff only looks at the files named.

**-a**
> Include hidden files and directories in a recursive search.

**-e**
> Excess mode: print all but one file from each cluster, and omit the headers. This is the form to pipe into `xargs rm`.

**-t**
> Thorough mode: compare byte by byte when sizes match, instead of trusting the digest.

**-d** _function_
> Digest algorithm: `sha1` (the default), `sha256`, `sha384`, or `sha512`.

**-z**
> Do not report empty files as duplicates of one another.

**-p**
> Physical mode: treat hard links to the same file as distinct, rather than as duplicates.

**-H** / **-L** / **-P**
> Follow symbolic links given on the command line only; follow all symbolic links; or follow none. **-P** is the default, and each overrides the others.

**-l** _limit_
> Minimum file size at which duff samples rather than reading whole files. Defaults to zero. This is a **size threshold**, not a cap on the number of results.

**-f** _format_
> Custom cluster header, with escapes such as `%n` (file count), `%s` (size), `%d` (digest), `%i` (cluster index).

**-q**
> Quiet mode: suppress warnings and error messages.

**-0**
> When reading file names from stdin, expect them null-terminated rather than newline-separated.

# DESCRIPTION

**duff** (Duplicate File Finder) identifies duplicate files by comparing file sizes and contents. It groups files with identical content, making it useful for finding and removing redundant files to free disk space.

The tool first groups files by size, then compares content using checksums and byte-by-byte comparison when necessary. Output shows clusters of duplicate files separated by blank lines.

# OUTPUT FORMAT

```
file1.txt
file2.txt

another1.jpg
another2.jpg
another3.jpg
```

Each cluster contains files with identical content.

# CAVEATS

**duff does not recurse by default.** `duff mydir` inspects the directory entry itself and finds nothing; you almost always want **-r**. Hidden files are skipped in recursive mode too, unless **-a** is given, so a run that reports no duplicates may simply not have looked.

Without **-t**, duplicates are decided by **digest**, not by comparing the bytes. A SHA-1 collision is not something you will encounter by accident, but the guarantee is probabilistic rather than absolute, and **-t** upgrades it to certainty at the cost of speed. `-l` makes this weaker still: above the given size duff samples rather than hashing whole files, which is fast and occasionally wrong.

duff never deletes anything, which is a feature. The intended pipeline is **-e**, which prints every copy except one per cluster:

```duff -re [directory] | xargs -d '\n' rm --```

Read the output before running that. Empty files are all identical to one another and will be swept up unless **-z** is given, and by default hard links to the same inode are reported as duplicates even though deleting one frees nothing: **-p** stops that.

# HISTORY

duff was written by **Camilla Löwy** as a small, fast duplicate finder for Unix. Its approach is the classic one: group by size first, then by digest, and only fall back to comparing bytes when explicitly asked, which means the vast majority of candidate files are never fully read. Development has long been quiet, and **jdupes**, a maintained and considerably faster descendant of fdupes, is what most people reach for now.

# SEE ALSO

[fdupes](/man/fdupes)(1), [rdfind](/man/rdfind)(1), [jdupes](/man/jdupes)(1), [rmlint](/man/rmlint)(1), [find](/man/find)(1)

# RESOURCES

```[Source code](https://github.com/elmindreda/duff)```

<!-- verified: 2026-07-14 -->

