# TAGLINE

Parse revision and repository information

# TLDR

**Get commit hash**

```git rev-parse HEAD```

**Get short hash**

```git rev-parse --short HEAD```

**Get branch name**

```git rev-parse --abbrev-ref HEAD```

**Get repository root**

```git rev-parse --show-toplevel```

**Check if in git repository**

```git rev-parse --is-inside-work-tree```

**Get git directory**

```git rev-parse --git-dir```

**Verify object exists**

```git rev-parse --verify [ref]```

# SYNOPSIS

**git** **rev-parse** [_options_] _args_...

# PARAMETERS

**--short** [_length_]
> Abbreviated hash.

**--abbrev-ref**
> Show short ref name.

**--verify**
> Verify object exists.

**--show-toplevel**
> Show repository root.

**--git-dir**
> Show .git directory.

**--is-inside-work-tree**
> Check if in work tree.

**--symbolic**
> Show symbolic name.

**--symbolic-full-name**
> Full symbolic name.

# DESCRIPTION

**git rev-parse** translates ref names, symbolic references, and other arguments into SHA-1 hashes. It also provides information about the repository structure, such as the root directory, git directory, and current branch.

This plumbing command is widely used in scripts for resolving refs and querying repository metadata.

# SEE ALSO

[git-rev-list](/man/git-rev-list)(1), [git-describe](/man/git-describe)(1)
