# TAGLINE

manage Git colocation of a Jujutsu workspace

# TLDR

**Show** whether the workspace is colocated with Git

```jj git colocation status```

**Enable colocation** (move the Git repo to `.git` at the workspace root)

```jj git colocation enable```

**Disable colocation** (hide the Git repo under `.jj`)

```jj git colocation disable```

# SYNOPSIS

**jj git colocation** _subcommand_

# PARAMETERS

**status**
> Print whether the current workspace is colocated with Git.

**enable**
> Convert into a colocated Jujutsu/Git workspace. Moves the backing Git repository from inside `.jj` to a `.git` directory at the workspace root so Git tools can operate on the same working copy.

**disable**
> Convert into a non-colocated Jujutsu/Git workspace. Moves the `.git` directory at the workspace root into `.jj`. Git commands will no longer work directly in the workspace.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**jj git colocation** manages whether a Git-backed Jujutsu workspace is **colocated** with Git.

A colocated workspace is a hybrid Jujutsu/Git workspace: `.jj` and `.git` sit at the same root and share the working copy. This is the default for repositories created with **jj git init** or **jj git clone**. In that mode Jujutsu imports and exports Git refs automatically on every **jj** command, which is convenient when IDEs, `gh`, or other tools expect a `.git` directory.

A non-colocated workspace still stores most data in Git format, but the Git repository is hidden under `.jj`. Git tools do not see a `.git` directory at the workspace root, and you must run **jj git import** / **jj git export** yourself to keep Git refs in sync.

**enable** automates moving the store from `.jj/repo/store/git` to `.git` and pointing Jujutsu at it. **disable** reverses that. The command only works on a Git-backed workspace that Jujutsu itself manages; an external Git repo attached with **jj git init --git-repo** cannot be moved this way.

# CONFIGURATION

**git.colocate**
> Default colocation for new repos created by **jj git init** and **jj git clone**. When **false**, those commands create a non-colocated workspace unless **--colocate** is passed.

# CAVEATS

Subcommand of **jj**. Requires the Git backend. Colocation makes Git tools work, but mixing mutating **git** and **jj** commands can produce bookmark conflicts or divergent change IDs (no data loss, but noisy). Automatic import on every command can slow down repos with a very large number of refs; **jj util gc** helps. Git tools see a non-human-readable representation of conflicted files inside the object store. Colocated workspaces are less resilient if the repo is shared over NFS or Dropbox.

# INSTALL

```pacman: sudo pacman -S jujutsu```

```apk: sudo apk add jujutsu```

```zypper: sudo zypper install jujutsu```

```brew: brew install jujutsu```

```nix: nix profile install nixpkgs#jujutsu```

<!-- packages: 2026-09-12 -->

# SEE ALSO

[jj-git](/man/jj-git)(1), [jj-git-init](/man/jj-git-init)(1), [jj-git-clone](/man/jj-git-clone)(1), [jj-git-import](/man/jj-git-import)(1), [jj-git-export](/man/jj-git-export)(1), [jj](/man/jj)(1)

# RESOURCES

```[Source code](https://github.com/jj-vcs/jj)```

```[Homepage](https://jj-vcs.github.io/jj/)```

```[Documentation](https://docs.jj-vcs.dev/latest/cli-reference/#jj-git-colocation)```

<!-- verified: 2026-09-13 -->
