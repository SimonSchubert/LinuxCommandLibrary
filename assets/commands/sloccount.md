# TLDR

**Count lines in directory**

```sloccount [src/]```

**Count with details**

```sloccount --details [src/]```

**Duplicate file handling**

```sloccount --duplicates [src/]```

**Wide output format**

```sloccount --wide [src/]```

**Add effort estimates**

```sloccount --effort [1.0] [2.5] [src/]```

# SYNOPSIS

**sloccount** [_options_] _directories_...

# DESCRIPTION

**sloccount** counts physical source lines of code (SLOC) in software projects. It recognizes many programming languages and provides effort and cost estimates using the COCOMO model.

The tool helps measure project size, estimate development effort, and track codebase growth.

# PARAMETERS

**--details**
> Show per-file details.

**--duplicates**
> Count duplicate files.

**--crossdups**
> Count cross-directory duplicates.

**--wide**
> Wide output format.

**--effort** _a_ _b_
> COCOMO effort parameters.

**--schedule** _a_ _b_
> COCOMO schedule parameters.

**--personcost** _cost_
> Annual person cost.

**--overhead** _rate_
> Overhead rate.

**--datadir** _dir_
> Data directory.

**--addlang** _lang_
> Add language.

# CAVEATS

COCOMO estimates are rough approximations. Language detection may miss some. Large projects slow to analyze. Generated code may skew counts.

# HISTORY

**SLOCCount** was created by **David A. Wheeler** to accurately count source lines. It applies software economics models to estimate development effort, helping with project planning and comparisons.

# SEE ALSO

[cloc](/man/cloc)(1), [tokei](/man/tokei)(1), [wc](/man/wc)(1), [find](/man/find)(1)
