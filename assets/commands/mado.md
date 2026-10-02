# TAGLINE

Fast Markdown linter for CommonMark and GitHub Flavored Markdown

# TLDR

**Check** the current directory

```mado check```

**Check** specific files or directories

```mado check [docs/] [README.md]```

**Exclude** paths by glob (comma-separated)

```mado check --exclude "[**/node_modules/**]" [docs/]```

Use a **config file**

```mado --config [path/to/mado.toml] check [docs/]```

Print violations like **mdl**

```mado check --output-format [mdl] [docs/]```

**Shell completion**

```mado generate-shell-completion [bash]```

# SYNOPSIS

**mado** [**--config** _file_] **check** [_options_] [_paths_...]

**mado generate-shell-completion** _shell_

# PARAMETERS

**--config** _file_
> TOML file used instead of the discovered **mado.toml**. Place it before the subcommand.

**check** [_paths_...]
> Lint Markdown files. Directories are walked. Default path is **.**. Non-terminal stdin is linted as one document and the path arguments are ignored.

**--output-format** _format_
> **concise** (default), **mdl**, or **markdownlint**. Overrides **output-format** in the config file.

**--quiet**
> Print violations only. Suppresses the success line. ORed with **quiet** in the config file.

**--exclude** _globs_
> Comma-separated globs to skip. Replaces the **exclude** list from the config file for this run.

**generate-shell-completion** _shell_
> Print a completion script. _shell_ is **bash**, **elvish**, **fish**, **powershell**, or **zsh**.

**-h**, **--help**
> Help. **mado** with no subcommand does the same.

**-V**, **--version**
> Print the version.

# DESCRIPTION

**mado** is a Rust linter for CommonMark and GitHub Flavored Markdown. It checks the markdownlint rule set (MD001 through MD047, with gaps) and exits 0 when every file passes, printing **All checks passed!** unless **--quiet** is set. Any violation exits non-zero after a count of errors.

With a terminal on stdin it lints the given paths in parallel. With a pipe it lints that text instead.

# CONFIGURATION

**mado.toml** or **.mado.toml** in the working directory is loaded first. If neither exists, mado reads the user config: **~/.config/mado/mado.toml** on Linux and macOS, **~\AppData\Roaming\mado\mado.toml** on Windows.

```toml
[lint]
output-format = "concise"
respect-gitignore = "repository-only"
exclude = ["**/node_modules/**"]

[lint.md013]
line-length = 80
code-blocks = false
tables = false
```

**respect-gitignore** is **never**, **repository-only** (default: only inside a Git, worktree, submodule, or jj tree), or **always** (also when the tree has no Git metadata, such as a source archive). **respect-ignore** controls **.ignore** files. The global Git ignore file and **.git/info/exclude** are never read.

Rule options live under **[lint.MD###]** (heading style, line length, allowed HTML elements, and so on). A JSON Schema for the file is shipped in the repository.

# CAVEATS

This is not the Node **markdownlint** CLI and it does not autofix. The upstream README marks MD003, MD007, MD020, MD027, and MD032 as unstable, and some rule options are unsupported. **--exclude** on the command line replaces the configured exclude list rather than adding to it. A piped run does not lint the paths you also passed.

# INSTALL

```pacman: sudo pacman -S mado```

```apk: sudo apk add mado```

```brew: brew install mado```

```nix: nix profile install nixpkgs#mado```

<!-- packages: 2026-10-02 -->

# SEE ALSO

[markdownlint](/man/markdownlint)(1), [vale](/man/vale)(1), [prettier](/man/prettier)(1), [glow](/man/glow)(1)

# RESOURCES

```[Source code](https://github.com/akiomik/mado)```

<!-- verified: 2026-10-02 -->
