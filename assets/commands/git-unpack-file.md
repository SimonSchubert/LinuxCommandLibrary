# TAGLINE

Extract blob contents to a temporary file

# TLDR

**Unpack blob to temp file**

```git unpack-file [blob_hash]```

# SYNOPSIS

**git** **unpack-file** _blob_

# DESCRIPTION

**git unpack-file** creates a temporary file with a blob's contents and prints the filename. It is a low-level plumbing command for accessing blob contents outside of the working tree, used internally during merges and by scripts that need direct access to a blob's data.

# CAVEATS

Creates a file named **.merge_file_XXXXXX** in the current directory. Git does not remove it automatically; the caller is responsible for deleting it once done.

# SEE ALSO

[git-cat-file](/man/git-cat-file)(1), [git-hash-object](/man/git-hash-object)(1)

# RESOURCES

```[Documentation](https://git-scm.com/docs/git-unpack-file)```

```[Source code](https://github.com/git/git)```

<!-- verified: 2026-07-17 -->
