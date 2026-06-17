# TAGLINE

Remove unused imports and variables from Python code

# TLDR

**Preview** changes as a diff without modifying the file

```autoflake [file.py]```

**Remove** all unused imports in place

```autoflake --in-place --remove-all-unused-imports [file.py]```

Remove unused imports recursively from **all Python files**

```autoflake --in-place --remove-all-unused-imports -r [.]```

**Check** without modifying and exit non-zero if changes are needed

```autoflake --check [file.py]```

Remove unused imports and **variables** in place

```autoflake --in-place --remove-unused-variables --remove-all-unused-imports [file.py]```

# SYNOPSIS

**autoflake** [_--in-place_] [_--remove-unused-variables_] [_options_] _files_

# DESCRIPTION

**autoflake** removes unused imports and variables from Python code. It helps keep code clean by eliminating dead code automatically.

The tool uses static analysis to identify unused elements and can modify files in place or report issues.

# PARAMETERS

**-i**, **--in-place**
> Modify files directly instead of printing a diff

**-s**, **--stdout**
> Write the result to standard output

**--remove-unused-variables**
> Remove unused variables

**--remove-all-unused-imports**
> Remove all unused imports, not just standard-library ones

**--ignore-init-module-imports**
> Leave imports in __init__.py files untouched

**--expand-star-imports**
> Expand wildcard imports (from x import *) when names can be resolved

**--remove-duplicate-keys**
> Remove duplicate keys in dictionary literals

**--check**
> Exit non-zero if changes are needed, without modifying files (CI mode)

**--check-diff**
> Like --check, but also print the diff of proposed changes

**-r**, **--recursive**
> Process directories recursively

**-j** _n_, **--jobs** _n_
> Number of parallel jobs (0 uses all CPU cores)

**--exclude** _globs_
> Exclude files and directories matching the comma-separated globs

**--imports** _modules_
> Comma-separated list of additional modules whose unused imports should be removed

# CAVEATS

May incorrectly identify imports used only in type hints. Does not handle all edge cases. Review changes before committing. Works well with other formatters like black.

# HISTORY

**autoflake** was created to automate cleanup of unused Python imports, complementing code formatters and linters.

# SEE ALSO

[black](/man/black)(1), [isort](/man/isort)(1), [flake8](/man/flake8)(1)

# RESOURCES

```[Source code](https://github.com/PyCQA/autoflake)```

<!-- verified: 2026-06-17 -->
