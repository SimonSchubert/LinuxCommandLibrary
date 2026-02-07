# TAGLINE

shell keyword to close conditional blocks

# TLDR

**End if statement**

```if [ condition ]; then commands; fi```

**If-else structure**

```if [ condition ]; then commands; else other; fi```

**Nested if with** elif

```if [ cond1 ]; then cmd1; elif [ cond2 ]; then cmd2; fi```

# SYNOPSIS

**if** _condition_; **then** _commands_; **fi**

# PARAMETERS

**if**
> Begin conditional block.

**then**
> Commands to execute if condition is true.

**elif**
> Else-if for additional conditions.

**else**
> Commands if no conditions matched.

**fi**
> End of if block (if spelled backward).

# DESCRIPTION

**fi** is a shell keyword that closes an if conditional block. It's part of the shell's control flow syntax, marking where conditional execution ends.

The if/then/fi structure evaluates conditions and executes code blocks based on exit statuses. Conditions can use test commands, [[ ]], or any command's exit status.

fi must appear for every if, matching them like parentheses.

# CAVEATS

Must have matching if. Requires semicolon or newline before fi. Syntax errors from missing fi are common.

# HISTORY

fi is part of **Bourne shell** syntax from the 1970s. The reversed spelling of "if" matches other shell block terminators like esac (case reversed) and done (for/while/until).

# SEE ALSO

[if](/man/if)(1), [test](/man/test)(1), [bash](/man/bash)(1)
