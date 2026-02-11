# TAGLINE

Translate or delete characters

# TLDR

**Translate characters** (lowercase to uppercase)

```echo "hello" | tr 'a-z' 'A-Z'```

**Delete specific characters**

```echo "hello 123" | tr -d '0-9'```

**Squeeze repeated characters**

```echo "helllo" | tr -s 'l'```

**Replace newlines with spaces**

```tr '\n' ' ' < [file]```

**Delete non-printable characters**

```tr -cd '[:print:]' < [file]```

**Translate spaces to tabs**

```tr ' ' '\t' < [file]```

**Delete all except specified characters**

```echo "hello123" | tr -cd '0-9'```

# SYNOPSIS

**tr** [_options_] _set1_ [_set2_]

# PARAMETERS

**-d**, **--delete**
> Delete characters in set1

**-s**, **--squeeze-repeats**
> Replace repeated characters with single occurrence

**-c**, **-C**, **--complement**
> Use complement of set1

**-t**, **--truncate-set1**
> Truncate set1 to length of set2

# CHARACTER CLASSES

**[:alnum:]**: Letters and digits
**[:alpha:]**: Letters
**[:digit:]**: Digits
**[:lower:]**: Lowercase letters
**[:upper:]**: Uppercase letters
**[:space:]**: Whitespace
**[:blank:]**: Spaces and tabs
**[:print:]**: Printable characters
**[:punct:]**: Punctuation
**[:cntrl:]**: Control characters

# DESCRIPTION

**tr** translates, deletes, or squeezes characters from standard input, writing to standard output. It operates character-by-character, making it efficient for simple transformations.

Translation replaces each character in set1 with the corresponding character in set2. If set2 is shorter, its last character is repeated. If longer, excess characters are ignored.

With **-d**, characters in set1 are deleted. With **-s**, repeated characters in set1 are squeezed to single occurrences. Both can be combined.

**-c** complements set1, meaning "all characters NOT in set1." Useful for keeping only specific characters.

# CAVEATS

Tr operates on characters, not strings or patterns. For pattern-based substitution, use **sed** or **awk**.

Character classes in brackets must use the [:class:] syntax. Don't confuse with regex [a-z] which also works but differs from [:lower:] in locales.

Tr reads only from stdin; it cannot process files directly. Use redirection or pipes.

# SEE ALSO

[sed](/man/sed)(1), [awk](/man/awk)(1), [cut](/man/cut)(1), [iconv](/man/iconv)(1)
