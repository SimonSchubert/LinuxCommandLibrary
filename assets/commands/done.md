# TAGLINE

Shell reserved word that closes a loop body

# TLDR

Close a **for** loop

```for f in *.txt; do echo "$f"; done```

Close a **while** loop

```while read -r line; do echo "$line"; done < [file.txt]```

Close an **until** loop

```until ping -c1 [host]; do sleep 1; done```

**Redirect the output** of an entire loop

```for i in 1 2 3; do echo "$i"; done > [out.txt]```

**Pipe a whole loop** into another command

```for i in 1 2 3; do echo "$i"; done | sort -r```

# SYNOPSIS

**for** _name_ [**in** _words_]; **do** _commands_; **done**

**while** _condition_; **do** _commands_; **done**

**until** _condition_; **do** _commands_; **done**

**select** _name_ [**in** _words_]; **do** _commands_; **done**

# DESCRIPTION

**done** is a shell reserved word, not a program: it terminates the body of a **for**, **while**, **until**, or **select** loop that was opened with **do**. Every **do** must be matched by a **done**, and the pair brackets the commands that run on each iteration.

Because **done** ends a compound command, redirections and pipes written after it apply to the loop as a whole rather than to the last command inside it. `done > out.txt` sends every iteration's output to the file, opening it once, which is both faster and more correct than redirecting on each pass through the loop.

The word is only special where a command is expected. Anywhere else, for instance as an argument, it is an ordinary string, which is why `echo done` simply prints the word.

The exit status of a loop is the exit status of the last command run in its body, or 0 if the body never ran.

# CAVEATS

**done** is a reserved word, so it cannot be used as a function or command name without quoting. A **do** with no matching **done** leaves the shell waiting for more input, which shows up as a hung script or a continuation prompt rather than a clear syntax error.

It is not universal across shells: **fish** and **csh** close their loops with **end**, so `done` belongs to the Bourne family (sh, bash, dash, ksh, zsh). It is also unrelated to `task done` in Taskwarrior, where `done` is an ordinary subcommand of that program rather than shell syntax.

# HISTORY

The `do ... done` bracketing comes from the **Bourne shell** in Unix Version 7 (**1979**). Stephen Bourne took the style from ALGOL 68, where compound statements are closed by reversing the opening keyword, the same instinct that gives the shell `if ... fi` and `case ... esac`. Loops never acquired a reversed `od`, so they were given the plain word `done` instead. POSIX standardised the syntax, and it behaves identically in every Bourne-family shell today.

# INSTALL

```aur: yay -S done```

<!-- packages: 2026-07-22 -->

# SEE ALSO

[for](/man/for)(1), [while](/man/while)(1), [until](/man/until)(1), [break](/man/break)(1), [continue](/man/continue)(1), [bash](/man/bash)(1)
