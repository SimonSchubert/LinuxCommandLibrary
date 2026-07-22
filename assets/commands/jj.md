# TAGLINE

jujutsu, a Git-compatible version control system

# TLDR

**Initialize a new colocated Git/jj repository** in the current directory

```jj git init --colocate```

**Clone a Git remote**

```jj git clone [https://github.com/owner/repo]```

**Show working-copy status**

```jj status```

**Show the revision graph**

```jj log```

**Create a new (empty) change on top of the current one**

```jj new```

**Describe the current change**

```jj describe -m "[message]"```

**Squash the current change into its parent**

```jj squash```

**Move a change to a new parent (rebase)**

```jj rebase -r [revision] -d [destination]```

**Abandon the current change** (drops its content, rebases descendants)

```jj abandon```

**Undo the last operation**

```jj undo```

**Sync with the Git remote**

```jj git fetch && jj git push```

# SYNOPSIS

**jj** [_global_options_] _command_ [_args_]

# COMMON COMMANDS

**git init** [--colocate]
> Initialize a new repository, optionally colocated with Git so both **jj** and **git** see the same working copy.

**git clone** _url_
> Clone a Git remote into a jj repo.

**status**
> Show high-level repository / working copy state.

**log**
> Display the revision graph.

**new** [_revisions_...]
> Create a new (empty) change on top of the given revisions; defaults to the current working-copy parent.

**describe** [**-m** _message_]
> Edit the description (commit message) of a change.

**edit** _revision_
> Move the working copy to an existing revision (replaces "checkout" thinking).

**squash** [**--from** _rev_] [**--into** _rev_]
> Move changes from one revision into another (default: current → its parent).

**rebase** **-r** _rev_ **-d** _dest_
> Move a revision (and optionally its descendants) onto a new destination.

**abandon** [_revision_]
> Drop a change; descendants are rebased onto the parent.

**undo**
> Revert the last operation. Combine with **jj op log** and **jj op restore** for finer control.

**bookmark** _subcommand_
> Manage named references (jj's equivalent of Git branches): **create**, **move**, **delete**, **track**, **untrack**, **list**.

**git** _subcommand_
> Git interop: **fetch**, **push**, **import**, **export**, **remote**.

**op log**, **op restore**
> Inspect and roll back the operation log (every command is recorded).

# GLOBAL OPTIONS

**-R**, **--repository** _PATH_
> Operate on the repository at _PATH_.

**--at-operation** _OP_, **--at-op** _OP_
> Run the command at a previous operation in the operation log (read-only views).

**--no-pager**
> Disable the pager for this invocation.

**--config-toml** _TOML_
> Inline configuration overrides.

# DESCRIPTION

**jj** (Jujutsu) is a Git-compatible distributed version control system. Every working-copy change is recorded as a first-class revision, conflicts are stored in commits rather than blocking operations, and there are no branches in the Git sense — instead every commit is reachable through the revision graph and human-friendly **bookmarks** can be attached to any revision.

The default backend is Git, so a jj repo can be made **colocated** with a real Git repo (`jj git init --colocate`), letting Git tools and other developers continue to interact through plain Git while you use jj locally.

# CAVEATS

The CLI is still pre-1.0 and changing — the **bookmark** subcommand was renamed from **branch** in 0.18, and many flags continue to evolve. **jj git push** by default pushes only the bookmarks that match the local working revisions; explicit pushes use **--bookmark** _name_ or **--all-bookmarks**. Conflicts are stored on disk but the tooling around resolving them is still young.

# HISTORY

**Jujutsu** was created in **2019** at **Google** by **Martin von Zweigbergk** as a personal experiment, open-sourced in **2022**, and is now developed at **github.com/jj-vcs/jj** with a growing community of contributors.

# INSTALL

```pacman: sudo pacman -S jujutsu```

```apk: sudo apk add jujutsu```

```zypper: sudo zypper install jujutsu```

```brew: brew install jujutsu```

```nix: nix profile install nixpkgs#jujutsu```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[jj-git](/man/jj-git)(1), [jj-log](/man/jj-log)(1), [git](/man/git)(1), [hg](/man/hg)(1)
