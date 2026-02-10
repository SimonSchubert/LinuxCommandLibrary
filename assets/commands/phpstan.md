# TAGLINE

performs static analysis on PHP code, finding bugs without running the code

# TLDR

**Analyze source directory**

```phpstan analyse [src/]```

**Analyze with specific level**

```phpstan analyse --level [5] [src/]```

**Analyze using config file**

```phpstan analyse -c [phpstan.neon]```

**Analyze with max level**

```phpstan analyse --level max [src/]```

**Generate baseline**

```phpstan analyse --generate-baseline```

**Clear cache**

```phpstan clear-result-cache```

**Show version**

```phpstan --version```

# SYNOPSIS

**phpstan** [_analyse_] [_--level n_] [_-c config_] [_options_] [_paths_]

# PARAMETERS

**analyse**, **analyze**
> Run analysis.

**--level**, **-l** _N_
> Rule level (0-9 or max).

**-c** _FILE_
> Configuration file.

**--configuration** _FILE_
> Configuration file (long form).

**--memory-limit** _SIZE_
> Memory limit.

**--debug**
> Debug mode.

**--generate-baseline**
> Generate error baseline.

**-b** _FILE_
> Baseline file.

**--error-format** _FMT_
> Output format (table, json, raw, etc.).

**--no-progress**
> Disable progress bar.

**clear-result-cache**
> Clear analysis cache.

# DESCRIPTION

**phpstan** performs static analysis on PHP code, finding bugs without running the code. It catches type errors, undefined methods, and incorrect function calls.

Analysis levels range from 0 (basic) to 9 (strictest). Higher levels check more conditions but may find more false positives in legacy code. Start low and increase gradually.

Configuration files (phpstan.neon) define paths, excludes, and custom rules. They enable consistent analysis across team members and CI pipelines.

Baseline files ignore existing errors, enabling gradual adoption. New code must pass analysis while legacy issues can be fixed over time.

The tool integrates with IDEs through plugins, showing errors as you type. CI integration catches regressions before merge.

PHPStan supports PHPDoc annotations for type hints in older code. Modern PHP type declarations are preferred when possible.

# CAVEATS

High levels may be impractical for legacy code. Some dynamic PHP patterns can't be analyzed. Extensions needed for frameworks. Memory usage scales with codebase size.

# HISTORY

**PHPStan** was created by **Ondřej Mirtes** in **2016** to bring static typing benefits to PHP. It became one of the most popular PHP static analysis tools, competing with Psalm and Phan.

# SEE ALSO

[psalm](/man/psalm)(1), [php](/man/php)(1), [composer](/man/composer)(1), [phpcs](/man/phpcs)(1)
