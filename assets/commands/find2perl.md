# TAGLINE

Translate find command lines to equivalent Perl code

# TLDR

**Convert a find command to a Perl script**

```find2perl [directory] -name "[*.txt]"```

**Generate a script with -exec translation**

```find2perl [.] -type f -exec cat {} \;```

**Translate a complex find expression and save to a file**

```find2perl [/var] -mtime +[30] -name "[*.log]" > [cleanup.pl]```

**Run the generated Perl script directly**

```find2perl [.] -name "[*.bak]" | perl```

# SYNOPSIS

**find2perl** [_paths_] [_predicates_]

# PARAMETERS

_PATHS_
> Starting directories to search.

_PREDICATES_
> find-style expressions translated to Perl equivalents.

**-name** _PATTERN_
> Match filename against shell glob pattern.

**-type** _TYPE_
> File type: f (regular file), d (directory), l (symbolic link).

**-mtime** _N_
> Modification time in days (+N older, -N newer, N exactly).

**-size** _N_
> File size.

**-exec** _CMD_
> Execute command on matching files.

**-print**
> Print matching paths (default action).

**-depth**
> Process directory contents before the directory itself.

# DESCRIPTION

**find2perl** translates find command expressions into equivalent Perl scripts using the File::Find module. The generated Perl code typically runs faster than the original find command and can be modified to add custom processing beyond what find supports.

The tool helps users migrate from shell-based find commands to Perl for complex file processing tasks. The output is a complete Perl script that can be piped directly to perl or saved and modified.

# CAVEATS

Not all find predicates are supported. The generated code may need manual cleanup for edge cases. find2perl was **removed from Perl core in version 5.22.0** (2015) and deprecated since Perl 5.20.0. It is available separately from CPAN as the **App::find2perl** distribution.

# HISTORY

find2perl was included with **Perl** as a utility for translating find commands. It was removed from the Perl core distribution in **Perl 5.22.0** and must now be installed separately from CPAN.

# SEE ALSO

[find](/man/find)(1), [perl](/man/perl)(1)
