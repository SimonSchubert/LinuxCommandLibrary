# TAGLINE

Convert Perl4 libraries to Perl5 modules

# TLDR

**Convert Perl4 library to module**

```pl2pm [library.pl] > [Module.pm]```

**Convert multiple files**

```pl2pm [lib1.pl] [lib2.pl]```

# SYNOPSIS

**pl2pm** [_file_...]

# PARAMETERS

_FILE_
> Perl4 library file(s).

Output goes to stdout.

# DESCRIPTION

**pl2pm** converts Perl 4 library files (.pl) to Perl 5 module format (.pm). It performs basic syntactic transformations such as adding package declarations, converting require statements, and updating subroutine definitions to follow Perl 5 module conventions.

Part of the standard Perl distribution, the conversion is approximate and the output typically requires manual review and adjustment to produce fully functional Perl 5 modules.

# CAVEATS

Part of Perl. Basic conversion. Manual review needed.

# HISTORY

pl2pm was created for **migrating Perl4 code** to Perl5 modules.

# SEE ALSO

[perl](/man/perl)(1), [h2xs](/man/h2xs)(1)

