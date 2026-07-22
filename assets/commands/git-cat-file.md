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

**Batch-print info and content for objects on stdin**

```git cat-file --batch```

**Batch-check type and size for objects on stdin**

```git cat-file --batch-check```

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
> Exit with zero status if the object exists and is valid.

**--batch**
> Print object info and content for each object id read from stdin.

**--batch-check**
> Print object type and size for each object id read from stdin.

**--textconv**
> Show content as transformed by a configured textconv filter.

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

# INSTALL

```apt: sudo apt install git```

```dnf: sudo dnf install git```

```pacman: sudo pacman -S git```

```apk: sudo apk add git```

```zypper: sudo zypper install git```

```brew: brew install git```

```nix: nix profile install nixpkgs#git```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[git-show](/man/git-show)(1), [git-hash-object](/man/git-hash-object)(1), [git-ls-tree](/man/git-ls-tree)(1), [git-rev-parse](/man/git-rev-parse)(1), [git-verify-pack](/man/git-verify-pack)(1)

