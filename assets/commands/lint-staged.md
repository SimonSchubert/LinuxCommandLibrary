# TAGLINE

Run linters on git staged files

# TLDR

**Run on staged files**

```npx lint-staged```

**Run with config file**

```npx lint-staged --config [.lintstagedrc.json]```

**Run in debug mode**

```npx lint-staged --debug```

**Dry run (no changes)**

```npx lint-staged --dry-run```

**Run on changed files between two branches**

```npx lint-staged --diff="[branch1]...[branch2]"```

**Run with verbose output**

```npx lint-staged --verbose```

# SYNOPSIS

**lint-staged** [_options_]

# PARAMETERS

**--config**, **-c** _file_
> Path to config file or npm package name.

**--debug**, **-d**
> Enable debug mode.

**--dry-run**
> Show what would run without executing.

**--diff** _ref_
> Override the default --staged flag of git diff to get list of files.

**--diff-filter** _filter_
> Override the default --diff-filter=ACMR of git diff.

**--concurrent**, **-p** _number_
> Control concurrency of tasks (default: true for parallel).

**--no-stash**
> Disable creating backup stash, leave modifications in index.

**--hide-unstaged**
> Hide unstaged changes to tracked files before running tasks.

**--quiet**, **-q**
> Suppress all CLI output except from tasks.

**--relative**, **-r**
> Pass filepaths relative to process.cwd() to tasks.

**--verbose**
> Show task output even when tasks succeed.

**--allow-empty**
> Allow creating empty git commits when tasks revert all staged changes.

**--cwd** _dir_
> Run all tasks in a specific directory.

**--max-arg-length** _number_
> Override the maximum length of the generated command string.

# DESCRIPTION

**lint-staged** runs linters on git staged files. It's typically used with husky or lefthook to ensure code quality before commits by running formatters and linters only on changed files.

This makes pre-commit hooks fast by avoiding linting the entire codebase.

# CONFIGURATION

```json
// package.json
{
  "lint-staged": {
    "*.js": ["eslint --fix", "prettier --write"],
    "*.css": "stylelint --fix"
  }
}
```

# CAVEATS

Requires git repository. Stashes unstaged changes during run. May conflict with partial staging. Works best with auto-fixing linters.

# HISTORY

lint-staged was created by **Andrey Okonetchnikov** in **2016** to solve the problem of slow pre-commit hooks by targeting only staged files.

# SEE ALSO

[husky](/man/husky)(1), [eslint](/man/eslint)(1), [prettier](/man/prettier)(1), [lefthook](/man/lefthook)(1)
