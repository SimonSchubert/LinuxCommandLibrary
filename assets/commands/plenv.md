# TLDR

**List installed versions**

```plenv versions```

**Show current version**

```plenv version```

**Set global version**

```plenv global [5.38.0]```

**Set local version**

```plenv local [5.36.0]```

**Install Perl version**

```plenv install [5.38.0]```

**List available versions**

```plenv install --list```

**Install cpanm**

```plenv install-cpanm```

**Rehash shims**

```plenv rehash```

# SYNOPSIS

**plenv** [_install_] [_global_] [_local_] [_versions_] [_options_] [_version_]

# PARAMETERS

**install** _VERSION_
> Install Perl version.

**install --list**
> List available versions.

**versions**
> List installed versions.

**version**
> Show current version.

**global** [_VERSION_]
> Set/show global version.

**local** [_VERSION_]
> Set/show local version.

**shell** [_VERSION_]
> Set shell-specific version.

**rehash**
> Rebuild shim executables.

**which** _CMD_
> Show command path.

**exec** _CMD_
> Run with current Perl.

**install-cpanm**
> Install cpanminus.

# DESCRIPTION

**plenv** manages multiple Perl versions. It installs versions to ~/.plenv and uses shims to route commands to the correct Perl.

Version selection prioritizes: PLENV_VERSION environment variable, .perl-version file in current/parent directories, global setting.

Local version creates .perl-version file for project-specific Perl. Entering the directory automatically switches versions.

Installation uses Perl-Build to compile from source. Build options can customize the installation.

cpanm installation provides a module installer that works with all managed Perl versions. Run rehash after installing modules with executables.

The design mirrors rbenv, providing consistent version management across languages for developers familiar with that pattern.

# CAVEATS

Building Perl requires development tools. Some modules need recompilation when switching versions. Shell initialization required.

# HISTORY

**plenv** was created by **Tokuhiro Matsuno** around **2011**, inspired by rbenv. It provides Perl version management following the same principles that made rbenv successful for Ruby.

# SEE ALSO

[perlbrew](/man/perlbrew)(1), [cpanm](/man/cpanm)(1), [perl](/man/perl)(1), [rbenv](/man/rbenv)(1)
