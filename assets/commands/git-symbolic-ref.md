# TAGLINE

Read and modify symbolic references like HEAD

# TLDR

**Show HEAD target**

```git symbolic-ref HEAD```

**Set HEAD to branch**

```git symbolic-ref HEAD refs/heads/main```

**Get short name**

```git symbolic-ref --short HEAD```

**Delete symbolic ref**

```git symbolic-ref -d HEAD```

# SYNOPSIS

**git symbolic-ref** [_options_] _name_ [_ref_]

# PARAMETERS

_NAME_
> Symbolic ref name (usually HEAD).

_REF_
> Target ref to set.

**--short**
> Show short name.

**-d**, **--delete**
> Delete symbolic ref.

**-q**, **--quiet**
> Quiet mode.

**--help**
> Display help information.

# DESCRIPTION

**git symbolic-ref** reads and modifies symbolic references. HEAD is the most common symbolic ref, pointing to the currently checked-out branch. This plumbing command shows which branch HEAD points to or changes it programmatically.

When HEAD is detached (pointing directly to a commit rather than a branch), this command will report an error, distinguishing it from `git rev-parse`.

# CAVEATS

Plumbing command. HEAD is most common use. Detached HEAD is not a symbolic ref.

# HISTORY

git symbolic-ref is a core **Git** plumbing command for managing symbolic references, fundamental to branch tracking.

# SEE ALSO

[git-checkout](/man/git-checkout)(1), [git-rev-parse](/man/git-rev-parse)(1)
