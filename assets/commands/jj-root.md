# TAGLINE

print the current Jujutsu workspace root directory

# TLDR

**Print** the workspace root

```jj root```

Use the path in a **script**

```cd "$(jj root)"```

Avoid snapshotting (common in **prompts**)

```jj --ignore-working-copy root```

Print the root of a **named workspace** (not a shortcut; use the full command)

```jj workspace root --name [workspace_name]```

# SYNOPSIS

**jj root**

# DESCRIPTION

**jj root** prints the absolute path of the current workspace root: the directory that contains the working copy and the `.jj/` metadata. It is a shortcut for `jj workspace root` without extra flags.

This is the Jujutsu counterpart of `git rev-parse --show-toplevel`. It is **not** the Git directory; for that path use **jj git root** (the workspace `.git` in a colocated repo, or the hidden Git store under `.jj` otherwise).

`jj workspace root --name` can query another workspace attached to the same repo. That option is not available on the **jj root** shortcut.

Like other jj commands, **jj root** snapshots the working copy unless you pass **--ignore-working-copy**. Shell prompts that only need the path typically use that flag, or skip the command entirely and look for a `.jj` directory while walking up from `$PWD`.

# CAVEATS

Subcommand of **jj**. Fails outside a workspace. Does not accept **--name**; use **jj workspace root** for a named workspace. Do not confuse with **jj git root**.

# INSTALL

```pacman: sudo pacman -S jujutsu```

```apk: sudo apk add jujutsu```

```zypper: sudo zypper install jujutsu```

```brew: brew install jujutsu```

```nix: nix profile install nixpkgs#jujutsu```

<!-- packages: 2026-09-17 -->

# SEE ALSO

[jj](/man/jj)(1), [jj-workspace](/man/jj-workspace)(1), [jj-git-root](/man/jj-git-root)(1), [git-rev-parse](/man/git-rev-parse)(1)

# RESOURCES

```[Source code](https://github.com/jj-vcs/jj)```

```[Homepage](https://jj-vcs.github.io/jj/)```

```[Documentation](https://docs.jj-vcs.dev/latest/cli-reference/#jj-root)```

<!-- verified: 2026-09-17 -->
