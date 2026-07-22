# TAGLINE

JavaScript code quality tool

# TLDR

**Lint JavaScript file**

```jshint [file.js]```

**Lint multiple files**

```jshint [file1.js] [file2.js]```

**Use config file**

```jshint --config [.jshintrc] [file.js]```

**Check all JS files**

```jshint [src/]```

**Verbose output**

```jshint --verbose [file.js]```

**Show non-error data**

```jshint --show-non-errors [file.js]```

**Exclude paths**

```jshint --exclude [node_modules/,vendor/] [src/]```

**Use a custom reporter**

```jshint --reporter [checkstyle] [src/]```

# SYNOPSIS

**jshint** [_options_] _file_...

# PARAMETERS

_FILE_
> JavaScript files to lint.

**--config** _FILE_
> Path to the configuration file (default: .jshintrc lookup from the file's directory upward).

**--verbose**
> Include warning/error code (e.g. W117) in the output.

**--reporter** _NAME_
> Use a custom reporter: jslint, checkstyle, unix, or a path to a reporter module.

**--extract** _MODE_
> Extract JavaScript from HTML before linting: auto, always, never (default never).

**--extra-ext** _LIST_
> Comma-separated list of additional file extensions to lint (default .js).

**--exclude** _PATHS_
> Comma-separated list of directories or files to skip.

**--exclude-path** _FILE_
> Use a file in .gitignore syntax (e.g. .jshintignore) to skip paths.

**--prereq** _FILES_
> Files included before each linted file to provide globals.

**--filename** _NAME_
> Treat stdin input as having this filename when matching configuration.

**--show-non-errors**
> Show additional analysis data (functions, globals).

**--version**
> Print the installed version.

**--help**
> Display help information.

# DESCRIPTION

**JSHint** is a JavaScript static analysis tool that detects errors and potential problems in code. It is configurable through a **.jshintrc** JSON file (or a **jshintConfig** field in package.json), allowing teams to enforce a chosen coding style.

The CLI accepts files, directories, or stdin (use **-** as the filename). When given a directory, JSHint recursively lints every file with an extension matching **--extra-ext** (.js by default). Ignored paths can be listed in **.jshintignore**.

# CAVEATS

Requires Node.js. JSHint development has slowed; **ESLint** is generally preferred for new projects, especially when using modern ECMAScript or TypeScript. JSHint does not understand JSX or TypeScript natively.

# HISTORY

JSHint was forked from **JSLint** by **Anton Kovalyov** in 2011 to provide a more configurable JavaScript linter.

# INSTALL

```nix: nix profile install nixpkgs#jshint```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[eslint](/man/eslint)(1), [prettier](/man/prettier)(1), [tslint](/man/tslint)(1), [node](/man/node)(1)
