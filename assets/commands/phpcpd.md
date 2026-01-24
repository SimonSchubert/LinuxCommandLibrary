# TLDR

**Find duplicate code**

```phpcpd [src/]```

**Set minimum lines**

```phpcpd --min-lines [10] [src/]```

**Set minimum tokens**

```phpcpd --min-tokens [50] [src/]```

**Exclude directory**

```phpcpd --exclude [vendor] [src/]```

**Output to file**

```phpcpd --log-pmd [report.xml] [src/]```

**Check multiple directories**

```phpcpd [src/] [lib/]```

**Fuzzy matching**

```phpcpd --fuzzy [src/]```

# SYNOPSIS

**phpcpd** [_--min-lines n_] [_--min-tokens n_] [_--exclude dir_] [_options_] _directories_

# PARAMETERS

**--min-lines** _N_
> Minimum lines for duplication.

**--min-tokens** _N_
> Minimum tokens for duplication.

**--exclude** _DIR_
> Exclude directory.

**--log-pmd** _FILE_
> PMD-CPD XML format.

**--fuzzy**
> Fuzzy matching.

**--suffix** _EXT_
> File suffix to check.

**-v**, **--verbose**
> Verbose output.

**--help**
> Show help.

# DESCRIPTION

**phpcpd** (PHP Copy/Paste Detector) finds duplicate code in PHP projects. It identifies code that should be refactored.

Token-based analysis finds similar code blocks. Renaming variables doesn't hide duplications.

Thresholds control sensitivity. Higher minimums find larger, more significant duplications.

Fuzzy matching finds near-duplicates. Code with minor differences is also detected.

Reports show file locations and duplicated content. Integration with CI tools enables automated checks.

# CAVEATS

Similar but intentionally different code may be flagged. Very large codebases may be slow. Maintained as archived project.

# HISTORY

**phpcpd** was created by **Sebastian Bergmann** as part of the PHP QA toolset. It helps maintain code quality by detecting copy-pasted code blocks.

# SEE ALSO

[phpcs](/man/phpcs)(1), [phpmd](/man/phpmd)(1), [phpstan](/man/phpstan)(1)
