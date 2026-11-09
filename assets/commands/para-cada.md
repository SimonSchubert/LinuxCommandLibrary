# TAGLINE

Run a command for each file matched by glob expressions

# TLDR

**Run a command for each matching file**

```cada '[command] [*.txt]'```

**Preview commands** without executing (dry run)

```cada '[tar xzvf *.tgz]' -d```

**Copy each file**, reusing the matched name

```cada 'cp [*.txt] {p0}.bkp'```

**Rename** files using a Python expression

```cada 'mv [*.txt] {e}' 's.upper()'```

**Filter** files with a Python expression

```cada 'tar czvf {x.stem}.tgz [*]' -f 'len(p.stem) <= 6'```

Run **concurrently**, with automatic job count

```cada '[command] [*.txt]' -j0```

Number files, **sorted** by creation time

```cada 'mv [*.txt] {i}_{}' -k 'x.ctime' -s simple```

# SYNOPSIS

**cada** [_options_] _command_expr_ [_eval_expr_...]

# PARAMETERS

**-H**, **--include-hidden**
> Include files that start with a period.

**-f**, **--filter** _expr_
> Python expression that determines which files to skip. Can be repeated.

**-s**, **--sort-alg** _alg_
> Execution order: none, simple, natural or natural-ignore-case (default).

**-k**, **--sort-key** _expr_
> Key expression used for sorting.

**-r**, **--reverse**
> Reverse execution order.

**-i**, **--import** _symbol_
> Import an extra symbol for use in eval expressions. Can be repeated.

**-d**, **--dry-run**
> Do not execute commands, only show what would be executed.

**-x**, **--stop-at-error**
> Stop at the first command that returns a non-zero code.

**-j**, **--jobs** _n_
> Number of concurrent jobs. 0 means auto.

**-q**, **--quiet**
> Print only stdout and stderr of the executed commands.

**--color** _when_
> When to use terminal colors: always, auto (default) or never.

**-V**, **--version**
> Show version information.

**-h**, **--help**
> Display help information.

# DESCRIPTION

**para-cada** ("for each" in Spanish) installs the **cada** command, which executes a command for each file selected by the glob expressions inside it. With several glob expressions, it runs the command for each item of their product.

Commands can reference matched values with **{p0}** (Path), **{s0}** (string) and **{x0}** (extended path with attributes like **stem**, **size** and **owner**), where **p**, **s** and **x** are aliases for the first expression. **{i}** is the ordinal number of the command. Eval expressions add values computed with Python, available as **{e0}**, **{e1}** and so on. **{}** stands for **{e0}**, or **{s0}** if there are no eval expressions.

Extra symbols and plugins can be defined in **~/.cada/startup.py**.

# CAVEATS

Requires Python 3.8 or later. Quote the whole command expression so that the shell does not expand the globs. Commands run through **sh**. The **i.qual** counter is not available in concurrent mode.

# HISTORY

**para-cada** was created by **gergelyk** and is written in **Python**. Available via PyPI with **pip install para-cada**.

# SEE ALSO

[find](/man/find)(1), [xargs](/man/xargs)(1), [fd](/man/fd)(1), [parallel](/man/parallel)(1)

# RESOURCES

```[Source code](https://github.com/gergelyk/para-cada)```

```[Documentation](https://gergelyk.github.io/para-cada/)```

<!-- verified: 2026-11-09 -->
