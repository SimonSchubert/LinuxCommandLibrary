# TAGLINE

print the path of the backing Git directory

# TLDR

**Print** the underlying Git directory

```jj git root```

Point **GitHub CLI** at a non-colocated repo

```GIT_DIR=$(jj git root) gh issue list```

Use the path as **GIT_DIR** for other Git-aware tools

```export GIT_DIR=$(jj git root)```

# SYNOPSIS

**jj git root** [_options_]

# PARAMETERS

**-R**, **--repository** _PATH_
> Operate on the repository at _PATH_ instead of searching upward from the current directory.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**jj git root** prints the path of the underlying Git directory for a repository that uses the Git backend.

In a **colocated** workspace that is the workspace-root `.git` directory. In a **non-colocated** workspace the Git store is hidden under `.jj` (typically `.jj/repo/store/git`), so Git tools that look for `.git` in the working copy fail unless you set **GIT_DIR** to this path.

A common case is GitHub CLI (`gh`) in a non-colocated repo: `GIT_DIR=$(jj git root) gh issue list`. **direnv** users can put `export GIT_DIR=$(jj git root)` in `.envrc` so that happens automatically.

This is not the workspace root. For the directory that contains the working copy, use **jj workspace root** (or **jj root**).

# CAVEATS

Subcommand of **jj**. Requires the Git backend; it errors on a non-Git repository. The printed path may be a `.git` file (a gitdir pointer) rather than a directory in some layouts.

# INSTALL

```pacman: sudo pacman -S jujutsu```

```apk: sudo apk add jujutsu```

```zypper: sudo zypper install jujutsu```

```brew: brew install jujutsu```

```nix: nix profile install nixpkgs#jujutsu```

<!-- packages: 2026-09-12 -->

# SEE ALSO

[jj-git](/man/jj-git)(1), [jj-git-colocation](/man/jj-git-colocation)(1), [jj](/man/jj)(1), [git-rev-parse](/man/git-rev-parse)(1)

# RESOURCES

```[Source code](https://github.com/jj-vcs/jj)```

```[Homepage](https://jj-vcs.github.io/jj/)```

```[Documentation](https://docs.jj-vcs.dev/latest/cli-reference/#jj-git-root)```

<!-- verified: 2026-09-13 -->
