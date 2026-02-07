# TAGLINE

Translate awk scripts to Perl

# TLDR

**Convert** an awk script to Perl

```a2p [script.awk] > [script.pl]```

Convert with a **specific field separator**

```a2p -F: [script.awk] > [script.pl]```

Convert and **disable split** on whitespace

```a2p -n [script.awk] > [script.pl]```

# SYNOPSIS

**a2p** [_-Dnumber_] [_-Fcharacter_] [_-n_] [_-o_] [_filename_]

# DESCRIPTION

**a2p** (awk to perl) is a translator that converts awk scripts into Perl programs. It reads an awk script specified on the command line (or from stdin if no file is given) and outputs equivalent Perl code to stdout.

The generated Perl code attempts to mimic the behavior of awk as closely as possible, including handling of the implicit input loop, field splitting, pattern matching, and output formatting. While the output may not be the most elegant Perl, it provides a functional starting point for migration.

# PARAMETERS

**-D**_number_
> Set debugging flags

**-F**_character_
> Specify the field separator character (corresponds to awk's -F option). By default, fields are split on whitespace

**-n**
> Disable the automatic split() on input lines. Use this when you want to handle line splitting manually

**-o**
> Print the old awk script as comments in the output Perl code. Useful for comparing the original and converted code

# CAVEATS

The generated Perl code may require manual cleanup for optimal style and performance. Some complex awk constructs or GNU awk extensions may not translate perfectly. The translator assumes POSIX awk behavior.

# HISTORY

**a2p** was written by Larry Wall, the creator of Perl, and first appeared with Perl 1.0 in **1987**. It was one of the earliest tools designed to help users migrate from Unix scripting tools to Perl during a time when Perl was being positioned as a replacement for awk, sed, and shell scripting.

# SEE ALSO

[awk](/man/awk)(1), [perl](/man/perl)(1), [s2p](/man/s2p)(1)
