# TLDR

**Convert find to** Perl

```find2perl [directory] -name "[*.txt]"```

**Generate script with** execution

```find2perl [.] -type f -exec cat {} \;```

**Complex find expression**

```find2perl [/var] -mtime +[30] -name "[*.log]"```

**Output to file**

```find2perl [.] -name "[*.bak]" > [cleanup.pl]```

# SYNOPSIS

**find2perl** [_paths_] [_predicates_]

# PARAMETERS

_PATHS_
> Starting directories to search.

_PREDICATES_
> find-style expressions.

**-name** _PATTERN_
> Match filename pattern.

**-type** _TYPE_
> File type (f, d, l).

**-mtime** _N_
> Modification time.

**-exec** _CMD_
> Execute command.

**-print**
> Print matching paths.

# DESCRIPTION

**find2perl** translates find command expressions into equivalent Perl scripts. The generated script uses File::Find and produces the same results as the find command.

The tool helps users migrate from find to Perl for complex file processing tasks. The generated Perl code can be modified to add custom processing beyond what find supports.

find2perl bridges shell scripting and Perl programming for file system operations.

# CAVEATS

Not all find options supported. Generated code may need cleanup. Deprecated in newer Perl versions.

# HISTORY

find2perl was included with **Perl** as a utility for translating find commands. It helped users understand Perl's File::Find module and convert existing shell scripts.

# SEE ALSO

[find](/man/find)(1), [perl](/man/perl)(1), [File::Find](/man/File::Find)(3pm)
