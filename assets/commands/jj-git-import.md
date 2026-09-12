# TAGLINE

import Git refs from the backing repository into Jujutsu

# TLDR

**Import** Git branches and tags into the Jujutsu repo

```jj git import```

**Force an import** in a colocated workspace (skips the automatic no-op)

```jj git import --ignore-working-copy```

# SYNOPSIS

**jj git import** [_options_]

# PARAMETERS

**--ignore-working-copy**
> Do not snapshot or update the working copy. In a colocated workspace, **jj git import** is otherwise a no-op because import already runs automatically; this flag forces an import.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**jj git import** updates the Jujutsu repository with changes made in the underlying Git repository.

It copies Git refs, compares them with the last imported state, and merges differences into local bookmarks and tags. The reverse direction is **jj git export**.

Commits that are no longer reachable from any branch in the Git repo are treated as abandoned there, and Jujutsu abandons them locally to match. If the working-copy commit is among them, it is replaced with a new empty commit (the same rule as **jj abandon** in general).

In a **colocated** workspace, every **jj** command already imports Git refs, so **jj git import** does nothing unless you pass **--ignore-working-copy**. In a **non-colocated** workspace (for example after **jj git init --git-repo** or **jj git colocation disable**), Git can change the backing store without Jujutsu noticing until you import.

# CONFIGURATION

**git.abandon-unreachable-commits**
> When **false**, commits that disappeared from Git refs are not abandoned in the Jujutsu repo. Default is **true**.

# CAVEATS

Subcommand of **jj**. Requires the Git backend. Import does not fetch from a remote; use **jj git fetch** for that. Mixing mutating **git** and **jj** commands in a colocated workspace can produce bookmark conflicts or divergent change IDs. Git's index, unfinished rebases, and other in-progress Git states are ignored.

# INSTALL

```pacman: sudo pacman -S jujutsu```

```apk: sudo apk add jujutsu```

```zypper: sudo zypper install jujutsu```

```brew: brew install jujutsu```

```nix: nix profile install nixpkgs#jujutsu```

<!-- packages: 2026-09-12 -->

# SEE ALSO

[jj-git-export](/man/jj-git-export)(1), [jj-git-fetch](/man/jj-git-fetch)(1), [jj-git-colocation](/man/jj-git-colocation)(1), [jj-git](/man/jj-git)(1), [jj](/man/jj)(1)

# RESOURCES

```[Source code](https://github.com/jj-vcs/jj)```

```[Homepage](https://jj-vcs.github.io/jj/)```

```[Documentation](https://docs.jj-vcs.dev/latest/cli-reference/#jj-git-import)```

<!-- verified: 2026-09-13 -->
