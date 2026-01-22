# TLDR

**Check for issues**

```phpmd [src/] text [cleancode,codesize]```

**Generate HTML report**

```phpmd [src/] html [rulesets] --reportfile [report.html]```

**Use ruleset file**

```phpmd [src/] text [phpmd.xml]```

**Exclude directory**

```phpmd [src/] text [rulesets] --exclude [vendor]```

# SYNOPSIS

**phpmd** _source_ _format_ _rulesets_ [_options_]

# PARAMETERS

_SOURCE_
> Source files or directory.

_FORMAT_
> Output format (text, xml, html).

_RULESETS_
> Rules to apply.

**--reportfile** _FILE_
> Output file.

**--exclude** _PATTERN_
> Exclude pattern.

**--help**
> Display help.

# DESCRIPTION

**phpmd** is PHP Mess Detector. Finds potential problems in code.

The tool detects code smells. Complexity and design issues.

phpmd finds PHP problems.

# CAVEATS

Configurable rules. Can produce false positives.

# HISTORY

PHPMD was created for **detecting PHP code issues** and maintainability problems.

# SEE ALSO

[phpcs](/man/phpcs)(1), [phan](/man/phan)(1), [phpstan](/man/phpstan)(1)

