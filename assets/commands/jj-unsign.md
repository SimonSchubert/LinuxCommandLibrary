# TAGLINE

drops cryptographic signatures from Jujutsu revisions

# TLDR

**Drop** the signature from the working-copy commit

```jj unsign -r @```

**Drop** the signature from a specific revision

```jj unsign -r [revset]```

**Drop** signatures from several revsets

```jj unsign -r [revset1] -r [revset2]```

**Drop** signatures from every signed mutable ancestor of `@`

```jj unsign -r 'signed() & mutable() & ::@'```

# SYNOPSIS

**jj unsign** [**-r** _REVSETS_]

# PARAMETERS

**-r**, **--revision** _REVSETS_
> Revisions to unsign (repeatable; alias `--revisions`). Unsigned revisions in the set are skipped. If omitted, the set is empty and nothing changes.

# DESCRIPTION

**jj unsign** rewrites the selected signed revisions so their cryptographic signatures are dropped. Revisions that were not signed are left alone. Descendants of unsigned commits are rebased; whether those descendants keep a signature depends on `signing.behavior` (with `keep` or `own`, a descendant signed by you is typically re-signed after the rebase).

The command warns if it drops signatures from commits whose author email is not yours. Immutable revisions cannot be rewritten unless `--ignore-immutable` is passed. A signing backend is not required in order to drop signatures.

Use `jj sign` to add signatures. `signed()` selects currently signed commits in a revset.

# CAVEATS

Subcommand of **jj**. Dropping a signature rewrites the commit (new commit ID, same change ID). Unsigning someone else's commits is allowed but warned. An empty `-r` set is a no-op. This does not un-push already published signed commits.

# INSTALL

```pacman: sudo pacman -S jujutsu```

```apk: sudo apk add jujutsu```

```zypper: sudo zypper install jujutsu```

```brew: brew install jujutsu```

```nix: nix profile install nixpkgs#jujutsu```

<!-- packages: 2026-09-16 -->

# SEE ALSO

[jj](/man/jj)(1), [jj-sign](/man/jj-sign)(1), [jj-config](/man/jj-config)(1), [git-commit](/man/git-commit)(1)

# RESOURCES

```[Source code](https://github.com/jj-vcs/jj)```

```[Homepage](https://jj-vcs.github.io/jj/)```

```[Documentation](https://docs.jj-vcs.dev/latest/cli-reference/#jj-unsign)```

<!-- verified: 2026-09-16 -->
