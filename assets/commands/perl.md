# TAGLINE

The Perl 5 language interpreter

# TLDR

**Run a Perl script**

```perl [script.pl]```

**Execute a one-liner**

```perl -e 'print "Hello\n"'```

**In-place edit** a file with substitution

```perl -i -pe 's/old/new/g' [file]```

**In-place edit with backup** (original saved as .bak)

```perl -i.bak -pe 's/old/new/g' [file]```

**Print specific columns** with autosplit

```perl -ane 'print "$F[0]\n"' [file]```

**Check syntax** without running

```perl -c [script.pl]```

**Process input line by line** (like sed/awk)

```perl -ne 'print if /[pattern]/' [file]```

**Use a module** from the command line

```perl -MJSON -e 'print encode_json({key => "value"})'```

# SYNOPSIS

**perl** [_options_] [_program_] [_arguments_]

# PARAMETERS

_PROGRAM_
> Perl script file to execute.

**-e** _CODE_
> Execute the given code as a one-liner. Multiple -e flags are allowed.

**-E** _CODE_
> Like -e but enables all optional features (say, state, etc.).

**-n**
> Wrap code in a while(<>) loop, reading input line by line without printing.

**-p**
> Like -n but also prints $_ after each iteration.

**-i**[_EXT_]
> In-place edit files. If extension given, creates backup with that suffix.

**-a**
> Turn on autosplit mode (used with -n or -p). Splits each line into @F.

**-F** _PATTERN_
> Specify the split pattern for autosplit mode (default: whitespace).

**-l**
> Enable automatic line-ending processing. Strips newlines on input, adds on output.

**-0**[_OCTAL_]
> Specify input record separator as octal value. -0777 slurps entire files.

**-w**
> Enable warnings (prefer `use warnings;` in scripts).

**-W**
> Enable all warnings unconditionally.

**-c**
> Syntax check only; do not execute the program.

**-M**_MODULE_
> Load a module before executing (equivalent to `use MODULE`).

**-T**
> Enable taint mode for security. Untrusted data cannot affect the system.

**-S**
> Use PATH to find the script. Emulates #! on platforms that don't support it.

**-d**
> Run the program under the debugger.

**-v**
> Print version and configuration summary.

# DESCRIPTION

**perl** is the Perl 5 language interpreter. Perl is a general-purpose programming language originally developed for text manipulation, combining features from C, sed, awk, and shell scripting.

The language excels at text processing with powerful built-in regular expression support. It is widely used for system administration, web development, network programming, and data processing. The Comprehensive Perl Archive Network (CPAN) provides a vast repository of reusable modules.

# CAVEATS

Modern Perl scripts should use `use strict;` and `use warnings;` for safer code. The -i flag without an extension modifies files in place with no backup. CPAN modules can be installed with the cpan command.

# HISTORY

Perl was created by **Larry Wall** in **1987** as a practical language for text manipulation and report generation. Perl 5, released in 1994, introduced major features including references, objects, and modules.

# SEE ALSO

[python](/man/python)(1), [ruby](/man/ruby)(1), [awk](/man/awk)(1), [sed](/man/sed)(1), [grep](/man/grep)(1), [cpan](/man/cpan)(1), [perldoc](/man/perldoc)(1)
