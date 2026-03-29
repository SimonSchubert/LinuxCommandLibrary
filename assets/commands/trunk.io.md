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

**actions**
> Manage trunk actions (git hooks, notifications, etc.).

**tools**
> Manage linter and formatter tool installations.

**login**
> Authenticate with the Trunk platform.

**--all**
> Check or format all files in the repository, not just changed files.

**--fix**
> Automatically apply fixes for issues that support auto-fixing.

**--filter** _linter_
> Restrict check to a specific linter or formatter.

**--upstream** _branch_
> Explicitly set the upstream branch for change detection (auto-detected by default).

**--no-progress**
> Suppress progress reporting during checks.

**--ci**
> Run in CI mode with appropriate output formatting.

**--output** _format_
> Set output format (e.g., text, json).

# DESCRIPTION

**trunk** is a code quality tool that manages multiple linters and formatters through a unified interface. It auto-detects and configures appropriate tools for your codebase, providing static analysis, formatting, and CI integration.

By default, trunk operates in hold-the-line mode: it only checks files changed relative to the upstream branch, preventing existing issues from blocking new work. Use `--all` to check the entire repository.

Configuration is stored in `.trunk/trunk.yaml` where linters, formatters, and actions can be enabled, disabled, or customized.

# SEE ALSO

[eslint](/man/eslint)(1), [prettier](/man/prettier)(1)

