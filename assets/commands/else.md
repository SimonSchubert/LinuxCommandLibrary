# TAGLINE

Fallback branch in shell conditional statements

# TLDR

**Use else in** bash script

```if [condition]; then echo "true"; else echo "false"; fi```

**Else after elif**

```if [ $x -lt 0 ]; then echo "negative"; elif [ $x -eq 0 ]; then echo "zero"; else echo "positive"; fi```

# SYNOPSIS

**if** _condition_; **then** _commands_; **else** _commands_; **fi**

# DESCRIPTION

**else** is a shell keyword providing an alternative branch in conditional statements. It executes when the preceding if (and any elif) conditions are false.

else appears after if/elif blocks and before fi. It cannot have a condition - it catches all remaining cases. Only one else block is allowed per if statement.

This is a fundamental shell scripting construct for handling the "otherwise" case in conditional logic.

# CAVEATS

Shell keyword, not standalone command. Must be within if/fi block. Cannot have condition. Only one else per if statement.

# HISTORY

else is part of POSIX shell syntax from the Bourne shell, created by **Stephen Bourne** at Bell Labs. It provides the standard fallback mechanism in shell conditional statements.

# SEE ALSO

[if](/man/if)(1), [elif](/man/elif)(1), [test](/man/test)(1), [bash](/man/bash)(1)
