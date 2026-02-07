# TAGLINE

shell loop construct for iteration

# TLDR

**Iterate over list**

```for item in [a b c]; do echo $item; done```

**Loop over files**

```for file in *.txt; do cat "$file"; done```

**C-style loop**

```for ((i=0; i<10; i++)); do echo $i; done```

**Loop with range**

```for i in {1..10}; do echo $i; done```

**Process command output**

```for line in $(cat [file.txt]); do echo "$line"; done```

# SYNOPSIS

**for** _name_ **in** _words_; **do** _commands_; **done**

# PARAMETERS

_NAME_
> Variable name for each iteration.

_WORDS_
> List of items to iterate over.

_COMMANDS_
> Commands to execute each iteration.

**in**
> Introduces the list of items.

**do**
> Begins the command block.

**done**
> Ends the for loop.

# DESCRIPTION

**for** is a shell keyword that iterates over a list of items, executing commands for each. It's one of the fundamental loop constructs in shell scripting.

The loop variable takes each value from the word list in turn. Brace expansion, command substitution, and globbing can generate the list. C-style syntax provides numeric iteration.

for loops are essential for batch processing files, generating sequences, and iterating over arrays.

# CAVEATS

Word splitting can cause issues with spaces. Quote variables in commands. Large lists may be slow.

# HISTORY

for loops are part of the **Bourne shell** from the 1970s and are specified by POSIX. The C-style syntax was added by bash and ksh for compatibility with C programmers.

# SEE ALSO

[while](/man/while)(1), [until](/man/until)(1), [bash](/man/bash)(1)
