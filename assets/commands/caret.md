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

# HISTORY SUBSTITUTION

**^old^new**
> Replace first occurrence of "old" with "new" in previous command and execute

**^old^new^**
> Same, trailing ^ is optional

**!!:s/old/new/**
> Equivalent using full history syntax

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
