# TAGLINE

Clone dotfiles repository with yadm

# TLDR

**Clone dotfiles repo**

```yadm clone [url]```

**Clone with bootstrap**

```yadm clone --bootstrap [url]```

**Clone without checkout**

```yadm clone --no-checkout [url]```

# SYNOPSIS

**yadm** **clone** [_options_] _url_

# PARAMETERS

**--bootstrap**
> Run bootstrap after clone.

**--no-checkout**
> Clone without checkout.

**-f**, **--force**
> Force overwrite existing files.

**-w** _dir_
> Set worktree directory.

# DESCRIPTION

**yadm clone** clones a dotfiles repository to manage with yadm. Downloads repo and checks out files to home directory. First step in setting up dotfiles on a new system.

# SEE ALSO

[yadm](/man/yadm)(1), [yadm-bootstrap](/man/yadm-bootstrap)(1)

