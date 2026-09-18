# TAGLINE

run a command across a set of Jujutsu revisions

# TLDR

**Run a command** on the current working-copy revision

```jj run -- [command]```

Run a command across a **revset**

```jj run -r [revset] -- [command]```

Run a **formatter** on every commit in the stack from trunk to `@`

```jj run -r 'trunk()..@' -- cargo fmt```

Print the **change ID** of each selected revision (`JJ_CHANGE_ID` is set per checkout)

```jj run -r [revset] -- sh -c 'echo $JJ_CHANGE_ID'```

Run in **parallel** across several revisions

```jj run -r [revset] -j [4] -- [command]```

Run **without rewriting** any commits (tests, linters)

```jj run --ignore-changes -r [revset] -- [command]```

Keep **descendants' content** unchanged instead of rebasing their diffs

```jj run --restore-descendants -r [revset] -- [command]```

Run from each checkout's **workspace root** rather than the subdirectory you invoked from

```jj run -r [revset] --root -- [command]```

# SYNOPSIS

**jj run** [**-r** _REVSETS_] [**-j** _JOBS_] [**--root**] [**--clean**] [**--restore-descendants**] [**--passthrough**] [**--ignore-changes**] [**--ignore-errors**] [_global-options_] **--** _COMMAND_ [_ARGS_...]

# PARAMETERS

_COMMAND_ [_ARGS_...]
> Command to run in each selected revision. Use **--** before the command so flags such as `-r` on the child command are not eaten by **jj**.

**-r**, **--revision** _REVSETS_
> Revisions to operate on. Defaults to the working-copy commit `@`.

**-j**, **--jobs** _JOBS_
> How many processes to run in parallel. Overrides `run.jobs`. Defaults to **1** if neither is set.

**--root**
> Run the command from the working-copy root of each commit instead of the subdirectory **jj run** was invoked from.

**--clean**
> Delete each isolated working copy before running the command. By default working copies are reused so build artifacts survive between invocations.

**--restore-descendants**
> After amending, rebase descendants while preserving their content (not their diff).

**--passthrough**
> Connect the command's stdout and stderr to the terminal instead of capturing them (progress bars, color). Stdin is not inherited. Forces a single job so output cannot interleave.

**--ignore-changes**
> Check out each revision and run the command, but discard working-copy changes. Useful for tests and linters. Also allows running on immutable commits without **--ignore-immutable**.

**--ignore-errors**
> Continue with remaining revisions when a command fails. Failed checkouts are not saved; successful ones still apply atomically at the end. A failed child does not change the exit code of **jj run**.

# DESCRIPTION

**jj run** checks out each selected revision into an isolated working copy, runs _COMMAND_, then amends that revision with the resulting tree. By default descendants are rebased onto the amended revisions so the produced diff propagates. Use **--restore-descendants** to keep descendant content as-is, or **--ignore-changes** to execute without rewriting any commits.

Each invocation sets:

- **JJ_CHANGE_ID** — change id of the revision being processed
- **JJ_COMMIT_ID** — commit id of that revision
- **JJ_WORKSPACE_ROOT** — path of the isolated working copy

Typical uses are formatters (`cargo fmt`, `prettier`), linters, test suites, and scripted edits (`sed`) across a stack. For per-file stdin/stdout formatters configured under `fix.tools`, **jj fix** is the dedicated command.

# CONFIGURATION

Parallelism defaults:

```
[run]
jobs = 1
```

**-j** on the command line overrides `run.jobs`.

# CAVEATS

Subcommand of **jj**. Mutating runs refuse immutable commits unless **--ignore-immutable** or **--ignore-changes** is set. **--passthrough** cannot be combined with more than one job. Without **--**, child flags that look like jj options are parsed by **jj run**. Isolated working copies are not the user's workspace; tools that assume a single checkout or write outside the tree will misbehave.

# INSTALL

```pacman: sudo pacman -S jujutsu```

```apk: sudo apk add jujutsu```

```zypper: sudo zypper install jujutsu```

```brew: brew install jujutsu```

```nix: nix profile install nixpkgs#jujutsu```

<!-- packages: 2026-09-18 -->

# SEE ALSO

[jj](/man/jj)(1), [jj-fix](/man/jj-fix)(1), [jj-bisect](/man/jj-bisect)(1), [jj-undo](/man/jj-undo)(1), [jj-operation-show](/man/jj-operation-show)(1)

# RESOURCES

```[Source code](https://github.com/jj-vcs/jj)```

```[Homepage](https://jj-vcs.github.io/jj/)```

```[Documentation](https://docs.jj-vcs.dev/latest/cli-reference/#jj-run)```

<!-- verified: 2026-09-18 -->
