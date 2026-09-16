# TAGLINE

resolves divergent Jujutsu changes into a single revision

# TLDR

**Converge** divergent revisions in the default search space (`revsets.converge`)

```jj converge```

**Limit** the search to a revset

```jj converge -r [revset]```

**Resolve** without interactive prompts (warn and exit if heuristics fail)

```jj converge --no-interactive```

**Inspect** what the last converge did

```jj op show -p```

**Undo** a converge you are not happy with

```jj undo```

# SYNOPSIS

**jj converge** [**-r** _REVSETS_] [**--no-interactive**]

# PARAMETERS

**-r**, **--revision** _REVSETS_
> Search space for divergent revisions. If omitted, uses the `revsets.converge` setting (default: `mutable() & divergent()`).

**--no-interactive**
> Do not prompt. If heuristics cannot produce a solution, print a warning and leave the divergence in place.

# DESCRIPTION

**jj converge** attempts to resolve **divergent changes**: two or more visible commits that share the same change ID. That happens when a hidden predecessor becomes visible again (for example after a fetch, `jj new`, or `jj edit`) or when two processes rewrite the same change independently.

The command evaluates the given revset, groups matching revisions by change ID, and treats any change ID with more than one revision as divergent. If there is no divergence it succeeds without rewriting anything. If several change IDs are divergent, it prompts you to pick one (unless **--no-interactive**).

Heuristics then try to build a single replacement revision. When they are inconclusive, you may be asked to merge descriptions, choose parents, or (rarely) pick an author. The new revision replaces the divergent revisions that matched the revset; descendants are rebased onto it and local bookmarks that pointed at a divergent revision are moved to the solution. Other visible revisions of the same change ID **outside** the revset are left alone, so some divergence can remain.

The solution can contain file conflicts even when the inputs did not. Review the rewrite with `jj op show -p` and the change's evolution with `jj evolog`. Use `jj undo` if the result is wrong.

# CONFIGURATION

Default search space, in TOML:

```
[revsets]
converge = "mutable() & divergent()"
```

Override per invocation with **-r**. To converge only what is already marked divergent in the working-copy history, pass a tighter revset such as `-r 'divergent() & ::@'`.

# CAVEATS

Subcommand of **jj**. Official docs still call the command experimental: heuristics will not always match what you intended. Refer to a divergent commit by **commit ID** or by **change ID with offset** (`mzvwutvl/0`) — the bare change ID is ambiguous. Immutable history cannot always be rewritten; leaving the divergence in place is a valid option.

# INSTALL

```pacman: sudo pacman -S jujutsu```

```apk: sudo apk add jujutsu```

```zypper: sudo zypper install jujutsu```

```brew: brew install jujutsu```

```nix: nix profile install nixpkgs#jujutsu```

<!-- packages: 2026-09-16 -->

# SEE ALSO

[jj](/man/jj)(1), [jj-abandon](/man/jj-abandon)(1), [jj-squash](/man/jj-squash)(1), [jj-evolog](/man/jj-evolog)(1), [jj-undo](/man/jj-undo)(1), [jj-operation-show](/man/jj-operation-show)(1)

# RESOURCES

```[Source code](https://github.com/jj-vcs/jj)```

```[Homepage](https://jj-vcs.github.io/jj/)```

```[Documentation](https://docs.jj-vcs.dev/latest/cli-reference/#jj-converge)```

<!-- verified: 2026-09-14 -->
