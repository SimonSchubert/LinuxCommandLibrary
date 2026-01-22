# TLDR

**Run Perl script**

```perl [script.pl]```

**Execute one-liner**

```perl -e 'print "Hello\n"'```

**In-place edit**

```perl -i -pe 's/old/new/g' [file]```

**Print with autosplit**

```perl -ane 'print $F[0]' [file]```

**Check syntax**

```perl -c [script.pl]```

**Enable warnings**

```perl -w [script.pl]```

# SYNOPSIS

**perl** [_options_] [_program_] [_arguments_]

# PARAMETERS

_PROGRAM_
> Perl script file.

**-e** _CODE_
> Execute code.

**-n**
> Loop over input.

**-p**
> Loop and print.

**-i** _EXT_
> In-place edit.

**-w**
> Enable warnings.

**-c**
> Syntax check only.

# DESCRIPTION

**perl** is the Perl interpreter. Practical Extraction and Report Language.

The language excels at text processing. Powerful regex support.

perl runs Perl programs.

# CAVEATS

Perl 5 primarily. Use strict/warnings. CPAN for modules.

# HISTORY

Perl was created by **Larry Wall** in 1987 for text manipulation.

# SEE ALSO

[python](/man/python)(1), [ruby](/man/ruby)(1), [awk](/man/awk)(1)

