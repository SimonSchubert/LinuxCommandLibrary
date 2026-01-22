# TLDR

**Start an interactive rc shell**

```rc```

**Execute a script**

```rc [script.rc]```

**Execute a command string**

```rc -c '[command]'```

**Start rc without reading profile**

```rc -n```

**Start a login shell**

```rc -l```

# SYNOPSIS

**rc** [**-einvxl**] [**-c** _command_] [_file_ [_arguments_]]

# PARAMETERS

**-c** _command_
> Execute the given command string and exit

**-e**
> Exit if any command returns non-zero status

**-i**
> Run interactively (read commands from terminal)

**-l**
> Behave as a login shell (read profile)

**-n**
> Do not read the personal profile ($home/lib/profile)

**-v**
> Echo input to standard error as it is read

**-x**
> Print commands and arguments as they are executed

# DESCRIPTION

**rc** is the Plan 9 command interpreter, offering a cleaner alternative to the Bourne shell. Originally designed for Plan 9 from Bell Labs, it has been ported to Unix systems and provides a simpler, more consistent syntax.

Unlike the Bourne shell's string variables, rc provides list-valued variables (arrays of strings) as a fundamental type. This eliminates many quoting problems and makes argument handling more natural.

Rc uses C-like syntax for control structures: **if**, **while**, **for**, **switch**, and **fn** for function definitions. The syntax is defined by a formal grammar (implemented with yacc), making it unambiguous and predictable.

Pipes, redirections, and command substitution work similarly to other shells. Background execution uses **&**, and command grouping uses **{}** instead of subshells.

# SYNTAX DIFFERENCES FROM BOURNE SHELL

**Variables**: `var=value` becomes `var=value` (same), but `$var` expands to a list
**Lists**: `list=(a b c)` defines a list, accessed as `$list(1)`, `$list(2)`, etc.
**Functions**: `fn name { commands }` instead of `name() { commands }`
**If/else**: `if(test) cmd` and `if not cmd` or `else cmd`
**For loop**: `for(i in list) cmd`
**Quoting**: Single quotes only, doubled to include literal quote: `'it''s'`

# CAVEATS

Rc is not POSIX-compatible. Scripts written for bash or sh will not run correctly in rc without modification.

The Unix ports (Rakitzis implementation and Plan 9 from User Space) have slight differences from the original Plan 9 rc, particularly in profile locations and some features.

Limited availability in default package repositories. May require building from source or installing Plan 9 ports.

# HISTORY

Rc was created by **Tom Duff** at Bell Labs in **1989** for the Research Unix Version 10 and later became the standard shell for Plan 9. The name stands for "run commands." Byron Rakitzis created a popular Unix reimplementation in **1991**, which continues to be maintained. Duff is also known for "Duff's device," an optimization technique in C.

# SEE ALSO

[sh](/man/sh)(1), [bash](/man/bash)(1), [zsh](/man/zsh)(1), [es](/man/es)(1)
