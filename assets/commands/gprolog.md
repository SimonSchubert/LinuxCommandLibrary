# TAGLINE

GNU Prolog compiler and interpreter

# TLDR

**Start GNU Prolog interpreter**

```gprolog```

**Load and run file**

```gprolog --consult-file [program.pl]```

**Compile to executable**

```gplc [program.pl] -o [program]```

**Run query from command line**

```gprolog --query-goal "[goal]"```

# SYNOPSIS

**gprolog** [_options_]

**gplc** [_options_] _files_

# PARAMETERS

**--consult-file** _file_
> Load Prolog file at startup.

**--query-goal** _goal_
> Execute goal after loading.

**--init-goal** _goal_
> Execute initialization goal.

**--entry-goal** _goal_
> Entry point goal.

**--no-top-level**
> Exit after executing goals.

# DESCRIPTION

**GNU Prolog** is a Prolog compiler with constraint solving over finite domains. It compiles Prolog to native code and provides an interactive interpreter.

GNU Prolog supports ISO Prolog with extensions for constraint logic programming, making it suitable for combinatorial problems, scheduling, and AI applications.

# INTERPRETER COMMANDS

```prolog
?- consult('file.pl').    % Load file
?- listing.               % Show predicates
?- halt.                  % Exit
?- trace.                 % Enable tracing
```

# COMPILING

```bash
# Compile to executable
gplc program.pl -o program

# With optimization
gplc --fast-math program.pl -o program
```

# CAVEATS

Syntax differs slightly from SWI-Prolog. Native compilation adds startup complexity. Constraint solving requires finite domain declarations. Interactive debugging requires trace mode.

# HISTORY

GNU Prolog was created by **Daniel Diaz** at INRIA, first released in **1996**. It emphasizes native code compilation and constraint solving, distinguishing it from interpreted Prolog systems.

# SEE ALSO

[swipl](/man/swipl)(1), [sicstus](/man/sicstus)(1), [prolog](/man/prolog)(1)
