# TAGLINE

Opinionated code formatter for Snakemake workflow files

# TLDR

**Format Snakefile**

```snakefmt [Snakefile]```

**Check formatting**

```snakefmt --check [Snakefile]```

**Format directory**

```snakefmt [workflow/]```

**Show diff**

```snakefmt --diff [Snakefile]```

**Set line length**

```snakefmt -l [100] [Snakefile]```

**Format stdin**

```cat [Snakefile] | snakefmt -```

**Verbose output**

```snakefmt -v [Snakefile]```

# SYNOPSIS

**snakefmt** [_--check_] [_--diff_] [_-l length_] [_options_] _files_

# PARAMETERS

**--check**
> Check only, no changes.

**--diff**
> Show changes.

**-l**, **--line-length** _N_
> Max line length.

**-v**, **--verbose**
> Verbose output.

**--include** _PATTERN_
> Regular expression for files to include when formatting directories.

**--exclude** _PATTERN_
> Regular expression for files to exclude when formatting directories.

**--config** _FILE_
> Read configuration from a pyproject.toml or .editorconfig file.

**-**
> Read from stdin.

# DESCRIPTION

**snakefmt** is an opinionated code formatter for Snakemake workflow files. It enforces a consistent style across Snakefiles and associated rules files, handling both standard Python syntax and Snakemake-specific extensions like **rule**, **checkpoint**, and **module** blocks.

The formatter is built on top of Python's **black** formatter, using the same default line length of 88 characters and similar formatting philosophy. It understands Snakemake's domain-specific syntax, correctly formatting rule parameters like **input**, **output**, **params**, and **shell** while preserving semantic meaning.

Check mode (**--check**) verifies formatting without modifying files, returning a non-zero exit code if changes are needed, which is useful for CI pipelines. Diff mode (**--diff**) previews the exact changes that would be made before committing to them.

# CAVEATS

Snakemake-specific and not suitable for general Python files. Uses the same default line length (88) as black. Configuration can be set in pyproject.toml. May not handle all custom Snakemake wrappers or heavily templated rules gracefully.

# HISTORY

**snakefmt** was created for the **Snakemake** workflow management system. It brings consistent formatting to bioinformatics pipelines.

# SEE ALSO

[snakemake](/man/snakemake)(1), [black](/man/black)(1), [python](/man/python)(1), [ruff](/man/ruff)(1), [yapf](/man/yapf)(1)
