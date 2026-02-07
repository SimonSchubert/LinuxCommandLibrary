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

# DESCRIPTION

**git hash-object** computes the SHA-1 object ID for a file and optionally stores it in the Git object database. This low-level plumbing command exposes Git's internal object storage mechanism.

The command calculates the hash by formatting the file content as a Git object (with type and size header), then computing the SHA-1 hash. With the -w option, it also writes the object to .git/objects/, making it part of the repository even if not yet referenced by any commit. The --stdin option enables hashing content from pipes or scripts.

# SEE ALSO

[git-cat-file](/man/git-cat-file)(1), [git-write-tree](/man/git-write-tree)(1)
