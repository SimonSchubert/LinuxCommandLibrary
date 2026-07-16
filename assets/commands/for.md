# TAGLINE

shell loop construct for iteration

# TLDR

**Iterate** over an explicit list

```for item in [a b c]; do echo "$item"; done```

**Loop** over matching files

```for file in *.txt; do cat "$file"; done```

**Loop** over a numeric range with brace expansion

```for i in {1..10}; do echo "$i"; done```

**Loop** with a C-style counter (bash, ksh, zsh)

```for ((i=0; i<10; i++)); do echo "$i"; done```

**Iterate** over the positional parameters

```for arg do echo "$arg"; done```

**Iterate** over array elements (bash, ksh, zsh)

```for x in "${[array][@]}"; do echo "$x"; done```

**Loop** over command output, one word per iteration

```for user in $(cut -d: -f1 [/etc/passwd]); do echo "$user"; done```

# SYNOPSIS

**for** _name_ [**in** _words_]; **do** _commands_; **done**

**for** **((** _init_; _condition_; _update_ **))**; **do** _commands_; **done**

# PARAMETERS

_name_
> Variable assigned each item in turn. It stays set to the last value after the loop.

_words_
> The list to iterate over, after all expansions. If **in** _words_ is omitted, the loop iterates over the positional parameters, as if **in "$@"** had been written.

_commands_
> The body, executed once per item.

**in**
> Introduces the word list.

**do**
> Begins the loop body.

**done**
> Ends the loop.

# DESCRIPTION

**for** iterates over a list of words, assigning each to a variable and running the body once per word. It is a reserved word handled by the shell's parser, not an external command.

The word list is produced by the shell's normal expansions, which is where its flexibility comes from: brace expansion (**{1..10}**) generates sequences, pathname expansion (***.txt**) generates filenames, command substitution (**$(...)**) turns another program's output into items, and **"${array[@]}"** yields array elements. Crucially the list is fully expanded before the first iteration, so it is a fixed set of words rather than a stream.

Omitting **in** entirely is a useful shorthand: **for arg do ... done** loops over **"$@"**, the script's or function's arguments, correctly preserving arguments that contain spaces.

The C-style form **for ((init; condition; update))** is a separate construct that does arithmetic rather than word iteration. It is not POSIX, but is available in bash, ksh and zsh, and is the clearer choice when you need a counter with a computed bound.

The loop's exit status is that of the last command executed, or **0** if the body never ran. **break** exits the loop and **continue** skips to the next item.

# CAVEATS

An unquoted **$(command)** in the word list is split on whitespace, not on lines, and each resulting word is then glob-expanded. This makes **for line in $(cat file)** wrong for any file whose lines contain spaces or wildcards: use **while IFS= read -r line; do ...; done < file** to read line by line.

Always quote the variable inside the body (**"$item"**), or filenames with spaces will be split again when you use them.

If a glob matches nothing, the shell leaves the pattern itself in the list by default, so **for f in *.txt** runs once with the literal string ***.txt** in an empty directory. Guard with **[ -e "$f" ]**, or set **shopt -s nullglob** in bash.

Because the list is expanded up front, a **for** loop over a very large glob or command output builds the entire list in memory first. For huge inputs prefer a **while read** loop or **find -exec** / **xargs**.

The loop variable leaks: it remains set after **done** and is not scoped to the loop.

# HISTORY

**for** dates to the **Bourne shell** (**1977**) and is standardized by POSIX. The arithmetic **for ((...))** form came from the **Korn shell** and was adopted by bash in version **2.04**, offering C programmers a familiar counting loop.

# SEE ALSO

[while](/man/while)(1), [until](/man/until)(1), [do](/man/do)(1), [done](/man/done)(1), [break](/man/break)(1), [continue](/man/continue)(1), [seq](/man/seq)(1), [xargs](/man/xargs)(1), [bash](/man/bash)(1)

# RESOURCES

```[Documentation](https://www.gnu.org/software/bash/manual/bash.html#Looping-Constructs)```

<!-- verified: 2026-07-16 -->
