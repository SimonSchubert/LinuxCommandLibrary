# TAGLINE

infrequently used Jujutsu utilities (completions, gc, exec)

# TLDR

Generate **bash** completions

```jj util completion bash```

Load **zsh** completions

```source <(jj util completion zsh)```

Load **fish** completions

```jj util completion fish | source```

Run **garbage collection** (objects older than two weeks)

```jj util gc```

Garbage-collect **immediately**

```jj util gc --expire now```

**Snapshot** the working copy (for scripts)

```jj util snapshot```

Print the **config JSON schema**

```jj util config-schema```

Print the storage **backend name**

```jj util backend name```

Install **man pages** under a prefix (creates `man1/` etc.)

```jj util install-man-pages [/usr/local/share/man]```

# SYNOPSIS

**jj util** (_completion_ | _config-schema_ | _exec_ | _gc_ | _install-man-pages_ | _markdown-help_ | _snapshot_ | _backend_) [_args_]

# SUBCOMMANDS

**completion** _SHELL_
> Print a completion script. _SHELL_ is one of **bash**, **elvish**, **fish**, **nushell**, **power-shell**, **zsh**.

**config-schema**
> Print the JSON schema for jj's TOML config format.

**exec** _COMMAND_ [_ARGS_...]
> Run an external command with `JJ_WORKSPACE_ROOT` set. Intended for aliases. Put **--** before the command so flags go to the child, not to jj.

**gc** [**--expire** now]
> Backend-dependent garbage collection. Default: prune obsolete objects and operations older than two weeks. **--expire** currently accepts only the string **now**.

**install-man-pages** _PATH_
> Write man pages under _PATH_ (`man1/` is appended). Example: `/usr/share/man`.

**markdown-help**
> Print CLI help for every subcommand as Markdown.

**snapshot**
> Snapshot the working copy if it changed. Almost every jj command already does this; this subcommand is for scripts that need a distinct operation.

**backend name**
> Print the name of the storage backend used by the current repo (typically `git`).

# DESCRIPTION

**jj util** groups commands that are not part of the daily edit/rebase/push loop: shell completions, schema dumps, man-page install, explicit snapshots, and garbage collection.

**jj util gc** only reclaims objects that are already unreachable. To drop old operation history first, run `jj op abandon ..<old-operation>` and then **jj util gc**.

**jj util exec** exists so aliases can run arbitrary programs through jj. The child sees `JJ_WORKSPACE_ROOT`. Official docs warn that this is a convenience for running code on your system: a bad alias can break `jj undo` or destroy files, and the feature may be replaced by an embedded scripting language.

**jj util snapshot** is the documented way to force a working-copy snapshot from a script (for example so a sandwich of snapshots around other jj commands keeps those operations distinct in `jj op log`). Humans almost never need it; `jj operation log --limit 1` also snapshots.

# CONFIGURATION

Typical alias using **exec** (the `--` is required so flags reach the script):

```
[aliases]
my-script = ["util", "exec", "--", "my-jj-script"]
```

# CAVEATS

Subcommand of **jj**. **gc --expire** does not yet accept arbitrary timestamps. **exec** runs arbitrary commands. Completions must be regenerated after jj upgrades.

# INSTALL

```pacman: sudo pacman -S jujutsu```

```apk: sudo apk add jujutsu```

```zypper: sudo zypper install jujutsu```

```brew: brew install jujutsu```

```nix: nix profile install nixpkgs#jujutsu```

<!-- packages: 2026-09-17 -->

# SEE ALSO

[jj](/man/jj)(1), [jj-operation-abandon](/man/jj-operation-abandon)(1), [jj-operation-log](/man/jj-operation-log)(1), [jj-config](/man/jj-config)(1)

# RESOURCES

```[Source code](https://github.com/jj-vcs/jj)```

```[Homepage](https://jj-vcs.github.io/jj/)```

```[Documentation](https://docs.jj-vcs.dev/latest/cli-reference/#jj-util)```

<!-- verified: 2026-09-17 -->
