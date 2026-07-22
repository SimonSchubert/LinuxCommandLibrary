# TAGLINE

pluggable JavaScript and TypeScript linter

# TLDR

**Lint JavaScript files**

```eslint [file.js]```

**Lint directory recursively**

```eslint [src/]```

**Fix auto-fixable** issues

```eslint --fix [file.js]```

**Specify config file**

```eslint -c [.eslintrc.json] [file.js]```

**Output in specific** format

```eslint -f [json] [file.js]```

**Create a configuration file** interactively

```npm init @eslint/config```

**Lint files piped on** stdin

```cat [file.js] | eslint --stdin```

# SYNOPSIS

**eslint** [_options_] [_files_|_dirs_]

# PARAMETERS

_FILES_
> Files or directories to lint.

**--fix**
> Automatically fix problems.

**-c**, **--config** _FILE_
> Configuration file.

**-f**, **--format** _FORMAT_
> Output format.

**--cache**
> Only check files that changed since the last run.

**--quiet**
> Report errors only, suppressing warnings.

**--max-warnings** _N_
> Exit with an error if more than N warnings are found.

**--no-eslintrc**
> Ignore configuration files (legacy config only).

**--rulesdir** _DIR_
> Load additional custom rules from a directory (deprecated).

**--stdin**
> Lint source read from standard input.

**--help**
> Display help information.

# DESCRIPTION

**ESLint** is the standard linting tool for JavaScript and TypeScript. It statically analyzes code to find problems, enforce coding standards, and catch bugs before runtime.

Rules are highly configurable. Plugins extend functionality for React, Vue, TypeScript, and other frameworks. The --fix flag automatically corrects many issues.

ESLint integrates with editors and CI systems, making it central to JavaScript development workflows.

# CONFIGURATION

**eslint.config.js** (flat config)
> The default configuration file since ESLint v9. It exports an array of config objects defining files, rules, plugins and language options. Also available as eslint.config.mjs or eslint.config.cjs.

**.eslintrc.js** / **.eslintrc.json** / **.eslintrc.yml** (legacy)
> The pre-v9 "eslintrc" format. Deprecated and no longer searched for by default in v9, and slated for removal in v10.

# CAVEATS

Since ESLint v9 the flat config (eslint.config.js) is the default and the legacy .eslintrc format, the --ext flag, --no-eslintrc and the built-in `--init` command have been removed or replaced; use `npm init @eslint/config` to scaffold a config. Plugin compatibility varies between the two config systems. Large codebases benefit from --cache.

# HISTORY

ESLint was created by **Nicholas C. Zakas** in **2013** as a more pluggable and configurable alternative to JSHint. It became the dominant JavaScript linter due to its extensibility.

# INSTALL

```pacman: sudo pacman -S eslint```

```brew: brew install eslint```

```nix: nix profile install nixpkgs#eslint```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[prettier](/man/prettier)(1), [tsc](/man/tsc)(1), [jshint](/man/jshint)(1)

# RESOURCES

```[Source code](https://github.com/eslint/eslint)```

```[Homepage](https://eslint.org/)```

```[Documentation](https://eslint.org/docs/latest/)```

<!-- verified: 2026-07-14 -->
