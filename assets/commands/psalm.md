# TLDR

**Analyze project**

```psalm```

**Analyze with specific level**

```psalm --level=[5]```

**Analyze specific file**

```psalm [src/File.php]```

**Initialize configuration**

```psalm --init```

**Generate baseline**

```psalm --set-baseline=[baseline.xml]```

**Show info-level issues**

```psalm --show-info=true```

**Output as JSON**

```psalm --output-format=json```

**Fix issues automatically**

```psalm --alter --issues=[MissingReturnType]```

# SYNOPSIS

**psalm** [_--level n_] [_--set-baseline file_] [_--config file_] [_options_] [_paths_]

# PARAMETERS

**--level** _N_
> Error level (1-8).

**--config**, **-c** _FILE_
> Configuration file.

**--init**
> Initialize psalm.xml.

**--set-baseline** _FILE_
> Generate baseline file.

**--use-baseline** _FILE_
> Use baseline file.

**--ignore-baseline**
> Ignore baseline.

**--show-info**
> Show info-level issues.

**--output-format** _FMT_
> Output format (console, json, xml, etc.).

**--alter**
> Modify files to fix issues.

**--issues** _LIST_
> Issues to fix with --alter.

**--threads** _N_
> Parallel analysis threads.

**--memory-limit** _SIZE_
> Memory limit.

**--clear-cache**
> Clear cache.

# DESCRIPTION

**psalm** is a static analysis tool for PHP that finds bugs and enforces type safety. It understands PHP type hints and PHPDoc annotations.

Error levels range from 1 (strictest) to 8 (most permissive). Higher levels allow more potential issues, suitable for legacy codebases.

Configuration in psalm.xml defines analysis scope, excluded files, and issue severity. Project-specific settings enable gradual adoption.

Baselines record existing issues to ignore. New code must pass analysis while legacy problems can be addressed over time.

The alter mode automatically fixes certain issues like adding return types or parameter types. This accelerates migration to stricter typing.

Psalm understands complex PHP patterns including generics, union types, and template types through PHPDoc syntax.

# CAVEATS

Strict levels may be impractical for legacy code. Some PHP patterns are difficult to analyze. Memory usage scales with project size.

# HISTORY

**Psalm** was created by **Matthew Brown** at **Vimeo** around **2016**. It brought advanced static analysis to PHP, supporting features like generics before PHP had native support.

# SEE ALSO

[phpstan](/man/phpstan)(1), [php](/man/php)(1), [composer](/man/composer)(1), [phpcs](/man/phpcs)(1)
