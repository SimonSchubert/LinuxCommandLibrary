# TAGLINE

checks PHP files for syntax errors in parallel

# TLDR

**Lint PHP files in a directory**

```parallel-lint [src/]```

**Lint with exclusions**

```parallel-lint --exclude [vendor] [.]```

**Lint with a specific PHP executable**

```parallel-lint -p [/usr/bin/php8.1] [src/]```

**Lint with git blame for errors**

```parallel-lint --blame [src/]```

**Output results as JSON**

```parallel-lint --json [src/]```

# SYNOPSIS

**parallel-lint** [_options_] _paths_...

# PARAMETERS

**--exclude** _path_
> Exclude a file or directory from checking. Use multiple times to exclude several paths.

**-p** _php_
> Specify PHP executable to run (default: php).

**-s**, **--short**
> Set short_open_tag to On (default: Off).

**-e** _ext_
> Check only files with selected extensions separated by comma (default: php,php3,php4,php5,phtml,phpt).

**-j** _num_
> Number of parallel jobs (default: 10).

**--blame**
> Try to show git blame for the line with error.

**--git** _git_
> Path to Git executable for blame messages (default: git).

**--colors**
> Enable colored console output.

**--no-colors**
> Disable colored console output.

**--no-progress**
> Disable progress output.

**--checkstyle**
> Output results as Checkstyle XML.

**--json**
> Output results as JSON string.

**--show-deprecated**
> Show PHP deprecation warnings.

**-h**, **--help**
> Print help.

**-V**, **--version**
> Display the application version.

# DESCRIPTION

**parallel-lint** checks PHP files for syntax errors in parallel. It provides fast syntax checking across multiple files and directories. It does not check code style, only syntax validity. By default it runs 10 parallel jobs and checks common PHP file extensions.

# SEE ALSO

[php](/man/php)(1), [phpcs](/man/phpcs)(1)

