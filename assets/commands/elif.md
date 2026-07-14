# TAGLINE

Conditional else-if construct in shell scripts

# TLDR

**Use elif in** bash script

```if [condition1]; then echo "first"; elif [condition2]; then echo "second"; fi```

**Multiple elif** conditions

```if [ $x -lt 0 ]; then echo "negative"; elif [ $x -eq 0 ]; then echo "zero"; elif [ $x -gt 0 ]; then echo "positive"; fi```

**Branch on a command's exit status** rather than a test

```if command -v nvim; then echo "nvim"; elif command -v vim; then echo "vim"; else echo "none"; fi```

# SYNOPSIS

**if** _condition_; **then** _commands_; **elif** _condition_; **then** _commands_; **fi**

# DESCRIPTION

**elif** is a shell keyword used in bash and other POSIX shells for conditional branching. It's short for "else if" and allows multiple conditions to be tested sequentially.

elif follows an if statement and precedes then. Multiple elif blocks can appear before an optional else. Only the first matching condition's block executes.

This construct is fundamental to shell scripting for implementing multi-way branching logic.

# CAVEATS

elif is a shell reserved word, not a program, so `which elif` finds nothing and it cannot be used outside an if block. Each elif needs its own **then**, and the whole chain still ends with a single **fi**. Inside `[ ... ]` every token must be separated by spaces: `[$x -eq 1]` is a syntax error. The condition is a command list, so it branches on the exit status, and any command works there, not just test.

# HISTORY

elif is part of POSIX shell syntax, inherited from the Bourne shell created by **Stephen Bourne** at Bell Labs in the 1970s. It provides cleaner syntax than nested if-else blocks.

# SEE ALSO

[if](/man/if)(1), [else](/man/else)(1), [fi](/man/fi)(1), [test](/man/test)(1), [bash](/man/bash)(1)
