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
> Include pattern.

**--exclude** _PATTERN_
> Exclude pattern.

**-**
> Read from stdin.

# DESCRIPTION

**snakefmt** formats Snakemake workflow files. It enforces consistent style.

Snakefiles use Python syntax with extensions. The formatter handles both.

Check mode verifies formatting. Non-zero exit if changes needed.

Diff mode shows what would change. Preview before modifying.

Line length controls wrapping. Default is 88 (Black-style).

# CAVEATS

Snakemake-specific. May need adjustment for complex rules. Black-based formatting style.

# HISTORY

**snakefmt** was created for the **Snakemake** workflow management system. It brings consistent formatting to bioinformatics pipelines.

# SEE ALSO

[snakemake](/man/snakemake)(1), [black](/man/black)(1), [python](/man/python)(1)
