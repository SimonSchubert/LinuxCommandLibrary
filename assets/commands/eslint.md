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

**Initialize configuration**

```eslint --init```

**Lint with extensions**

```eslint --ext [.js,.jsx,.ts,.tsx] [src/]```

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

**--ext** _EXTENSIONS_
> File extensions to check.

**--init**
> Create configuration file.

**--cache**
> Cache results for faster runs.

**--quiet**
> Report errors only.

**--help**
> Display help information.

# DESCRIPTION

**ESLint** is the standard linting tool for JavaScript and TypeScript. It statically analyzes code to find problems, enforce coding standards, and catch bugs before runtime.

Rules are highly configurable through .eslintrc files. Plugins extend functionality for React, Vue, TypeScript, and other frameworks. The --fix flag automatically corrects many issues.

ESLint integrates with editors and CI systems, making it central to JavaScript development workflows.

# CONFIGURATION

**.eslintrc.js** / **.eslintrc.json** / **.eslintrc.yml**
> Main configuration files defining rules, parser options, plugins, and extends. Can be placed in project root or any parent directory.

**package.json**
> ESLint configuration can be embedded in the "eslintConfig" field.

**.eslintignore**
> Specifies files and directories to exclude from linting.

# CAVEATS

Configuration can be complex. Plugin compatibility varies. Flat config vs legacy config transition. Large codebases may be slow without caching.

# HISTORY

ESLint was created by **Nicholas C. Zakas** in **2013** as a more pluggable and configurable alternative to JSHint. It became the dominant JavaScript linter due to its extensibility.

# SEE ALSO

[prettier](/man/prettier)(1), [tsc](/man/tsc)(1), [jshint](/man/jshint)(1)
