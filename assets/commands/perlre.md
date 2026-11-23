# TAGLINE

Perl regular expressions reference

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

**perlre** is the Perl manual page documenting regular expression syntax and semantics: metacharacters, quantifiers, modifiers, captures, and extended constructs. Perl's regex syntax influenced many other languages and tools, most notably PCRE.

Related pages cover specific topics: **perlretut** (tutorial), **perlreref** (quick reference), **perlrecharclass** (character classes), **perlrebackslash** (backslash sequences), and **perlop** (the **m//**, **s///**, and **qr//** operators).

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
/x  - Extended (allow whitespace and comments)
/xx - Like /x, also ignore tabs/spaces in [classes]
/n  - Make (...) groups non-capturing
/e  - Evaluate replacement as code (s///e)
/r  - Return modified copy, keep original (s///r)
/a  - ASCII-restrict \d \s \w
/u  - Unicode semantics
/o  - Compile once (legacy)
```

# CAPTURES

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
(?|...)   - Branch reset
\K        - Keep text left of \K out of the match
\g{N}     - Backreference to group N
a*+       - Possessive quantifier
```

# CAVEATS

Complex regex can be slow. Use /x for readability. PCRE differs slightly from Perl regex.

# HISTORY

Perl's regex engine was originally derived from **Henry Spencer**'s regex library and extended by **Larry Wall** and later maintainers. Perl 5 (1994) added non-greedy quantifiers, lookahead, and the **/x** modifier; named captures and possessive quantifiers arrived in Perl **5.10** (2007).

# SEE ALSO

[perl](/man/perl)(1), [perldoc](/man/perldoc)(1)

# RESOURCES

```[Source code](https://github.com/Perl/perl5)```

```[Documentation](https://perldoc.perl.org/perlre)```

<!-- verified: 2026-11-23 -->
