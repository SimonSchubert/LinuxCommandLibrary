# TAGLINE

Verify GPG signatures of tags

# TLDR

**Verify signed tag**

```git verify-tag [tag]```

**Verify multiple tags**

```git verify-tag [tag1] [tag2]```

**Show raw signature**

```git verify-tag --raw [tag]```

**Verbose output**

```git verify-tag -v [tag]```

# SYNOPSIS

**git** **verify-tag** [_options_] _tag_...

# PARAMETERS

**-v**, **--verbose**
> Print tag contents.

**--raw**
> Print raw signature.

**--format** _format_
> Format output.

# DESCRIPTION

**git verify-tag** checks GPG signatures of tags. It verifies that tags were signed with valid GPG keys, confirming the authenticity of tagged releases.

This is commonly used to verify the integrity of release tags in security-sensitive workflows.

# CAVEATS

The signer's public key must already be available in the local GPG keyring (or configured SSH/X.509 verifier); an unknown key causes verification to fail even for a well-formed signature. Exits non-zero if any given tag lacks a valid signature.

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

[git-tag](/man/git-tag)(1), [git-verify-commit](/man/git-verify-commit)(1)

# RESOURCES

```[Documentation](https://git-scm.com/docs/git-verify-tag)```

```[Source code](https://github.com/git/git)```

<!-- verified: 2026-07-17 -->
