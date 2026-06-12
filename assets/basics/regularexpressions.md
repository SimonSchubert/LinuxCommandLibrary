# Regular Expressions

## Basic Matching
A regular expression (regex) is a pattern that describes a set of strings. Tools like **grep**, **sed**, and **awk** use regex to search and transform text. A literal string is the simplest pattern: it matches itself, anywhere in the line.
```[grep](/man/grep) 'hello' file.txt```
```[grep](/man/grep) -i 'error' /var/log/syslog```

> Put the pattern in single quotes so the shell passes it to the tool unchanged.

## Regex Flavors
Three dialects are in everyday use, and the same pattern can behave differently in each.

**Basic Regular Expressions** (BRE) are the default for **grep** and **sed**. The characters **+**, **?**, **{**, **}**, **(**, **)**, and **|** match literally; they need a backslash to get their special meaning.

**Extended Regular Expressions** (ERE) make those characters special without escaping. Enable ERE with the **-E** flag; **awk** uses it by default.
```[grep](/man/grep) -E 'error|warning' logfile```
```[sed](/man/sed) -E 's/[0-9]+/NUM/g' data.txt```

**Perl-Compatible Regular Expressions** (PCRE) add shortcuts like **\d**, lookarounds, and lazy quantifiers. Use **grep -P** where available.
```[grep](/man/grep) -P '\d{3}-\d{4}' contacts.txt```

> If a pattern with **+**, **?**, or alternation silently matches nothing, check whether the tool is running in BRE mode.

## Anchors
Anchors match a position rather than a character.

| Pattern | Description |
|-----|-------------|
| **^** | Start of line |
| **$** | End of line |
| **\b** | Word boundary |
| **\B** | Non-word boundary |
| **\<** | Start of word (GNU) |
| **\>** | End of word (GNU) |

```[grep](/man/grep) '^#' config.txt```
```[grep](/man/grep) '\.conf$' filelist.txt```

Combine both anchors to match the whole line. This finds lines that consist only of digits.
```[grep](/man/grep) -E '^[0-9]+$' data.txt```

A word boundary matches "cat" but not "catalog".
```[grep](/man/grep) '\bcat\b' animals.txt```

## Character Classes
A character class matches one character from a defined set.

| Pattern | Description |
|-----|-------------|
| **.** | Any single character (except newline) |
| **[abc]** | One of a, b, or c |
| **[^abc]** | Any character except a, b, or c |
| **[a-z]** | Any lowercase letter |
| **[A-Z]** | Any uppercase letter |
| **[0-9]** | Any digit |
| **[a-zA-Z0-9]** | Any alphanumeric character |
| **\d** | Any digit, same as [0-9] (PCRE only) |
| **\D** | Any non-digit (PCRE only) |
| **\w** | Any word character (letter, digit, underscore) |
| **\W** | Any non-word character |
| **\s** | Any whitespace (space, tab, newline) |
| **\S** | Any non-whitespace character |

> GNU **grep** and **sed** accept **\w**, **\s**, and **\b** even without **-P**, but **\d** only works in PCRE. For portable scripts, use POSIX classes instead.

Inside a bracket expression, most metacharacters become literal. To include a literal **]**, place it first; a literal **-** goes first or last.

## POSIX Classes
POSIX character classes are portable across all Unix tools. They are written inside a bracket expression, which is why you see double brackets.

| Class | Description |
|-----|-------------|
| **[[:alpha:]]** | Alphabetic characters |
| **[[:digit:]]** | Digits (0-9) |
| **[[:alnum:]]** | Alphanumeric characters |
| **[[:space:]]** | Whitespace characters |
| **[[:upper:]]** | Uppercase letters |
| **[[:lower:]]** | Lowercase letters |
| **[[:punct:]]** | Punctuation characters |
| **[[:print:]]** | Printable characters |
| **[[:blank:]]** | Space and tab |
| **[[:xdigit:]]** | Hexadecimal digits |

```[grep](/man/grep) '[[:digit:]]' data.txt```
```[tr](/man/tr) -d '[:punct:]' < file.txt```

## Quantifiers
Quantifiers control how many times the preceding element must appear.

| Pattern | Description |
|-----|-------------|
| `*` | Zero or more times |
| **+** | One or more times |
| **?** | Zero or one time |
| **{n}** | Exactly n times |
| **{n,}** | n or more times |
| **{n,m}** | Between n and m times |

```[grep](/man/grep) -E 'o{2,}' words.txt```
```[grep](/man/grep) -E 'https?://' urls.txt```

> Quantifiers are greedy: they match as much text as possible. The star works unescaped in every flavor; in BRE, write intervals as **\{n,m\}**, and GNU tools also accept **\+** and **\?**.

## Groups and Alternation
Parentheses group elements so quantifiers apply to the whole unit, and they capture what they match. The pipe symbol provides alternation.

| Pattern | Description |
|-----|-------------|
| **(abc)** | Group: match "abc" as a unit |
| **a\|b** | Alternation: match a or b |
| **\1** | Backreference: match the first captured group again |
| **\2** | Backreference: match the second captured group |

```[grep](/man/grep) -E 'cat|dog' animals.txt```
```[echo](/man/echo) 'abcabc' | [grep](/man/grep) -E '(abc)\1'```

Backreferences shine in **sed**, where they rearrange the matched text in the replacement.
```[echo](/man/echo) 'John Smith' | [sed](/man/sed) -E 's/(.*) (.*)/\2, \1/'```

## Escaping
The backslash removes the special meaning of a metacharacter. In extended regex, these characters are special:
```. * + ? ( ) [ ] { } | ^ $ \```

To match one of them literally, prefix it with a backslash. Without the escapes, the dots below would match any character, so the pattern would also match "192x168y1z1".
```[grep](/man/grep) '192\.168\.1\.1' hosts.txt```

## Lookahead and Lookbehind
PCRE supports lookarounds: zero-width assertions that constrain what surrounds a match without including it. It also adds lazy quantifiers.

| Pattern | Description |
|-----|-------------|
| **(?=x)** | Lookahead: followed by x |
| **(?!x)** | Negative lookahead: not followed by x |
| **(?<=x)** | Lookbehind: preceded by x |
| **(?<!x)** | Negative lookbehind: not preceded by x |
| `*?` `+?` | Lazy quantifier: match as little as possible |

Match "foo" only when "bar" does not follow it.
```[grep](/man/grep) -P 'foo(?!bar)' file.txt```

With **-o** printing only the match, a lookbehind extracts a value without its label.
```[grep](/man/grep) -oP '(?<=user=)\w+' auth.log```

## Common Examples
Match lines that look like an email address.
```[grep](/man/grep) -E '[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}' contacts.txt```

Match an IPv4 address. This permissive form also accepts numbers above 255, which is usually fine for log searches.
```[grep](/man/grep) -E '([0-9]{1,3}\.){3}[0-9]{1,3}' logfile```

Print only the matched part instead of the whole line.
```[grep](/man/grep) -oE '[0-9]+' file.txt```

Remove blank lines from a file.
```[sed](/man/sed) '/^$/d' file.txt```

Remove comment lines, including indented ones.
```[sed](/man/sed) '/^[[:blank:]]*#/d' config.txt```

Replace runs of whitespace with a single space.
```[sed](/man/sed) -E 's/[[:blank:]]+/ /g' messy.txt```

Print lines whose first field is a number.
```[awk](/man/awk) '$1 ~ /^[0-9]+$/' data.txt```
