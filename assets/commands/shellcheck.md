# TLDR

**Check a shell script**

```shellcheck [script.sh]```

**Check multiple scripts**

```shellcheck [script1.sh] [script2.sh]```

**Check with specific shell dialect**

```shellcheck --shell=[bash|sh|dash|ksh] [script.sh]```

**Output in different format** (JSON, GCC, etc.)

```shellcheck --format=[json|gcc|checkstyle] [script.sh]```

**Exclude specific warnings**

```shellcheck --exclude=[SC2034,SC2086] [script.sh]```

**Check script from stdin**

```cat [script.sh] | shellcheck -```

**Enable optional checks**

```shellcheck --enable=all [script.sh]```

# SYNOPSIS

**shellcheck** [_options_] [_script_...]

# PARAMETERS

**-s**, **--shell** _dialect_
> Specify shell dialect (sh, bash, dash, ksh)

**-f**, **--format** _format_
> Output format (tty, gcc, json, checkstyle, diff, quiet)

**-e**, **--exclude** _codes_
> Exclude specific error codes (comma-separated)

**-i**, **--include** _codes_
> Include only specific error codes

**--enable** _checks_
> Enable optional checks (all, require-variable-braces, etc.)

**-o**, **--enable**
> Enable specific optional checks

**-x**, **--external-sources**
> Follow and check sourced files

**-a**, **--check-sourced**
> Check sourced files for issues

**-S**, **--severity** _level_
> Minimum severity (error, warning, info, style)

**-V**, **--version**
> Display version

**--wiki-link-count** _n_
> Include wiki links for first n warnings

# DESCRIPTION

**shellcheck** is a static analysis tool for shell scripts. It detects bugs, syntax issues, and pitfalls in bash/sh/ksh/dash scripts, providing explanations and suggestions for fixes.

Each warning has a code (e.g., SC2086) linking to detailed wiki documentation explaining the issue, why it matters, and how to fix it. This makes shellcheck excellent for learning shell scripting best practices.

The tool catches common issues like unquoted variables, deprecated syntax, command substitution pitfalls, and potential security vulnerabilities. It distinguishes between different shell dialects and their specific features.

Integration is available for most editors (VS Code, Vim, Emacs, Sublime) and CI systems, enabling automated script checking.

# COMMON WARNINGS

**SC2086**: Double quote to prevent globbing and word splitting
**SC2034**: Variable appears unused
**SC2046**: Quote to prevent word splitting
**SC2006**: Use $(...) instead of backticks
**SC2035**: Use ./\* so patterns don't expand to options
**SC2164**: Use cd ... || exit in case cd fails

# CAVEATS

ShellCheck may produce false positives when variables are used indirectly or sourced from external files. Use **# shellcheck disable=SC####** comments to suppress specific warnings.

Some legitimate shell patterns trigger warnings. Review each warning before disabling; often the suggested fix is genuinely better.

The **--external-sources** option requires caution as it can execute arbitrary code when checking scripts that source files.

# SEE ALSO

[bash](/man/bash)(1), [sh](/man/sh)(1), [lint](/man/lint)(1)
