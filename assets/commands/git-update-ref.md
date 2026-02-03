# TLDR

**Update ref to new value**

```git update-ref [refs/heads/branch] [commit]```

**Delete ref**

```git update-ref -d [refs/heads/branch]```

**Create symbolic ref**

```git update-ref --symbolic-ref [ref] [target]```

**Update with old value check**

```git update-ref [ref] [new] [old]```

# SYNOPSIS

**git** **update-ref** [_options_] _ref_ _newvalue_ [_oldvalue_]

# PARAMETERS

**-d**
> Delete ref.

**--create-reflog**
> Create reflog.

**--no-deref**
> Don't dereference symbolic.

**-m** _reason_
> Reflog message.

**--stdin**
> Read from stdin.

# DESCRIPTION

**git update-ref** safely updates ref names. Provides atomic ref updates with optional old value verification. Used by higher-level commands like git branch.

# SEE ALSO

[git-symbolic-ref](/man/git-symbolic-ref)(1), [git-branch](/man/git-branch)(1)

