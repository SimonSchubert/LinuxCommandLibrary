# TAGLINE

Rename files using simple string substitution (util-linux version)

# TLDR

Replace "foo" with "bar" in all matching filenames

```rename.ul foo bar *.txt```

Preview changes without doing anything

```rename.ul -n foo bar *```

Replace only the first occurrence per filename

```rename.ul -o foo bar *```

# SYNOPSIS

**rename.ul** [_options_] _from_ _to_ _file_...

# PARAMETERS

**-n**, **--no-act**  
> Show what would be done, but do not actually rename

**-v**, **--verbose**  
> Print the names of files that are renamed

**-o**, **--one**  
> Only replace the first occurrence of _from_ in each filename

**-i**, **--interactive**  
> Prompt before each rename

**-f**, **--force**  
> Overwrite existing files if necessary

# DESCRIPTION

**rename.ul** is the util-linux implementation of a simple bulk renamer. It replaces the first (or all) occurrences of the string _from_ with _to_ in the basenames of the listed files.

It is intentionally simpler than the Perl-based `rename` found on Debian systems. The syntax is closer to a basic search-and-replace than a full Perl expression engine.

Because it only operates on basenames and does not cross directory boundaries by default, it is very safe for everyday bulk renaming tasks.

# CAVEATS

- It will refuse to overwrite an existing file unless **--force** is given.
- Only the filename portion is changed; the directory part is untouched.
- The `from` and `to` strings are literal — no regex or glob expansion is performed on them.

# SEE ALSO

[rename](rename)(1) (Perl version on Debian), [mmv](mmv)(1), [prename](prename)(1)