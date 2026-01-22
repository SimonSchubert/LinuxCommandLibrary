# TLDR

**Analyze PHP project**

```phan```

**Analyze specific directory**

```phan --directory [src/]```

**Generate baseline**

```phan --save-baseline [.phan/baseline.php]```

**Use baseline**

```phan --load-baseline [.phan/baseline.php]```

**Output format**

```phan --output-mode [json]```

# SYNOPSIS

**phan** [_options_]

# PARAMETERS

**--directory** _DIR_
> Directory to analyze.

**--config-file** _FILE_
> Configuration file.

**--save-baseline** _FILE_
> Save baseline.

**--load-baseline** _FILE_
> Load baseline.

**--output-mode** _FORMAT_
> Output format.

**--help**
> Display help.

# DESCRIPTION

**phan** is a PHP static analyzer. Finds bugs through type checking.

The tool performs deep analysis. Supports PHP 7/8 features.

phan analyzes PHP code.

# CAVEATS

Requires PHP with AST extension. Configuration recommended.

# HISTORY

Phan was created for **advanced PHP static analysis** with type inference.

# SEE ALSO

[phpstan](/man/phpstan)(1), [psalm](/man/psalm)(1), [php](/man/php)(1)

