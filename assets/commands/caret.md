# TAGLINE

Shell history substitution and regex anchor character

# TLDR

**Quick substitution on last command**

```^[old]^[new]```

**Repeat last command replacing text**

```^typo^fixed```

**Start of line anchor (regex)**

```grep "^start" [file]```

**Negation in character class (regex)**

```grep "[^0-9]" [file]```

# SYNOPSIS

**^**_old_**^**_new_[**^**]

# PARAMETERS

**^**_old_**^**_new_
> Replace first occurrence of _old_ with _new_ in the previous command and execute it.

**^**_old_**^**_new_**^**
> Same substitution; the trailing **^** is optional unless appending additional text.

**!!:s/**_old_**/**_new_**/**
> Equivalent long-form history substitution syntax.

**!!:gs/**_old_**/**_new_**/**
> Replace all occurrences of _old_ with _new_ in the previous command.

# DESCRIPTION

**^** in shell has multiple meanings:

**History substitution**: **^old^new** is a shortcut for **!!:s/old/new/**, replacing text in the previous command. Quick fix for typos without retyping.

**Regular expression anchor**: **^** matches the start of a line. **^hello** matches lines starting with "hello".

**Character class negation**: **[^abc]** matches any character except a, b, or c.

**Exponentiation**: In **$((...))** and some languages, **^** may be XOR or exponent (use ******** in bash for exponent).

# CAVEATS

**^old^new** only replaces the first occurrence. For global replacement, use **!!:gs/old/new/**.

In some shells/contexts, **^** may need escaping or behave differently.

The caret substitution must be at the start of the command line.

# SEE ALSO

[bash](/man/bash)(1), [history](/man/history)(1), [grep](/man/grep)(1), [sed](/man/sed)(1)
