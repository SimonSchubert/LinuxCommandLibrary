# TLDR

**Install a Perl module**

```cpanm [Module::Name]```

**Install module locally** (without root)

```cpanm -l ~/perl5 [Module::Name]```

**Install from cpanfile**

```cpanm --installdeps .```

**Install specific version**

```cpanm [Module::Name]@[1.23]```

**Install from Git repository**

```cpanm [git://github.com/user/repo.git]```

**Uninstall a module**

```cpanm -U [Module::Name]```

**Show what would be installed**

```cpanm --info [Module::Name]```

**Install quietly**

```cpanm -q [Module::Name]```

# SYNOPSIS

**cpanm** [_options_] _Module_...

# PARAMETERS

**-l**, **--local-lib** _path_
> Install modules to local directory.

**-L**, **--local-lib-contained** _path_
> Install to directory with contained dependencies.

**-n**, **--notest**
> Skip running tests.

**-q**, **--quiet**
> Quiet output.

**-v**, **--verbose**
> Verbose output.

**-f**, **--force**
> Force install even if tests fail.

**-U**, **--uninstall**
> Uninstall module.

**--installdeps**
> Install dependencies only.

**--info**
> Show module information without installing.

**--look**
> Download and unpack, then open shell.

**--mirror** _url_
> CPAN mirror URL.

**--sudo**
> Use sudo for installation.

# DESCRIPTION

**cpanm** (cpanminus) is a script to install Perl modules from CPAN (Comprehensive Perl Archive Network). It provides a simpler, faster alternative to the traditional CPAN shell with minimal dependencies and configuration.

The tool automatically resolves and installs dependencies, downloads modules from CPAN mirrors, runs tests, and installs to the appropriate location. It supports local::lib for user-local installations without root privileges.

cpanm can install modules by name, from tarballs, from Git repositories, or from URLs. The **cpanfile** format allows declaring project dependencies that cpanm can install with **--installdeps**.

# CAVEATS

Installing globally requires root privileges unless using local::lib. Some modules have system dependencies (libraries, headers) that must be installed separately. Test failures may indicate incompatible system configurations. The --notest flag should be used cautiously as it may install broken modules.

# HISTORY

cpanminus was created by **Tatsuhiko Miyagawa** in **2010** as a zero-configuration CPAN installer. Frustrated with the complexity of CPAN.pm and CPANPLUS, he designed cpanm to "just work" with sensible defaults. It became the de facto standard for installing Perl modules, valued for its simplicity and speed.

# SEE ALSO

[cpan](/man/cpan)(1), [carton](/man/carton)(1), [perl](/man/perl)(1), [local::lib](/man/local::lib)(3pm)
