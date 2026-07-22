# TAGLINE

Safely update Git reference values

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
> Read update instructions (update, create, delete, verify, symref-update, etc.) from standard input, applying them together as one atomic transaction.

**-z**
> Use NUL-terminated arguments with **--stdin** instead of quoted, whitespace-terminated strings.

**--batch-updates**
> With **--stdin**, allow individual updates in the transaction to fail without aborting the others.

# DESCRIPTION

**git update-ref** safely updates ref names stored in the repository. It provides atomic ref updates with optional old value verification, ensuring that a ref is only changed if it currently points to an expected value.

This is a low-level plumbing command used internally by higher-level commands like `git branch` and `git tag`. With **--stdin**, multiple ref updates can be batched into a single atomic transaction.

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

[git-symbolic-ref](/man/git-symbolic-ref)(1), [git-branch](/man/git-branch)(1), [git-tag](/man/git-tag)(1)

# RESOURCES

```[Documentation](https://git-scm.com/docs/git-update-ref)```

```[Source code](https://github.com/git/git)```

<!-- verified: 2026-07-17 -->
