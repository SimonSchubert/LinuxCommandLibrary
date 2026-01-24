# TLDR

**Start interactive**

```swipl```

**Load file**

```swipl [program.pl]```

**Run goal and exit**

```swipl -g "[goal]" -t halt [program.pl]```

**Query from command line**

```swipl -g "[member(X,[1,2,3]),writeln(X)]" -t halt```

**Compile to standalone**

```swipl -o [output] -c [program.pl]```

# SYNOPSIS

**swipl** [_-g goal_] [_-t goal_] [_-o output_] [_options_] [_files_]

# PARAMETERS

**-g** _GOAL_
> Initial goal.

**-t** _GOAL_
> Top-level goal.

**-o** _FILE_
> Output executable.

**-c** _FILES_
> Compile files.

**-s** _FILE_
> Load script.

**--quiet**
> Suppress banner.

# DESCRIPTION

**swipl** runs SWI-Prolog. It's a Prolog interpreter.

Interactive REPL. Query facts and rules.

Comprehensive library. Built-in predicates.

Constraint solving. CLP support.

Web frameworks. HTTP server.

# CAVEATS

Prolog syntax unique. Logic programming paradigm. Learning curve.

# HISTORY

**SWI-Prolog** was started by **Jan Wielemaker** in 1987. It's one of the most widely used Prolog implementations.

# SEE ALSO

[gprolog](/man/gprolog)(1), [sicstus](/man/sicstus)(1), [yap](/man/yap)(1)
