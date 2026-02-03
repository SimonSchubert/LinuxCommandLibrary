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

**git hash-object** computes the object ID and optionally creates a blob from a file. A low-level command for interacting with the object database.

# SEE ALSO

[git-cat-file](/man/git-cat-file)(1), [git-write-tree](/man/git-write-tree)(1)

