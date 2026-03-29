# TAGLINE

Execute the yadm bootstrap program

# TLDR

**Run the bootstrap script**

```yadm bootstrap```

# SYNOPSIS

**yadm** **bootstrap**

# DESCRIPTION

**yadm bootstrap** executes the bootstrap program at `$HOME/.config/yadm/bootstrap` if it exists. This is typically used for post-clone setup such as installing packages, setting permissions, or configuring applications. The bootstrap script must be executable.

After `yadm clone` successfully clones a repository, yadm will prompt whether to run the bootstrap program if one is found. This prompt can be bypassed with the `--bootstrap` or `--no-bootstrap` options to `yadm clone`.

The bootstrap program can be any executable file, though bash scripts are common. It is recommended to make the bootstrap logic idempotent so it can be safely re-run when merging changes from other hosts. The bootstrap path can be overridden with the `--yadm-bootstrap` option.

# SEE ALSO

[yadm](/man/yadm)(1), [yadm-clone](/man/yadm-clone)(1)

