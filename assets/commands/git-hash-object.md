# TAGLINE

Compute object ID value

# TLDR

**Compute object hash**

```git hash-object [file]```

**Compute and store object**

```git hash-object -w [file]```

**Hash from stdin**

```echo "[content]" | git hash-object --stdin```

**Specify object type**

```git hash-object -t [blob] [file]```

# SYNOPSIS

**git** **hash-object** [_options_] [_file_...]

# PARAMETERS

**-w**
> Write object to database.

**--stdin**
> Read from stdin.

**-t** _type_
> Object type (blob, commit, tree, tag).

**--path** _path_
> Hash as if at path.

**--no-filters**
> Don't apply filters.

**--stdin-paths**
> Read file paths from stdin, hashing each in turn.

**--literally**
> Allow hashing content that wouldn't form a valid object (debugging).

# DESCRIPTION

**git hash-object** computes the object ID (SHA-1, or SHA-256 in repositories using that format) for a file and optionally stores it in the Git object database. This low-level plumbing command exposes Git's internal object storage mechanism.

The command calculates the hash by formatting the file content as a Git object (with type and size header), then hashing it. With the -w option, it also writes the object to .git/objects/, making it part of the repository even if not yet referenced by any commit. The --stdin option enables hashing content from pipes or scripts; --stdin-paths reads a list of file paths instead.

# CAVEATS

Without **-w**, the object is only hashed, not stored. Filters (like `clean` in `.gitattributes`) are applied by default unless **--no-filters** is given, which can change the resulting hash.

# HISTORY

**git hash-object** is a core plumbing command present since Git's earliest releases, exposing the object hashing used internally for blobs, trees, and commits.

# SEE ALSO

[git-cat-file](/man/git-cat-file)(1), [git-write-tree](/man/git-write-tree)(1)

# RESOURCES

```[Source code](https://github.com/git/git)```

```[Homepage](https://git-scm.com/)```

```[Documentation](https://git-scm.com/docs/git-hash-object)```

<!-- verified: 2026-07-17 -->
