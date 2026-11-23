# TAGLINE

Search Mageia package files and metadata

# TLDR

Search packages containing **file**

```urpmf [filename]```

Search for an exact **file path**, without regex interpretation

```urpmf -l [/usr/bin/vim]```

Search **summary** with AND

```urpmf --summary [keyword1] -a [keyword2]```

Search **description** with OR

```urpmf --description [keyword1] -o [keyword2]```

Search summary, **excluding** a keyword

```urpmf --summary [keyword1] -a ! [keyword2]```

**Case-insensitive** search of package names

```urpmf --name -i [pattern]```

Find packages that **provide** a capability

```urpmf --provides [capability]```

Show **media** names along with matching files

```urpmf -m [filename]```

# SYNOPSIS

**urpmf** [_OPTIONS_] _PATTERN-EXPRESSION_

# PARAMETERS

**--files**
> Search and print the files contained in packages (default).

**--name**
> Search and print package names.

**--summary**
> Search and print package summaries.

**--description**
> Search and print package descriptions.

**--provides**, **--requires**, **--recommends**, **--conflicts**, **--obsoletes**
> Search and print the corresponding dependency tags.

**--group**, **--license**, **--url**, **--sourcerpm**, **--size**, **--arch**
> Search and print other rpm tags.

**-l**, **--literal**
> Match literally instead of as a Perl regular expression.

**-i**
> Ignore case in the patterns that follow.

**-I**
> Honor case in the patterns that follow (default).

**-a**
> AND operator between patterns.

**-o**
> OR operator between patterns.

**!**
> NOT operator (exclude matches).

**(** **)**
> Group expressions.

**-m**
> Print the name of the media in which the package was found.

**-f**
> Print version, release and arch along with the package name.

**-F** _SEP_
> Field separator for the rest of the output line (default: colon).

**--qf** _FORMAT_
> printf-like output format, with tags given as %[-][width]tagname.

**--uniq**
> Do not print identical lines twice.

**--media** _MEDIA_, **--excludemedia** _MEDIA_
> Only search, or skip, the given comma-separated media.

**--update**
> Search only update media.

# DESCRIPTION

**urpmf** finds files in packages and queries information about them in Mageia Linux. By default it lists the packages containing a file whose name or path matches the pattern; tag options such as **--summary** or **--provides** select which rpm tags are printed and searched. Patterns are Perl-style regular expressions, and boolean expressions are matched against the whole output line.

It searches the metadata of the configured urpmi media, not the local rpm database; use **rpm -qf** for installed files. Part of the urpmi package management suite for Mageia.

# CAVEATS

Mageia specific. Searches through all configured media. Large queries may take time to process.

# SEE ALSO

[urpmi](/man/urpmi)(8), [urpmq](/man/urpmq)(8), [urpme](/man/urpme)(8), [rpm](/man/rpm)(8)

# RESOURCES

```[Source code](https://gitweb.mageia.org/software/rpm/urpmi/)```

```[Documentation](https://wiki.mageia.org/en/URPMI)```

<!-- verified: 2026-11-23 -->
