# TAGLINE

export Jujutsu bookmarks and tags into the backing Git repository

# TLDR

**Export** local Jujutsu refs into the underlying Git repo

```jj git export```

**Force an export** in a colocated workspace (skips the automatic no-op)

```jj git export --ignore-working-copy```

# SYNOPSIS

**jj git export** [_options_]

# PARAMETERS

**--ignore-working-copy**
> Do not snapshot or update the working copy. In a colocated workspace, **jj git export** is otherwise a no-op because export already runs automatically; this flag forces an export.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**jj git export** writes Jujutsu bookmarks and tags into the backing Git repository as Git refs.

Jujutsu stores its own view of bookmarks separately from Git. Export copies that view into the Git store so **git** commands, Git hosting tools, and other consumers of `.git` see the same branch and tag tips. The reverse direction is **jj git import**.

In a **colocated** workspace (the default for **jj git init** / **jj git clone**), every **jj** command already imports and exports Git refs, so **jj git export** does nothing unless you pass **--ignore-working-copy**. In a **non-colocated** workspace the Git store is hidden under `.jj` and will stay stale until you export (and import) explicitly.

Use **jj git colocation status** to see which mode the workspace is in.

# CAVEATS

Subcommand of **jj**. Requires the Git backend. Export does not push to a remote; use **jj git push** for that. Refs that Git updated since the last import are not overwritten. Commits created by Jujutsu may carry extra Git ref prefixes under `refs/jj/` to keep them reachable for Git GC.

# INSTALL

```pacman: sudo pacman -S jujutsu```

```apk: sudo apk add jujutsu```

```zypper: sudo zypper install jujutsu```

```brew: brew install jujutsu```

```nix: nix profile install nixpkgs#jujutsu```

<!-- packages: 2026-09-12 -->

# SEE ALSO

[jj-git-import](/man/jj-git-import)(1), [jj-git-colocation](/man/jj-git-colocation)(1), [jj-git-push](/man/jj-git-push)(1), [jj-git](/man/jj-git)(1), [jj](/man/jj)(1)

# RESOURCES

```[Source code](https://github.com/jj-vcs/jj)```

```[Homepage](https://jj-vcs.github.io/jj/)```

```[Documentation](https://docs.jj-vcs.dev/latest/cli-reference/#jj-git-export)```

<!-- verified: 2026-09-13 -->
