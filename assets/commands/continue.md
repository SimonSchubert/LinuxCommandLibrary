# TAGLINE

skip to next loop iteration

# TLDR

**Skip to the next iteration** in a for loop

```for i in 1 2 3; do if [ "$i" -eq 2 ]; then continue; fi; echo "$i"; done```

**Skip iteration based on condition** in while loop

```while read line; do [[ "$line" == "#"* ]] && continue; echo "$line"; done < [file.txt]```

**Continue from an outer loop** (skip 2 levels)

```for i in 1 2; do for j in a b; do [ "$j" = "a" ] && continue 2; echo "$i$j"; done; done```

**Skip processing empty lines**

```for file in *; do [ -z "$file" ] && continue; process "$file"; done```

# SYNOPSIS

**continue** [_n_]

# PARAMETERS

**n**
> Number of enclosing loops to skip out of. Default is 1 (innermost loop). Must be a positive integer.

# DESCRIPTION

**continue** is a shell builtin command that skips the remaining commands in the current iteration of an enclosing **for**, **while**, **until**, or **select** loop, and continues with the next iteration of that loop.

When called without an argument, continue affects the innermost enclosing loop. When given a numeric argument **n**, it continues from the **n**th enclosing loop, counting outward from the innermost. This allows breaking out of multiple nested loops.

The command is essential for controlling loop flow, particularly when certain conditions require skipping processing without terminating the entire loop. Unlike **break**, which exits the loop entirely, continue simply moves to the next iteration.

# CAVEATS

The argument must be greater than or equal to 1. If **n** is greater than the number of enclosing loops, continue acts on the outermost loop. Using continue outside of a loop context produces an error. The command only affects the immediate loop structure, not function calls.

# HISTORY

continue is a fundamental shell control flow statement present since the original Bourne shell in **1979**. It follows conventions from earlier programming languages like C. The ability to specify a loop level was added to provide more flexible control in nested loop scenarios.

# SEE ALSO

[break](/man/break)(1), [for](/man/for)(1), [while](/man/while)(1), [bash](/man/bash)(1)
