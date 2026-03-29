# TAGLINE

Pick out and massage parameters for other git commands

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

**Verify** a ref exists (exits non-zero if invalid)

```git rev-parse --verify [ref]```

**Get path** from repo root to current directory

```git rev-parse --show-prefix```

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

**--show-prefix**
> Show path of current directory relative to repository root.

**--show-cdup**
> Show path from current directory to repository root.

**--is-bare-repository**
> Print "true" if the repository is bare, "false" otherwise.

**--absolute-git-dir**
> Like --git-dir, but output is always an absolute path.

**--symbolic**
> Show symbolic name instead of SHA-1.

**--symbolic-full-name**
> Like --symbolic but show full ref name (e.g., refs/heads/master).

**--quiet**
> Only meaningful with --verify. Do not output error message on failure, just exit with non-zero status.

# DESCRIPTION

**git rev-parse** translates ref names, symbolic references, and other arguments into SHA-1 hashes. It also provides information about the repository structure, such as the root directory, git directory, and current branch.

This plumbing command is widely used in scripts for resolving refs and querying repository metadata.

# SEE ALSO

[git-rev-list](/man/git-rev-list)(1), [git-describe](/man/git-describe)(1), [git-symbolic-ref](/man/git-symbolic-ref)(1), [git-log](/man/git-log)(1)
