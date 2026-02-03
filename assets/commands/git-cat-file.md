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

**git cat-file** provides content or type/size information for repository objects. A low-level command for examining the Git object database directly.

# SEE ALSO

[git-show](/man/git-show)(1), [git-hash-object](/man/git-hash-object)(1)

