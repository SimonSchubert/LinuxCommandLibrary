# TAGLINE

shell keyword to close conditional blocks

# TLDR

**Close** a simple if statement

```if [ condition ]; then commands; fi```

**Close** an if/else structure

```if [ condition ]; then commands; else other; fi```

**Close** a chain with elif

```if [ cond1 ]; then cmd1; elif [ cond2 ]; then cmd2; else cmd3; fi```

**Close** an if written across multiple lines (no semicolon needed before fi)

```if [ -f [file] ]
then
    cat [file]
fi```

**Branch** on any command's exit status, not just test

```if grep -q [pattern] [file]; then echo found; fi```

# SYNOPSIS

**if** _list_; **then** _list_; [**elif** _list_; **then** _list_;] ... [**else** _list_;] **fi**

# PARAMETERS

**if**
> Begin the conditional; runs the following list and inspects its exit status.

**then**
> Introduces the commands run when the preceding condition succeeded.

**elif**
> Test another condition when all previous ones failed.

**else**
> Commands run when no condition succeeded.

**fi**
> End of the if block ("if" spelled backwards).

# DESCRIPTION

**fi** terminates an **if** conditional. It is a reserved word rather than a command, recognized by the shell's parser only where a command could start, which is why it must follow a newline or a semicolon.

The **if** construct tests exit status, not truth values: the condition is a command list, and the branch is taken when its exit status is **0**. **[** and **[[** are simply commands that exit **0** or **1**, so any program works as a condition, which is what makes idioms like **if grep -q ...** natural in shell.

An **if** may contain any number of **elif** clauses and at most one **else**. Every **if** needs exactly one matching **fi**, including nested ones, and the block's exit status is that of the last command executed, or **0** if no branch ran.

# CAVEATS

Because **fi** is only recognized in command position, writing **if [ x = y ]; then echo hi fi** silently passes **fi** as an argument to **echo** instead of closing the block, and the shell then reports an unexpected end of file. Put a semicolon or newline before it.

An empty branch is a syntax error: the shell requires at least one command between **then** and **fi**. Use **:** (the null command) as a placeholder.

A missing **fi** is usually reported at the end of the file rather than at the real mistake, so the line number in the error is rarely where the problem is.

# HISTORY

**fi** comes from the **Bourne shell** (**1977**) and is standardized by POSIX. Stephen Bourne borrowed the reversed-keyword convention from **ALGOL 68**, which used **if**/**fi** the same way; the shell applies it again in **case**/**esac**. **do**/**done** breaks the pattern, as **od** was already taken by the octal dump utility.

# SEE ALSO

[if](/man/if)(1), [else](/man/else)(1), [elif](/man/elif)(1), [test](/man/test)(1), [true](/man/true)(1), [while](/man/while)(1), [until](/man/until)(1), [bash](/man/bash)(1)

# RESOURCES

```[Documentation](https://www.gnu.org/software/bash/manual/bash.html#Conditional-Constructs)```

<!-- verified: 2026-07-16 -->

# INSTALL

```aur: yay -S fi```

<!-- packages: 2026-07-22 -->
