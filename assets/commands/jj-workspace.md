# TAGLINE

manages extra working copies attached to a Jujutsu repository

# TLDR

**List** every workspace attached to the repo

```jj workspace list```

**Add** a workspace at a path (name defaults to the directory basename)

```jj workspace add [path/to/directory]```

**Add** with an explicit name and parent revision

```jj workspace add --name [workspace_name] -r [revision] [path/to/directory]```

**Print** the root of the current workspace

```jj workspace root```

**Print** the root of a named workspace

```jj workspace root --name [workspace_name]```

**Rename** the current workspace

```jj workspace rename [new_name]```

**Stop tracking** a workspace without deleting its files

```jj workspace forget [workspace_name]```

**Refresh** a workspace whose working copy has gone stale

```jj workspace update-stale```

# SYNOPSIS

**jj workspace** (_add_ | _forget_ | _list_ | _rename_ | _root_ | _update-stale_) [_options_] [_args_]

# SUBCOMMANDS

**add** _DESTINATION_
> Create a new workspace (working copy plus `.jj/` linked to the same repo) at _DESTINATION_.

**forget** [_WORKSPACES_...]
> Stop tracking the named workspace's working-copy commit. Disk files are not removed. With no names, forgets the current workspace.

**list**
> Print every workspace and its available root path.

**rename** _NEW_NAME_
> Rename the current workspace.

**root**
> Print the workspace root directory (`jj root` is a shortcut).

**update-stale**
> Rewrite the working copy so it matches the operation the repo currently records for this workspace.

# PARAMETERS

**--name** _NAME_
> For **add**: name of the new workspace (default: basename of _DESTINATION_). For **root**: workspace to query (default: current).

**-r**, **--revision** _REVSETS_
> Parent revision(s) of the new workspace's working-copy commit. Omit to share the current workspace's parent(s). Passing revisions is equivalent to `jj new r1 r2 ...` in the new workspace.

**-m**, **--message** _MESSAGE_
> Description for the new working-copy commit (**add**).

**--sparse-patterns** _copy_|_full_|_empty_
> How the new workspace inherits sparse checkout patterns. Default **copy**. **full** materializes every file; **empty** starts with nothing on disk.

**-T**, **--template** _TEMPLATE_
> Render each row of **list**. Defaults to `templates.workspace_list`.

# DESCRIPTION

**jj workspace** attaches extra working copies to one repository. Each workspace is a directory with its own `.jj/` metadata and its own working-copy commit. Extra workspaces show up in `jj log` as `<workspace name>@`. A typical use is a long-running test or build in one checkout while you keep editing in another.

`jj workspace add path` creates the directory, links it to the repo, and checks out a new working-copy commit. By default that commit sits on the same parent(s) as the current workspace; **-r** chooses different parents (including a merge if you pass several). Sparse patterns are copied from the current workspace unless **--sparse-patterns** says otherwise; each workspace keeps its own sparse set afterwards.

`jj workspace forget` only unregisters the workspace. Delete the files yourself, before or after. A working copy becomes **stale** when another workspace (or an interrupted command) rewrites its commit and the on-disk files are not updated; `jj workspace update-stale` brings them back in sync, creating a recovery commit if the recorded operation was lost.

# CAVEATS

Subcommand of **jj**. Forgetting a workspace does not delete files. Rewriting workspace A's working-copy commit from workspace B leaves A's copy stale until **update-stale**. Each workspace has independent sparse patterns.

# INSTALL

```pacman: sudo pacman -S jujutsu```

```apk: sudo apk add jujutsu```

```zypper: sudo zypper install jujutsu```

```brew: brew install jujutsu```

```nix: nix profile install nixpkgs#jujutsu```

<!-- packages: 2026-09-16 -->

# SEE ALSO

[jj](/man/jj)(1), [jj-sparse](/man/jj-sparse)(1), [jj-new](/man/jj-new)(1), [jj-log](/man/jj-log)(1), [git-worktree](/man/git-worktree)(1)

# RESOURCES

```[Source code](https://github.com/jj-vcs/jj)```

```[Homepage](https://jj-vcs.github.io/jj/)```

```[Documentation](https://docs.jj-vcs.dev/latest/cli-reference/#jj-workspace)```

<!-- verified: 2026-09-14 -->
