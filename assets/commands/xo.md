# TAGLINE

Opinionated JavaScript and TypeScript linter

# TLDR

**Lint the project**

```xo```

**Lint specific files**

```xo [file.js] [src/**/*.ts]```

**Fix issues**

```xo --fix```

**Specify space indent**

```xo --space```

**Print the effective ESLint config for a file**

```xo --print-config=[file.js]```

**Show only errors**

```xo --quiet```

**Lint and fix code from stdin**

```echo '[const x=true]' | xo --stdin --fix```

# SYNOPSIS

**xo** [_options_] [_file_|_glob_ ...]

# PARAMETERS

**--fix**
> Auto-fix issues.

**--fix-dry-run**
> Fix issues without saving the changes to the file system.

**--space** [_n_]
> Use space indent instead of tabs (default width: 2).

**--semicolon**
> Require semicolons (default: true).

**--prettier**
> Format with Prettier, or turn off Prettier-conflicting rules when set to **compat**.

**--print-config**=_file_
> Print the effective ESLint config for the given file.

**--reporter** _name_
> Reporter to use.

**--config** _path_
> Path to an XO configuration file.

**--open**
> Open files with issues in your editor.

**--quiet**
> Show only errors and no warnings.

**--max-warnings** _n_
> Number of warnings that triggers a nonzero exit code (default: -1).

**--stdin**
> Validate or fix code from stdin.

**--stdin-filename** _name_
> Filename to assume for **--stdin**.

**--ignore** _glob_
> Ignore pattern; can be set multiple times.

**--suppressions-location** _path_
> Path to a custom ESLint suppressions file.

**--cwd**=_dir_
> Working directory for files.

**--version**
> Print XO version.

# CONFIGURATION

**xo.config.js**, **xo.config.ts**
> Project configuration in ESLint flat config style. An **xo** field in **package.json** also works.

# DESCRIPTION

**xo** is an opinionated JavaScript and TypeScript linter built on top of ESLint. It provides a zero-configuration linting experience with a curated set of strict rules designed to enforce consistent, high-quality code without requiring manual ESLint setup.

The tool includes built-in TypeScript support and optional Prettier integration for combined linting and formatting. The **--fix** option automatically corrects fixable issues, while **--space** switches from the default tab indentation to spaces. By defaulting to strict, well-chosen rules, xo eliminates the need for teams to debate and configure linting rules individually.

Without file arguments it lints JS/TS, HTML, Markdown, JSON and CSS files, skipping commonly ignored paths.

# CAVEATS

The project must be ESM. XO must be installed locally (**npm install xo --save-dev**) and can then be run with **npx xo**. Current releases require Node.js 22 or higher.

# HISTORY

**xo** was created by **Sindre Sorhus** as an opinionated ESLint wrapper with sensible defaults.

# SEE ALSO

[eslint](/man/eslint)(1), [standard](/man/standard)(1), [prettier](/man/prettier)(1)

# RESOURCES

```[Source code](https://github.com/xojs/xo)```

<!-- verified: 2026-11-09 -->
