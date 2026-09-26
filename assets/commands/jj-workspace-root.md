# TAGLINE

print the root directory of a Jujutsu workspace

# TLDR

**Print** the current workspace root

```jj workspace root```

Use the path in a **script**

```cd "$(jj workspace root)"```

Print the root of a **named workspace**

```jj workspace root --name [workspace_name]```

Avoid snapshotting (common in **prompts**)

```jj --ignore-working-copy workspace root```

# SYNOPSIS

**jj workspace root** [_options_]

# PARAMETERS

**--name** _NAME_
> Workspace to query. Defaults to the current workspace.

# DESCRIPTION

**jj workspace root** prints the absolute path of a workspace root: the directory that contains the working copy and the `.jj/` metadata.

With no **--name**, it reports the workspace that contains the current directory. That is the same result as **jj root**, which is a shortcut for this command without extra flags. **--name** selects another workspace attached to the same repository.

This is the Jujutsu counterpart of `git rev-parse --show-toplevel`. It is **not** the Git directory; for that path use **jj git root**.

Like other jj commands, **jj workspace root** snapshots the working copy unless you pass **--ignore-working-copy**. Shell prompts that only need the path typically use that flag.

# CAVEATS

Subcommand of **jj**. Fails outside a workspace. **jj root** does not accept **--name**. Do not confuse with **jj git root**.

# INSTALL

```pacman: sudo pacman -S jujutsu```

```apk: sudo apk add jujutsu```

```zypper: sudo zypper install jujutsu```

```brew: brew install jujutsu```

```nix: nix profile install nixpkgs#jujutsu```

<!-- packages: 2026-09-26 -->

# SEE ALSO

[jj-workspace](/man/jj-workspace)(1), [jj-root](/man/jj-root)(1), [jj-git-root](/man/jj-git-root)(1), [jj](/man/jj)(1), [git-rev-parse](/man/git-rev-parse)(1)

# RESOURCES

```[Source code](https://github.com/jj-vcs/jj)```

```[Homepage](https://jj-vcs.github.io/jj/)```

```[Documentation](https://docs.jj-vcs.dev/latest/cli-reference/#jj-workspace-root)```

<!-- verified: 2026-09-26 -->
