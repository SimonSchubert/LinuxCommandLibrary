# TAGLINE

runs linters on git staged files

# TLDR

**Run on staged files**

```npx lint-staged```

**Run with config file**

```npx lint-staged --config [.lintstagedrc.json]```

**Run in debug mode**

```npx lint-staged --debug```

**Dry run (no changes)**

```npx lint-staged --dry-run```

**Run on specific files**

```npx lint-staged --diff="[branch]"```

# SYNOPSIS

**lint-staged** [_options_]

# PARAMETERS

**--config** _file_
> Path to config file.

**--debug**
> Enable debug mode.

**--dry-run**
> Show what would run.

**--diff** _ref_
> Compare against reference.

**--no-stash**
> Disable git stash.

**--quiet**
> Suppress output.

**--relative**
> Use relative paths.

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
