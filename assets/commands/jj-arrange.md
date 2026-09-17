# TAGLINE

interactively rearrange the Jujutsu commit graph

# TLDR

**Arrange** mutable commits reachable from the working copy (`revsets.arrange`)

```jj arrange```

Arrange a **specific revset**

```jj arrange -r [revset]```

Arrange **several revsets** (union)

```jj arrange -r [revset1] -r [revset2]```

Arrange the **stack from trunk to @**

```jj arrange -r 'trunk()..@'```

**Undo** an arrange you are not happy with

```jj undo```

# SYNOPSIS

**jj arrange** [**-r** _REVSETS_...] [_REVSETS_...]

# PARAMETERS

**-r**, **--revisions** _REVSETS_
> Revisions to include. Positional revsets are the same argument. Repeatable; the union is arranged. If omitted, uses the `revsets.arrange` setting (default: `reachable(@, mutable())`).

# DESCRIPTION

**jj arrange** opens a full-screen TUI for rewriting parent edges of a connected set of mutable commits. It is the closest built-in equivalent of `git rebase -i` / `hg histedit`. Official docs still describe it as under development.

The selected revset must be **connected** (no gaps) and **rewritable**. Commits just outside the set are shown as context (external parents and children) but cannot be moved. An empty set prints `No revisions to arrange.` and exits.

In the TUI, **j**/**k** or the arrow keys move the selection. **Shift+J** / **Shift+K** (or Shift+Down / Shift+Up) swap the selected commit with its single parent or single child when that neighbor is also in the set. **a** marks the selection to abandon; **p** keeps it. **c** applies the plan as one operation (`arrange revisions`); **q** or **Ctrl+C** cancels. Swap is a no-op when the commit has more than one in-set parent or child.

Confirming rewrites parents (and abandons marked commits), then rebases descendants as usual. Review with `jj op show -p` and undo with `jj undo`.

# CONFIGURATION

Default selection and row template, in TOML:

```
[revsets]
arrange = "reachable(@, mutable())"

[templates]
arrange = "builtin_log_compact"
```

Override the selection per invocation with **-r**.

# CAVEATS

Subcommand of **jj**. The TUI is still evolving; a stack taller than the terminal historically failed to scroll (fixed in later 0.39-era releases). Immutable commits cannot be arranged. Canceling is treated as an error (`Canceled by user`). For a single move, `jj rebase -A`/`-B` is often enough.

# INSTALL

```pacman: sudo pacman -S jujutsu```

```apk: sudo apk add jujutsu```

```zypper: sudo zypper install jujutsu```

```brew: brew install jujutsu```

```nix: nix profile install nixpkgs#jujutsu```

<!-- packages: 2026-09-17 -->

# SEE ALSO

[jj](/man/jj)(1), [jj-rebase](/man/jj-rebase)(1), [jj-squash](/man/jj-squash)(1), [jj-split](/man/jj-split)(1), [jj-abandon](/man/jj-abandon)(1), [jj-undo](/man/jj-undo)(1)

# RESOURCES

```[Source code](https://github.com/jj-vcs/jj)```

```[Homepage](https://jj-vcs.github.io/jj/)```

```[Documentation](https://docs.jj-vcs.dev/latest/cli-reference/#jj-arrange)```

<!-- verified: 2026-09-17 -->
