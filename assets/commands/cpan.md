# TAGLINE

Perl module installer from CPAN

# TLDR

**Install a Perl module**

```cpan [Module::Name]```

**Install multiple modules**

```cpan [Module::One] [Module::Two]```

**Start interactive CPAN shell**

```cpan```

**Force install a module** (ignore test failures)

```cpan -f [Module::Name]```

**Install from a specific mirror**

```cpan -M [http://cpan.org] [Module::Name]```

**Upgrade all installed modules**

```cpan -u```

**Get information about a module**

```cpan -D [Module::Name]```

**Install without testing**

```cpan -T [Module::Name]```

# SYNOPSIS

**cpan** [_-cfFiOstTu_] [_-D module_] [_-M mirror_] [_module ..._]

# PARAMETERS

**-f**
> Force installation, ignoring test failures.

**-F**
> Turn off CPAN.pm's attempts to lock (use with caution).

**-i**
> Install specified modules (default action).

**-T**
> Do not test modules before installing.

**-t**
> Run tests for the specified modules.

**-u**
> Upgrade all installed modules.

**-D** _module_
> Display module details and installation status.

**-M** _mirror_
> Use the specified CPAN mirror.

**-O**
> Show outdated modules.

**-a**
> Create an autobundle of installed modules.

**-r**
> Recompile dynamically loaded modules.

**-j** _file_
> Use alternate configuration file.

**-g** _module_
> Download to current directory without installing.

**-v**
> Print CPAN.pm version.

# DESCRIPTION

**cpan** is the standard command-line interface for installing Perl modules from the Comprehensive Perl Archive Network (CPAN). It handles dependency resolution, downloading, building, testing, and installation of Perl modules and their prerequisites.

On first run, cpan enters a configuration mode to set up mirrors, build preferences, and other settings. This configuration is stored in **~/.cpan/CPAN/MyConfig.pm**. Users can reconfigure later with **o conf** commands in the interactive shell.

The interactive shell provides commands for searching (m /pattern/), installing (install Module), examining (look Module), and managing the local CPAN cache. Tab completion and command history are available in the shell.

CPAN.pm downloads module distributions to **~/.cpan/sources/**, extracts and builds them in **~/.cpan/build/**, then installs to the Perl library path. On systems where users lack write access to system Perl directories, consider using **local::lib** or **perlbrew** for user-local installations.

# CONFIGURATION

**~/.cpan/CPAN/MyConfig.pm**
> Main CPAN configuration storing mirror URLs, build preferences, proxy settings, and installation directories.

# CAVEATS

May require root/sudo for system-wide installation. Some modules require a C compiler or system libraries. Test failures with -f can install broken modules. First run configuration wizard can be confusing. Consider cpanm (App::cpanminus) for simpler usage.

# HISTORY

**CPAN.pm** was created by Andreas König in **1995**, shortly after CPAN itself was established. It became the standard way to install Perl modules, integrated into core Perl distributions. While newer tools like cpanm offer simpler interfaces, CPAN.pm remains the most feature-complete client with extensive configuration options.

# SEE ALSO

[cpanm](/man/cpanm)(1), [perl](/man/perl)(1), [perlbrew](/man/perlbrew)(1), [carton](/man/carton)(1), [cpm](/man/cpm)(1)
