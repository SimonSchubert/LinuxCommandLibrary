# TAGLINE

enhanced conditional expression for bash/zsh

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

**[[** is a reserved word in bash, zsh, and ksh, but it is **not POSIX**. Scripts with a `#!/bin/sh` shebang must use **[** instead, since `/bin/sh` is `dash` on Debian and Ubuntu and will fail with a syntax error.

The quoting rules are inverted from what people expect, and this is the most common source of bugs:

Quote the right-hand side of **==** to compare literally. Unquoted, it is a **glob pattern**, so `[[ $x == pattern* ]]` matches a prefix while `[[ $x == "pattern*" ]]` matches the literal asterisk.

Do **not** quote a regex after **=~**. Quoting turns the pattern into a literal string, so `[[ $x =~ "^test" ]]` looks for the characters `^test` rather than anchoring the match. Store the pattern in a variable if it needs to contain spaces.

The regex dialect is **ERE**, and captured groups land in the `BASH_REMATCH` array, with the whole match in element 0.

**<** and **>** compare strings lexicographically, not numerically: `[[ 10 < 9 ]]` is true. Use `((` `))` or the `-lt`/`-gt` operators for numbers.

# HISTORY

**[[** originated in the **Korn shell** (ksh88), where David Korn added it to fix the long-standing traps in the `test` command: `[` is an ordinary command, so its arguments are subject to word splitting and glob expansion, which is why an empty or unset variable turns `[ $x = y ]` into a syntax error. Making the construct a reserved word instead let the shell parse it before expansion, which is exactly what removes the need for defensive quoting.

bash adopted it in version 2.02 (**1998**), zsh has it as well, and it is now standard practice in scripts that are not required to be POSIX. It was proposed for POSIX but rejected, so `[` remains the only portable option.

# SEE ALSO

[test](/man/test)(1), [bash](/man/bash)(1), [zsh](/man/zsh)(1), [ksh](/man/ksh)(1), [double-parenthesis](/man/double-parenthesis)(1)
