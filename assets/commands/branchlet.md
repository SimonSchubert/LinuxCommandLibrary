# TAGLINE

Interactive Git worktree manager

# TLDR

**Launch** the interactive menu

```branchlet```

**Open the create flow** directly

```branchlet create```

**Create a worktree** non-interactively from a source branch

```branchlet create -n [my-feature] -s [main]```

**Create a worktree** with a different branch name

```branchlet create -n [dir-name] -s [main] -b [feature/foo]```

**List worktrees** as JSON

```branchlet list --json```

**Delete a worktree** by name

```branchlet delete -n [my-feature]```

**Force delete** a worktree by path

```branchlet delete -p [/path/to/worktree] -f```

# SYNOPSIS

**branchlet** [**create** | **list** | **delete** | **settings**] [_options_]

# PARAMETERS

**-n**, **--name** _name_
> Worktree directory name (create, delete)

**-s**, **--source** _branch_
> Source branch to create from (create)

**-b**, **--branch** _branch_
> New branch name (create)

**-p**, **--path** _path_
> Worktree path (delete)

**-f**, **--force**
> Delete even with uncommitted changes (delete)

**--json**
> Output as JSON (list)

**-m**, **--mode** _mode_
> Set the initial mode: menu, create, list, delete or settings

**--from-wrapper**
> Output the selected path to stdout, for use by the shell wrapper

**-h**, **--help**
> Show help

**-v**, **--version**
> Show the version

# DESCRIPTION

**branchlet** is an interactive terminal interface for creating, listing and deleting **Git worktrees**. Without flags it opens a menu or the flow for the given command. Passing **create**, **list** or **delete** with flags skips the prompts for use in scripts.

New worktrees can receive copies of files such as **.env** from the main checkout and can run commands after creation. The optional shell integration, set up from the menu, lets **branchlet** change the shell's directory to the selected worktree.

# CONFIGURATION

Settings are read from **.branchlet.json** in the repository root, then **~/.branchlet/settings.json**.

**worktreeCopyPatterns**
> Glob patterns of files to copy to new worktrees (default: .env*, .vscode/**)

**worktreeCopyIgnores**
> Glob patterns to exclude when copying

**worktreePathTemplate**
> Template for worktree directory names (default: $BASE_PATH.worktree)

**postCreateCmd**
> Commands to run in the new worktree after creation

**terminalCommand**
> Command to open a terminal or editor in the new worktree

**deleteBranchWithWorktree**
> Also delete the branch when deleting its worktree (default: false)

Templates and commands can use **$BASE_PATH**, **$WORKTREE_PATH**, **$BRANCH_NAME** and **$SOURCE_BRANCH**.

# CAVEATS

Must be run inside a Git repository. Requires Node.js 20 or later.

# SEE ALSO

[git](/man/git)(1), [git-worktree](/man/git-worktree)(1), [lazygit](/man/lazygit)(1)

# RESOURCES

```[Source code](https://github.com/raghavpillai/branchlet)```

<!-- verified: 2026-11-09 -->
