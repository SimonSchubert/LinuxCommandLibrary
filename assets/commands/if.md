# TAGLINE

Shell conditional statement

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

**Test command exit status**

```if grep -q "pattern" file; then echo "found"; fi```

**Numeric comparison**

```if [[ $count -gt 10 ]]; then echo "more than 10"; fi```

# SYNOPSIS

**if** _test-commands_; **then** _commands_; [**elif** _test-commands_; **then** _commands_;] [**else** _commands_;] **fi**

# PARAMETERS

_test-commands_
> A list of commands whose exit status determines the branch taken. An exit status of 0 (success) means the condition is true.

**then**
> Introduces commands to execute when the preceding condition is true.

**elif**
> Else-if clause; tests an additional condition if prior conditions were false.

**else**
> Commands to execute if all preceding conditions were false.

**fi**
> End of the if block.

# DESCRIPTION

**if** is a shell builtin conditional statement. It executes the _test-commands_ list and, if the exit status is zero (success), runs the corresponding **then** clause. If non-zero, each **elif** clause is tested in turn. If no condition succeeds and an **else** clause is present, its commands are executed.

Although **if** is most commonly used with **test** or **[[ ]]** expressions, any command can serve as the condition since the decision is based on exit status. For example, **if grep -q pattern file** branches on whether grep found a match.

# CAVEATS

Shell builtin. Spaces inside **[ ]** and **[[ ]]** are required (e.g., **[ "$a" = "$b" ]**, not **["$a"="$b"]**). The POSIX-compatible test syntax is **[ ]**, while **[[ ]]** is a bash/zsh extension with additional features like pattern matching and regex.

# HISTORY

**if** is a standard **Unix shell** construct, present in all POSIX-compliant shells since the original Bourne shell.

# SEE ALSO

[test](/man/test)(1), [bash](/man/bash)(1), [while](/man/while)(1), [for](/man/for)(1)
