# TAGLINE

fuzzy finder for dated experiment directories

# TLDR

**Browse** all experiments (after shell init)

```try```

**Jump to or create** an experiment matching a query

```try [redis]```

**Create** a date-prefixed directory (and a git worktree if inside a repo)

```try .```

**Clone** a repository into a dated experiment directory

```try clone [https://github.com/user/repo.git]```

**Install** the shell wrapper so **try** can change directory

```eval "$(try init)"```

# SYNOPSIS

**try** [_query_ | **.** | **clone** _uri_ | **init** [_path_] | **worktree** ...] [_options_]

# DESCRIPTION

**try** (gem name **try-cli**, Arch package **tobi-try**) is a one-file Ruby CLI by Tobi Lütke for keeping short-lived coding experiments in one place. Directories live under **TRY_PATH** (default **~/src/tries**; Omarchy uses **~/Work/tries**) and are named like **2025-08-17-redis-experiment**.

The interactive selector fuzzy-matches names, ranks recently used directories higher, and can create a new dated directory from the current query. **try clone** (or a pasted git URL) clones into a date-prefixed folder. **try .** / **try worktree** create a dated directory and, inside a git repo, a detached-HEAD worktree.

**try** itself prints a small shell snippet to change directory. You must eval the wrapper from **try init** (bash/zsh) or `try init | source` (fish) so the **try** function can **cd** for you.

# PARAMETERS

**init** [_PATH_]
> Print the shell wrapper. Optional path sets the experiments root.

**clone** _URI_ [_name_]
> Clone a git URL into the tries root. Default name is **YYYY-MM-DD-user-repo**. A GitHub pull-request URL clones the repo and checks out that PR.

**.** / **worktree dir** [_name_]
> Create a dated directory from the current (or given) repo; add a git worktree when inside a repository.

**--path** _PATH_
> Override the tries root for this invocation.

**--help**
> Show usage.

# CONFIGURATION

**TRY_PATH**
> Root directory for experiments (default **~/src/tries**).

**TRY_PROJECTS**
> Destination used when graduating a try into a real project (default: parent of **TRY_PATH**).

# CAVEATS

Without the **try init** wrapper, the binary cannot change your shell's working directory. Name collides with the English word "try" and with unrelated tools; this page is Tobi Lütke's **try-cli**, which Omarchy ships as **tobi-try**.

# INSTALL

```brew: brew install try```

<!-- packages: 2026-08-29 -->

# SEE ALSO

[fzf](/man/fzf)(1), [git](/man/git)(1), [zoxide](/man/zoxide)(1)

# RESOURCES

```[Source code](https://github.com/tobi/try)```

```[Homepage](https://pages.tobi.lutke.com/try/)```

<!-- verified: 2026-08-29 -->
