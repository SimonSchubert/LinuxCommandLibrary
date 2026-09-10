# TAGLINE

Fast Markdown linter and formatter written in Rust

# TLDR

**Lint** the current directory

```rumdl check .```

Lint a **single file**

```rumdl check [README.md]```

**Auto-fix** what can be fixed, then report leftovers

```rumdl check --fix .```

**Format** files (exits 0 even if unfixable issues remain)

```rumdl fmt .```

Show a **diff** of what formatting would change, without writing

```rumdl fmt --check .```

Write a default **`.rumdl.toml`**

```rumdl init```

Lint with a **config file** or an inline TOML override

```rumdl check --config [rumdl.toml] [docs/]```

**Disable** specific rules

```rumdl check --disable [MD013,MD033] .```

Start the **language server**

```rumdl server```

Print **rule documentation**

```rumdl rule [MD013]```

# SYNOPSIS

**rumdl** [_global-options_] _command_ [_options_] [_paths_...]

# PARAMETERS

**check** [_PATHS_...]
> Lint Markdown files and print diagnostics. Paths override include patterns. Exit `1` if violations remain.

**-f**, **--fix**
> With **check**, apply automatic fixes. Exit `0` only if nothing is left to fix.

**fmt** [_PATHS_...]
> Format Markdown (fixes always on). Exit `0` on success even if some violations cannot be auto-fixed. **--check** prints a diff and fails if files would change.

**init**
> Write a default configuration file (`.rumdl.toml`). **--pyproject** adds a `[tool.rumdl]` section instead.

**import** _FILE_
> Import a markdownlint / markdownlint-cli2 config into rumdl's TOML format.

**rule** [_RULE_]
> List rules, or print details for one rule id (e.g. `MD013`).

**config**
> Show the effective configuration. **--defaults** / **--no-defaults** filter the dump.

**server**
> Run the Markdown language server (diagnostics, quick fixes, formatting).

**vscode**
> Install or manage the VS Code / Cursor / Windsurf extension.

**completions** [_SHELL_]
> Print a completion script for `bash`, `zsh`, `fish`, `powershell`, or `elvish`. Omitting _SHELL_ uses `$SHELL`. **--list** prints supported shells.

**version**
> Print version information.

**-c**, **--config** _FILE_or_TOML_
> Config path, or an inline TOML override such as `MD013.line-length=120`. Repeatable.

**--no-config**
> Ignore all configuration files and use built-in defaults (`--isolated` is an alias).

**-d**, **--disable** _RULES_
> Disable rules (comma-separated ids).

**-e**, **--enable** _RULES_
> Enable only the given rules.

**--output-format** _FORMAT_
> Diagnostic format (`text`, `json`, plus CI formats such as GitHub, GitLab, SARIF, JUnit).

**-q**, **--quiet**
> Print diagnostics, suppress summary lines.

**-s**, **--silent**
> With **fmt**, suppress diagnostics and summaries.

**--stdin**
> Read Markdown from stdin (and write formatted Markdown to stdout for **fmt**).

**--color** _MODE_
> `auto` (default), `always`, or `never`.

# DESCRIPTION

**rumdl** is a native Rust Markdown linter and formatter in the same spirit as **ruff**: one binary, fast enough for editors and CI, with automatic fixes and a language server. It implements the common markdownlint rule ids (MD013, MD033, …) plus extra rumdl-only rules, and it can read existing markdownlint / markdownlint-cli2 config files so a first run can be compared without rewriting the project config.

Flavors cover GFM, MkDocs, MDX, Quarto, MyST, and others. When no flavor is set, rumdl infers from the file name (`.mdx` → MDX, `.qmd`/`.Rmd` → Quarto, and so on). Results are cached so unchanged files are skipped on later runs.

**check** is the CI/pre-commit command (non-zero if issues remain). **fmt** is the editor-friendly formatter (zero on successful rewrite). **server** is the LSP used by the official VS Code and JetBrains plugins.

# CONFIGURATION

Discovery walks parent directories for `.rumdl.toml`, `rumdl.toml`, and `[tool.rumdl]` in `pyproject.toml`. markdownlint JSON/YAML configs are also picked up unless **--no-config** is set. Inline `<!-- rumdl-disable-next-line MD026 -->` comments suppress individual rules.

**.rumdl.toml** / **rumdl.toml**
> Native TOML config: global include/exclude, line length, enabled/disabled rules, and per-rule tables such as `[MD013]`.

**pyproject.toml** `[tool.rumdl]`
> Same settings nested under the Python project file.

**.rumdl_cache**
> Per-project lint cache written next to the files. Safe to gitignore.

# CAVEATS

**fmt** exiting 0 does not mean the file is clean — only that formatting ran. Use **check** (or **check --fix**) when a non-zero status must mean remaining violations.

Not every markdownlint plugin/rule is implemented. Flavor auto-detection is filename-based; mixed-flavor trees may need an explicit flavor map in config.

# HISTORY

**rumdl** (Ru(st) MarkDown Linter) was created by **rvben** as a Rust replacement for the Node.js markdownlint toolchain. It is MIT-licensed and ships as a single static binary (also on PyPI, npm, and crates.io).

# INSTALL

```pacman: sudo pacman -S rumdl```

```brew: brew install rumdl```

```nix: nix profile install nixpkgs#rumdl```

<!-- packages: 2026-09-10 -->

# SEE ALSO

[markdownlint](/man/markdownlint)(1), [ruff](/man/ruff)(1), [prettier](/man/prettier)(1), [vale](/man/vale)(1), [textlint](/man/textlint)(1), [tldr-lint](/man/tldr-lint)(1)

# RESOURCES

```[Source code](https://github.com/rvben/rumdl)```

```[Homepage](https://rumdl.dev/)```

<!-- verified: 2026-09-10 -->
