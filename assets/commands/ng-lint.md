# TAGLINE

runs linting on Angular project source code

# TLDR

**Set up ESLint** in a workspace without a linter

```ng add angular-eslint```

**Lint all projects**

```ng lint```

**Lint specific project**

```ng lint [project-name]```

**Fix lint issues automatically**

```ng lint --fix```

**Output in specific format**

```ng lint --format json```

**Fail on warnings** in CI and write a report file

```ng lint --max-warnings 0 --output-file [lint-report.txt]```

**Only re-check changed files**

```ng lint --cache```

# SYNOPSIS

**ng** **lint** [_project_] [_options_]

# PARAMETERS

**-c**, **--configuration** _name_
> Use a named configuration of the **lint** target from **angular.json**.

**--fix**
> Auto-fix lint issues.

**--format** _format_
> Output format (default: _stylish_; also _json_, etc.).

**--force**
> Succeed even with lint errors.

**--silent**
> Suppress output.

**--quiet**
> Report errors only, ignoring warnings.

**--cache**
> Only check files changed since the last run.

**--cache-location** _path_
> Path to the cache file or directory.

**--max-warnings** _N_
> Fail (exit code 1) if more than _N_ warnings are reported.

**--output-file** _file_
> Write the report to a file instead of the console.

**--lint-file-patterns** _glob_
> Files, directories or globs to lint instead of the configured ones.

**--eslint-config** _file_
> Use a specific ESLint config file.

**--stats**
> Print performance statistics for ESLint rules.

# DESCRIPTION

**ng lint** runs the **lint** builder configured for a project in **angular.json**. Angular CLI ships no linter of its own: TSLint support was removed in **Angular 12**, and new workspaces have no lint target. Running **ng lint** without one offers to install **angular-eslint**, which adds an **eslint.config.js** flat config and the **@angular-eslint/builder:lint** target.

Running without a project name lints every project that has a **lint** target. Builder options such as **--fix** or **--format** are passed through to ESLint.

# CAVEATS

Requires a configured lint target in **angular.json**. Current **angular-eslint** requires ESLint 9+ and flat config only; pin **ng add angular-eslint@**_major_ to match an older Angular version. **--fix** rewrites source files in place; commit or stash beforehand. **--force** still allows the build pipeline to continue but does not silence the report.

# SEE ALSO

[ng](/man/ng)(1), [eslint](/man/eslint)(1), [ng-build](/man/ng-build)(1), [ng-test](/man/ng-test)(1), [prettier](/man/prettier)(1)

# RESOURCES

```[Source code](https://github.com/angular/angular-cli)```

```[Homepage](https://angular.dev)```

```[Documentation](https://angular.dev/cli/lint)```

<!-- verified: 2026-11-23 -->
