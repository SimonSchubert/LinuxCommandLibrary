# TAGLINE

Shell keyword separating the loop variable from the list in for and select loops

# TLDR

**Iterate over a list of words**

```for fruit in apple banana cherry; do echo "$fruit"; done```

**Iterate over a glob**

```for f in *.txt; do echo "$f"; done```

**Iterate over command substitution**

```for user in $(cat users.txt); do echo "$user"; done```

**Iterate over a brace-expansion range**

```for i in {1..10}; do echo "$i"; done```

**Interactive menu with select**

```select opt in start stop quit; do echo "$opt"; done```

# SYNOPSIS

**for** _name_ **in** [_words_ ...]**;** **do** _commands_**;** **done**

**select** _name_ **in** [_words_ ...]**;** **do** _commands_**;** **done**

# DESCRIPTION

**in** is a reserved word of the POSIX shell grammar, used as a delimiter between the loop variable and the word list in **for** and **select** compound commands and in **case** statements. It is not a standalone program and cannot be invoked directly; shells such as bash, zsh, dash, and ksh parse it as part of the surrounding control structure.

Inside a **for** loop, the variable named before **in** is assigned successively to each word produced by the list after **in** (which may be literal words, glob expansions, command substitutions, or parameter expansions). When the word list is omitted entirely, the loop iterates over the positional parameters "$@".

# CAVEATS

**in** is a keyword, not an executable; `which in` will typically return nothing. It has no flags or options of its own. Behavior depends on the surrounding shell construct and on POSIX quoting/expansion rules.

# HISTORY

**in** comes from the Bourne shell and has been part of the POSIX shell specification since its inception. It is inherited by all POSIX-compatible shells including bash, ksh, zsh, and dash, and by the C shell family in similar form.

# SEE ALSO

[for](/man/for)(1), [while](/man/while)(1), [do](/man/do)(1), [done](/man/done)(1), [read](/man/read)(1)
