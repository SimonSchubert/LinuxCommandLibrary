# TAGLINE

cryptographically signs Jujutsu revisions

# TLDR

**Sign** revisions in the default `revsets.sign` set (`reachable(@, mutable())`)

```jj sign```

**Sign** a specific revision

```jj sign -r [revset]```

**Sign** several revsets

```jj sign -r [revset1] -r [revset2]```

**Sign** with an explicit key (overrides `signing.key`)

```jj sign --key [key_id] -r [revset]```

**Show** cryptographic signatures in the log

```jj log --config ui.show-cryptographic-signatures=true```

# SYNOPSIS

**jj sign** [**-r** _REVSETS_] [**--key** _KEY_]

# PARAMETERS

**-r**, **--revision** _REVSETS_
> Revisions to sign (repeatable; alias `--revisions`). If omitted, uses the `revsets.sign` setting (default: `reachable(@, mutable())`). Selected revisions are always re-signed.

**--key** _KEY_
> Signing key for this invocation. For GnuPG, anything `gpg -u` accepts. For SSH, a public key or path to a `.pub` file.

# DESCRIPTION

**jj sign** rewrites the selected revisions so each carries a cryptographic signature. A commit signing backend must be configured (`gpg`, `gpgsm`, or `ssh`). Without a backend the command errors and points at the official commit-signing docs.

Every selected revision is signed again, even if it is already signed by you. Descendants are rebased onto the rewritten commits. Commits whose author email is not yours still get signed; a warning is printed. Immutable revisions cannot be rewritten unless `--ignore-immutable` is passed.

Automatic signing on later rewrites is controlled by `signing.behavior` (`drop`, `keep`, `own`, `force`), which is separate from this manual command.

# CONFIGURATION

Enable a backend and choose when rewritten commits are signed:

```
[signing]
behavior = "own"
backend = "gpg"
# key = "4ED556E9729E000F"
```

SSH example:

```
[signing]
behavior = "own"
backend = "ssh"
key = "~/.ssh/id_ed25519.pub"
```

Default set signed by a bare `jj sign`:

```
[revsets]
sign = "reachable(@, mutable())"
```

Show signatures in templates with `ui.show-cryptographic-signatures = true`.

# CAVEATS

Subcommand of **jj**. Re-signing already-signed commits is intentional (hardware tokens will be prompted again). Signing someone else's commits is allowed but warned. Immutable history is skipped unless `--ignore-immutable`. Signatures on rewritten descendants follow `signing.behavior`, not this command.

# INSTALL

```pacman: sudo pacman -S jujutsu```

```apk: sudo apk add jujutsu```

```zypper: sudo zypper install jujutsu```

```brew: brew install jujutsu```

```nix: nix profile install nixpkgs#jujutsu```

<!-- packages: 2026-09-16 -->

# SEE ALSO

[jj](/man/jj)(1), [jj-unsign](/man/jj-unsign)(1), [jj-config](/man/jj-config)(1), [git-commit](/man/git-commit)(1)

# RESOURCES

```[Source code](https://github.com/jj-vcs/jj)```

```[Homepage](https://jj-vcs.github.io/jj/)```

```[Documentation](https://docs.jj-vcs.dev/latest/cli-reference/#jj-sign)```

<!-- verified: 2026-09-16 -->
