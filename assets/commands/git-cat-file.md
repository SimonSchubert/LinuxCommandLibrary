# TAGLINE

Display content or metadata of repository objects

# TLDR

**Show object type**

```git cat-file -t [object]```

**Show object size**

```git cat-file -s [object]```

**Show object content**

```git cat-file -p [object]```

**Show blob content**

```git cat-file blob [hash]```

**Show commit content**

```git cat-file commit [hash]```

**Show tree content**

```git cat-file tree [hash]```

# SYNOPSIS

**git** **cat-file** [_options_] _object_

# PARAMETERS

**-t**
> Show object type.

**-s**
> Show object size.

**-p**
> Pretty-print content.

**-e**
> Check if object exists.

**blob**
> Show blob.

**commit**
> Show commit.

**tree**
> Show tree.

# DESCRIPTION

**git cat-file** provides direct access to Git's object database, allowing inspection of blobs, trees, commits, and tags. This low-level plumbing command reveals the internal structure of Git's content-addressable storage system.

The command operates on object hashes (SHA-1 or SHA-256) and can display object type, size, or pretty-printed content. It's essential for debugging repository corruption, understanding Git internals, and forensic analysis of repository history.

Common use cases include examining specific versions of files without checking them out, inspecting tree structures to understand directory layouts at specific commits, and validating object integrity. The -p flag pretty-prints objects in human-readable format, while -t and -s provide metadata without full content extraction.

# SEE ALSO

[git-show](/man/git-show)(1), [git-hash-object](/man/git-hash-object)(1)

