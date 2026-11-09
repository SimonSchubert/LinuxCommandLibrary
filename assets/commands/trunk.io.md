# TAGLINE

Unified code quality linting and formatting

# TLDR

**Initialize trunk in a project**

```trunk init```

**Check changed files for issues**

```trunk check```

**Check all files in the repository**

```trunk check --all```

**Check and auto-fix issues**

```trunk check --fix```

**Format changed files**

```trunk fmt```

**Format all files in the repository**

```trunk fmt --all```

**Run only a specific linter**

```trunk check --filter [eslint]```

**Run several linters** on the whole repository

```trunk check --all --filter=[eslint,isort]```

**Run every linter except some**

```trunk check --all --filter=-[clang-tidy],-[shellcheck]```

**Try each linter on a few files** to test the setup

```trunk check --sample=[5]```

**Enable a linter**

```trunk check enable [eslint]```

**List available linters**

```trunk check list```

**Upgrade trunk and all managed tools**

```trunk upgrade```

# SYNOPSIS

**trunk** _command_ [_options_]

# PARAMETERS

**init**
> Initialize trunk configuration in the current repository, creating a `.trunk/trunk.yaml` file.

**check** [_paths..._]
> Run all enabled linters on changed files. Without `--all`, only checks files modified relative to the upstream branch.

**fmt** [_paths..._]
> Format code using enabled formatters. Equivalent to `trunk check --fix --filter` set to all formatters.

**upgrade**
> Upgrade trunk CLI and all managed tool versions.

**check enable**|**disable**|**list**
> Enable or disable linters, or list them.

**actions**
> Manage trunk actions (git hooks, notifications, etc.).

**tools**
> Manage linter and formatter tool installations.

**login**, **logout**
> Authenticate with the Trunk platform, or log out.

**version**
> Output the version.

**-a**, **--all**
> Check or format all files in the repository, not just changed files.

**-y**, **--fix**
> Automatically apply all fixes without prompting.

**-n**, **--no-fix**
> Do not automatically apply fixes.

**--filter** _linters_
> Comma-separated list of linters and/or issue codes to include, or to exclude with a leading -.

**--exclude** _linters_
> Shorthand for an inverse --filter.

**--scope** _scope_
> Scope of checks to run: all or security.

**--ignore** _glob_
> Glob pattern to exclude files from linting.

**--sample** _N_
> Run each linter on N files.

**--show-existing**
> Show existing issues otherwise hidden by hold-the-line.

**-j**, **--jobs** _N_
> Number of concurrent jobs.

**--upstream** _branch_
> Explicitly set the upstream branch for change detection (auto-detected by default).

**--no-progress**
> Suppress progress reporting during checks.

**--ci**
> Run in non-interactive mode designed for CI environments.

**--output** _format_
> Set output format: text (default) or json.

**--output-file** _file_
> Write JSON results to the specified file.

# DESCRIPTION

**trunk** is a code quality tool that manages multiple linters and formatters through a unified interface. It auto-detects and configures appropriate tools for your codebase, providing static analysis, formatting, and CI integration.

By default, trunk operates in hold-the-line mode: it only checks files changed relative to the upstream branch, preventing existing issues from blocking new work. Use `--all` to check the entire repository.

Configuration is stored in `.trunk/trunk.yaml` where linters, formatters, and actions can be enabled, disabled, or customized.

# SEE ALSO

[eslint](/man/eslint)(1), [prettier](/man/prettier)(1)

# RESOURCES

```[Homepage](https://trunk.io/)```

```[Documentation](https://docs.trunk.io/)```

<!-- verified: 2026-11-09 -->
