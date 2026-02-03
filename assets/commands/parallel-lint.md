# TLDR

**Lint PHP files**

```parallel-lint [src/]```

**Lint with exclusions**

```parallel-lint --exclude [vendor] [.]```

**Lint with specific PHP version**

```parallel-lint --php [/usr/bin/php8.1] [src/]```

**Lint with blame output**

```parallel-lint --blame [src/]```

# SYNOPSIS

**parallel-lint** [_options_] _paths_...

# PARAMETERS

**--exclude** _path_
> Exclude path from checking.

**--php** _binary_
> PHP binary to use.

**-j** _num_
> Number of parallel jobs.

**--blame**
> Show git blame for errors.

**--colors**
> Force colored output.

**-e** _ext_
> File extensions to check.

# DESCRIPTION

**parallel-lint** checks PHP files for syntax errors in parallel. Fast syntax checking across multiple files and directories. Does not check code style, only syntax validity.

# SEE ALSO

[php](/man/php)(1), [phpcs](/man/phpcs)(1)

