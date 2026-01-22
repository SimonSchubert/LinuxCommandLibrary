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

# DESCRIPTION

**gem** is the package manager for Ruby gems. It installs, updates, and manages Ruby libraries and applications from RubyGems.org or local files.

The tool handles dependencies automatically, resolving and installing required gems. It supports multiple gem versions and provides environment isolation with bundler.

gem is essential for Ruby development, providing access to hundreds of thousands of libraries.

# CAVEATS

System gems may require sudo. Conflicts possible without bundler. Version resolution can be complex.

# HISTORY

RubyGems was created in 2004 to standardize Ruby library distribution. It became part of Ruby's standard library in Ruby 1.9, making gem the official Ruby package manager.

# SEE ALSO

[bundle](/man/bundle)(1), [ruby](/man/ruby)(1), [rvm](/man/rvm)(1)
