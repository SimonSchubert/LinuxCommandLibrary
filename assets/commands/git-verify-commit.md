# TAGLINE

Verify GPG signatures of commits

# TLDR

**Verify signed commit**

```git verify-commit [commit]```

**Verify multiple commits**

```git verify-commit [commit1] [commit2]```

**Show raw signature**

```git verify-commit --raw [commit]```

**Verbose output**

```git verify-commit -v [commit]```

# SYNOPSIS

**git** **verify-commit** [_options_] _commit_...

# PARAMETERS

**-v**, **--verbose**
> Print commit contents.

**--raw**
> Print raw signature.

# DESCRIPTION

**git verify-commit** checks GPG signatures of commits. It verifies that commits were signed with valid GPG keys, confirming the authenticity and integrity of the commit author.

This command is useful in workflows that require signed commits for security or compliance purposes.

# CAVEATS

The signer's public key must already be available in the local GPG keyring (or configured SSH/X.509 verifier) for verification to succeed; an unknown key results in a failure even if the signature itself is valid. Exits non-zero if any given commit lacks a valid signature.

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

[git-commit](/man/git-commit)(1), [git-verify-tag](/man/git-verify-tag)(1), [git-log](/man/git-log)(1)

# RESOURCES

```[Documentation](https://git-scm.com/docs/git-verify-commit)```

```[Source code](https://github.com/git/git)```

<!-- verified: 2026-07-17 -->
