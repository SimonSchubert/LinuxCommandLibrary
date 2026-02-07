# TAGLINE

Exim mail queue search utility

# TLDR

Match **sender** address (case-insensitive)

```exiqgrep -f '<[email@example.com]>'```

Match sender and display **message IDs** only

```exiqgrep -i -f '<[email@example.com]>'```

Match **recipient** address

```exiqgrep -r '[email@example.com]'```

**Remove** all messages matching sender

```exiqgrep -i -f '<[email@example.com]>' | xargs exim -Mrm```

Test for **bounced** messages

```exiqgrep -f '^<>$'```

Display **count** of bounced messages

```exiqgrep -c -f '^<>$'```

# SYNOPSIS

**exiqgrep** [_options_] [_pattern_]

# PARAMETERS

**-f** _pattern_
> Match sender address

**-r** _pattern_
> Match recipient address

**-i**
> Display message IDs only

**-c**
> Display count only

**-o** _seconds_
> Match messages older than

**-y** _seconds_
> Match messages younger than

**-z**
> Match frozen messages only

# DESCRIPTION

**exiqgrep** is a Perl script for searching the Exim mail queue. It filters queue output by sender, recipient, age, and other criteria.

Useful for managing mail queues and identifying problematic messages.

# CAVEATS

Exim mail server specific. Patterns use Perl regular expressions. Requires appropriate permissions to access mail queue.

# SEE ALSO

[exim](/man/exim)(8), [exim_dumpdb](/man/exim_dumpdb)(8)
