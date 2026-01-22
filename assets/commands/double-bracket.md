# TLDR

**Test condition (bash/zsh extended)**

```[[ -f [file] ]] && echo "exists"```

**Pattern matching**

```[[ "[string]" == pattern* ]]```

**Regex matching**

```[[ "[string]" =~ ^[0-9]+$ ]]```

**Safe variable comparison (no quoting needed)**

```[[ $var == "value" ]]```

**Combine conditions**

```[[ -f [file] && -r [file] ]]```

# SYNOPSIS

**[[** _expression_ **]]**

# OPERATORS

**File tests**: Same as **[** (-f, -d, -e, -r, -w, -x, etc.)

**String comparison**:
- **==** or **=**: Pattern match (glob)
- **!=**: Not pattern match
- **=~**: Regex match
- **<**, **>**: Lexicographic order

**Numeric**: -eq, -ne, -lt, -le, -gt, -ge

**Logical**:
- **&&**: AND
- **||**: OR
- **!**: NOT

# DESCRIPTION

**[[** is bash/zsh's enhanced conditional expression. It provides safer and more powerful tests than **[**.

Key advantages over **[**:
- No word splitting on variables (unquoted $var is safe)
- Pattern matching with **==** and **!=**
- Regular expression matching with **=~**
- **&&** and **||** work inside the brackets
- **<** and **>** don't need escaping

```bash
# Pattern matching
[[ $file == *.txt ]] && echo "text file"

# Regex matching
if [[ $email =~ ^[A-Za-z]+@[A-Za-z]+\.[A-Za-z]+$ ]]; then
    echo "Valid email format"
fi

# No quoting needed
[[ $var == "test" ]]  # Safe even if var is empty
```

# CAVEATS

**[[** is bash/zsh specific, not POSIX. Use **[** for portable scripts.

Regex with **=~** uses ERE (Extended Regular Expressions). Captured groups go in BASH_REMATCH array.

Quote the right side of **==** to match literally: **[[ $x == "pattern*" ]]** matches the literal string.

Don't quote regex patterns: **[[ $x =~ ^test ]]** not **[[ $x =~ "^test" ]]**

# SEE ALSO

[test](/man/test)(1), [bash](/man/bash)(1), [zsh](/man/zsh)(1)
