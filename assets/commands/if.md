# TLDR

**Basic if statement**

```if [[ condition ]]; then command; fi```

**If-else**

```if [[ -f file ]]; then echo "exists"; else echo "missing"; fi```

**If-elif-else**

```if [[ $x -eq 1 ]]; then cmd1; elif [[ $x -eq 2 ]]; then cmd2; else cmd3; fi```

**Test file exists**

```if [[ -e file ]]; then echo "found"; fi```

**Test string equality**

```if [[ "$a" == "$b" ]]; then echo "equal"; fi```

# SYNOPSIS

**if** _condition_; **then** _commands_; [**elif** _condition_; **then** _commands_;] [**else** _commands_;] **fi**

# PARAMETERS

_CONDITION_
> Test expression.

**then**
> Commands if true.

**elif**
> Else-if clause.

**else**
> Commands if false.

**fi**
> End if block.

# DESCRIPTION

**if** is a shell conditional statement. It executes commands based on the exit status of test conditions.

The construct supports multiple conditions with elif and a fallback else clause. It's fundamental to shell scripting.

if provides conditional execution.

# CAVEATS

Shell builtin. Spaces in conditions matter. Use [[ ]] in bash.

# HISTORY

if is a standard **Unix shell** construct, present in all POSIX-compliant shells.

# SEE ALSO

[test](/man/test)(1), [case](/man/case)(1), [bash](/man/bash)(1)
