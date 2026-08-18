# TAGLINE

Git-aware Python AST static review CLI

# TLDR

**Review** Python files changed versus Git HEAD (plus untracked `.py` files)

```avouch```

Print findings as **JSON**

```avouch --json```

Review **every eligible** Python file (the mode that works in CI)

```avouch --all-files```

Review only **staged** files

```avouch --staged```

Review `.py` files **without a Git repository**

```avouch --not-git```

Print a **compact diff** of changed files instead of the findings report

```avouch --changed```

Analyze and return only the **exit code** (no report)

```avouch --quiet```

# SYNOPSIS

**avouch** [**--json**] [**--quiet**] [**--verbose**] [**--ignore-path** _PATH_] [**--changed** | **--staged** | **--all-files**] [**--not-git**]

**avouch** **--docs**

**avouch** **--version**

# PARAMETERS

**--json**
> Print one versioned JSON document on stdout (schema `version` 1). Human report is omitted. Combines with any review-scope flag.

**--quiet**
> Run the same analysis but print no report. Errors still go to stderr. Exit codes are unchanged.

**--verbose**
> Print step-by-step diagnostics to stderr (config source, ignore paths, review set).

**--ignore-path** _PATH_
> Exclude a repository-relative file or directory. Repeatable. Combined with `ignore_paths` from `avouch.toml`.

**--changed**
> Show added and deleted lines of files changed versus HEAD instead of the findings report. Mutually exclusive with **--staged** and **--all-files**.

**--staged**
> Review only files with staged Git changes (`git diff --cached --name-only`). Mutually exclusive with **--changed** and **--all-files**.

**--all-files**
> Review every eligible Python file in the repository (`git ls-files`). Use this in CI: a clean checkout has nothing changed versus HEAD.

**--not-git**
> Walk the current directory for `.py` files and skip the Git requirement. Cannot be combined with **--changed** or **--staged**.

**--docs**
> Print built-in documentation and exit 0 without reviewing. Interactive pager on a TTY; plain text when piped.

**--version**
> Print the Avouch package version and exit.

**--help**
> Show the argparse help and exit.

# DESCRIPTION

**avouch** is a local, Git-aware static-analysis CLI for Python. It asks Git which files the next commit will touch, parses each changed `.py` file with the standard-library `ast` module, and reports structural problems against limits you configure in `avouch.toml`.

The default review set is tracked files modified versus `HEAD` plus untracked `.py` files. Deleted paths, non-Python files, and generated-looking names (`generated.py`, `*_generated.py`, `codegen.py`, `autogen.py`, and similar) are skipped. Committed, untouched files never appear in the output.

Findings are **warnings** produced by 17 rule identifiers (SCR001–SCR017) plus cyclomatic-complexity checks on functions and classes. Metrics such as parameter counts, nesting depth, and line spans come from the AST. An unreadable or syntactically broken file becomes an `ERROR` entry; one broken file does not cancel the rest of the review.

Avouch reviews; it does not rewrite files. Enforcement belongs to whatever calls it. Exit codes are **0** (clean), **1** (findings reported), and **2** (Avouch could not run). Colors are emitted only when stdout is a TTY.

Requires **Python 3.10+** (`ast.Match`, `tomllib`) and **Git** on `PATH` unless **--not-git** is used. Install with `pip install avouch`, which registers the `avouch` console script.

# CONFIGURATION

**avouch.toml**
> Optional TOML file in the **current working directory** only (no parent search). Missing or empty means built-in defaults, with no warning.

**[limits]**
> Numeric thresholds. Unset keys keep their defaults. Examples: `max_parameters` (5), `max_nesting` (5), `max_function_lines` (300), `max_class_lines` (200), `max_file_lines` (1000), `max_complexity` (40), `max_boolean_conditions` (5), `max_if_chain` (5), `max_local_variables` (30), `max_return_statements` (6), `max_lambda_nodes` (10), `max_large_comprehensions` (40).

**[rules]**
> Per-rule on/off toggles (`true`/`false`). Keys match the rule modules (`bare_except`, `nested_function`, `max_parameters`, …). Setting a toggle to `false` disables that rule.

**ignore_paths**
> Top-level TOML list of repository-relative paths to skip (must be a list). Matching is component-wise: `tests` skips `tests/` and `tests/x.py` but not `tests.py`. Combined with repeatable **--ignore-path**.

There are no configuration environment variables. `AVOUCH_FONT` only selects an optional terminal font via OSC 50 on capable terminals. Unknown TOML keys are ignored silently. Malformed TOML or a non-list `ignore_paths` exits **2**.

# CAVEATS

Default mode against a clean Git checkout prints `error: nothing to review` and exits **2** — use **--all-files** in CI. Configuration is CWD-only, so running from a subdirectory will not see a repo-root `avouch.toml`. Unknown config keys do not warn. Limit values are not type-checked at load time. Only Python is reviewed. `self` on methods counts toward `max_parameters`. Nested `async def` is not flagged by SCR015. The declared `rich` dependency is not used by the reporter.

# HISTORY

Avouch is a Python CLI by **Mukund** (`mukundzha`), first published on PyPI as package **avouch**. It targets a pre-push, diff-scoped review rather than a whole-repository lint. The console-script entry point is `avouch.cli:main`.

# SEE ALSO

[ruff](/man/ruff)(1), [flake8](/man/flake8)(1), [pylint](/man/pylint)(1), [mypy](/man/mypy)(1), [git](/man/git)(1)

# RESOURCES

```[Source code](https://github.com/mukundzha/avouch)```

<!-- verified: 2026-08-18 -->
