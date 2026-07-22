# TAGLINE

Fast local scanner to stop secrets entering git commits

# TLDR

**Scan** the current directory for secrets

```ripsecrets```

**Scan specific files** (e.g. staged changes)

```ripsecrets --strict-ignore $(git diff --cached --name-only --diff-filter=ACM)```

**Install** as a git pre-commit hook

```ripsecrets --install-pre-commit```

# SYNOPSIS

**ripsecrets** [*options*] [*path*...]

# DESCRIPTION

**ripsecrets** searches source files for high-entropy strings and known secret patterns to prevent accidental commits. It is designed for pre-commit speed: local-only (no cloud verification), low false-positive rate relative to naive regex tools, and a single static binary.

# PARAMETERS

*path*...

> Files or directories to scan (default: recursive from cwd).

**--install-pre-commit**

> Install a git pre-commit hook that runs ripsecrets.

**--strict-ignore**

> Honor ignore rules strictly when scanning explicit file lists (typical with **git diff --cached**).

Additional flags control allowlists and output—see **ripsecrets --help**.

# CAVEATS

Local pattern matching cannot prove a string is a live credential; it also cannot catch every secret type. Use with commit hooks and complementary scanners for defense in depth. Never commit real secrets “just for testing.”

# INSTALL

```brew: brew install ripsecrets```

```nix: nix profile install nixpkgs#ripsecrets```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[git](/man/git)(1), [gitleaks](/man/gitleaks)(1), [trufflehog](/man/trufflehog)(1)

# RESOURCES

```[Source code](https://github.com/sirwart/ripsecrets)```

<!-- verified: 2026-07-19 -->
