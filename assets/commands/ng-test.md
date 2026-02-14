# TAGLINE

Runs unit tests for an Angular project

# TLDR

**Run unit tests**

```ng test```

**Run tests for a specific project**

```ng test [project-name]```

**Run tests without watching** for changes

```ng test --no-watch```

**Run tests with code coverage**

```ng test --code-coverage```

**Run tests in a specific browser**

```ng test --browsers [ChromeHeadless]```

**Run a single test run** and exit

```ng test --watch=false```

# SYNOPSIS

**ng test** [_project_] [_options_]

# PARAMETERS

_project_
> The project to run unit tests for. Defaults to the default project.

**--code-coverage**
> Generate a code coverage report in the coverage/ directory.

**--watch**
> Re-run tests when files change (default: true).

**--browsers** _browsers_
> Override browsers to launch for testing (e.g., ChromeHeadless).

**--configuration** _name_
> Target build configuration.

**--karma-config** _path_
> Path to Karma configuration file.

**--include** _glob_
> Glob pattern of files to include in testing.

**--help**
> Display help information.

# DESCRIPTION

**ng test** compiles the application and runs unit tests using the configured test runner. By default, Angular CLI uses **Karma** as the test runner with **Jasmine** as the testing framework. Tests run in a browser and re-execute automatically when source files change.

The command watches for file changes by default, providing a continuous testing workflow during development.

# CAVEATS

Requires a test runner to be configured. Karma is the default but alternatives like Jest can be configured. Browser-based testing requires a browser to be installed. Headless mode is recommended for CI environments. Part of Angular CLI.

# HISTORY

**ng test** has been part of Angular CLI since its initial release, using **Karma** and **Jasmine** as the default testing stack. Support for alternative test runners like **Jest** and **Web Test Runner** has been explored in later Angular versions.

# SEE ALSO

[ng](/man/ng)(1), [ng-e2e](/man/ng-e2e)(1), [karma](/man/karma)(1), [jest](/man/jest)(1)
