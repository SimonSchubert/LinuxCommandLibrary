# TLDR

**Install hooks into repository**

```pre-commit install```

**Run all hooks manually**

```pre-commit run --all-files```

**Run specific hook**

```pre-commit run [hook_id]```

**Update hook versions**

```pre-commit autoupdate```

**Create sample config**

```pre-commit sample-config```

**Install commit-msg hooks**

```pre-commit install --hook-type commit-msg```

**Run on specific files**

```pre-commit run --files [file1] [file2]```

**Clean cached hook environments**

```pre-commit clean```

# SYNOPSIS

**pre-commit** _command_ [_--all-files_] [_--files files_] [_options_]

# PARAMETERS

**install**
> Install git hooks.

**uninstall**
> Remove git hooks.

**run** [_hook_id_]
> Run hooks manually.

**autoupdate**
> Update hooks to latest versions.

**sample-config**
> Generate sample configuration.

**clean**
> Clean cached environments.

**gc**
> Garbage collect unused environments.

**try-repo** _REPO_
> Try hooks from repository.

**--all-files**, **-a**
> Run on all files, not just staged.

**--files** _FILES_
> Run on specific files.

**--hook-stage** _STAGE_
> Run hooks for stage: commit, push, etc.

**--hook-type** _TYPE_
> Install hooks for type.

**--color** _WHEN_
> Color output: auto, always, never.

**--verbose**, **-v**
> Verbose output.

# DESCRIPTION

**pre-commit** manages and runs git hooks as code quality checks. Hooks run automatically before commits, catching issues before they enter the repository.

Configuration lives in .pre-commit-config.yaml, listing repositories and hooks to use. Hooks can check formatting, lint code, validate files, or run any custom command.

Each hook runs in an isolated environment, automatically installed and cached. This ensures consistent behavior regardless of developer's local setup. Language-specific environments (Python, Node, Ruby, etc.) are supported.

Common hooks include: trailing-whitespace, end-of-file-fixer, check-yaml, check-json, black, flake8, prettier, eslint. The hook ecosystem provides ready-made checks for most needs.

Autoupdate fetches latest hook versions from repositories. The --all-files flag runs against the entire codebase, useful for CI or initial cleanup. Stage-specific hooks (commit-msg, pre-push) enable additional checks.

# CAVEATS

Initial hook installation can be slow. Requires hooks to be installed per-clone. Some hooks may conflict with each other. Large files slow down commits. Breaking changes in hook updates possible. CI and local environments should match.

# HISTORY

**pre-commit** was created by **Anthony Sottile** at Yelp around **2014**. It addressed the problem of managing git hooks across teams - previously, hooks were often uncommitted or inconsistent. The framework standardized hook management and spawned a large ecosystem of shareable hooks.

# SEE ALSO

[git-hooks](/man/git-hooks)(5), [husky](/man/husky)(1), [lefthook](/man/lefthook)(1), [lint-staged](/man/lint-staged)(1)
