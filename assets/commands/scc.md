# TAGLINE

Fast source code line counter

# TLDR

**Count lines in current directory**

```scc```

**Count specific directory**

```scc [path/to/dir]```

**Count specific language**

```scc --include-ext [py]```

**Exclude directories**

```scc --exclude-dir [vendor,node_modules]```

**Sort by lines**

```scc --sort lines```

**Output as JSON**

```scc --format json```

**Show complexity estimates**

```scc -w```

**Show by file**

```scc --by-file```

# SYNOPSIS

**scc** [_--include-ext ext_] [_--exclude-dir dirs_] [_--format fmt_] [_options_] [_paths_]

# PARAMETERS

**--include-ext** _EXT_
> Include only extensions.

**--exclude-dir** _DIRS_
> Exclude directories.

**--sort** _FIELD_
> Sort by field (files, lines, blanks, code, comments).

**--format** _FMT_
> Output format (default, json, csv, html, etc.).

**-w**, **--wide**
> Show complexity and weighted lines.

**--by-file**
> Show per-file breakdown.

**--no-duplicates**
> Ignore duplicate files.

**--no-gen**
> Ignore generated files.

**--no-min**
> Ignore minified files.

**--cocomo**
> Show COCOMO estimates.

**-f** _PATTERN_
> Match filenames.

**-M** _SIZE_
> Max file size.

# DESCRIPTION

**scc** (Succinct Code Counter) counts lines of code in many languages. It's extremely fast, using parallelism and optimized parsing.

Output shows files, lines, blanks, comments, and code per language. Wide mode adds complexity estimates based on branching.

Language detection uses file extensions and content inspection. Hundreds of languages are recognized, from common to obscure.

Generated and minified file detection prevents counting boilerplate. Duplicates can be ignored to avoid counting vendored code multiple times.

COCOMO estimation provides rough effort metrics. These are theoretical but useful for comparisons.

Output formats support integration with other tools. JSON and CSV enable processing by scripts and dashboards.

# CAVEATS

Complexity estimates are heuristic. Language detection may misidentify some files. Very large codebases may need memory.

# HISTORY

**scc** was created by **Ben Boyter** around **2018** as a faster alternative to cloc and other line counters. Written in Go, it emphasizes speed through parallelism and efficient algorithms.

# SEE ALSO

[cloc](/man/cloc)(1), [tokei](/man/tokei)(1), [loc](/man/loc)(1), [wc](/man/wc)(1)
