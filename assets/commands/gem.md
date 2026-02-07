# TAGLINE

package manager for Ruby libraries

# TLDR

**Install gem**

```gem install [package_name]```

**Install specific version**

```gem install [package_name] -v [1.2.3]```

**List installed gems**

```gem list```

**Update gem**

```gem update [package_name]```

**Uninstall gem**

```gem uninstall [package_name]```

# SYNOPSIS

**gem** _command_ [_options_] [_arguments_]

# PARAMETERS

_COMMAND_
> Operation: install, uninstall, list, update, search, etc.

**install** _GEM_
> Install gem package.

**uninstall** _GEM_
> Remove gem.

**list**
> List installed gems.

**update**
> Update gems.

**search** _TERM_
> Search for gems.

**-v** _VERSION_
> Specify version.

**--help**
> Display help information.

# CONFIGURATION

**~/.gemrc**
> User-specific gem configuration including default gem sources and installation options.

**/etc/gemrc**
> System-wide gem configuration for all users.

# DESCRIPTION

**gem** is RubyGems' command-line package manager for installing, managing, and distributing Ruby libraries and applications. It provides access to RubyGems.org, the central repository hosting hundreds of thousands of community-contributed Ruby packages called "gems".

The tool handles dependency resolution automatically, installing required gems and their dependencies in the correct order. It supports installing specific versions, updating existing gems, and managing multiple versions of the same gem simultaneously. Each gem includes metadata specifying its dependencies, Ruby version requirements, and other constraints.

gem installs packages either system-wide (requiring sudo/administrator privileges) or in user-specific locations. It integrates with bundler for project-specific dependency management, allowing different projects to use different gem versions without conflict. The Gemfile and Gemfile.lock workflow, managed by bundler, has become the standard for Ruby applications.

Beyond installation, gem provides commands for searching available packages, viewing documentation, building and publishing your own gems, and managing local gem caches. It's the cornerstone of Ruby's package ecosystem and an essential tool for all Ruby developers.

RubyGems has been part of Ruby's standard library since version 1.9, making gem available with every Ruby installation.

# CAVEATS

System gems may require sudo. Conflicts possible without bundler. Version resolution can be complex.

# HISTORY

RubyGems was created in 2004 to standardize Ruby library distribution. It became part of Ruby's standard library in Ruby 1.9, making gem the official Ruby package manager.

# SEE ALSO

[bundle](/man/bundle)(1), [ruby](/man/ruby)(1), [rvm](/man/rvm)(1)
