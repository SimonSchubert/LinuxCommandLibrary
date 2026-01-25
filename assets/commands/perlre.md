# TLDR

**View Perl regex documentation**

```perldoc perlre```

**View quick reference**

```perldoc perlreref```

**View regex tutorial**

```perldoc perlretut```

**View character classes**

```perldoc perlrecharclass```

# SYNOPSIS

**perldoc perlre**

# DESCRIPTION

**perlre** documents Perl regular expressions, one of the most powerful regex implementations. Perl's regex syntax influenced many other languages and tools (PCRE).

# BASIC PATTERNS

```perl
/pattern/       # Match
s/old/new/      # Substitute
m/pattern/i     # Case insensitive
/pattern/g      # Global

# Character classes
\d  - Digit
\w  - Word character
\s  - Whitespace
.   - Any character
```

# MODIFIERS

```perl
/i  - Case insensitive
/g  - Global match
/m  - Multiline mode
/s  - Single line (. matches \n)
/x  - Extended (allow whitespace)
/o  - Compile once
```

# EXAMPLES

```perl
# Match and capture
if ($text =~ /(\d+)/) {
    print "Found: $1\n";
}

# Named captures
/(?<name>\w+)/;
print $+{name};

# Non-greedy
/.*?/
```

# ADVANCED FEATURES

```perl
(?:...)   - Non-capturing group
(?=...)   - Positive lookahead
(?!...)   - Negative lookahead
(?<=...)  - Positive lookbehind
(?<!...)  - Negative lookbehind
(?>...)   - Atomic group
```

# CAVEATS

Complex regex can be slow. Use /x for readability. PCRE differs slightly from Perl regex.

# HISTORY

Perl regular expressions were designed by **Larry Wall** and evolved through Perl versions, becoming the standard for modern regex.

# SEE ALSO

[perl](/man/perl)(1), [perlretut](/man/perlretut)(1), [perlreref](/man/perlreref)(1), [pcre](/man/pcre)(3)
