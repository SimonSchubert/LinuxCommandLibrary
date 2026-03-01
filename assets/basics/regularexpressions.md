# Regular Expressions

## Basic Matching
A regular expression (regex) is a pattern that describes a set of strings. Most Linux tools like **grep**, **sed**, and **awk** support regex for searching and transforming text. A literal string is the simplest pattern — it matches itself.
```[echo](/man/echo) "hello world" | [grep](/man/grep) "hello"```
```[grep](/man/grep) -i "error" /var/log/syslog```

## Anchors
Anchors match a position rather than a character.

| Pattern | Description |
|-----|-------------|
| **^** | Start of line |
| **$** | End of line |
| **\b** | Word boundary |
| **\B** | Non-word boundary |

```[grep](/man/grep) "^#" config.txt```
```[grep](/man/grep) "\.conf$" filelist.txt```

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
| **\d** | Any digit (same as [0-9]) |
| **\D** | Any non-digit |
| **\w** | Any word character (letter, digit, underscore) |
| **\W** | Any non-word character |
| **\s** | Any whitespace (space, tab, newline) |
| **\S** | Any non-whitespace character |

> **\d**, **\w**, and **\s** are Perl-style shortcuts. They work in `grep -P` and most programming languages but not in basic POSIX regex.

## POSIX Classes
POSIX character classes are portable across all Unix tools. They must be used inside brackets: `[[:digit:]]`.

| Class | Description |
|-----|-------------|
| **[:alpha:]** | Alphabetic characters |
| **[:digit:]** | Digits (0-9) |
| **[:alnum:]** | Alphanumeric characters |
| **[:space:]** | Whitespace characters |
| **[:upper:]** | Uppercase letters |
| **[:lower:]** | Lowercase letters |
| **[:punct:]** | Punctuation characters |
| **[:print:]** | Printable characters |
| **[:blank:]** | Space and tab |

```[grep](/man/grep) "[[:digit:]]" data.txt```

## Quantifiers
Quantifiers control how many times the preceding element must appear.

| Pattern | Description |
|-----|-------------|
| ***** | Zero or more times |
| **+** | One or more times |
| **?** | Zero or one time |
| **{n}** | Exactly n times |
| **{n,}** | n or more times |
| **{n,m}** | Between n and m times |

```[grep](/man/grep) -E "o{2,}" words.txt```

> In basic regex (BRE), quantifiers `+`, `?`, `{`, and `}` must be escaped with a backslash. Use `grep -E` for extended regex where they work without escaping.

## Groups and Alternation
Parentheses create groups for applying quantifiers or capturing matches. The pipe symbol provides alternation.

| Pattern | Description |
|-----|-------------|
| **(abc)** | Group — match "abc" as a unit |
| **a\|b** | Alternation — match a or b |
| **\1** | Backreference — match the first captured group again |
| **\2** | Backreference — match the second captured group |

```[echo](/man/echo) "abcabc" | [grep](/man/grep) -E "(abc)\1"```
```[grep](/man/grep) -E "cat|dog" animals.txt```

Backreferences are useful in **sed** for rearranging matched text.
```[echo](/man/echo) "John Smith" | [sed](/man/sed) -E "s/(.*) (.*)/\2, \1/"```

## Escaping
The backslash `\` removes the special meaning of a metacharacter. The special characters that need escaping depend on the regex flavor.

In **extended regex** (ERE), these characters are special: `. * + ? ( ) [ ] { } | ^ $ \`

To match a literal dot, period, or other special character, prefix it with a backslash.
```[grep](/man/grep) -E "192\.168\.1\.1" hosts.txt```

## Basic vs Extended Regex
Linux tools support two main regex flavors.

**Basic Regular Expressions** (BRE) are the default for [grep](/man/grep) and [sed](/man/sed). In BRE, the characters `+`, `?`, `{`, `}`, `(`, `)`, and `|` are treated as literals — you must escape them with `\` to use their special meaning.

**Extended Regular Expressions** (ERE) treat those characters as special by default. Use the **-E** flag to enable ERE.
```[grep](/man/grep) -E "error|warning" logfile```
```[sed](/man/sed) -E "s/[0-9]+/NUM/g" data.txt```

Perl-compatible regex (**PCRE**) adds features like lookahead, lookbehind, and non-greedy quantifiers. Use `grep -P` where available.
```[grep](/man/grep) -P "\d{3}-\d{4}" contacts.txt```

## Common Examples
Match lines that look like an email address.
```[grep](/man/grep) -E "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,}" contacts.txt```

Match an IPv4 address.
```[grep](/man/grep) -E "[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}" logfile```

Remove blank lines from a file.
```[sed](/man/sed) "/^$/d" file.txt```

Remove lines starting with a comment character.
```[sed](/man/sed) "/^#/d" config.txt```

Extract the third column from whitespace-separated data.
```[awk](/man/awk) "{print \$3}" data.txt```

Replace multiple spaces with a single space.
```[sed](/man/sed) -E "s/ +/ /g" messy.txt```
