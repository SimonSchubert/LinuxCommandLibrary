# TAGLINE

Fast Markdown linter and formatter written in Rust

# TLDR

**Lint** the current directory

```rumdl check .```

Lint a **single file**

```rumdl check [README.md]```

**Auto-fix** issues, then report what could not be fixed

```rumdl check --fix .```

**Format** files in place (exits 0 even if unfixable issues remain)

```rumdl fmt .```

Preview a **diff** of what would change, without writing files

```rumdl check --diff .```

**Disable** specific rules for one run

```rumdl check --disable [MD013,MD033] [docs/]```

Re-lint whenever files **change**

```rumdl check --watch [docs/]```

Create a default **`.rumdl.toml`**

```rumdl init```

**Import** an existing markdownlint config

```rumdl import [.markdownlint.json]```

Show **rule documentation** (list all rules if omitted)

```rumdl rule [MD013]```

# SYNOPSIS

**rumdl** [_OPTIONS_] _COMMAND_ [_PATHS_...]

# PARAMETERS

**check** [_PATHS_...]
> Lint Markdown files and print diagnostics. Paths override include patterns from config.

**-f**, **--fix**
> With **check**: apply safe fixes in place. Exit 0 if everything was fixed, 1 if violations remain.

**fmt** [_PATHS_...]
> Format files in place. Same fixes as **check --fix**, but always exits 0 after a successful format (formatter-style codes).

**--diff**
> Show what would change instead of writing files.

**--check**
> With **fmt**: exit 1 if formatting would change anything, without writing files.

**-w**, **--watch**
> Re-run whenever files change.

**-d**, **--disable** _RULES_
> Disable rules (comma-separated IDs, or `all`).

**-e**, **--enable** _RULES_
> Enable only these rules.

**--exclude** _PATTERNS_
> Skip files matching comma-separated globs.

**--include** _PATTERNS_
> Limit the run to matching files.

**--respect-gitignore**
> Honor `.gitignore` when scanning directories (default on). Does not apply to paths given on the command line.

**--no-exclude**
> Ignore exclude patterns from the config file.

**--stdin**, **-**
> Read Markdown from stdin. **fmt --silent -** writes only formatted Markdown to stdout.

**--stdin-filename** _NAME_
> Filename used for stdin diagnostics, config, and relative links.

**--output-format** _FMT_
> Diagnostic format: `text` (default), `full`, `concise`, `grouped`, `json`, `json-lines`, `sarif`, `junit`, `github`, `gitlab`, `azure`, `pylint`.

**-q**, **--quiet**
> Print diagnostics, suppress summaries.

**-s**, **--silent**
> Suppress diagnostics and summaries (use with **fmt** when stdout must be pure Markdown).

**-c**, **--config** _FILE_or_TOML_
> Config file path, or an inline `KEY = VALUE` override (repeatable).

**--no-config**
> Ignore discovered config files and use built-in defaults.

**--color** _WHEN_
> `auto` (default), `always`, or `never`.

**init**
> Write a default `.rumdl.toml`. **--pyproject** writes `[tool.rumdl]` instead. **--preset** _NAME_ selects `default`, `google`, or `relaxed`.

**import** _FILE_
> Convert a markdownlint JSON/JSONC/YAML config to rumdl format.

**rule** [_RULE_]
> List rules, or print one rule's documentation (ID or alias).

**config**
> Print the merged effective configuration. **get** _KEY_ queries one setting; **file** prints the loaded config path.

**server**
> Start the Language Server Protocol server on stdio.

**vscode**
> Install or update the rumdl VS Code extension.

**completions** [_SHELL_]
> Print a completion script (`bash`, `zsh`, `fish`, `powershell`, `elvish`).

**version**
> Print version information.

# DESCRIPTION

**rumdl** is a native Markdown linter and formatter. The name is **Ru**(st) **M**ark**D**own **L**inter. It is modeled on **ruff**: one fast binary covers linting, formatting, caching, editor integration, and CI output.

It implements **84** rules, largely aligned with markdownlint (including the `MD###` IDs). Existing `.markdownlint.json`, `.markdownlint.yaml`, and related files are discovered automatically, so a first run can compare results without rewriting config. `rumdl import` converts those files to `.rumdl.toml` when you are ready to switch.

Built-in **flavors** (standard/GFM, MkDocs, MDX, Quarto, Pandoc, Obsidian, kramdown, Azure DevOps, MyST, Hugo, and others) adjust rules for dialect-specific syntax. When no flavor is set, rumdl infers one from the filename (`.mdx`, `.qmd` / `.Rmd`, and so on).

**check** is the CI/pre-commit path: non-zero exit when violations remain. **fmt** is the editor/format-on-save path: it rewrites files and exits 0 even if some issues cannot be auto-fixed. Files that contain Git conflict markers are left unchanged.

Exit codes: **0** success, **1** Markdown violations, **2** tool or configuration error (with **--deny-config-warnings**, unknown rules and similar config problems also exit 2).

# CONFIGURATION

Discovery walks up from the working directory and stops at `.git` or a depth limit. First match wins: **`.rumdl.toml`**, **`rumdl.toml`**, **`.config/rumdl.toml`**, then **`pyproject.toml`** `[tool.rumdl]`. Subdirectory configs apply to files under that directory. With no project file, rumdl falls back to markdownlint configs, then a user file under `~/.config/rumdl/` (or `$XDG_CONFIG_HOME/rumdl/`) and finally `~/.rumdl.toml`.

```toml
# .rumdl.toml
[global]
line-length = 100
exclude = ["node_modules", "build", "dist"]
respect-gitignore = true
flavor = "mkdocs"
disable = ["MD013", "MD033"]

[per-file-flavor]
"**/*.mdx" = "mdx"

[MD007]
indent = 2

[MD013]
line-length = 100
code-blocks = false
reflow = true
```

Inline HTML comments `<!-- rumdl-disable MD013 -->` / `<!-- rumdl-enable MD013 -->` (and the markdownlint equivalents) disable rules in a file.

# CAVEATS

Still **beta** pending a 1.0 compatibility policy. The CLI, config model, and core rules are intended for production use, but details can still change.

markdownlint compatibility is broad, not bit-identical. Some historic rule numbers are intentionally absent (for example MD002, MD006) to match upstream markdownlint.

**fmt** and **check --fix** do not share exit-code semantics. Using the wrong one in CI will either fail a clean format or hide remaining violations.

`--respect-gitignore` does not apply to paths you pass explicitly. A file listed on the command line is checked even if gitignored.

# HISTORY

**rumdl** was created by **Ruben J. Jongejan** (**rvben**) and first published in **February 2025** (MIT, Rust). It is positioned as a Ruff-style toolchain for Markdown: one native binary instead of a Node markdownlint install. The project later added flavor support, an LSP, editor extensions, and package availability on crates.io, PyPI, Homebrew, pacman, and Nix.

# INSTALL

```pacman: sudo pacman -S rumdl```

```brew: brew install rumdl```

```nix: nix profile install nixpkgs#rumdl```

<!-- packages: 2026-09-10 -->

# SEE ALSO

[markdownlint](/man/markdownlint)(1), [prettier](/man/prettier)(1), [vale](/man/vale)(1), [ruff](/man/ruff)(1), [biome](/man/biome)(1)

# RESOURCES

```[Source code](https://github.com/rvben/rumdl)```

```[Homepage](https://rumdl.dev)```

```[Documentation](https://rumdl.dev/usage/cli)```

<!-- verified: 2026-09-10 -->
