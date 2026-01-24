# TLDR

**Install Perl version**

```perlbrew install perl-[5.38.0]```

**List available versions**

```perlbrew available```

**List installed versions**

```perlbrew list```

**Switch to Perl version**

```perlbrew switch perl-[5.38.0]```

**Use version in current shell**

```perlbrew use perl-[5.38.0]```

**Install cpanm**

```perlbrew install-cpanm```

**Create library**

```perlbrew lib create perl-[5.38.0]@[mylib]```

**Run command with specific Perl**

```perlbrew exec --with perl-[5.38.0] [perl script.pl]```

# SYNOPSIS

**perlbrew** [_install_] [_switch_] [_use_] [_list_] [_options_] [_args_]

# PARAMETERS

**install** _VERSION_
> Install Perl version.

**available**
> List available versions.

**list**
> List installed versions.

**switch** _VERSION_
> Set default version.

**use** _VERSION_
> Use version in current shell.

**off**
> Disable perlbrew in current shell.

**lib create** _NAME_
> Create library.

**lib list**
> List libraries.

**exec** _CMD_
> Run command with Perl version.

**install-cpanm**
> Install cpanminus.

**self-upgrade**
> Upgrade perlbrew.

**--notest**
> Skip tests during install.

**-j** _N_
> Parallel build jobs.

# DESCRIPTION

**perlbrew** manages multiple Perl installations in user space. It enables switching between versions without system access.

Installations compile Perl from source in ~/perl5/perlbrew. Each version is independent with its own modules and libraries.

Libraries provide isolated module sets for the same Perl version. This enables project-specific dependencies without conflicts.

Switch sets the default version for new shells. Use changes only the current shell. This flexibility supports development across versions.

cpanm integration simplifies module installation. It's installed once and works with all managed Perl versions.

Exec runs commands against specific versions, useful for testing compatibility or building packages.

# CAVEATS

Building Perl takes time. Disk usage accumulates with versions. Some modules need recompilation when switching. Not for system Perl replacement.

# HISTORY

**perlbrew** was created by **Kang-min Liu** (gugod) around **2010**, inspired by Ruby's rvm and rbenv. It addressed the need for multiple Perl versions in development, especially for testing CPAN module compatibility.

# SEE ALSO

[plenv](/man/plenv)(1), [cpanm](/man/cpanm)(1), [carton](/man/carton)(1), [perl](/man/perl)(1)
