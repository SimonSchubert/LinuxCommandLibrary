# TAGLINE

update files with formatting fixes or other content transformations in Jujutsu

# TLDR

**Fix changed files** in all mutable revisions connected to the working-copy commit

```jj fix```

**Fix changed files** in the specified revision(s) and their descendants

```jj fix -s [revsets]```

**Fix files only** in the working-copy commit

```jj fix -s @```

**Fix only** a specific file or directory

```jj fix [path/to/file_or_directory]```

**Format all lines** instead of only modified lines

```jj fix -a```

**Format all lines** of a specific file

```jj fix -a [path/to/file]```

**Fix unchanged files** as well as changed ones across the repository

```jj fix --include-unchanged-files```

**Review** what the last fix rewrote

```jj op show -p```

# SYNOPSIS

**jj fix** [_options_] [_FILESETS_...]

# PARAMETERS

_FILESETS_
> Fix only these paths. If omitted, every matching path in the selected revisions is considered.

**-s**, **--source** _REVSETS_
> Fix files in these revision(s) and their descendants. Defaults to the `revsets.fix` setting, or `reachable(@, mutable())` if that setting is unset.

**--include-unchanged-files**
> Fix unchanged files in addition to changed ones. If no paths are specified, every file in the repo is fixed.

**-a**, **--all-lines**
> Format all lines instead of only modified lines. Has no effect if the configured tool cannot format a line range.

# DESCRIPTION

**jj fix** rewrites file contents in selected revisions by piping each file through external tools configured under `fix.tools`. The usual use is to run code formatters (`clang-format`, `black`, `prettier`, `rustfmt`) on commits that are not yet formatted. Any stdin-to-stdout filter works, including `sed` or `sort`.

Changed files in the given revisions are passed through every tool whose `patterns` match the path. Descendants of those revisions get the same files through the same tools so the fixes are not lost when history is rewritten. The command never introduces new conflicts. Files that already contain conflicts are updated on every conflict side, which can add or remove conflict markers.

When the same path has the same content in several commits, the tool is run once and the result is reused. Tools must therefore be deterministic. The working copy is not used as input; each tool reads file content on standard input and writes the rewritten content on standard output.

Review the rewrite with `jj op show -p`.

# CONFIGURATION

Tools are tables under `fix.tools`. Each tool has a `command` (stdin in, stdout out) and `patterns` (filesets). Optional keys include `enabled`, `line-range-arg` (`$first` / `$last` for 1-based modified line ranges), and `run-tool-if-zero-line-ranges`.

```
[fix.tools.clang-format]
command = ["/usr/bin/clang-format", "--assume-filename=$path"]
patterns = ["glob:'**/*.cc'", "glob:'**/*.h'"]
line-range-arg = "--lines=$first:$last"

[fix.tools.black]
command = ["/usr/bin/black", "-", "--stdin-filename=$path"]
patterns = ["glob:'**/*.py'"]
```

`$path` is the repo-relative file path and `$root` is the workspace root. Tools that match the same file run in ascending lexicographical order of their configured names. Define a tool as `enabled = false` in user config and turn it on per repo with `jj config set --repo fix.tools.[name].enabled true`.

The default revision set is `revsets.fix` (fallback `reachable(@, mutable())`).

# CAVEATS

Subcommand of **jj**. With no `fix.tools` configured, the command has nothing to run. Tools must not touch the working copy; they only rewrite the bytes they are given on stdin. Non-deterministic tools produce inconsistent results because identical inputs are cached. `--all-lines` is ignored when the tool has no `line-range-arg`. `--include-unchanged-files` without a path argument formats the entire tree, which can be slow in a large repository.

# INSTALL

```pacman: sudo pacman -S jujutsu```

```apk: sudo apk add jujutsu```

```zypper: sudo zypper install jujutsu```

```brew: brew install jujutsu```

```nix: nix profile install nixpkgs#jujutsu```

<!-- packages: 2026-09-16 -->

# SEE ALSO

[jj](/man/jj)(1), [jj-config](/man/jj-config)(1), [jj-operation-show](/man/jj-operation-show)(1), [jj-undo](/man/jj-undo)(1), [clang-format](/man/clang-format)(1)

# RESOURCES

```[Source code](https://github.com/jj-vcs/jj)```

```[Homepage](https://jj-vcs.github.io/jj/)```

```[Documentation](https://docs.jj-vcs.dev/latest/cli-reference/#jj-fix)```

<!-- verified: 2026-09-16 -->
