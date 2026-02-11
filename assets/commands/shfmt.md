# TAGLINE

Format and lint shell scripts

# TLDR

**Format shell script**

```shfmt [script.sh]```

**Format and overwrite**

```shfmt -w [script.sh]```

**Check if formatted** (exit non-zero if not)

```shfmt -d [script.sh]```

**Use 4-space indent**

```shfmt -i [4] [script.sh]```

**Use tabs for indent**

```shfmt -i [0] [script.sh]```

**Format all scripts in directory**

```shfmt -w [directory/]```

**Format as bash** (not POSIX)

```shfmt -ln bash [script.sh]```

**Binary operator at line start**

```shfmt -bn [script.sh]```

# SYNOPSIS

**shfmt** [_-w_] [_-d_] [_-i indent_] [_-ln language_] [_options_] [_files_]

# PARAMETERS

**-w**, **--write**
> Write result to file instead of stdout.

**-d**, **--diff**
> Show diff and exit with error if not formatted.

**-l**, **--list**
> List files that differ from formatted.

**-i** _N_, **--indent** _N_
> Indent spaces (0 for tabs).

**-ln** _LANG_, **--language-dialect** _LANG_
> Shell variant: bash, posix, mksh, bats.

**-bn**, **--binary-next-line**
> Binary operators start new lines.

**-ci**, **--case-indent**
> Indent case statement bodies.

**-sr**, **--redirect-operators**
> Redirect operators follow next line.

**-fn**, **--func-next-line**
> Function brace on next line.

**-kp**, **--keep-padding**
> Keep column alignment padding.

**-s**, **--simplify**
> Simplify code.

**-mn**, **--minify**
> Minify output.

**-f**, **--find**
> Find shell files recursively.

**--apply-ignore**
> Apply .shfmtignore files.

# DESCRIPTION

**shfmt** formats shell scripts. It parses and rewrites scripts with consistent styling, similar to gofmt for Go or prettier for JavaScript.

The tool understands multiple shell dialects: POSIX sh, bash, mksh, and bats. Detection is automatic from shebang or can be specified explicitly. Different dialects support different syntax.

Indent options control spacing: -i 2 for two spaces, -i 4 for four, -i 0 for tabs. Consistent indentation is the most impactful formatting change.

Write mode (-w) modifies files in place. Diff mode (-d) checks formatting without changing, useful in CI to enforce style. The exit code indicates whether formatting was needed.

The simplify option (-s) removes unnecessary syntax: unneeded quotes, redundant semicolons, POSIX-compatible alternatives. This produces cleaner, more portable code.

Minify mode (-mn) removes all non-essential whitespace, useful for embedded scripts or size-constrained environments.

# CAVEATS

May change script behavior in edge cases. Some heredoc formatting can be tricky. Not all style preferences are configurable. Parser may reject valid but unusual syntax. Backup files before mass formatting.

# HISTORY

**shfmt** was created by **Daniel Martí** (mvdan) around **2016**. Written in Go, it was inspired by gofmt's approach to code formatting. The project fills a gap - while other languages have standard formatters, shell scripts traditionally lacked one. It's widely adopted in CI pipelines and editor integrations.

# SEE ALSO

[shellcheck](/man/shellcheck)(1), [bash](/man/bash)(1), [sh](/man/sh)(1), [prettier](/man/prettier)(1)
