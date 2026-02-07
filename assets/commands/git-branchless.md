# TAGLINE

High-velocity Git workflow tools with smartlog and undo

# TLDR

**Initialize git-branchless** in a repository

```git branchless init```

**Show smart log** visualization

```git sl```

**Undo the last git operation**

```git undo```

**Sync all local branches** with upstream

```git sync```

**Move a commit** to a different parent

```git move -s [commit] -d [destination]```

**Navigate to next commit** in stack

```git next```

**Navigate to previous commit** in stack

```git prev```

**Show hidden commits** in smartlog

```git sl --hidden```

# SYNOPSIS

**git branchless** [_options_] _command_ [_args_...]

# COMMANDS

**init**
> Initialize git-branchless in the repository.

**smartlog**, **sl**
> Render visualization of commits you're working on.

**undo**
> General-purpose undo for any git operation.

**sync**
> Rebase all local commit stacks and branches.

**move** **-s** _source_ **-d** _dest_
> Move commits to a different location in the DAG.

**next** [_n_]
> Check out the next commit in the stack.

**prev** [_n_]
> Check out the previous commit in the stack.

**restack**
> Reapply commits after their parent was changed.

**hide** _commit_
> Hide a commit from the smartlog.

**unhide** _commit_
> Unhide a previously hidden commit.

**submit**
> Create or update pull requests for commit stacks.

**test**
> Run tests on commits in your stack.

**query** _revset_
> Query commits using revset expressions.

**install-man-pages**
> Generate and install man pages.

# PARAMETERS

**-C** _path_
> Run as if started in the specified directory.

**--color** _when_
> Control color output: always, never, auto.

**--hidden**
> Show hidden commits (with smartlog).

**-h**, **--help**
> Display help information.

**-V**, **--version**
> Show version number.

# DESCRIPTION

**git-branchless** is a suite of tools that enhances Git for high-velocity, monorepo-scale workflows. It implements concepts from other version control systems like Mercurial and Meta's internal tools.

The **smartlog** (**git sl**) provides an intuitive visualization of your commit graph, showing only relevant commits. Unlike git log, it focuses on work in progress rather than full history.

The **undo** command can reverse almost any Git operation, including hard resets, rebases, and commit amendments. It maintains a hidden log of repository states.

Git-branchless uses **revset expressions**, a declarative language for specifying commits similar to Mercurial. This enables powerful queries like **stack()** (all commits in current stack) or **draft()** (local unpublished commits).

The **move** command allows relocating entire commit subtrees without affecting the working copy, automatically cleaning up obsolete branches.

# CONFIGURATION

**.git/hooks/**
> git-branchless init installs custom hooks (post-commit, post-rewrite, etc.) to track commit visibility and DAG changes.

**.git/config**
> Stores branchless-specific settings under the [branchless] section, including default revset queries and display preferences.

# CAVEATS

Requires initialization with **git branchless init** in each repository. Some features modify Git hooks and configuration. Not compatible with all Git GUIs. Learning revset syntax has a curve for Git-only users.

# HISTORY

Git-branchless was created by **Waleed Khan** inspired by Meta's internal Git tooling and Mercurial's evolve extension. Development began around **2021** with the goal of bringing stacked diff workflows and better undo functionality to Git. The project brings concepts like commit evolution and commit visibility to standard Git repositories.

# SEE ALSO

[git](/man/git)(1), [git-absorb](/man/git-absorb)(1), [lazygit](/man/lazygit)(1), [tig](/man/tig)(1)
