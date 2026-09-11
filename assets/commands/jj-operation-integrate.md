# TAGLINE

add an unintegrated Jujutsu operation to the operation log

# TLDR

**Integrate an operation** into the log

```jj operation integrate [operation-id]```

**Run a mutating command without integrating** it

```jj --no-integrate-operation [command]```

**Inspect the resulting repo** at that unintegrated operation

```jj --at-op=[operation-id] log```

**Restore the repo** to that unintegrated operation instead of integrating it

```jj op restore [operation-id]```

**Confirm it is (or is not) already in the log**

```jj op log```

# SYNOPSIS

**jj** **operation** **integrate** _operation_

# PARAMETERS

_OPERATION_
> The operation to integrate. The ID is printed by a command that ran with **--no-integrate-operation**, or recovered after an interrupted/failed integrate.

**--help**
> Display help information.

# DESCRIPTION

**jj operation integrate** (alias **jj op integrate**) makes an existing operation part of the operation log. By default, Jujutsu integrates every mutating command automatically. Integration can be skipped with the global **--no-integrate-operation** flag, or fail to complete after an internal error. This command is how you attach such an operation afterwards.

When **--no-integrate-operation** is given, the command still creates an operation object, but it is not linked into the log and the working copy is not updated. The command prints the resulting operation ID. Pass that ID to **jj --at-op** to inspect the resulting repo state, to **jj op restore** to make that state current, or to **jj op integrate** to append it to the log.

Running **jj op integrate** on an operation that is already visible in **jj op log** has no effect. **--no-integrate-operation** does not suppress side effects outside the repo; for example **jj git push --no-integrate-operation** still performs the push.

# CAVEATS

Subcommand of **jj**. The operation must already exist as an object; this command does not create one. Integrating does not undo or redo work — it only links the operation into the log. Side effects that already happened (network, working-copy writes from the original command) are not replayed or rolled back.

# INSTALL

```pacman: sudo pacman -S jujutsu```

```apk: sudo apk add jujutsu```

```zypper: sudo zypper install jujutsu```

```brew: brew install jujutsu```

```nix: nix profile install nixpkgs#jujutsu```

<!-- packages: 2026-09-11 -->

# SEE ALSO

[jj-operation](/man/jj-operation)(1), [jj-operation-log](/man/jj-operation-log)(1), [jj-operation-restore](/man/jj-operation-restore)(1), [jj-operation-show](/man/jj-operation-show)(1), [jj](/man/jj)(1)

# RESOURCES

```[Source code](https://github.com/jj-vcs/jj)```

```[Homepage](https://jj-vcs.github.io/jj/)```

```[Documentation](https://docs.jj-vcs.dev/latest/cli-reference/#jj-operation-integrate)```

<!-- verified: 2026-09-11 -->
